package com.ss.ita.kata.implementation.Percifalll;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        List<Long> tempPrimes = new ArrayList<>();
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) tempPrimes.add(i);
        }
        long[] primes = tempPrimes.stream().mapToLong(a->a).toArray();
        if (primes.length == 0) return null;
        for(int i = 0; i < primes.length - 1; i++){
            if (Math.abs(primes[i] - primes[i + 1]) == g) return new long[]{primes[i], primes[i+1]};
        }
        return null;
    }

    private static boolean isPrime(long number) {
        return number > 1
                && LongStream.rangeClosed(2, (long) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
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
