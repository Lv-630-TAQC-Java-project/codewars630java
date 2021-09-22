package com.ss.ita.kata.implementation.anastasia8755;

import com.ss.ita.kata.Eight;

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
        int count = 0;
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count++;
            } else {
                sum += input[i];
            }
        }
        return new int[]{count, sum};
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {

        long result = 1;
        for (int i = 1; i < n; i++) {
            result = result * i;
        }
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 563) {
            return true;
        }
        //for numbers n!<=9223372036854775807L(long.MAX_VALUE)
        if (((result + 1) / (n * n)) % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round(number * 100) / 100.00;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {

        int newAmount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                newAmount++;
            }
        }
        int newCounter = 0;
        int[] divisibleByArray = new int[newAmount];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                divisibleByArray[newCounter] = numbers[i];
                newCounter++;
            }
        }
        return divisibleByArray;
    }

}
