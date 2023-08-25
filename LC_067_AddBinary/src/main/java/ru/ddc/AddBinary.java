package ru.ddc;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int overflow = 0;
        for (int i = 0; i < Math.max(a.length(), b.length()) || overflow == 1; i++) {
            int str1Index = a.length() - i - 1;
            int str2Index = b.length() - i - 1;
            int i1 = str1Index >= 0 ? a.charAt(str1Index) - '0' : 0;
            int i2 = str2Index >= 0 ? b.charAt(str2Index) - '0' : 0;
            int res = i1 + i2 + overflow;
            result.append(res % 2);
            overflow = res / 2;
        }
        return result.reverse().toString();
    }
}
