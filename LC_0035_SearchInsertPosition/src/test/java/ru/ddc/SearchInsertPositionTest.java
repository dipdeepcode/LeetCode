package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    private final SearchInsertPosition searchInsertPosition = new SearchInsertPosition();


    @Test
    public void test1() {
        int actual = searchInsertPosition.searchInsert(new int []{1, 3, 5, 6}, 5);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int actual = searchInsertPosition.searchInsert(new int []{1, 3, 5, 6}, 2);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int actual = searchInsertPosition.searchInsert(new int []{1, 3, 5, 6}, 7);
        int expected = 4;
        assertEquals(expected, actual);
    }

}