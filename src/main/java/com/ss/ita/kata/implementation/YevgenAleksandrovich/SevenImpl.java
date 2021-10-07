package com.ss.ita.kata.implementation.YevgenAleksandrovich;
import com.ss.ita.kata.Seven;

import static java.lang.String.format;

public class SevenImpl implements Seven {

    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double number : arr) {
            sum += number;
        }
        long res = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if (res <= 0)
            throw new IllegalArgumentException();
        else
            return res;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0.00;
        if (n == 0) {
            return String.valueOf(format("%.2f", sum));
        } else {
            for (int j = 0; j < n; j++) {
                sum += 1.00 / (double) (1 + j * 3);
            }
            double sum1 = Math.round(sum * 100) / 100D;
            return String.valueOf(format("%.2f", sum1));
        }
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int count = 0;
        int a = 0;
        int b = 0;
        for (int i = 1; i <= p; i++) {
            a = i - 1;
            b = p - i;
            if (a >= bef && b <= aft) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {

        String[] arr = this.getClass().getPackage().getName().split("\\.");
        return arr[arr.length - 1];
    }
}