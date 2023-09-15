package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeSumTest {
    private final TreeSum treeSum = new TreeSum();

    @Test
    public void test1() {
        System.out.println(treeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    @Test
    public void test2() {
        System.out.println(treeSum.threeSum(new int[]{0,1,1}));
    }
    @Test
    public void test3() {
        System.out.println(treeSum.threeSum(new int[]{0,0,0}));
    }
}