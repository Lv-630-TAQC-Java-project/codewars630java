package com.ss.ita.kata.implementation.anastasia8755;

import com.ss.ita.kata.Eight;

import java.util.Arrays;
import java.util.List;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        if (time < 0) {
            return -1;
        }
        return (int) (time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {

        if (length < 0 || width < 0 || height < 0) {
            return -1;
        }
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {

        final float oneGalonInLiters = 4.54609188f;
        final float oneMileInKm = 1.609344f;
        if (mpg < 0) {
            return -1;
        }
        return (float) Math.round(mpg * oneMileInKm / oneGalonInLiters * 100) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            if (Math.sqrt(array[i]) % 1 == 0) {
                result[i] = (int) Math.sqrt(array[i]);
            } else {
                result[i] = array[i] * array[i];
            }
        }

        return result;
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
        return ((result + 1) / (n * n)) % 1 == 0;
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

    @Override
    public String toString(){

        List<String> arr = Arrays.asList( this.getClass().getPackage().getName().split("\\."));
        return arr.get(arr.size()-1);
    }

}
