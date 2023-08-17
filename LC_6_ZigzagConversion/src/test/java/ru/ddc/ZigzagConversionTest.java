package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ZigzagConversionTest {
    @Test
    public void test1() {
        String result = new ZigzagConversion().convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    public void test2() {
        String result = new ZigzagConversion().convert("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI", result);
    }

    @Test
    public void test3() {
        String result = new ZigzagConversion().convert("A", 1);
        assertEquals("A", result);
    }

    @Test
    public void test4() {
        assertEquals("AB", new ZigzagConversion().convert("AB", 1));
    }
}