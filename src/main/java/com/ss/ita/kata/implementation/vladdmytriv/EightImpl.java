package com.ss.ita.kata.implementation.vladdmytriv;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    /*Nathan loves cycling.
Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
You get given the time in hours and you need to return the number of litres Nathan
 will drink, rounded to the smallest value.
 */
    @Override
    public int liters(double time) {
        return (int) (time / 2);
    }

    /*   Bob needs a fast way to calculate the volume of a cuboid with three values:
         length, width and the height of the cuboid. Write a function to help Bob with this calculation.  */

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
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
