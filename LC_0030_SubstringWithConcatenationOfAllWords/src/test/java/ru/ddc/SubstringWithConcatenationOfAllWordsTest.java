package ru.ddc;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubstringWithConcatenationOfAllWordsTest {

    private final SubstringWithConcatenationOfAllWords substring = new SubstringWithConcatenationOfAllWords();

    @Test
    public void test1() {
        List<Integer> expected = new ArrayList<>(){{
            add(0);
            add(9);
        }};
        List<Integer> actual = substring.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"});
        assertIterableEquals(expected, actual);
    }

    @Test
    public void test2() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = substring.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"});
        assertIterableEquals(expected, actual);
    }

    @Test
    public void test3() {
        List<Integer> expected = new ArrayList<>(){{
            add(6);
            add(9);
            add(12);
        }};
        List<Integer> actual = substring.findSubstring("barfoofoobarthefoobarman", new String[]{"bar","foo","the"});
        assertIterableEquals(expected, actual);
    }

    @Test
    public void test4() {
        List<Integer> expected = new ArrayList<>(){{
            add(13);
        }};
        List<Integer> actual = substring.findSubstring(
                "lingmindraboofooowingdingbarrwingmonkeypoundcake",
                new String[]{"fooo","barr","wing","ding","wing"});
        assertIterableEquals(expected, actual);
    }
}