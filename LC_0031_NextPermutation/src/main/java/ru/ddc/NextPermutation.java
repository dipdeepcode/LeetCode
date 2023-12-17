package ru.ddc;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int index1 = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                index1 = i;
            }
        }
        if (index1 == -1) {
            Arrays.sort(nums);
            return;
        }
        int index2 = index1 + 1;
        for (int i = index2; i < nums.length; i++) {
            if (nums[i] >  nums[index1] && nums[i] < nums[index2]) {
                index2 = i;
            }
        }
        int x = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = x;
        Arrays.sort(nums, index1 + 1, nums.length);
    }
}
