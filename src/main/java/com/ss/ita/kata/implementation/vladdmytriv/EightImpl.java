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

    /*Sometimes, I want to quickly be able to convert miles per imperial gallon into kilometers per liter.

    Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).

    Make sure to round off the result to two decimal points. If the answer ends with a 0, it should be rounded off without the 0. So instead of 5.50, we should get 5.5.

    Some useful associations relevant to this kata: 1 Imperial Gallon = 4.54609188 litres 1 Mile = 1.609344 kilometres*/
    @Override
    public float mpgToKPM(float mpg) {
        final float litresInGallon = 4.54609188f;
        final float kmInMile = 1.609344f;
        return mpg*kmInMile/litresInGallon;
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
