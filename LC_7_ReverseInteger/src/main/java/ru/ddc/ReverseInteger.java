package ru.ddc;

public class ReverseInteger
{
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        boolean flag = false;
        if (sb.charAt(0) == '-') {
            sb.deleteCharAt(0);
            flag = true;
        }
        sb.reverse();
        int result;
        try {
            result = Integer.parseInt(sb.toString());
            if (flag) {
                result = -result;
            }
        } catch (Exception e) {
            return 0;
        }

        return result;
    }
}
