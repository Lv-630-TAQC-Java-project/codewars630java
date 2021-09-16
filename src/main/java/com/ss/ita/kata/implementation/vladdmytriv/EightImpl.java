package com.ss.ita.kata.implementation.vladdmytriv;

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
        double i = 1;
        int temp;
        boolean isPrime = true;
        for (int k=2;k<=n/2;k++){
            temp = (int) (n%k);
            if (temp == 0) {
                isPrime=false;
                break;
            }
        }
        for (int j = 1; j < n; j++) {
            i = i * j;
        }
        if (((i + 1) / n * n) % 1 == 0 && isPrime) {
            return true;
        } else {
            return false;
        }
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
