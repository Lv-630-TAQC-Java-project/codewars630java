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
        return new long[0];
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
