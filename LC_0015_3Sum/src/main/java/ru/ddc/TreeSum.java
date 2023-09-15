package ru.ddc;

import java.util.*;

public class TreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int l = i + 1;
                int r = nums.length - 1;
                while (l < r) {
                    int sum = nums[l] + nums[r];
                    if (sum > -nums[i]) {
                        r--;
                    } else if (sum < -nums[i]) {
                        l++;
                    } else {
                        result.add(List.of(nums[i], nums[l], nums[r]));
                        r--;
                        l++;
                    }
                }
            }
        }
        return result.stream().toList();
    }
}
