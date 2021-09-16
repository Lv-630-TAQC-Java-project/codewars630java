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
        List<Integer> list = new ArrayList<Integer>();
        for (int i:numbers) {
            if (i % divider == 0) {
                list.add(i);
            }
        }
        int[]result = new int[list.size()];
        for (int k=0;k<list.size();k++){
            result[k]= list.get(k);
        }
        return result ;
    }
}
