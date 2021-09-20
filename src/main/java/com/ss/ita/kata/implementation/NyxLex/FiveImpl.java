package com.ss.ita.kata.implementation.NyxLex;

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
        return null;
    }

    @Override
    public double solveSum(double m) {
        double res = (2*m+1-Math.sqrt(4*m+1))/(2*m);
        if (res > 1 || res < 0 ) throw new IllegalArgumentException() ;
        return  res;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
