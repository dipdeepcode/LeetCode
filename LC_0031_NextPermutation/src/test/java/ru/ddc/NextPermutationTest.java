package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextPermutationTest {
    private final NextPermutation nextPermutation = new NextPermutation();

    @Test
    public void test1() {
        int[] nums = new int[] {1, 2, 3};
        nextPermutation.nextPermutation(nums);
        assertArrayEquals(new int[] {1, 3, 2}, nums);
    }

    @Test
    public void test2() {
        int[] nums = new int[] {3, 2, 1};
        nextPermutation.nextPermutation(nums);
        assertArrayEquals(new int[] {1, 2, 3}, nums);
    }

    @Test
    public void test3() {
        int[] nums = new int[] {1, 1, 5};
        nextPermutation.nextPermutation(nums);
        assertArrayEquals(new int[] {1, 5, 1}, nums);
    }
}