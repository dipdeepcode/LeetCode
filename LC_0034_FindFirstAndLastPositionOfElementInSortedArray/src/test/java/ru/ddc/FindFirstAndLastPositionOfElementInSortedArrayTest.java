package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstAndLastPositionOfElementInSortedArrayTest {
    private final FindFirstAndLastPositionOfElementInSortedArray find = new FindFirstAndLastPositionOfElementInSortedArray();

    @Test
    public void test1() {
        int[] expected = new int[]{3, 4};
        int[] actual = find.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] expected = new int[]{-1, -1};
        int[] actual = find.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        int[] expected = new int[]{-1, -1};
        int[] actual = find.searchRange(new int[]{}, 0);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        int[] expected = new int[]{1, 2};
        int[] actual = find.searchRange(new int[]{5, 8, 8, 9, 9, 10}, 8);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        int[] expected = new int[]{-1, -1};
        int[] actual = find.searchRange(new int[]{5, 7, 7, 7, 7, 10}, 8);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        int[] expected = new int[]{10, 13};
        int[] actual = find.searchRange(new int[]{0,0,1,1,1,2,2,3,3,3,4,4,4,4,5,5,6,6,6,8,10,10}, 4);
        assertArrayEquals(expected, actual);
    }

}