package com.ss.ita.kata.implementation.vladdmytriv;

import com.ss.ita.kata.Eight;

import java.util.ArrayList;
import java.util.List;

public class EightImpl implements Eight {

    @Override
    public int liters(double time) {
        return (int) (time / 2);
    }

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
        for (int j = 1; j < n; j++) {
            i = i * j;
        }
        if (((i + 1) / n * n)%1==0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round((number*100)/100);
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
