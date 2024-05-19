import java.util.*;

public class CombinationSum {
    private final List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(new LinkedList<>(), candidates, target, 0);
        return result;
    }
    private void dfs(LinkedList<Integer> list, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new LinkedList<>(list));
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (candidates[i] <= target) {
                    list.addLast(candidates[i]);
                    dfs(list, candidates, target - candidates[i], i);
                    list.removeLast();
                } else {
                    break;
                }
            }
        }
    }
}
