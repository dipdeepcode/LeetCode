package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    @Test
    public void test1() {
        assertEquals("bab", new LongestPalindromicSubstring().longestPalindrome("babad"));
    }

    @Test
    public void test2() {
        assertEquals("bb", new LongestPalindromicSubstring().longestPalindrome("cbbd"));
    }

}