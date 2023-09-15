package ru.ddc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumII {
    private final Map<Integer, Integer> cache = new HashMap<>();

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int j = Arrays.binarySearch(numbers, i + 1, numbers.length, target - numbers[i]);
            if (j > i) {
                return new int[]{i + 1, j +1};
            }
        }
        return null;
    }
}
