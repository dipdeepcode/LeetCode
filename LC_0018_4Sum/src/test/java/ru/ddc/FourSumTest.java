package ru.ddc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class FourSumTest {
    private final FourSum fourSum = new FourSum();

    @Test
    public void test1() {
        List<List<Integer>> expected = List.of(List.of(-2,-1,1,2), List.of(-2,0,0,2), List.of(-1,0,0,1));
        List<List<Integer>> actual = fourSum.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        assertTrue(expected.containsAll(actual));
        assertTrue(actual.containsAll(expected));
    }

    @Test
    public void test2() {
        List<List<Integer>> expected = List.of(List.of(2,2,2,2));
        List<List<Integer>> actual = fourSum.fourSum(new int[]{2,2,2,2,2}, 8);
        assertTrue(expected.containsAll(actual));
        assertTrue(actual.containsAll(expected));
    }

    @Test
    public void test3() {
        List<List<Integer>> expected = List.of();
        List<List<Integer>> actual =
                fourSum.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296);
        assertTrue(expected.containsAll(actual));
        assertTrue(actual.containsAll(expected));
    }
}
