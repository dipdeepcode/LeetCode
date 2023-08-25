package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void test1() {
        assertTrue(palindromeNumber.isPalindrome(121));
    }

    @Test
    public void test2() {
        assertFalse(palindromeNumber.isPalindrome(-121));
    }

    @Test
    public void test3() {
        assertFalse(palindromeNumber.isPalindrome(10));
    }

    @Test
    public void test4() {
        assertTrue(palindromeNumber.isPalindrome(0));
    }

}