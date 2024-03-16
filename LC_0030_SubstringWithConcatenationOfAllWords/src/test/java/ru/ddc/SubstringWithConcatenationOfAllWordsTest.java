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

    @Test
    public void test5() {
        List<Integer> expected = new ArrayList<>(){{
            add(0);
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(10);
        }};
        List<Integer> actual = substring.findSubstring("aaaaaaaaaaaaaa", new String[]{"aa","aa"});
        assertIterableEquals(expected, actual);
    }

    @Test
    public void test6() {
        List<Integer> expected = new ArrayList<>(){{
            add(0);
            add(3);
            add(6);
            add(15);
        }};
        List<Integer> actual = substring.findSubstring("foobarfoobarthefoobarman", new String[]{"foo","bar"});
        assertIterableEquals(expected, actual);
    }
}