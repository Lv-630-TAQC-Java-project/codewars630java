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
