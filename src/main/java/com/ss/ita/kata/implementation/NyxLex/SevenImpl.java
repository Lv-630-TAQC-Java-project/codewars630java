package com.ss.ita.kata.implementation.NyxLex;

import com.ss.ita.kata.Seven;

import java.util.Locale;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        long result = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if (result < 0) throw new IllegalArgumentException();
        return result;
    }

    @Override
    public String seriesSum(int n) {
        int counter = 4;
        double sum = 1;

        for (int i = 1; i < n; i++) {
            sum += (double) 1 / counter;
            counter += 3;

        }
        double scale = Math.pow(10, 2);
        if(n==0) return String.format(Locale.US, "%.2f",Math.round(0*scale)/scale);
        return String.format(Locale.US, "%.2f",Math.round(sum * scale) / scale);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int counter = 0;
        int a, b;
        for (int i = 1; i <= p; i++) {
            a = i - 1;
            b = p - i;
            if (a >= bef && b <= aft) {
                counter++;
            }
        }
        return counter;
    }
}
