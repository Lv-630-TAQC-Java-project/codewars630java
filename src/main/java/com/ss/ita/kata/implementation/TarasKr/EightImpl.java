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

	/**
	 * Write a method, that will get an integer array as parameter and will process
	 * every number from this array. Return a new array with processing every number
	 * of the input-array like this:
	 * 
	 * If the number has an integer square root, take this, otherwise square the
	 * number.
	 * 
	 * [4,3,9,7,2,1] -> [2,9,3,49,4,1] The input array will always contain only
	 * positive numbers and will never be empty or null.
	 * 
	 * The input array should not be modified!
	 * 
	 * @param A array of int
	 * @exception IllegalArgumentException whith message "Error. Length of array is
	 *                                     0." if (array.length == 0)
	 * @exception IllegalArgumentException whith message "Error. Elements of array
	 *                                     is negative." if (arrayElement < 0)
	 * 
	 * @return If the number has an integer square root, take this, otherwise square
	 *         the number.
	 * 
	 */
	@Override
	public int[] squareOrSquareRoot(int[] array) {
		if (array.length == 0) {
			throw new IllegalArgumentException("Error. Length of array is 0.");
		}
		for (int arrayElement : array) {
			if (arrayElement < 0) {
				throw new IllegalArgumentException("Error. Elements of array is negative.");
			}

		}
		int[] resultArray = array;
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = Math.sqrt(resultArray[i]) % 1 == 0 ? (int) Math.sqrt(resultArray[i])
					: resultArray[i] * resultArray[i];
		}
		return resultArray;
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
