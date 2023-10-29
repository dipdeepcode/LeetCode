package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeSumClosestTest {

    private final TreeSumClosest treeSumClosest = new TreeSumClosest();

    @Test
    public void test1() {
        assertEquals(2, treeSumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }

    @Test
    public void test2() {
        assertEquals(0, treeSumClosest.threeSumClosest(new int[]{0, 0, 0}, 1));
    }

    @Test
    public void test3() {
        assertEquals(3, treeSumClosest.threeSumClosest(new int[]{1, 1, 1, 0}, 100));
    }

    @Test
    public void test4() {
        assertEquals(2, treeSumClosest.threeSumClosest(new int[]{1, 1, 1, 0}, -100));
    }

    @Test
    public void test5() {
        assertEquals(-2, treeSumClosest.threeSumClosest(new int[]{4,0,5,-5,3,3,0,-4,-5}, -2));
    }
}