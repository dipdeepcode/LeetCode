package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    private final LongestCommonPrefix prefix = new LongestCommonPrefix();

    @Test
    public void test1() {
        String[] strs = new String[] {"flower", "flow", "flight"};
        assertEquals("fl", prefix.longestCommonPrefix(strs));
    }

    @Test
    public void test2() {
        String[] strs = new String[] {"dog","racecar","car"};
        assertEquals("", prefix.longestCommonPrefix(strs));
    }
}