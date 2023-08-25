package ru.ddc;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsIITest {

    @Test
    public void test1() {
        List<List<Integer>> lists =
                new SubsetsII().subsetsWithDup(new int[]{1, 2, 2});
        assertTrue(lists.contains(new ArrayList<>()));
        assertTrue(lists.contains(List.copyOf(List.of(1))));
        assertTrue(lists.contains(List.copyOf(List.of(1, 2))));
        assertTrue(lists.contains(List.copyOf(List.of(1, 2, 2))));
        assertTrue(lists.contains(List.copyOf(List.of(2))));
        assertTrue(lists.contains(List.copyOf(List.of(2, 2))));
        assertEquals(6, lists.size());
    }

    @Test
    public void test2() {
        List<List<Integer>> lists =
                new SubsetsII().subsetsWithDup(new int[]{0});
        assertTrue(lists.contains(new ArrayList<>()));
        assertTrue(lists.contains(List.copyOf(List.of(0))));
        assertEquals(2, lists.size());
    }
}