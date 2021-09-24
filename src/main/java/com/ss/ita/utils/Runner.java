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

		String result = Arrays.toString(eight.countPositivesSumNegatives(array));

		System.out.println(String.format("Result:" + result));
	}

	/**
	 * String into a number
	 */
	public void TASK_8_6() {
		System.out.print("Its a function that can transform a string into a number.\n" + "Enter your number:");

		String input = scanner.readString();
		int result = eight.stringToNumber(input);
		System.out.println("Your number is " + result);
		}

	public void TASK_8_7() {
		double num = 0;
		System.out.println("Wilson primes satisfy the following condition. Let P represent a prime number.\r\n" + "\r\n"
				+ "Then ((P-1)! + 1) / (P * P) should give a whole number.\r\n" + "\r\n"
				+ "Your task is to create a function that returns true if the given number is a Wilson prime.");
		System.out.print("Input number: ");
		num = scanner.readDouble();
		boolean result = eight.amIWilson(num);
		System.out.println(num + "is a Wilson Prime: " + result);
	}

	public void TASK_8_8() {
		double num = 0;
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
		System.out.println("\nEnter X (e.g. \"1e-15\"): ");
		double input = scanner.readDouble();
		double res = six.f(input);
		System.out.println("A \"good\" result: " + res);
	}

	public void TASK_6_4() {
		System.out.println("run task Rainfall");
		String input0 =
				"Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
						"\n" +
						"London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
						"\n" +
						"Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
						"\n" +
						"NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
						"\n" +
						"Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5" +
						"\n" +
						"Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
						"\n" +
						"Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
						"\n" +
						"Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
						"\n" +
						"Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" +
						"\n" +
						"Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7";
		String input1 = "Rome, London, Paris, NY, Vancouver, Sydney, Bangkok, Tokyo, Beijing, Lima";
		String input2 = "London";
		System.out.println("We have such data for input:\n" + input1 + "\n. Default town - London" );
		System.out.println("\nDo you want to change it?\n1-Yes\n2-No");
		if (scanner.readInt() == 1) {
			input1 = scanner.readString();
			input2 = scanner.readString();
		}
		String res1 = Double.toString(six.mean(input2, input0));
		String res2 = Double.toString(six.variance(input2, input0));
		System.out.println("Result is:\n" +  "Mean: " + res1 + "\nVariance: " + res2);
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
		double num = 0;
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
	}

}
