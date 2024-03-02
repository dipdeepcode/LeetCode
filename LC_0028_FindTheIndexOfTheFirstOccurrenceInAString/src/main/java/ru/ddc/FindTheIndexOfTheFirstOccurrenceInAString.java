package ru.ddc;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        int ans = 0;
        while (ans <= m - n) {
            for (int i = 0; i < n; i++) {
                if (needle.charAt(i) != haystack.charAt(i + ans)) {
                    ans++;
                    break;
                }
                if (i == n - 1) {
                    return ans;
                }
            }
        }
        return -1;
    }
}
