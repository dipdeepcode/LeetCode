package ru.ddc;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        char[] charArrTemp = s.toCharArray();
        char[] charArr = new char[s.length() * 2 + 1];
        int index = 0;
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = (i % 2) == 0 ? '#' : charArrTemp[index++];
        }
        int[] pArr = new int[charArr.length];
        int c = -1;
        int r = -1;
        int max = 0;
        int indexOfMax = 0;
        for (int i = 0; i < charArr.length; i++) {
            pArr[i] = r > i ? Math.min(pArr[2 * c - i], r - i) : 1;
            while (i + pArr[i] < charArr.length && i - pArr[i] > -1) {
                if (charArr[i + pArr[i]] == charArr[i - pArr[i]])
                    pArr[i]++;
                else {
                    break;
                }
            }
            if (i + pArr[i] > r) {
                r = i + pArr[i];
                c = i;
            }
            if (pArr[i] > max) {
                max = pArr[i];
                indexOfMax = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = indexOfMax - max + 2; i < indexOfMax + max; i += 2) {
            sb.append(charArr[i]);
        }
        return sb.toString();
    }
}
