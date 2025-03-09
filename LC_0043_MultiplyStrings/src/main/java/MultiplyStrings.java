public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }

        int num1Length = num1.length();
        int num2Length = num2.length();
        int[] prod = new int[num1Length + num2Length];
        for(int i = num1Length - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for(int j = num2Length - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';
                prod[i + j + 1] += d1 * d2;
            }
        }

        for(int i = prod.length - 1; i > 0; i--) {
            prod[i - 1] += prod[i] / 10;
            prod[i] %= 10;
        }

        StringBuilder ans = new StringBuilder();
        for(int i = (prod[0] == 0) ? 1 : 0; i < prod.length; i++) {
            ans.append(prod[i]);
        }
        return ans.toString();
    }
}
