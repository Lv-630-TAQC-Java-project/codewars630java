package com.ss.ita.kata.implementation.YevgenAleksandrovich;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {

    @Override
    public int artificialRain(int[] v) {

        int rain = 1;
        int count = 1;
        int start = 0;

        for (int i : v) {
            if (i < 0) {
                return -1;
            }
        }
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

    /*доробити задачу */
    @Override
    public long[] gap(int g, long m, long n) {
        return null;
    }


    @Override
    public int zeros(int n) {
        class NumberOfTrailingZerosOfN {
            public int zeros(int n) {
                int res = 0;
                for (int i = 5; i <= n; i *= 5) {
                    res += n / i;
                }
                return res;
            }
        }
        return 0;
    }

    public BigInteger perimeter(BigInteger n) {
        int k = n.intValue() + 1;
        int[] f = new int[k];
        f[0] = 1;
        f[1] = 1;
        int sum = 2;
        for (int i = 2; i < k; i++) {
            f[i] = f[i - 1] + f[i - 2];
            sum += f[i];
        }

        return BigInteger.valueOf(sum * 4);
    }

    @Override
    public double solveSum(double m) {
        double s = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - s) / (2 * m);
    }

    private static long replace(long value, int i, int j) {
        StringBuilder builder = new StringBuilder(String.valueOf(value));

        char digit = builder.charAt(i);
        builder.deleteCharAt(i);
        builder.insert(j, digit);
        return Long.parseLong(builder.toString());
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
                if (replaced < smallestValue) {
                    smallestValue = replaced;
                    smallestI = i;
                    smallestJ = j;
                }
            }
        }

        return new long[]{smallestValue, smallestI, smallestJ};
    }
}
