package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    public void test1() {
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
        assertArrayEquals(new int[]{0, 1}, new TwoSum().twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    public void test2() {
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
        assertArrayEquals(new int[]{1, 2}, new TwoSum().twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    public void test3() {
//        Input: nums = [3,3], target = 6
//        Output: [0,1]
        assertArrayEquals(new int[]{0,1}, new TwoSum().twoSum(new int[]{3,3}, 6));
    }
}