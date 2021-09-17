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
/*Write a method, that will get an integer array as parameter and will process every number from this array.
Return a new array with processing every number of the input-array like this:

If the number has an integer square root, take this, otherwise square the number.

[4,3,9,7,2,1] -> [2,9,3,49,4,1]
The input array will always contain only positive numbers and will never be empty or null.

The input array should not be modified!*/

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i=0;i< array.length;i++){
           if (Math.sqrt(array[i])%1==0){
               array[i]= (int) Math.sqrt(array[i]);
            }
           else{
               array[i]= (int) Math.pow(array[i],2);
           }
        }
        return array;
    }
/*Given an array of integers.
Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
If the input array is empty or null, return an empty array.*/

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[2];
        result[0]=0;
        result[1]=0;
        for (int j : input) {
            if (j >= 0) {
                result[0]++;
            }
            else {
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
        for (int k=2;k<=n/2;k++){
            temp = (int) (n%k);
            if (temp == 0) {
                isPrime=false;
                break;
            }
        }
        if (n==1) isPrime = false;
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
        return Math.round((number*100)/100);
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
