package ru.ddc;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private final Map<Character, Integer> map = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    private final Map<String, Integer> map2 = new HashMap<>() {{
       put("IV", 4);
       put("IX", 9);
       put("XL", 40);
       put("XC", 90);
       put("CD", 400);
       put("CM", 900);
    }};

    public int romanToInt(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                result += map2.get(s.substring(i - 1, i + 1));
                i--;
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}
