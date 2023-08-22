package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void test1() {
        assertEquals(123, reverseInteger.reverse(321));
    }

    @Test
    public void test2() {
        assertEquals(-123, reverseInteger.reverse(-321));
    }

    @Test
    public void test3() {
        assertEquals(21, reverseInteger.reverse(120));
    }

}