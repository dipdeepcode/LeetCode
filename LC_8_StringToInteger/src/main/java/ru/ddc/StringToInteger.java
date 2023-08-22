package ru.ddc;

public class StringToInteger {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        boolean isNegative = false;
        boolean isSignPresent = false;
        if (s.charAt(0) == '-') {
            isNegative = true;
            isSignPresent = true;
        }
        if (s.charAt(0) == '+') {
            isSignPresent = true;
        }
        if ((s.charAt(0) < '0' || s.charAt(0) > '9') && (s.charAt(0) != '-') && (s.charAt(0) != '+')) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        if (isNegative) {
            sb.append('-');
        }
        for (int i = isSignPresent ? 1 : 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sb.append(s.charAt(i));
            } else {
                break;
            }
        }
        if (sb.length() == 0 || "-".equals(sb.toString())) {
            sb.append('0');
        }
        int result;
        try {
            result = Integer.parseInt(sb.toString());
        } catch (RuntimeException e) {
            if (isNegative) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }

        return result;

    }
}
