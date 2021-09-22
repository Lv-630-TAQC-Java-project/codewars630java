package com.ss.ita.kata.implementation.dzhyv;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
	@Override
	public int artificialRain(int[] v) {
		return 0;
	}

	@Override
	public long[] gap(int g, long m, long n) {
		return new long[0];
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
		return 0;
	}

	@Override
	public long[] smallest(long n) {
		return new long[0];
	}
}
