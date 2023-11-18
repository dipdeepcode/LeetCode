package ru.ddc;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.isBlank()) {
            return new ArrayList<>();
        }
        helper(0, new StringBuilder(), digits);
        return result;
    }

    void helper(int index, StringBuilder s, String digits) {
        if (s.length() == digits.length()) {
            result.add(new String(s));
            return;
        }
        int a = digits.charAt(index) - '0';
        for (int i = 0; i < arr[a].length(); i++) {
            s.append((arr[a].charAt(i)));
            helper(index + 1, s, digits);
            s.deleteCharAt(s.length() - 1);
        }
    }
}
