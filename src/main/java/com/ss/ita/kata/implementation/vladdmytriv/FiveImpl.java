package com.ss.ita.kata.implementation.vladdmytriv;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class FiveImpl implements Five {

    @Override
    public int artificialRain(int[] v) {
        ArrayList<Integer> massOfNum = new ArrayList<Integer>();
        int count = 1;
        int vSize = v.length;

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
                if (k == 0 && v[k] < v[k + 1]) {
                    count++;
                }
                if (k != 0 && v[k] < v[k - 1])
                    break;
            }
            massOfNum.add(count);
            count = 0;
        }

        return Collections.max(massOfNum);
    }

    private static boolean prime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
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
        return new long[0];
    }
}
