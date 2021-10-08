package com.ss.ita.kata.implementation.YevgenAleksandrovich;

import com.ss.ita.kata.Eight;

import java.util.stream.*;
import java.util.Arrays;

public class EightImpl implements Eight {

    @Override
    public int liters(double time) {
        if (time < 0) {
            return -1;
        }
        return (int) (0.5 * time);
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
        final float kmInMiles = 1.609344f;
        final float lInGallon = 4.54609188f;
        final float coefficient = kmInMiles / lInGallon;

        float result = mpg * coefficient;
        if (mpg<0){
            return -1;
        }
        return Float.parseFloat(String.format("%.2f", result));
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {

        if (array == null) throw new NullPointerException();
        if (array.length == 0) throw new IllegalArgumentException();

        int[] result = new int[array.length];

        for (int i = 0; i < result.length; i++) {
            double root = Math.sqrt(array[i]);

            if (Math.floor(root) == root) {
                result[i] = (int) root;
            } else {
                result[i] = array[i] * array[i];
            }
        }

        return result;

    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            int[] emptyArray = {};
            return emptyArray;
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count++;
            } else if (input[i] < 0) {
                sum += input[i];
            }
        }
        int[] returnValues = new int[]{count, sum};
        return returnValues;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    //доробити
    @Override
    public boolean amIWilson(double n) {
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;

    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Double.parseDouble(String.format("%.2f", number));
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {

        return Arrays.stream(numbers)
                .filter(i -> (i % divider) == 0)
                .toArray();

    }
}
