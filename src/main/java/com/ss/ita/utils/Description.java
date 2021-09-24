package com.ss.ita.utils;

public enum Description {
	TASK_8_1(8, "Keep Hydrated!", "Nathan loves cycling.\r\n"
			+ "Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.\r\n"
			+ "You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.\r\n"),
	TASK_8_2(8, "Volume of a cuboid",
			"Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid.\r\n"
					+ " Write a function to help Bob with this calculation.\r\n"),
	TASK_8_3(8, "Miles per gallon to kilometers per liter",
			"Sometimes, I want to quickly be able to convert miles per imperial gallon into kilometers per liter.\r\n"
					+ "Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).\r\n"
					+ "Make sure to round off the result to two decimal points. If the answer ends with a 0, it should be rounded off without the 0. So instead of 5.50, we should get 5.5.\r\n"),
	TASK_8_4(8, "To square root or no to square",
			"Write a method, that will get an integer array as parameter and will process every number from this array.\r\n"
					+ "Return a new array with processing every number of the input-array like this:\r\n"
					+ "If the number has an integer square root, take this, otherwise square the number.\r\n"
					+ "[4,3,9,7,2,1] -> [2,9,3,49,4,1]\r\n"
					+ "The input array will always contain only positive numbers and will never be empty or null.\r\n"),
	TASK_8_5(8, "Count of positives / sum of negatives", "Given an array of integers.\r\n"
			+ "Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.\r\n"
			+ "If the input array is empty or null, return an empty array.\r\n"),
	TASK_8_6(8, "Convert a String to a Number!", "We need a function that can transform a string into a number.\r\n "),
	TASK_8_7(8, "Wilson primesr", "Wilson primes satisfy the following condition. Let P represent a prime number.\r\n"
			+ "Then ((P-1)! + 1) / (P * P) should give a whole number.\r\n"
			+ " Your task is to create a function that returns true if the given number is a Wilson prime.\r\n"),
	TASK_8_8(8, "Formatting decimal places",
			"Each number should be formatted that it is rounded to two decimal places.\r\n"
					+ "You don't need to check whether the input is a valid number because only valid numbers are used in the tests.\r\n"),
	TASK_8_9(9, "Find numbers which are divisible by given number",
			"Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.\r\n"
					+ " First argument is an array of numbers and the second is the divisor.\r\n"),
	TASK_7_1(7, "Looking for a benefactor",
			"The function new_avg(arr, navg)" + " that will permit to reach the average navg.\r\n");
//    TASK_7_2("TASK 7.2\n" + "description"),
//    TASK_7_3("TASK 7.3\n" + "description"),
//    TASK_6_1("TASK 6.1\n" + "description"),
//    TASK_6_2(
//            "TASK 6.2\n" + "description"),
//    TASK_6_3("TASK 6.3\n\n" +
//            "Consider the function\n\n" +
//            "f: x -> sqrt(1 + x) - 1 at x = 1e-15.\n\n" +
//            "We get: f(x) = 4.44089209850062616e-16 " +
//            "or something around that, depending on the language.\n\n" +
//            "This function involves the subtraction of a pair of similar numbers when x is near 0 " +
//            "and the results are significantly erroneous in this region.\n" +
//            "Using pow instead of sqrt doesn't give better results.\n" +
//            "A \"good\" answer is 4.99999999999999875... * 1e-16.\n" +
//            "Can you modify f(x) to give a good approximation of f(x) in the neighborhood of 0?"),
//    TASK_6_4("TASK 6.4\n" + "description"),
//    TASK_6_5("TASK 6.5\n" + "description"),
//    TASK_6_6("TASK 6.6\n" + "description"),
//    TASK_5_1("TASK 5.1\n" + "description"),
//    TASK_5_2("TASK 5.2\n" + "description"),
//    TASK_5_3("TASK 5.3\n" + "description"),
//    TASK_5_4("TASK 5.4\n" + "description"),
//    TASK_5_5("TASK 5.5\n" + "description"),
//    TASK_5_6("TASK 5.6\n" + "You have a positive number n consisting of digits.\n" +
//            "You can do at most one operation: Choosing the index of a digit\n" +
//            "in the number, remove this digit at that index and insert it back\n" +
//            "to another or at the same place in the number in order to find the" +
//            "smallest number you can get.\n"+
//            "Input long value:\n");

	private final Integer kyu;
	private final String name;
	private final String desc;

	Description(int kyu, String name, String desc) {
		this.kyu = kyu;
		this.name = name;
		this.desc = desc;

	}

	public int getKyu() {
		return this.kyu;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.desc;
	}
}
