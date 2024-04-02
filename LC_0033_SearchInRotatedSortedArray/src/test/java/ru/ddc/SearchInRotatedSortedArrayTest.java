package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayTest {
    private SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();

    @Test
    public void test1() {
        assertEquals(4, search.search(new int[] {4,5,6,7,0,1,2}, 0));
    }

    @Test
    public void test2() {
        assertEquals(-1, search.search(new int[] {4,5,6,7,0,1,2}, 3));
    }

    @Test
    public void test3() {
        assertEquals(-1, search.search(new int[] {1}, 0));
    }
}