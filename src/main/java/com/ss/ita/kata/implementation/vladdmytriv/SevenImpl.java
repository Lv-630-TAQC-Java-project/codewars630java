package com.ss.ita.kata.implementation.vladdmytriv;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = +arr[i];
        }
        double n = arr.length;
        navg = 30 * (n + 1) - sum;
        return (long) navg;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
