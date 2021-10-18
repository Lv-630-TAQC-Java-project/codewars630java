package com.ss.ita.kata.implementation.anastasia8755;

import com.ss.ita.kata.Seven;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

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

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += 1 / (double) (1 + i * 3);
        }
        double newSum = Math.round(sum * 100D) / 100D;
        return String.format(Locale.US, "%.2f", newSum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return p - Math.max(bef + 1, p - aft) + 1;
    }

    @Override
    public String toString() {

        List<String> arr = Arrays.asList(this.getClass().getPackage().getName().split("\\."));
        return arr.get(arr.size() - 1);
    }
}
