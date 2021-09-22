package com.ss.ita.kata.implementation.dzhyv;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long a = 0;
        boolean prime;
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (i - a == g) {
                    return new long[]{a, i};
                }
                a = i;
            }
        }
        return null;
    }

    @Override
    public int zeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i = i * 5) {
            count = count + n / i;
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;
        BigInteger temp = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        for (long i = 0; i <= n.longValue(); i++) {
            first = second;
            second = temp;
            temp = first.add(second);
            sum = sum.add(first);
        }
        return sum.multiply(BigInteger.valueOf(4));
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
