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
                    if (nums[i] + nums[l] + nums[r] > 0) {
                        r = decreaseR(nums, r, l);
                    } else if (nums[i] + nums[l] + nums[r] < 0) {
                        l = increaseL(nums, l, r);
                    } else {
                        result.add(List.of(nums[i], nums[l], nums[r]));
                        r = decreaseR(nums, r, l);
                        l = increaseL(nums, l, r);
                    }
                }
            }
        }
        return result.stream().toList();
    }

    private int increaseL(int[] nums, int l, int r) {
        l++;
        while (nums[l] == nums[l - 1] && l < r) {
            l++;
        }
        return l;
    }

    private int decreaseR(int[] nums, int r, int l) {
        r--;
        while (nums[r] == nums[r + 1] && l < r) {
            r--;
        }
        return r;
    }
}
