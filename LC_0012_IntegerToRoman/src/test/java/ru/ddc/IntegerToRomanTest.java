package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
    private final IntegerToRoman integerToRoman = new IntegerToRoman();

    @Test
    public void test1() {
        assertEquals("III", integerToRoman.intToRoman(3));
    }

    @Test
    public void test2() {
        assertEquals("LVIII", integerToRoman.intToRoman(58));
    }

    @Test
    public void test3() {
        assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
    }

}