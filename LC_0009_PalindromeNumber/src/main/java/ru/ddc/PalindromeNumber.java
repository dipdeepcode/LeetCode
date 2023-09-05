package ru.ddc;

public class PalindromeNumber {
    public boolean isPalindrome(final int x) {
        int reverse = 0;
        for (int origin = x; origin >= 1; origin = origin / 10) {
            reverse = reverse * 10 + origin % 10;
        }
        return x == reverse;
    }
}
