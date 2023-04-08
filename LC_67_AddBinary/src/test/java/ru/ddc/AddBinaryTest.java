package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    public void Test1() {
        assertEquals("100", new AddBinary().addBinary("11", "1"));
    }

    @Test
    public void Test2() {
        assertEquals("10101", new AddBinary().addBinary("1010", "1011"));
    }
}