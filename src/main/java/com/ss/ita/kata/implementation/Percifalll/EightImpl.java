package com.ss.ita.kata.implementation.Percifalll;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    /**
     * Bob needs a fast way to calculate the volume of a cuboid with three values:
     * length, width and the height of the cuboid.
     * Write a function to help Bob with this calculation.
     */
    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if (length <= 0.0 ||
                width <= 0.0 ||
                height <= 0.0) {
            return 0.0;
        }

        return length * width * height;
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
