package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    @Test
    public void test1() {
        assertEquals(2.0, new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    @Test
    public void test2() {
        assertEquals(2.5, new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

}