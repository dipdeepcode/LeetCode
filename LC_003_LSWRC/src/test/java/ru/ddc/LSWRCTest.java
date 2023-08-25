package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LSWRCTest {

    @Test
    public void test1() {
        assertEquals(3, new LSWRC().lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2() {
        assertEquals(1, new LSWRC().lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3() {
        assertEquals(3, new LSWRC().lengthOfLongestSubstring("pwwkew"));
    }

}