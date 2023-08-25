package ru.ddc;

public class StringToInteger {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int sign = 1;
        int start = 0;
        if (s.charAt(0) == '+') {
            start++;
        } else if (s.charAt(0) == '-') {
            sign = -1;
            start++;
        }
        int res = 0;
        for (int i = start; i < s.length(); i++) {
            if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) {
                if (((res * 10 + s.charAt(i) - '0') * sign / 10) == res * sign) {
                    res = res * 10 + s.charAt(i) - '0';
                } else {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }
        return res * sign;
    }
}
