package com.ss.ita.kata.implementation.VladGranat;

import com.ss.ita.kata.Eight;

import java.util.Arrays;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {

        return (int) (time / 2);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {

        return (length * width * height);
    }

    @Override
    public float mpgToKPM(float mpg) {
        float gallon = 4.54609188f;
        float mile = 1.609344f;
        float out = (mpg * mile) / gallon;

        return (float) Math.round(out * 100) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            double sqr = Math.sqrt(array[i]);
            if (sqr == Math.round(sqr)) {
                array[i] = (int) sqr;
            } else {
                array[i] = array[i] * array[i];
            }
        }

        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int count = 0, sum = 0;
        for (int i : input) {
            if (i > 0) count++;
            if (i < 0) sum += i;
        }

        return new int[]{count, sum};
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {

        return ((n - 1) + 1) / (n * n) == 0;
    }

    @Override
    public double twoDecimalPlaces(double number) {

        return Math.round(number*100d)/100d;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(i -> (i % divider) == 0).toArray();
    }


}
