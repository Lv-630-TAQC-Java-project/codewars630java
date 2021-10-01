package com.ss.ita.kata.implementation.TarasKr;

import com.ss.ita.kata.Eight;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EightImpl implements Eight {

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
	 * @return volume of cubboid
	 * @throws IllegalArgumentException IF (length < 0 || width < 0 || height < 0)
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
	 * <p>
	 * Create an application that will display the number of kilometers per liter
	 * (output) based on the number of miles per imperial gallon (input).
	 * <p>
	 * Make sure to round off the result to two decimal points. If the answer ends
	 * with a 0, it should be rounded off without the 0. So instead of 5.50, we
	 * should get 5.5.
	 * <p>
	 * Some useful associations relevant to this kata: 1 Imperial Gallon =
	 * 4.54609188 litres 1 Mile = 1.609344 kilometres
	 *
	 * @param mpg A Miles per imperial gallon
	 * @return A number of kilometers per liter
	 * @throws IllegalArgumentException IF (mpg < 0)
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
	 * Given an array of integers.
	 * <p>
	 * Return an array, where the first element is the count of positives numbers
	 * and the second element is sum of negative numbers.
	 * <p>
	 * If the input array is empty or null, return an empty array.
	 * <p>
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

	/**
	 * We need a function that can transform a string into a number. What ways of
	 * achieving this do you know?
	 */
	@Override
	public int stringToNumber(String str) {
		return Integer.parseInt(str);

	}

	/**
	 * Write a method, that will get an integer array as parameter and will process
	 * every number from this array. Return a new array with processing every number
	 * of the input-array like this:
	 * <p>
	 * If the number has an integer square root, take this, otherwise square the
	 * number.
	 * <p>
	 * [4,3,9,7,2,1] -> [2,9,3,49,4,1] The input array will always contain only
	 * positive numbers and will never be empty or null.
	 * <p>
	 * The input array should not be modified!
	 *
	 * @param array array of int
	 * @return If the number has an integer square root, take this, otherwise square
	 *         the number.
	 * @throws IllegalArgumentException whith message "Error. Length of array is 0."
	 *                                  if (array.length == 0)
	 * @throws IllegalArgumentException whith message "Error. Elements of array is
	 *                                  negative." if (arrayElement < 0)
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

	/**
	 * Wilson primes satisfy the following condition. Let P represent a prime
	 * number.
	 * <p>
	 * Then ((P-1)! + 1) / (P * P) should give a whole number.
	 * <p>
	 * Your task is to create a function that returns true if the given number is a
	 * Wilson prime.
	 *
	 * @param n input double
	 * @retun true if n is Wilson prime? false if n not Wilson prime
	 */
	@Override
	public boolean amIWilson(double n) {
		BigDecimal factorial = BigDecimal.ONE;
		if (n == 1) {
			return false;
		}
		for (int i = 1; i <= n - 1; i++) {
			factorial = factorial.multiply(BigDecimal.valueOf(i));
		}
		try {
			return (factorial.add(BigDecimal.ONE)).divide(BigDecimal.valueOf((long) Math.pow(n, 2))).scale() == 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Each number should be formatted that it is rounded to two decimal places.
	 *
	 * @param number input number
	 * @return number rounded to two decimal places
	 */
	@Override
	public double twoDecimalPlaces(double number) {
		return (Math.round(number * 100)) / 100.00;
	}

	/**
	 * Complete the function which takes two arguments and returns all numbers which
	 * are divisible by the given divisor. First argument is an array of numbers and
	 * the second is the divisor.
	 *
	 * @param numbers numbers A array of int
	 * @param divider int divider
	 * @return array number which divisible whith divisor
	 * @throws IllegalArgumentException if (numbers == null || numbers.length == 0)
	 *                                  whith message "Error. Array is null or
	 *                                  empty"
	 * @throws IllegalArgumentException if (divider == 0) whith message "Error.
	 *                                  Array is null or empty"
	 */
	@Override

	public int[] divisibleBy(int[] numbers, int divider) {
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Error. Array is null or empty");

		}
		if (divider == 0) {
			throw new IllegalArgumentException("Error. Argument is 0.");

		}
		List<Integer> ls = new ArrayList<Integer>();
		for (int elementNumbers : numbers) {
			if (elementNumbers % divider == 0) {
				ls.add(elementNumbers);
			}
		}

		int[] resArray = new int[ls.size()];
		for (int i = 0; i < ls.size(); i++) {
			resArray[i] = ls.get(i);
		}
		return resArray;
	}

}
