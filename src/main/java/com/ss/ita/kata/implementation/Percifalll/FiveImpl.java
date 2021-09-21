package com.ss.ita.kata.implementation.Percifalll;

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
        return (2*m+1-Math.sqrt(4*m+1))/(2*m);
    }

    @Override
    public long[] smallest(long n) {
        long smallestValue = n;
        long smallestI = 0;
        long smallestJ = 0;

        String value = String.valueOf(n);
        for (int i = 0; i < value.length(); i++) {
            for (int j = 0; j < value.length(); j++) {
                if (i == j) continue;

                long replaced = replace(n, i, j);
                if (replaced < smallestValue){
                    smallestValue = replaced;
                    smallestI = i;
                    smallestJ = j;
                }
            }
        }

        return new long[]{smallestValue, smallestI, smallestJ};
    }

    private static long replace(long value, int i, int j) {
        StringBuilder builder = new StringBuilder(String.valueOf(value));

        char digit = builder.charAt(i);
        builder.deleteCharAt(i);
        builder.insert(j, digit);
        return Long.parseLong(builder.toString());
    }
}
