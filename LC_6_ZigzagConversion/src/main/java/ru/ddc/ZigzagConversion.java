package ru.ddc;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int section = (numRows * 2 - 2) == 0 ? 1 : numRows * 2 - 2;
        int j = (int) Math.ceil((double) s.length() / section) * (numRows - 1);
        if (j == 0) {
            j = 1;
        }
        char[][] temp = new char[numRows][j];

        int[] cursor = new int[2];
        for (int i = 0; i < s.length(); i++) {
            temp[cursor[0]][cursor[1]] = s.charAt(i);
            if (i % section < numRows - 1) {
                cursor[0]++;
            } else if (i % section < section) {
                cursor[0]--;
                cursor[1]++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char[] chars : temp) {
            for (char aChar : chars) {
                if (aChar != '\u0000') {
                    sb.append(aChar);
                }
            }
        }

        return sb.toString();
    }
}
