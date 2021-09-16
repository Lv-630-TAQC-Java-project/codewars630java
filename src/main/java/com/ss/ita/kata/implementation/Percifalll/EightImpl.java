package com.ss.ita.kata.implementation.Percifalll;

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

    /**
     * Given an array of integers.
     * Return an array, where the first element is the count of positives numbers
     * and the second element is sum of negative numbers.
     * If the input array is empty or null, return an empty array.
     */
    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[] {};
        int count = 0, sum = 0;

        for (int element : input) {
            if (element > 0) count++;
            if (element < 0) sum += element;
        }
        return new int[] {count, sum};
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
