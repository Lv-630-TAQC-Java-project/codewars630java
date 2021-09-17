package com.ss.ita.kata.implementation.NyxLex;

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
        int[] emptyArr = {};
        int[] array = new int[2];
        for (int k : input) {
            if (k > 0) count++;
            if (k < 0) sum += k;
            for (int j = 0; j < array.length; j++) {
                array[0] = count;
                array[1] = sum;
            }
        }
        if (input==null) return emptyArr;
        return array;
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
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
