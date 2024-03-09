package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTwoIntegersTest {
    private final DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();

    @Test
    public void test1() {
        assertEquals(3, divideTwoIntegers.divide(10, 3));
    }

    @Test
    public void test2() {
        assertEquals(-2, divideTwoIntegers.divide(7, -3));
    }

    @Test
    public void test3() {
        assertEquals(1, divideTwoIntegers.divide(1, 1));
    }

    @Test
    public void test4() {
        assertEquals(2147483647, divideTwoIntegers.divide(-2147483648, -1));
    }

    @Test
    public void test5() {
        assertEquals(-2147483648, divideTwoIntegers.divide(-2147483648, 1));
    }

    @Test
    public void test6() {
        assertEquals(-1073741824, divideTwoIntegers.divide(-2147483648, 2));
    }

    @Test
    public void test7() {
        assertEquals(1073741823, divideTwoIntegers.divide(2147483647, 2));
    }
}