package ru.ddc;

import java.util.*;

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>(List.of(new ArrayList<>()));
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = 0;
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = end + 1;
            }
            end = result.size() - 1;
            List<List<Integer>> temp = new ArrayList<>();
            for (int j = start; j < result.size(); j++) {
                List<Integer> internal = new ArrayList<>(result.get(j));
                internal.add(nums[i]);
                temp.add(internal);
            }
            result.addAll(temp);
        }
        return result;
    }
}
