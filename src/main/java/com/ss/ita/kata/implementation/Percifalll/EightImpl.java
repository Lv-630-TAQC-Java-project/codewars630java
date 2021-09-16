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

    @Override
    public boolean amIWilson(double n) {
        return true;
    }

    public static boolean w(double n) {
        BigDecimal leftOperand = fact(n - 1).add(BigDecimal.ONE);
        BigDecimal rightOperand = BigDecimal.valueOf(n*n);
        BigDecimal result = leftOperand.divide(rightOperand, 10, RoundingMode.FLOOR);

        return result.stripTrailingZeros().scale() <= 0;
    }

    private static BigDecimal fact(double n) {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigDecimal.valueOf(i));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(w(521));
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
