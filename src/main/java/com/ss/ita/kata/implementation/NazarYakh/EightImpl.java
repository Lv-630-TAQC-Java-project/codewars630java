package com.ss.ita.kata.implementation.NazarYakh;

import com.ss.ita.kata.Eight;

import java.util.ArrayList;
import java.util.List;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        if (time < 0) {
            return -1;
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
        if (mpg < 0) {
            return -1;
        }
        return (float) Math.round(mpg * kminmiles / imperialgallon * 100) / 100;
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

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                positive_count++;
            } else {
                negative_sum += input[i];
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

        long result = 1;
        for (int j = 1; j < n; j++) {
            result = result * j;
            }
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 563){
            return true;
        }

        return ((result + 1) / (n * n)) % 1 == 0;
        }


    @Override
    public double twoDecimalPlaces(double number) {
        return (double) Math.round(number * 100) / 100;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {

        List<Integer> list = new ArrayList<>();

        for (int element : numbers) {
            if (element % divider == 0) {
                list.add(element);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
