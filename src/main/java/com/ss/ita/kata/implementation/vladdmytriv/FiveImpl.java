package com.ss.ita.kata.implementation.vladdmytriv;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    private static boolean prime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long x = 0;
        for (long i = m; i <= n; i++) {
            if (prime(i)) {
                if (i - x == g) {
                    return new long[] { x, i };
                }
                x = i;
            }
        }
        return null;
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
