package com.ss.ita.kata.implementation.Percifalll;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    /**
     * Your task is to write a function which returns the sum of following series upto nth term(parameter).
     * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
     * Rules:
     *     You need to round the answer to 2 decimal places and return it as String.
     *     If the given value is 0 then it should return 0.00
     *     You will only be given Natural Numbers as arguments.
     */
    @Override
    public String seriesSum(int n) {
        if (n == 0) return "0.00";
        double series = 1;
        double sum = 0;

        for (int i = n; i > 0; i--) {
            sum += 1 / series;
            series += 3;
        }

        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
