package com.ss.ita.kata.implementation.anastasia8755;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {

        long newNavg = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        newNavg = (long) Math.ceil((navg * (arr.length + 1)) - sum);

        if (newNavg <= 0) {
            throw new IllegalArgumentException();
        }
        return newNavg;
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
