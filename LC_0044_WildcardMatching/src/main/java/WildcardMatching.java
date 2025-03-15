public class WildcardMatching {

    public boolean isMatch(String s, String p) {
        int pLength = p.length();
        int sLength = s.length();
        boolean[][] dp = new boolean[pLength + 1][sLength + 1];

        dp[0][0] = true;

        int sp = 0;
        while (sp < pLength && p.charAt(sp) == '*') {
            dp[++sp][0] = true;
        }

        for (int i = 1; i <= pLength; i++) {
            for (int j = 1; j <= sLength; j++) {
                if (s.charAt(j - 1) == p.charAt(i - 1) || p.charAt(i - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(i - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[pLength][sLength];
    }
}
