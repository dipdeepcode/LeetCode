package ru.ddc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeSumTest {
    private final TreeSum treeSum = new TreeSum();

    @Test
    public void test1() {
        List<List<Integer>> expected = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
        assertEquals(expected, treeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    @Test
    public void test2() {
        assertEquals(List.of(), treeSum.threeSum(new int[]{0,1,1}));
    }
    @Test
    public void test3() {
        List<List<Integer>> expected = List.of(List.of(0, 0, 0));
        assertEquals(expected, treeSum.threeSum(new int[]{0,0,0}));
    }
}