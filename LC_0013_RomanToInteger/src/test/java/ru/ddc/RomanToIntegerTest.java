package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    private final RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    public void test1() {
        assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test
    public void test2() {
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }

    @Test
    public void test3() {
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }

}