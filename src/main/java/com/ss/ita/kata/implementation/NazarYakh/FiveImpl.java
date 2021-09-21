package com.ss.ita.kata.implementation.NazarYakh;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.*;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        int rain = 1;
        int count = 1;
        int start = 0;

        for (int i = 1; i < v.length; i++) {
            if (v[i] < v[i - 1]) {
                start = i;
            } else if (v[i] > v[i - 1]) {
                rain = Math.max(rain, count);
                count = i - start;
            }
            count++;
        }
        return Math.max(rain, count);

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
        List<Integer> fibonacci_sequense = new ArrayList<Integer>(){{
            add(0);
            add(1);
        }};

        for(int i = 2; i < n.intValue() + 2; i++) {
            int next_number = fibonacci_sequense.get(i-1) + fibonacci_sequense.get(i-2);
            fibonacci_sequense.add( next_number );
        }

        return new BigInteger( String.valueOf( fibonacci_sequense.stream().mapToInt(Integer::intValue).sum() * 4 ) );
    }

    @Override
    public double solveSum(double m) {
        return (1-Math.sqrt((4*m)+1))/(2*m)+1;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
