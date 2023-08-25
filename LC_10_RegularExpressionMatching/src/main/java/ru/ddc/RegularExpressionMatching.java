package ru.ddc;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {

        int j = 0;
        boolean starFlag = false;
        for (int i = 0; i < p.length(); i++) {
            char symbol = p.charAt(i);
            char quantity = '1';
            if ((i < p.length() - 1) && '*' == p.charAt(i + 1)) {
                quantity = '*';
                i++;
            }
            System.out.println("" + symbol + quantity);



            if ('*' == quantity) {
                for (int k = j; k < s.length(); k++) {
                    if ('.' == symbol || s.charAt(k) == symbol) {
                        j = k;
                        starFlag = true;
                        j++;
                    } else {
                        break;
                    }
                }
            } else {
                if (starFlag && j == s.length()) {
                    j--;
                }
                if (j == s.length()) {
                    return false;
                }
                if (!('.' == symbol || s.charAt(j) == symbol)) {
                    return false;
                }
                starFlag = false;
                j++;
            }
            System.out.println("starFlag=" + starFlag + " --- j=" + j);
        }
        return j == s.length();
    }
}
