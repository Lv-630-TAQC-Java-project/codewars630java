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
        int per;
        int size = n.intValue();
        int[] arr = new int[size+1];
        arr[0] = 1;
        arr[1] = 1;
        int sum = 0;
        for (int i = 2; i < arr.length; i++) {
                arr[i] += arr[i-2]+arr[i-1];
                sum+=arr[i];

        }
        per = 4*(sum+2);
        return BigInteger.valueOf(per);
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
