package ru.ddc;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(strs[0])) {
                strs[0] = strs[0].substring(0, strs[0].length() - 1);
            }
            if (strs[0].isEmpty()) {
                break;
            }
        }
        return strs[0];
    }
}
