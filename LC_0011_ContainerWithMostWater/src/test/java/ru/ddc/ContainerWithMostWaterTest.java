package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
    ContainerWithMostWater container = new ContainerWithMostWater();

    @Test
    public void test1() {
        assertEquals(49, container.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    public void test2() {
        assertEquals(1, container.maxArea(new int[]{1, 1}));
    }

}