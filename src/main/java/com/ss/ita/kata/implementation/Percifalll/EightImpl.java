package com.ss.ita.kata.implementation.Percifalll;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

    /**
     * Nathan loves cycling.
     * Because Nathan knows it is important to stay hydrated,
     * he drinks 0.5 litres of water per hour of cycling.
     * You get given the time in hours and you need to return the number of litres Nathan will drink,
     * rounded to the smallest value.
     * For example:
     * time = 3 ----> litres = 1
     * time = 6.7---> litres = 3
     * time = 11.8--> litres = 5
     */
    @Override
    public int liters(double time){
        if (time <= 0.0) return 0;

        return (int) time / 2;
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
        return new int[0];
    }
}
