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
        for (int check : v) {
            if (check < 0) {
                return -1;
            }
        }
        int leftSide = 0;
        int size = 0;
        int max = 1;
        for (int i = 1; i < v.length; i++) {
            if (v[i] < v[i - 1]) {
                leftSide = i;
            } else if (v[i] > v[i - 1]) {
                if (size < max) {
                    size = max;
                }
                max = i - leftSide;
            }
            max++;
        }
        return Math.max(max, size);
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
        if (n < -1) {
            return -1;
        }
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
        int index = 0;
        int index0 = 0;
        long smallest = n;
        String number = String.valueOf(n);
        for (int i = 0; i < number.length(); i++) {
            for (int j = 0; j < number.length(); j++) {
                if (i != j) {
                    StringBuilder str = new StringBuilder(number);
                    char digit = number.charAt(i);
                    str.deleteCharAt(i);
                    str.insert(j, digit);
                    String result = str.toString();
                    if (Long.parseLong(result) < smallest) {
                        smallest = Long.parseLong(result);
                        index = i;
                        index0 = j;
                    }
                }
            }
        }
        return new long[]{smallest, index, index0};
    }

    @Override
    public String toString() {
        String[] arr = this.getClass().getPackage().getName().split("\\.");
        return arr[arr.length - 1];
    }
}
