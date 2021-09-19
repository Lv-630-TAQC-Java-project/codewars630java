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
        BigInteger n_1 = BigInteger.ONE;
        BigInteger n_2 = BigInteger.ZERO;
        BigInteger sum = BigInteger.ONE;

        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(n.add(BigInteger.ONE)) <= 0; i = i.add(BigInteger.ONE)){
            BigInteger current = n_1.add(n_2);
            sum = sum.add(current);
            n_2 = n_1;
            n_1 = current;
        }

        return sum.multiply(BigInteger.valueOf(4));
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
