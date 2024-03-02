package ru.ddc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    private final RemoveElement removeElement = new RemoveElement();

    @Test
    public void test1() {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        int k = removeElement.removeElement(nums, val);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int k = removeElement.removeElement(nums, val);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }

}