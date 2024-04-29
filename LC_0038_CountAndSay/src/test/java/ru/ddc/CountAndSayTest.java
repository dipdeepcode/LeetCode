package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAndSayTest {

    private final CountAndSay countAndSay = new CountAndSay();

    @Test
    public void test1() {
        assertEquals("1", countAndSay.countAndSay(1));
    }

    @Test
    public void test2() {
        assertEquals("1211", countAndSay.countAndSay(4));
    }

}