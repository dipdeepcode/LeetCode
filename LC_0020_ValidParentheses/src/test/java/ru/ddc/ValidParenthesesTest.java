package ru.ddc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    private final ValidParentheses validParentheses = new ValidParentheses();

    @ParameterizedTest
    @ValueSource(strings = {"({[)", "({[]}", "(]", "]", "[[[]", "[([]])"})
    public void test1(String s) {
        assertFalse(validParentheses.isValid(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"({[]})", "[{()}]", "()", "()[]{}", "(([]){})", "((()))"})
    public void test2(String s) {
        assertTrue(validParentheses.isValid(s));
    }
}
