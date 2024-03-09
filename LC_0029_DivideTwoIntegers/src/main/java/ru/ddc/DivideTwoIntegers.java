package ru.ddc;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (dividend == divisor) {
            return 1;
        }

        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return dividend;
        }

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return ~dividend;
        }

        if (divisor == Integer.MIN_VALUE) {
            return 0;
        }

        if (divisor == 2) {
            return dividend >> 1;
        }

        int cnt = 0;
        if (dividend < 0 && divisor < 0) {
            while (dividend <= divisor) {
                dividend -= divisor;
                cnt++;
            }
            return cnt;
        } else if (dividend < 0 && divisor > 0) {
            while (dividend <= -divisor) {
                dividend += divisor;
                cnt++;
            }
            return -cnt;
        } else if (dividend >= 0 && divisor < 0) {
            while (-dividend <= divisor) {
                dividend += divisor;
                cnt++;
            }
            return -cnt;
        } else {
            while (dividend >= divisor) {
                dividend -= divisor;
                cnt++;
            }
            return cnt;
        }
    }
}
