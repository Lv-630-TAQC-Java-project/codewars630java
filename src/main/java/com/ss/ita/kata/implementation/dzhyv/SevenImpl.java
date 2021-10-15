package com.ss.ita.kata.implementation.dzhyv;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        long avg;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        avg = (int) Math.ceil((navg * (arr.length + 1)) - (sum));
        if (avg <= 0) {
            throw new IllegalArgumentException();
        }
        return avg;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0;
        double divisor = 1;
        for (int i = 0; i < n; i++) {
            sum = sum + 1 / divisor;
            divisor = divisor + 3;
        }
        return (String.format("%.2f", sum)).replaceAll("," , ".");
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return Math.min(p - bef, aft + 1);
    }

    @Override
    public String toString() {
        String[] arr = this.getClass().getPackage().getName().split("\\.");
        return arr[arr.length - 1];
    }
}
