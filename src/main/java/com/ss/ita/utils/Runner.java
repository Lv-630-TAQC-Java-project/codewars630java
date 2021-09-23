package com.ss.ita.utils;

import com.ss.ita.kata.*;

import com.ss.ita.kata.Eight;

import com.ss.ita.kata.implementation.VladGranat.EightImpl;
import com.ss.ita.kata.implementation.users.User;

import java.util.Arrays;

public class Runner {

	private final ConsoleScanner scanner = new ConsoleScanner();
	private Eight eight;
	private Seven seven;
	private Six six;
	private Five five;

	public void setUser(User user) {
		Holder holder = user.getHolder();

		eight = holder.getEightImpl();
		seven = holder.getSevenImpl();
		six = holder.getSixImpl();
		five = holder.getFiveImpl();
	}

	public void TASK_8_1() {
		System.out.println("Get number of litres Nathan will drink during entered time");
		System.out.println("Enter time");
		double input = scanner.readDouble();
		System.out.println(eight.liters(input));
	}

	public void TASK_8_2() {
		System.out.println("Calculate the volume of a cuboid ");
		System.out.println("Enter length");
		double length = Double.parseDouble(scanner.readString());
		System.out.println("Enter width");
		double width = Double.parseDouble(scanner.readString());
		System.out.println("Enter height");
		double height = Double.parseDouble(scanner.readString());
		double res = eight.getVolumeOfCuboid(length, width, height);
		System.out.println(res);
	}

	public void TASK_8_3() {
		System.out.println("Miles per gallon to kilometers per liter");
		System.out.println("Enter mpg");
		float mpg = scanner.readFloat();
		float res = eight.mpgToKPM(mpg);
		System.out.println(res);
	}

	public void TASK_8_4() {
		System.out.println("To square(root) or not to square(root)");
		int [] array = scanner.readIntArray();
		System.out.println("result " + Arrays.toString(eight.squareOrSquareRoot(array)) );

	}

	/**
	 * Count of positives, sum of negatives
	 */
	public void TASK_8_5() {
		System.out.println("\n" + "Given an array of integers.\n"
				+ "Return an array, where the first element is the count of positives numbers\n"
				+ "and the second element is sum of negative numbers.");

		int[] array = scanner.readIntArray();

		int[] result = eight.countPositivesSumNegatives(array);

		System.out.printf("Your array contains %d positive numbers\n" + "and %d is the sum of negatives%n",
				result[0], result[1]);
	}

	/**
	 * String into a number
	 */
	public void TASK_8_6() {
		System.out.print("Its a function that can transform a string into a number.\n" + "Enter your number:");

		String input = scanner.readString();

		try {
			int result = eight.stringToNumber(input);
			System.out.println("Your number is " + result);
		} catch (Exception exception) {
			System.out.println("Its not a number");
		}
	}

	public void TASK_8_7() {
		double num;
		System.out.println("Wilson primes satisfy the following condition. Let P represent a prime number.\r\n" + "\r\n"
				+ "Then ((P-1)! + 1) / (P * P) should give a whole number.\r\n" + "\r\n"
				+ "Your task is to create a function that returns true if the given number is a Wilson prime.");
		System.out.print("Input number: ");
		num = scanner.readDouble();
		boolean result = eight.amIWilson(num);
		System.out.println(num + "is a Wilson Prime: " + result);
	}

	public void TASK_8_8() {
		double num;
		System.out.println("Each number should be formatted that it is rounded to two decimal places.");
		System.out.print("Input number: ");
		num = scanner.readDouble();
		double result = eight.twoDecimalPlaces(num);
		System.out.println("Rounde to two decimal places: " + result);

	}

	public void TASK_8_9() {

		System.out.println(" Function which takes two arguments(int array,int divider) and "
				+ "returns all numbers which are divisible by the given divisor");
		System.out.println("Input array : ");
		int[] array = scanner.readIntArray();
		System.out.println("Input divider : ");

		int divider = scanner.readInt();
		int[] resArray = eight.divisibleBy(array, divider);
		System.out.println(Arrays.toString(resArray));

	}

	public void TASK_7_1() {
		System.out.println("The function new_avg(arr, navg)" +
				" should return the expected donation (rounded up to the next integer)" +
				" that will permit to reach the average navg.");
		double[] array = scanner.readDoubleArray();
		System.out.println("Input navg:");
		double navg = scanner.readDouble();
		System.out.println("Result :");
		System.out.println(Long.parseLong(String.valueOf(seven.newAvg(array,navg))));
	}

	public void TASK_7_2() {
	}

	public void TASK_7_3() {
	}

	public void TASK_6_1() {
	}

	public void TASK_6_2() {
	}

	public void TASK_6_3() {
	}

	public void TASK_6_4() {
	}

	public void TASK_6_5() {
		System.out.println("Ranking NBA teams");
		System.out.println("Enter team to find");
		String teamName = scanner.readString();
		System.out.println("Enter match results in separated by comma");
		String resultSheet = scanner.readString();
		System.out.println("Result: " + six.nbaCup(resultSheet, teamName));
	}

	public void TASK_6_6() {
		System.out.println("Help the bookseller!");
		System.out.println("Enter array of codes.Example code: ABART 20");
		String[] stocklist = scanner.readStringArray();
		System.out.println("Enter array of categories.Example category: A");
		String[] categories = scanner.readStringArray();
		String res = six.stockSummary(stocklist, categories);
		System.out.println("Result: " + res);
	}

	/**
	 * Artificial rain
	 */
	public void TASK_5_1() {
		System.out.println("Garden, which can be represented as a set of n rectangles of varying height.\n"
				+ "Due to the newest irrigation system we can create artificial rain above them.\n"
				+ "Enter int array that will represent a set of rectangles");

		int[] array = scanner.readIntArray();
		int result = five.artificialRain(array);

		System.out.println("The maximum number of watered sections - " + result);
	}

	public void TASK_5_2() {
	}

	public void TASK_5_3() {
	}

	public void TASK_5_4() {
	}

	public void TASK_5_5() {
		double num;
		System.out.println(
				"Consider the sequence U(n, x) = x + 2x**2 + 3x**3 + .. + nx**n where x is a real number and n a positive integer.\r\n"
						+ "\r\n"
						+ "When n goes to infinity and x has a correct value (ie x is in its domain of convergence D), U(n, x) goes to a finite limit m depending on x.\r\n"
						+ "\r\n"
						+ "Usually given x we try to find m. Here we will try to find x (x real, 0 < x < 1) when m is given (m real, m > 0).\r\n"
						+ "\r\n"
						+ "Let us call solve the function solve(m) which returns x such as U(n, x) goes to m when n goes to infinity.\r\n"
						+ "\r\n" + "Examples:\r\n"
						+ "solve(2.0) returns 0.5 since U(n, 0.5) goes to 2 when n goes to infinity.\r\n" + "\r\n"
						+ "solve(8.0) returns 0.7034648345913732 since U(n, 0.7034648345913732) goes to 8 when n goes to infinity.");
		System.out.print("Input number: ");
		num = scanner.readDouble();
		double result = five.solveSum(num);
		System.out.println("Result: x = " + result);
	}

	public void TASK_5_6() {
		System.out.println("You have a positive number n consisting of digits." +
				" You can do at most one operation: Choosing the index of a digit" +
				" in the number, remove this digit at that index and insert it back" +
				" to another or at the same place in the number in order to find the" +
				" smallest number you can get.");
		System.out.println("Input long value:");
		long value = scanner.readLong();
		System.out.println("Res: " + Arrays.toString(five.smallest(value)));
	}

}
