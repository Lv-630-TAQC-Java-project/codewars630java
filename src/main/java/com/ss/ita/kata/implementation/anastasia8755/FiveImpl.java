package com.ss.ita.kata.implementation.anastasia8755;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long[] result = new long[2];
        List<Integer> list = new LinkedList<>();
        for (int i = (int) m; i <= n; i++)
            if (prime(i)) {
                list.add(i);
            }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) == g) {
                result[0] = Long.parseLong(list.get(i).toString());
                result[1] = Long.parseLong(list.get(i + 1).toString());
                return new long[]{result[0], result[1]};
            }
        }
        System.out.println(Arrays.toString(result));
        return null;
    }

    static boolean prime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    @Override
    public int zeros(int n) {


        if (n < 0)
            throw new IllegalArgumentException();
        // 125/5=25 25/5=5 5/5=1 25+5+1=31
        // 125/5=25 125/25=5 125/125=1 25+5+1=31
        int trailingZeros = 0;

        for (int i = 5; n / i >= 1; i *= 5)
            trailingZeros += n / i;

        return trailingZeros;
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
