package ru.ddc;

public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");

        for (int i = 0; i < n - 1; i++) {
            StringBuilder sb1 = new StringBuilder();
            char pre = 0;
            int cnt = 0;
            for (int j = 0; j < sb.length(); j++) {

                if (j == 0) {
                    pre = sb.charAt(j);
                    cnt++;
                    continue;
                }

                if (sb.charAt(j) == pre) {
                    cnt++;
                    continue;
                }

                if (sb.charAt(j) != pre) {
                    sb1.append(cnt).append(pre);
                    pre = sb.charAt(j);
                    cnt = 1;
                }

            }
            sb1.append(cnt).append(pre);
            sb = sb1;
        }
        return sb.toString();
    }
}
