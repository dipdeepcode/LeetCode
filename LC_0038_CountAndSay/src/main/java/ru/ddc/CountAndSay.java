package ru.ddc;

public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        for (int i = 0; i < n - 1; i++) {
            sb = getNextState(sb);
        }
        return sb.toString();
    }
    private StringBuilder getNextState(StringBuilder sb) {
        StringBuilder sb1 = new StringBuilder();
        int len = sb.length();
        int i = 0;

        while (i < len) {
            char ch = sb.charAt(i++);
            int cnt = 1;
            while (i < len && ch == sb.charAt(i)) {
                cnt++;
                i++;
            }
            sb1.append(cnt).append(ch);
        }

        return sb1;
    }
}
