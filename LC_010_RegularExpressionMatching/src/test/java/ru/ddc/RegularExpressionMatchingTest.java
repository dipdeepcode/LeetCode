package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {
    RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();

    @Test
    public void test01() {
        assertFalse(regularExpressionMatching.isMatch("aa", "a"));
    }

    @Test
    public void test02() {
        assertTrue(regularExpressionMatching.isMatch("aa", "a*"));
    }

    @Test
    public void test03() {
        assertTrue(regularExpressionMatching.isMatch("ab", ".*"));
    }

    @Test
    public void test04() {
        assertTrue(regularExpressionMatching.isMatch("aab", "c*a*b"));
    }

    @Test
    public void test05() {
        assertTrue(regularExpressionMatching.isMatch("mississippi", "mis*is*ip*."));
    }

    @Test
    public void test06() {
        assertFalse(regularExpressionMatching.isMatch("ab", ".*c"));
    }

    @Test
    public void test07() {
        assertTrue(regularExpressionMatching.isMatch("aaa", "a*a"));
    }

    @Test
    public void test08() {
        assertFalse(regularExpressionMatching.isMatch("aaa", "aaaa"));
    }

    @Test
    public void test09() {
        assertFalse(regularExpressionMatching.isMatch("aaa", "ab*a"));
    }

    @Test
    public void test10() {
        assertTrue(regularExpressionMatching.isMatch("ab", ".*ab"));
    }
}