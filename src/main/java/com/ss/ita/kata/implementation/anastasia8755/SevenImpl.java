package com.ss.ita.kata.implementation.anastasia8755;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += 1 / (double) (1 + i * 3);
        }
        double newSum = Math.round(sum * 100) / 100.00;
        return String.valueOf(newSum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return p - Math.max(bef + 1, p - aft) + 1;
    }
}
