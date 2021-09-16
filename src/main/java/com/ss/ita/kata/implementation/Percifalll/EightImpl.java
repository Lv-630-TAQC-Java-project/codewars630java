package com.ss.ita.kata.implementation.Percifalll;

import com.ss.ita.kata.Eight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    /**
     * Wilson primes satisfy the following condition. Let P represent a prime number.
     * Then ((P-1)! + 1) / (P * P) should give a whole number.
     * Your task is to create a function that returns true if the given number is a Wilson prime.
     */
    @Override
    public boolean amIWilson(double n) {
        BigDecimal leftOperand = fact(n - 1).add(BigDecimal.ONE);
        BigDecimal rightOperand = BigDecimal.valueOf(n*n);
        BigDecimal result = leftOperand.divide(rightOperand, 10, RoundingMode.FLOOR);

        return result.stripTrailingZeros().scale() <= 0;
    }

    /**
     * This method is used in "amIWilson" method
     * It counts factorial for given double number
     * without recursion
     */
    private static BigDecimal fact(double n) {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigDecimal.valueOf(i));
        return result;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
