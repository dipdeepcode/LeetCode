package ru.ddc;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        int step = 2 * numRows - 2;
        for (int row = 0; row < numRows; row++) {
            for (int j = row; j < s.length(); j += step) {
                result.append(s.charAt(j));
                if (row != 0 && row != numRows - 1 && (j + step - 2 * row) < s.length()) {
                    result.append(s.charAt(j + step - 2 * row));
                }
            }
        }
        return result.toString();
    }
}
