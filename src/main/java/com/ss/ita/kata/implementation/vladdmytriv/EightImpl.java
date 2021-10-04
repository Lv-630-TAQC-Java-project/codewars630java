package com.ss.ita.kata.implementation.vladdmytriv;

import com.ss.ita.kata.Eight;

import java.util.ArrayList;
import java.util.List;

public class EightImpl implements Eight {

    @Override
    public int liters(double time) {
        if (time < 0) {
            return -1;
        }
        return (int) (time / 2);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        final float litresInGallon = 4.54609188f;
        final float kmInMile = 1.609344f;

        return (float) Math.round((mpg * kmInMile / litresInGallon) * 100) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] = (int) Math.pow(array[i], 2);
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;
        for (int j : input) {
            if (j >= 0) {
                result[0]++;
            } else {
                result[1] += j;
            }
        }
        return result;
    }

    @Override
    public int stringToNumber(String str) {
        int number = Integer.parseInt(str);
        return number;
    }

    @Override
    public boolean amIWilson(double n) {
        double i = 1;
        int temp;
        boolean isPrime = true;
        for (int k = 2; k <= n / 2; k++) {
            temp = (int) (n % k);
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (n == 1) isPrime = false;
        for (int j = 1; j < n; j++) {
            i = i * j;
        }
        return ((i + 1) / n * n) % 1 == 0 && isPrime;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round((number * 100) / 100);
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : numbers) {
            if (i % divider == 0) {
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }


}
