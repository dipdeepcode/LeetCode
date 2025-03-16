package ru.ddc;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, n = nums.length; i < n; i++) {
            int a = nums[i];
            int b = target - a;
            if (map.containsKey(a) && map.get(b) > -1) {
                return new int[]{map.get(b), i};
            }
            map.putIfAbsent(a, i);
            map.putIfAbsent(b, -1);
        }
        return null;
    }
}
