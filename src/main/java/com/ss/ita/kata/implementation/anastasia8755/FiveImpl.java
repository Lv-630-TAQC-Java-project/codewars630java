package com.ss.ita.kata.implementation.anastasia8755;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {


        int number = n.intValue();
        int total = 0;
        int first = 1;
        int second = 1;
        int third;

        for (int i = 0; i < number + 1; i++) {
            third = first + second;
            total += first;
            first = second;
            second = third;
        }

        return BigInteger.valueOf((total) * 4);
    }

    @Override
    public double solveSum(double m) {

        double s = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - s) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
