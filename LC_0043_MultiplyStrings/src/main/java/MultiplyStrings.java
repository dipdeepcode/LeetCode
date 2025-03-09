public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }

        int arrLength = num1.length() + num2.length();
        int[][] array = new int[arrLength][arrLength];

        for (int i = 0; i < num2.length(); i++) {
            for (int j = 0; j < num1.length(); j++) {
                int n1 = num1.charAt(num1.length() - j - 1) - '0';
                int n2 = num2.charAt(i) - '0';
                array[j + i][num1.length() - j + i] = (n1 * n2) % 10;
                array[j + i][num1.length() - j + i - 1] = (n1 * n2) / 10;
            }
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int sum = 0;
            for (int[] ints : array) {
                sum += ints[i];
            }
            array[arrLength - 1][i] = sum % 10;
            if (i > 0) {
                array[arrLength - 1][i - 1] = sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrLength; i++) {
            if (i != 0 || array[arrLength -1][i] != 0) {
                sb.append(array[arrLength - 1][i]);
            }
        }

        return sb.toString();
    }
}
