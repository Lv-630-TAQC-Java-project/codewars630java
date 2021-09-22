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
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        if (n > 1) {
            double fact_n = n-1;
            double sum = 1;
            while (fact_n>1){
                sum*=fact_n;
                fact_n--;
            }
            return ((sum + 1) / (n * n)) % 1 == 0;
        }
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        double scale = Math.pow(10, 2);
        return Math.ceil(number * scale) / scale;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        int counter=0;
        for (int number : numbers) {
            if (number % divider == 0) count++;
        }
        int[] divisibleArray = new int[count];
        for (int number : numbers) {
            if (number % divider == 0) {
                divisibleArray[counter] = number;
                counter++;
            }
        }
        return divisibleArray;
    }
}
