package com.ss.ita.kata.implementation.NazarYakh;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        if (time <= 0.0) {
            return 0;
        }
        return (int) time / 2;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if (length < 0 || width < 0 || height < 0) {
            return 0;
        }
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float imperialgallon = 4.54609188f;
        float kminmiles = 1.609344f;
        if (mpg <= 0) {
            return 0;
        }
        return (float) Math.round(mpg * kminmiles/ imperialgallon *100)/100 ;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty!");
        }

        for (int i : array) {
            if (i < 0) {
                throw new IllegalArgumentException("Element of array is negative!");
            }
        }

        int[] result;
        result = array;

        for (int i = 0; i < result.length; i++) {

            double numbers = Math.sqrt(array[i]);

            if (Math.floor(numbers) == numbers) {
                result[i] = (int) numbers;
            } else {
                result[i] = array[i] * array[i];
            }
        }
        return result;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int positive_count = 0;
        int negative_sum = 0;

        for (int element : input) {
            if (element < 0) {
                negative_sum += element;
            } else {
                positive_count += 1;
            }
        }

        return new int[]{positive_count, negative_sum};
    }


    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return (double) Math.round(number*100)/100;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
