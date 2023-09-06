package ru.ddc;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public String intToRoman(int num) {
        Map<Integer, String> integerRomanMap = new HashMap<>() {{
            put(0, "");
            put(1, "I");
            put(5, "V");
            put(10, "X");
            put(50, "L");
            put(100, "C");
            put(500, "D");
            put(1000, "M");
        }};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; num > 0; i++) {
            int x = num % 10;

            if (x <= 3) {
                for (int j = 0; j < x; j++) {
                    sb.append(integerRomanMap.get((int) Math.pow(10, i)));
                }
            }
            if (x == 4) {
                sb.append(integerRomanMap.get((int) Math.pow(10, i) * 5))
                        .append(integerRomanMap.get((int) Math.pow(10, i)));
            }
            if (x >= 5 && x < 9) {
                for (int j = 5; j < x; j++) {
                    sb.append(integerRomanMap.get((int) Math.pow(10, i)));
                }
                sb.append(integerRomanMap.get((int) Math.pow(10, i) * 5));
            }
            if (x == 9) {
                sb.append(integerRomanMap.get((int) Math.pow(10, i) * 10));
                sb.append(integerRomanMap.get((int) Math.pow(10, i)));
            }

            num = num / 10;

        }
        return sb.reverse().toString();
    }
}
