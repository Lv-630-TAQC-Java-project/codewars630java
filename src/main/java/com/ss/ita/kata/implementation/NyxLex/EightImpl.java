package com.ss.ita.kata.implementation.NyxLex;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
         if((length<=0&&width>=0&&height>=0))
            return -1;
        return length*width*height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float gallon = 4.54609188f;
        float mile = 1.609344f;
        return (float) Math.round((mpg*mile)/gallon*100)/100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
       for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i])*Math.sqrt(array[i])==array[i]){
                array[i]= (int) Math.sqrt(array[i]);
            }
            else array[i] = array[i]*array[i];
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int sum = 0;
        int[] emptyArr = {};
        int[] array = new int[2];
        for (int k : input) {
            if (k > 0) count++;
            if (k < 0) sum += k;
            for (int j = 0; j < array.length; j++) {
                array[0] = count;
                array[1] = sum;
            }
        }
        if (input==null) return emptyArr;
        return array;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
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
