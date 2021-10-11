package com.ss.ita.kata.implementation.vladdmytriv;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class FiveImpl implements Five {
    private static boolean prime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    private static long replace(long value, int i, int j) {
        StringBuilder builder = new StringBuilder(String.valueOf(value));

        char digit = builder.charAt(i);
        builder.deleteCharAt(i);
        builder.insert(j, digit);
        return Long.parseLong(builder.toString());
    }

    @Override
    public int artificialRain(int[] v) {
        ArrayList<Integer> massOfNum = new ArrayList<Integer>();
        int count = 0;
        int vSize = v.length;

        for (int i : v) {
            if (i < 0) {
                return -1;
            }
        }
        if (vSize == 1)
            return 1;

        for (int i = 0; i < vSize; i++) {
            for (int j = i; j < vSize; j++) {
                if (i != vSize - 1 && j != vSize - 1 && v[j] >= v[j + 1]) {
                    count++;
                }
                if (j == vSize - 1 && v[j] < v[j - 1]) {
                    count++;
                }
                if (j != vSize - 1 && v[j] < v[j + 1])
                    break;
            }

            for (int k = i; k >= 0; k--) {
                if (k != 0 && v[k] >= v[k - 1]) {
                    count++;
                }
                if (k == 0 && v[k] <= v[k + 1]) {
                    count++;
                }
                if (k != 0 && v[k] < v[k - 1])
                    break;
            }
            if (vSize <= 3 && vSize > 1) {
                count++;
            }
            massOfNum.add(count);
            count = 0;
        }

        return Collections.max(massOfNum);
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long x = 0;
        for (long i = m; i <= n; i++) {
            if (prime(i)) {
                if (i - x == g) {
                    return new long[]{x, i};
                }
                x = i;
            }
        }
        return null;
    }

    @Override
    public int zeros(int n) {
        int count = 0;
        if (n < 0) {
            return -1;
        }
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    @Override
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
        return (2 * m + 1 - Math.sqrt(4 * m + 1)) / (2 * m);
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