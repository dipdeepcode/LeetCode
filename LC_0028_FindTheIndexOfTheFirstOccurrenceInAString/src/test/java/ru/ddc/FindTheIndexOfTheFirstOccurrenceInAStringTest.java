package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {
    private final FindTheIndexOfTheFirstOccurrenceInAString find = new FindTheIndexOfTheFirstOccurrenceInAString();

    @Test
    public void test1() {
        int k = find.strStr("sadbutsad", "sad");
        assertEquals(0, k);
    }

    @Test
    public void test2() {
        int k = find.strStr("leetcode", "leeto");
        assertEquals(-1, k);
    }

    @Test
    public void test3() {
        int k = find.strStr("aaaaa", "bba");
        assertEquals(-1, k);
    }

    @Test
    public void test4() {
        int k = find.strStr("babba", "bbb");
        assertEquals(-1, k);
    }

}