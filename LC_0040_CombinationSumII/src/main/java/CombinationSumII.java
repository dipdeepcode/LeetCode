import java.util.*;

public class CombinationSumII {
    private final Set<List<Integer>> result = new HashSet<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(new LinkedList<>(), candidates, target, 0);
        return result.stream().toList();
    }

    private void dfs(LinkedList<Integer> list, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new LinkedList<>(list));
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (candidates[i] <= target) {
                    list.addLast(candidates[i]);
                    dfs(list, candidates, target - candidates[i], i + 1);
                    list.removeLast();
                    while(start+1 < candidates.length && candidates[start] == candidates[start+1]) {
                        start += 1;
                    }
                    dfs(list, candidates, target, i + 1);
                } else {
                    break;
                }
            }
        }
    }
}
