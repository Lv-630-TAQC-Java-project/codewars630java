package com.ss.ita.kata.implementation.dzhyv;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
    	return (int)Math.floor(time*0.5);
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
    	int[] finalArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
        	if (Math.sqrt(array[i])%1 == 0){
        		finalArray[i] = (int)Math.sqrt(array[i]);
        		} else {
        			finalArray[i] = array[i]*array[i];        		
        		}
        }
    	return finalArray;
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
    	int c = 0;
        int b = 0;
        for (int i = 0; i < numbers.length; i++){
          if (numbers[i]%divider == 0){
            c++;
          }
        }
        int[] array = new int[c];
        for (int j =0; j < numbers.length; j++){
          if (numbers[j]%divider == 0){
            array[b] = numbers[j];
            b++;
          }
        }
        return array;
    }
}
