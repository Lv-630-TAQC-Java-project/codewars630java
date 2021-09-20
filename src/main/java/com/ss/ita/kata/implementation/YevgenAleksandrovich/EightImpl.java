package com.ss.ita.kata.implementation.YevgenAleksandrovich;
import com.ss.ita.kata.Eight;
import java.util.stream.*;
import java.util.Arrays;

public class EightImpl<var> implements Eight {
    private double time;

    /**
     * Nathan loves cycling. Because Nathan knows it is important to stay hydrated,
     * he drinks 0.5 litres of water per hour of cycling. You get given the time in
     * hours and you need to return the number of litres Nathan will drink, rounded
     * to the smallest value.
     *
     * @param time - A time
     * @return the number of litres rounded to the smallest value.
     * @throws IllegalArgumentException IF (time < 0)
     */
    public int liters(double time) {
        this.time = time;
        if (time < 0) {
            throw new IllegalArgumentException();
        }
        return (int) (0.5 * time);
    }

    @Override
    public <time> int liters() {
        return 0;
    }
    /**
        Bob needs a fast way to calculate the volume of a cuboid with three values:
        length, width and the height of the cuboid.
        Write a function to help Bob with this calculation.

    */


    @Override

    public double getVolumeOfCuboid(double length, double width, double height) {

        if (length < 0 || width < 0 || height < 0) {
           return 0;
        }
        return length * width * height;


    }
/**
Sometimes, I want to quickly be able to convert miles per imperial gallon into kilometers per liter.

Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).

Make sure to round off the result to two decimal points. If the answer ends with a 0, it should be rounded off without the 0. So instead of 5.50, we should get 5.5.

Some useful associations relevant to this kata: 1 Imperial Gallon = 4.54609188 litres 1 Mile = 1.609344 kilometres
*/
    @Override
    public float mpgToKPM(float mpg) {
        final float kmInMiles = 1.609344f;
        final float lInGallon = 4.54609188f;
        final float coefficient = kmInMiles / lInGallon;

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

/**Given an array of integers.

 Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.

 If the input array is empty or null, return an empty array.

 Example
 For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
*/

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
        int[] returnValues = new int[] {count, sum};
        return returnValues;
    }
/**Description
 We need a function that can transform a string into a number. What ways of achieving this do you know?

 Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.

 Examples
 "1234" --> 1234
 "605"  --> 605
 "1405" --> 1405
 "-7" --> -7*/

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    /**Wilson primes satisfy the following condition. Let P represent a prime number.

     Then ((P-1)! + 1) / (P * P) should give a whole number.

     Your task is to create a function that returns true if the given number is a Wilson prime.*/
    @Override
    public boolean amIWilson(double n) {
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;

    }
/**Each number should be formatted that it is rounded to two decimal places. You don't need to check whether the input is a valid number because only valid numbers are used in the tests.

 Example:
 5.5589 is rounded 5.56
 3.3424 is rounded 3.34*/
    @Override
    public double twoDecimalPlaces(double number) {
        return Double.parseDouble(String.format("%.2f", number));
    }

    /**Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.

     Example
     divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]*/

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {

        return Arrays.stream(numbers)
                .filter(i -> (i % divider) == 0)
                .toArray();

    }
}
