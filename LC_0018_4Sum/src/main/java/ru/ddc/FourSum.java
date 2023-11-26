package ru.ddc;

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        long average_value = target / 4;
        if (nums[0] > average_value || average_value > nums[nums.length - 1]) {
            return res;
        }

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (!(j > i + 1 && nums[j] == nums[j - 1])) {
                    int left = j + 1;
                    int right = nums.length - 1;
                    while (left < right) {
                        int s = nums[i] + nums[j] + nums[left] + nums[right];
                        if (s == target) {
                            res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            left++;
                            right--;
                            while (nums[left] == nums[left - 1] && left < right) {
                                left++;
                            }
                            while (nums[right] == nums[right + 1] && left < right) {
                                right--;
                            }
                        } else {
                            if (s < target) {
                                left++;
                            } else {
                                right--;
                            }
                        }
                    }
                }

            }
        }
        return res;
    }
}
