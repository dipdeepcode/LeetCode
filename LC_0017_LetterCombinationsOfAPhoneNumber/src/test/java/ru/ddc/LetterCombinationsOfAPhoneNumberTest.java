package ru.ddc;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class LetterCombinationsOfAPhoneNumberTest {

    private final LetterCombinationsOfAPhoneNumber combinations = new LetterCombinationsOfAPhoneNumber();

    @Test
    public void test1() {
        List<String> expected = new ArrayList<>(List.of("ad","ae","af","bd","be","bf","cd","ce","cf"));
        List<String> actual = combinations.letterCombinations("23");
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        List<String> actual = combinations.letterCombinations("");
        assertEquals(1, actual.size());
    }

    @Test
    public void test3() {
        List<String> expected = new ArrayList<>(List.of("a","b","c"));
        List<String> actual = combinations.letterCombinations("2");
        assertEquals(expected, actual);
    }
  
}