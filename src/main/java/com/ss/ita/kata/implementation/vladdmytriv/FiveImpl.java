package com.ss.ita.kata.implementation.vladdmytriv;

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
        int k= n.intValue()+1;
        int[] f = new int[k];
        f[0] = 1;
        f[1] = 1;
        int sum = 2;
        for (int i = 2; i <k; i++) {
            f[i] = f[i - 1] + f[i - 2];
            sum+=f[i];
        }

        return BigInteger.valueOf(sum*4);
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
