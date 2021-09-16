package com.ss.ita.kata.implementation.TarasKr;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

	/**
	 * Nathan loves cycling. Because Nathan knows it is important to stay hydrated,
	 * he drinks 0.5 litres of water per hour of cycling. You get given the time in
	 * hours and you need to return the number of litres Nathan will drink, rounded
	 * to the smallest value.
	 * 
	 * @param time - A time
	 * @exception IllegalArgumentException IF (time < 0)
	 * @return the number of litres rounded to the smallest value.
	 */
	@Override
	public int liters(double time) {
		if (time < 0) {
			throw new IllegalArgumentException("Illegar argument! Time is non-negative.");
		}
		return (int) (0.5 * time);
	}

	/**
	 * Bob needs a fast way to calculate the volume of a cuboid with three values:
	 * length, width and the height of the cuboid. Write a function to help Bob with
	 * this calculation.
	 * 
	 * @param length A Length cuboid
	 * @param width  A Width cuboid
	 * @param height A Height cuboid
	 * 
	 * @exception IllegalArgumentException IF (length < 0 || width < 0 || height <
	 *                                     0)
	 * @return volume of cubboid
	 * 
	 */
	@Override
	public double getVolumeOfCuboid(double length, double width, double height) {
		if (length < 0 || width < 0 || height < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
		return length * width * height;
	}

	/**
	 * Sometimes, I want to quickly be able to convert miles per imperial gallon
	 * into kilometers per liter.
	 * 
	 * Create an application that will display the number of kilometers per liter
	 * (output) based on the number of miles per imperial gallon (input).
	 * 
	 * Make sure to round off the result to two decimal points. If the answer ends
	 * with a 0, it should be rounded off without the 0. So instead of 5.50, we
	 * should get 5.5.
	 * 
	 * Some useful associations relevant to this kata: 1 Imperial Gallon =
	 * 4.54609188 litres 1 Mile = 1.609344 kilometres
	 * 
	 * @param mpg A Miles per imperial gallon
	 * @exception IllegalArgumentException IF (mpg < 0)
	 * @return A number of kilometers per liter
	 */
	@Override
	public float mpgToKPM(float mpg) {
		final float litresInGallon = 4.54609188f;
		final float kmInMile = 1.609344f;
		if (mpg < 0) {
			throw new IllegalArgumentException("Error. Illegal Argument.");
		}
		return (float) Math.round(mpg * kmInMile / litresInGallon * 100) / 100;
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
