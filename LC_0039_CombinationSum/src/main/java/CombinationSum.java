import java.util.*;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new LinkedList<>(), candidates, target, 0);
        return result;
    }
    private void dfs(List<List<Integer>> result, LinkedList<Integer> list, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new LinkedList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                list.addFirst(candidates[i]);
                dfs(result, list, candidates, target - candidates[i], i);
                list.removeFirst();
            }
        }
    }
}
