package ru.ddc;

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Map<Long, List<Pair>> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Pair pair = new Pair(i, j);
                ArrayList<Pair> pairsList = new ArrayList<>() {{
                    add(pair);
                }};
                map.merge((long) (nums[i] + nums[j]), pairsList, (pairs, pairs2) -> {
                    pairs.addAll(pairs2);
                    return pairs;
                });
            }
        }

        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                long val = (long) target - nums[i] - nums[j];
                if (map.containsKey(val)) {
                    for (Pair pair : map.get(val)) {
                        int k = pair.i;
                        int l = pair.j;
                        if (k > j) {
                            result.add(List.of(nums[i], nums[j], nums[k], nums[l]));
                        }
                    }
                }
            }

        }
        
        return new ArrayList<>(result);
    }

    public static class Pair {
        int i;
        int j;

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
