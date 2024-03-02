package ru.ddc;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }

        char[] haystackCharArray = haystack.toCharArray();
        char[] needleCharArray = needle.toCharArray();
        int[][] dp = new int[needleCharArray.length][haystackCharArray.length];
        for (int i = 0; i < needleCharArray.length; i++) {
            for (int j = 0; j < haystackCharArray.length; j++) {
                if (haystackCharArray[j] == needleCharArray[i]) {
                    if (i == 0) {
                        dp[i][j] = j;
                    } else if (j == 0) {
                        dp[i][j] = -1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                } else {
                    dp[i][j] = -1;
                }
            }
        }

        int result = -1;
        for (int i = 0; i < dp[dp.length - 1].length; i++) {
            result = dp[dp.length - 1][i];
            if (result >= 0) {
                return result;
            }
        }

        return result;
    }
}
