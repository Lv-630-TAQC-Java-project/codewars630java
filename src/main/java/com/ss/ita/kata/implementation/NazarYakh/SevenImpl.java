package com.ss.ita.kata.implementation.NazarYakh;

import com.ss.ita.kata.Seven;

import java.util.Arrays;
import java.util.Locale;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        if (navg < 0) {
            throw new IllegalArgumentException("Only Positive Numbers");
        }
        double result = navg * (arr.length + 1) - Arrays.stream(arr).parallel().sum();
        return (long) Math.ceil(result);
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0;
        double iteration = 1;

        for (int j = n; j > 0; j--) {
            sum += 1 / iteration;
            iteration += 3;
        }

        return String.format(Locale.US, "%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
//        return (p-bef);
        int result;

        if (bef > aft) {
            result = Math.min(p - bef, p - aft);
        } else {
            result = Math.max(p - bef, p - aft);
        }

        return result;
    }
}
