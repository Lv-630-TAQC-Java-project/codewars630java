package com.ss.ita.kata.implementation.TarasKr;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {

    @Override
    public int artificialRain(int[] v) {
    	int count = 0;
		int leftCount = 0;
		int ritghCount = 0;
		int index = 0;
		for (int i = 0; i < v.length; i++) {
			index = i - 1;
			leftCount = 0;
			ritghCount = 0;
			for (; (index >= 0) && (v[index] <= v[index + 1]);) {
				leftCount += 1;
				--index;
			}
			index = i + 1;
			while ((index < v.length) && (v[index] <= v[index - 1])) {
				ritghCount += 1;
				++index;
			}
			if (count < (leftCount + ritghCount + 1)) {
				count = (leftCount + ritghCount + 1);
			}
		}
		return count;
    }


    @Override
    public long[] gap(int g, long m, long n) {
    	for (long i = m; i <= n - g; i++) {
            if (isPrime(i) && isPrime((i + g))) {
                boolean hasPrime = false;
                for (long j = i + 1; j < i + g; j++) {
                    if (isPrime(j)) {
                        hasPrime = true;
                        break;
                    }
                }
                if (!hasPrime) {
                    return new long[]{i, i + g};
                }
            }
        }
        return null;
    }

    public boolean isPrime(long number) {
        for (long i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
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
