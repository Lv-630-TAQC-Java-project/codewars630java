package com.ss.ita.kata.implementation.Percifalll;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        if (v.length == 0) return 0;
        if (v.length == 1) return 1;
        int max = 0;

        for (int i = 0; i < v.length; ) {
            int[] result = getRangeSum(v, i);
            if (result[0] > max) max = result[0];
            i = result[1];
        }

        return max;
    }

    private static int[] getRangeSum(int[] v, int index) {
        boolean isReachableLeft = true, isReachableRight = true;
        int sum = 1;
        int i = index, j = index;
        while (isReachableLeft || isReachableRight) {
            if (i >= v.length - 1) isReachableRight = false;
            if (j < 1) isReachableLeft = false;

            if (isReachableRight && v[i] >= v[i + 1]) sum++;
            else isReachableRight = false;

            if (isReachableLeft && v[j] >= v[j - 1]) sum++;
            else isReachableLeft = false;

            if (isReachableLeft) j--;
            if (isReachableRight) i++;
        }
        return new int[]{sum, i+1};
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 1, 2, 1};
        FiveImpl x = new FiveImpl();
        System.out.println(x.artificialRain(a));
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
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
