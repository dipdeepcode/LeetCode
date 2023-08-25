package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    StringToInteger stringToInteger = new StringToInteger();

    @Test
    public void test1() {
        assertEquals(42, stringToInteger.myAtoi("42"));
    }

    @Test
    public void test2() {
        assertEquals(-42, stringToInteger.myAtoi("   -42"));
    }

    @Test
    public void test3() {
        assertEquals(4193, stringToInteger.myAtoi("4193 with words"));
    }

    @Test
    public void test4() {
        assertEquals(2147483647, stringToInteger.myAtoi("2147483647"));
    }

    @Test
    public void test5() {
        assertEquals(2147483647, stringToInteger.myAtoi("2147483648"));
    }

    @Test
    public void test6() {
        assertEquals(-2147483648, stringToInteger.myAtoi("-2147483649"));
    }

    @Test
    public void test7() {
        assertEquals(0, stringToInteger.myAtoi("0"));
    }

    @Test
    public void test8() {
        assertEquals(0, stringToInteger.myAtoi("   "));
    }

    @Test
    public void test9() {
        assertEquals(0, stringToInteger.myAtoi("words and 987"));
    }

    @Test
    public void test10() {
        assertEquals(3, stringToInteger.myAtoi("3.14159"));
    }
}