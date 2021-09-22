package com.ss.ita.kata.implementation.dzhyv;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
    	return (int)Math.floor(time*0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length*width*height;
    }

    @Override
    public float mpgToKPM(float mpg) {
    	float kml = (float) (1.609344/4.54609188 * mpg);
        float answer = Math.round(kml*100);
        return answer/100;
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
        int[] array = {0, 0};
        if (input == null || input.length == 0) {
        	return new int[0];
    	}
        for (int i = 0; i < input.length; i++) {
        	if (input[i] > 0) {
        		array[0]++;
        	} else if (input[i] < 0) {
        		array[1] = array[1] + input[i];
        	}
        }
        return array;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
    	if (n == 5 || n== 13 || n == 563 ) {
        	return true;
        }
    	return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round(number*100)/100.0;
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
