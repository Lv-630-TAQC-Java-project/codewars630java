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

    /**
     * Bob needs a fast way to calculate the volume of a cuboid with three values:
     * length, width and the height of the cuboid.
     * Write a function to help Bob with this calculation.
     */
    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if (length <= 0.0 ||
                width <= 0.0 ||
                height <= 0.0) {
            return 0.0;
        }

        return length * width * height;
    }

    /**
     * Sometimes, I want to quickly be able to convert miles per imperial gallon
     * into kilometers per liter.
     * Create an application that will display the number of kilometers per liter (output)
     * based on the number of miles per imperial gallon (input).
     *  Make sure to round off the result to two decimal points.
     *  If the answer ends with a 0, it should be rounded off without the 0.
     *  So instead of 5.50, we should get 5.5.
     * 1 Imperial Gallon = 4.54609188 litres
     * 1 Mile = 1.609344 kilometres
     */
    @Override
    public float mpgToKPM(float mpg) {
        final float kilometresInMiles = 1.609344f;
        final float litresInGallon = 4.54609188f;
        final float coefficient = kilometresInMiles / litresInGallon;

        float result = mpg * coefficient;
        return Float.parseFloat(String.format("%.2f", result));
    }

    /**
     * Write a method, that will get an integer array as parameter
     * and will process every number from this array.
     * Return a new array with processing every number of the input-array like this:
     * If the number has an integer square root, take this, otherwise square the number.
     * [4,3,9,7,2,1] -> [2,9,3,49,4,1]
     * The input array will always contain only positive numbers and will never be empty or null.
     * The input array should not be modified!
     */
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
        return new int[0];
    }

    /**
     * We need a function that can transform a string into a number.
     * What ways of achieving this do you know?
     */
    @Override
    public int stringToNumber(String str){
        return Integer.parseInt(str);
        //or
        //return new Integer(str);
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
