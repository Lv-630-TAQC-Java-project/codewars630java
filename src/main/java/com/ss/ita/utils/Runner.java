package com.ss.ita.utils;

import com.ss.ita.kata.*;

import com.ss.ita.kata.Eight;

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
		new Runner();
		double input = scanner.readDouble();
		System.out.println(eight.liters(input));
	}

	public void TASK_8_2() {
		System.out.println("Calculate the volume of a cuboid ");
		System.out.println("Enter length");
		new Runner();
		double length = Double.parseDouble(scanner.readString());
		System.out.println("Enter width");
		double width = Double.parseDouble(scanner.readString());
		System.out.println("Enter height");
		double height = Double.parseDouble(scanner.readString());
		double res = eight.getVolumeOfCuboid(length, width, height);
		System.out.println(res);
	}

	public void TASK_8_3() {
	}

	public void TASK_8_4() {
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

		System.out.println(String.format("Your array contains %d positive numbers\n" + "and %d is the sum of negatives",
				result[0], result[1]));
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
		double num = 0;
		System.out.println("Wilson primes satisfy the following condition. Let P represent a prime number.\r\n" + "\r\n"
				+ "Then ((P-1)! + 1) / (P * P) should give a whole number.\r\n" + "\r\n"
				+ "Your task is to create a function that returns true if the given number is a Wilson prime.");
		System.out.print("Input number: ");
		num = scanner.readDouble();
		boolean result = eight.amIWilson(num);
		System.out.println( num + "is a Wilson Prime = " + result );
	}

	public void TASK_8_8() {
	}

	public void TASK_8_9() {

		System.out.println(" Function which takes two arguments(int array,int divider) and "
				+ "returns all numbers which are divisible by the given divisor");
		System.out.println("Input array : ");
		new Runner();
		String s = scanner.readString();
		int[] arr = new int[s.length()];
		String[] str = s.split("");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println("Input divider : ");

		int divider = scanner.readInt();
		int[] resArray = eight.divisibleBy(arr, divider);
		System.out.println(Arrays.toString(resArray));

	}

	public void TASK_7_1() {
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
		new Runner();
		String teamName = scanner.readString();
		System.out.println("Enter match results in separated by ;");
		String resultSheet = scanner.readString();
		System.out.println("Result: " + six.nbaCup(resultSheet, teamName));
	}

	public void TASK_6_6() {
		System.out.println("Help the bookseller!");
		System.out.println("Enter array of codes.Example code: ABART 20");
		new Runner();
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
	}

	public void TASK_5_6() {
	}

}
