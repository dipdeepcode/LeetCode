import java.util.*;

public class CombinationSumII {
    private final List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int[] f = new int[51];
        int size = 0;
        for (int g : candidates) {
            f[g]++;
            if (f[g] == 1) size++;
        }
        int[] h = new int[size];
        size = 0;
        for (int g = 1; g <= 50; g++) {
            if (f[g] > 0) {
                h[size++] = g;
            }
        }
        dfs(new ArrayList<>(), 0, size, 0, target, h, f, 0);
        return ans;
    }

    private void dfs(List<Integer> a, int k, int n, int sum, int t, int[] arr, int[] f, int s) {
        if (k == n || arr[k] == 0 || sum + arr[k] > t) {
            return;
        }
        if (sum + arr[k] < t) {
            if (f[arr[k]] > 0) {
                a.add(arr[k]);
                f[arr[k]]--;
                dfs(a, k, n, sum + arr[k], t, arr, f, s + 1);
                a.remove(s);
                f[arr[k]]++;
            }
            dfs(a, k + 1, n, sum, t, arr, f, s);
        } else if (f[arr[k]] > 0) {
            a.add(arr[k]);
            ans.add(new ArrayList<>(a));
            a.remove(s);
        }
    }
}
