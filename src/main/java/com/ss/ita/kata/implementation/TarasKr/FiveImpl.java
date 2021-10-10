package com.ss.ita.kata.implementation.TarasKr;

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

	/**
	 * Write a program that will calculate the number of trailing zeros in a
	 * factorial of a given number.
	 * 
	 * N! = 1 * 2 * 3 * ... * N
	 * 
	 * Be careful 1000! has 2568 digits...
	 * 
	 * For more info, see: http://mathworld.wolfram.com/Factorial.html
	 */
	public BigInteger factorial(int number) {
		BigInteger factorialNumber = BigInteger.ONE;
		if (number == 0) {
			return factorialNumber;
		} else {
			for (int i = 1; i <= number; i++) {
				factorialNumber = factorialNumber.multiply(BigInteger.valueOf(i));

			}
		}
		return factorialNumber;

	}

	@Override
	public int zeros(int n) {
		int countTraillingZeros = 0;
		String number = factorial(n).toString();
		int i = number.length()-1;
		while (number.charAt(i) == '0' ) {
			countTraillingZeros ++;
			i--;
		}
		return countTraillingZeros;
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
