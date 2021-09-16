package com.ss.ita.kata.implementation.Percifalll;

import com.ss.ita.kata.Seven;

import java.util.Arrays;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = Arrays.stream(arr).sum();
        double result = navg * (arr.length + 1) - sum;

        return (long) Math.ceil(result);
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
