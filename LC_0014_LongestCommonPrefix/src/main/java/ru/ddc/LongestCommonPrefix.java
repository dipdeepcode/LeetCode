package ru.ddc;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        return CommonPrefix(strs, 0, strs.length - 1);
    }

    private String CommonPrefix(String[] strs, int start, int end)
    {
        if (start == end)
            return strs[start];

        int middle = (start + end) / 2;

        var left = CommonPrefix(strs, start, middle);
        var right = CommonPrefix(strs, middle + 1, end);
        return ConquerString(left, right);
    }

    private String ConquerString(String left, String right)
    {
        int currentSmallest = Math.min(left.length(), right.length());
        for (int i = 0; i < currentSmallest; i++)
        {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0,i);
            }
        }
        return left.substring(0, currentSmallest);
    }
}
