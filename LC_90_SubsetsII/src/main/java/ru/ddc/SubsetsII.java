package ru.ddc;

import java.util.*;

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> temp = new ArrayList<>();
            int finalI = i;
            result.forEach(integers -> {
                List<Integer> internal = new ArrayList<>(integers);
                internal.add(nums[finalI]);
                temp.add(internal);
            });
            result.addAll(temp);
        }
        return new ArrayList<>(result);
    }
}
