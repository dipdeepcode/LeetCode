package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestValidParenthesesTest {

    private final LongestValidParentheses validParentheses = new LongestValidParentheses();


    @Test
    public void test1() {
        assertEquals(2, validParentheses.longestValidParentheses("(()"));
    }

    @Test
    public void test2() {
        assertEquals(4, validParentheses.longestValidParentheses(")()())"));
    }

    @Test
    public void test3() {
        assertEquals(2, validParentheses.longestValidParentheses("()(()"));
    }

}