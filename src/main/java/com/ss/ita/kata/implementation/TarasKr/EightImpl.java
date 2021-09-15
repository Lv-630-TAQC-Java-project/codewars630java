package com.ss.ita.kata.implementation.TarasKr;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
	@Override
	public int liters(double time) {
		return 0;
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

	/**
	 * Given an array of integers.
	 * 
	 * Return an array, where the first element is the count of positives numbers
	 * and the second element is sum of negative numbers.
	 * 
	 * If the input array is empty or null, return an empty array.
	 * 
	 * Example For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15],
	 * you should return [10, -65].
	 */
	@Override
	public int[] countPositivesSumNegatives(int[] input) {
		int[] resultArray = { 0, 0 };
		if (input == null || input.length == 0) {
			return new int[0];
		}

		for (int arrayElement : input) {
			if (arrayElement > 0) {
				resultArray[0] += 1;
			} else {
				resultArray[1] += arrayElement;
			}
		}
		return resultArray;
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
