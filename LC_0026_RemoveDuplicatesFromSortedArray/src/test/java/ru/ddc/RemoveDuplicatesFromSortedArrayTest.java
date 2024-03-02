package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray remove = new RemoveDuplicatesFromSortedArray();

    @Test
    public void test1() {
        int[] nums = new int[]{1,1,2};
        int[] expected = new int[]{1, 2};
        int actual = remove.removeDuplicates(nums);
        assertEquals(expected.length, actual);
        for (int i = 0; i < actual; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] expected = new int[]{0,1,2,3,4};
        int actual = remove.removeDuplicates(nums);
        assertEquals(expected.length, actual);
        for (int i = 0; i < actual; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }
}