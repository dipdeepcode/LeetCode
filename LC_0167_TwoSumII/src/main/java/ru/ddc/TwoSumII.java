package ru.ddc;

import java.util.Arrays;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum > target) {
                r = Arrays.binarySearch(numbers, l + 1, r, target - numbers[l]);
                r = r < 0 ? -r - 2 : r;
            } else if (sum < target) {
                l = Arrays.binarySearch(numbers, l + 1, r, target - numbers[r]);
                l = l < 0 ? -l - 1 : l;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }
        return null;
    }
}
