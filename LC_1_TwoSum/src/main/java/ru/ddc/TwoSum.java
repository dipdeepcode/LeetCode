package ru.ddc;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> proxy = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (proxy.containsKey(target - nums[i])) {
                return new int[]{proxy.get(target - nums[i]), i};
            }
            proxy.put(nums[i], i);
        }
        return new int[] {};
    }
}
