package ru.ddc;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < stringBuilders.length; i++) {
            stringBuilders[i] = new StringBuilder();
        }

        for (int i = 0, row = 0; i < s.length(); i++) {
            stringBuilders[row].append(s.charAt(i));
            row += (i % (numRows * 2 - 2) < numRows - 1) ? 1 : -1;
        }

        for (int i = 1; i < stringBuilders.length; i++) {
            stringBuilders[0].append(stringBuilders[i]);
        }

        return stringBuilders[0].toString();
    }
}
