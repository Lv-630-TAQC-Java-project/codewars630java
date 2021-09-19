package com.ss.ita.kata.implementation.Percifalll;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        System.out.println(v.length);
        if (v.length == 0) return 0;
        if (v.length == 1) return 1;

        int iterationMax = 1;
        int max = iterationMax;
        int start = 0;
        int current = v[0];
        for (int i = 1; i < v.length; i++) {
            if (current >= v[i]) iterationMax++;
            else {
                iterationMax += checkBehind(v, start);
                max = Math.max(iterationMax, max);
                iterationMax = 1;
                start = i;
            }
            if (i == v.length - 1) iterationMax+= checkBehind(v,start);
            max = Math.max(iterationMax, max);
            current = v[i];
        }

        return max;
    }

    private static int checkBehind(int[] array, int index) {
        int sum = 0;
        int current = array[index];
        for (int i = index - 1; i >= 0; i--) {
            if (current >= array[i]) sum++;
            else break;
            current = array[i];
        }
        return sum;
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
