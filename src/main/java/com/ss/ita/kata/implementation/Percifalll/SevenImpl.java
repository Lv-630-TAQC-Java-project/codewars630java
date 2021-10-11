package com.ss.ita.kata.implementation.Percifalll;

import com.ss.ita.kata.Seven;

import java.util.Arrays;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = Arrays.stream(arr).sum();
        double result = navg * (arr.length + 1) - sum;

        if(result < 0) throw new IllegalArgumentException();

        return (long) Math.ceil(result);
    }

    /**
     * Your task is to write a function which returns the sum of following series upto nth term(parameter).
     * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
     * Rules:
     * You need to round the answer to 2 decimal places and return it as String.
     * If the given value is 0 then it should return 0.00
     * You will only be given Natural Numbers as arguments.
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

    /**
     * Vasya stands in line with number of people p (including Vasya),
     * but he doesn't know exactly which position he occupies.
     * He can say that there are no less than b people standing in front of him
     * and no more than a people standing behind him.
     * Find the number of different positions Vasya can occupy.
     * Input
     * As an input you have 3 numbers:
     * 1. Total amount of people in the line;
     * 2. Number of people standing in front of him
     * 3. Number of people standing behind him
     */
    @Override
    public int whereIsHe(int p, int bef, int aft) {
        // Variables "bef" and "after" are used as bounds of positions
        // that Vasya can occupy
        if (p <= 0) return 0;
        int positionsCount = 0;

        for (int i = 0; i <= p; i++) {
            // Here we check if position is after left/front bound
            if (i - 1 >= bef) {
                // And here we check if position is before right/back bound
                if (p - i <= aft) {
                    positionsCount++;
                }
            }
        }
        return positionsCount;
    }

    @Override
    public String toString() {
        String[] arr = this.getClass().getPackage().getName().split("\\.");
        return arr[arr.length - 1];
    }
}
