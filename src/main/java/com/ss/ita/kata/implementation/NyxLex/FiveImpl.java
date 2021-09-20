package com.ss.ita.kata.implementation.NyxLex;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
   public int artificialRain(int[] v) {
       
        int[] arrRight = countRight(v);
        int[] arrLeft = countLeft(v);
        int count = 0;
       
        for (int i = 0; i < arrLeft.length; i++) {
            count = Math.max(arrLeft[i] + arrRight[i] + 1, count);
        }
        return count;
    }
    
    static boolean goLeft(int[] numbers, int i) {
        if (i == 0)
            return false;
        return numbers[i - 1] <= numbers[i];
    }
    
    static boolean goRight(int[] numbers, int i) {
        if (numbers.length - 1 == i)
            return false;
        return numbers[i + 1] <= numbers[i];
    }
    
    static int[] countLeft(int[] numbers) {
        int[] count = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (goLeft(numbers, i)) {
                count[i] = count[i - 1] + 1;
            } else {
                count[i] = 0;
            }
        }
        return count;
    }

    static int[] countRight(int[] numbers) {
        int[] count = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (goRight(numbers, i)) {
                count[i] = count[i + 1] + 1;
            } else {
                count[i] = 0;
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
