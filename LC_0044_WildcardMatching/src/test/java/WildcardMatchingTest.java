import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WildcardMatchingTest {
    private final WildcardMatching wm = new WildcardMatching();

    @Test
    public void test01() {
        assertFalse(wm.isMatch("aa", "a"));
    }

    @Test
    public void test02() {
        assertTrue(wm.isMatch("aa", "*"));
    }

    @Test
    public void test03() {
        assertFalse(wm.isMatch("cb", "?a"));
    }

    @Test
    public void test04() {
        assertFalse(wm.isMatch("acdcb", "a*c?b"));
    }

    @Test
    public void test05() {
        assertTrue(wm.isMatch("acdcb", "a*d?b"));
    }

    @Test
    public void test06() {
        assertTrue(wm.isMatch("", "******"));
    }

    @Test
    public void test07() {
        assertFalse(wm.isMatch("missingtest", "mi*ing?s*t"));
    }

    @Test
    public void test08() {
        assertTrue(wm.isMatch("adceb", "*a*b"));
    }

    @Test
    public void test09() {
        assertFalse(wm.isMatch("a", "aa"));
    }

    @Test
    public void test10() {
        assertFalse(wm.isMatch("mississippi", "m??*ss*?i*pi"));
    }

    @Test
    public void test11() {
        assertTrue(wm.isMatch("abcabczzzde", "*abc???de*"));
    }
}