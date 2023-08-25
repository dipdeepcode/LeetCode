package ru.ddc;

public class LSWRC {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, left = 0, right = 0;
        int[] pos = new int[128];
        for (char c : s.toCharArray()) {
            left = Math.max(pos[c], left);
            pos[c] = ++right;
            max = Math.max(max, right - left);
        }
        return max;
    }
}
