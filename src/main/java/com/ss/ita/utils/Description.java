package com.ss.ita.utils;

public enum Description {
    TASK_8_1("TASK 8.1, Keep Hydrated!\n" + "Get number of litres Nathan will drink during entered time"),
    TASK_8_2("TASK 8.2, Volume of a cuboid\n" + "Calculate the volume of a cuboid "),
    TASK_8_3("TASK 8.3 Miles per gallon to kilometers per liter" + "Miles per gallon to kilometers per liter"),
    TASK_8_4("TASK 8.4 To square root or no to square\n" + "description"),
    TASK_8_5("TASK 8.5 Count of positives / sum of negatives" + "description"),
    TASK_8_6("TASK 8.6 Convert a String to a Number!\n" + "description"),
    TASK_8_7("TASK 8.7 Willson primes\n" + "description"),
    TASK_8_8("TASK 8.8 Formatting decimal places\n" + "description"),
    TASK_8_9("TASK 8.9\nFind numbers which are divisible by given number"),
    TASK_7_1("TASK 7.1\n" + "The function new_avg(arr, navg)" +
            " should return the expected donation (rounded up to the next integer)" +
            " that will permit to reach the average navg."),
    TASK_7_2("TASK 7.2\n" + "description"),
    TASK_7_3("TASK 7.3\n" + "description"),
    TASK_6_1("TASK 6.1\n" + "description"),
    TASK_6_2(
            "TASK 6.2\n" + "description"),
    TASK_6_3("TASK 6.3\n\n" +
            "Consider the function\n\n" +
            "f: x -> sqrt(1 + x) - 1 at x = 1e-15.\n\n" +
            "We get: f(x) = 4.44089209850062616e-16 " +
            "or something around that, depending on the language.\n\n" +
            "This function involves the subtraction of a pair of similar numbers when x is near 0 " +
            "and the results are significantly erroneous in this region.\n" +
            "Using pow instead of sqrt doesn't give better results.\n" +
            "A \"good\" answer is 4.99999999999999875... * 1e-16.\n" +
            "Can you modify f(x) to give a good approximation of f(x) in the neighborhood of 0?"),
    TASK_6_4("TASK 6.4\n" + "description"),
    TASK_6_5("TASK 6.5\n" + "description"),
    TASK_6_6("TASK 6.6\n" + "description"),
    TASK_5_1("TASK 5.1\n" + "description"),
    TASK_5_2("TASK 5.2\n" + "description"),
    TASK_5_3("TASK 5.3\n" + "description"),
    TASK_5_4("TASK 5.4\n" + "description"),
    TASK_5_5("TASK 5.5\n" + "description"),
    TASK_5_6("TASK 5.6\n" + "You have a positive number n consisting of digits.\n" +
            "You can do at most one operation: Choosing the index of a digit\n" +
            "in the number, remove this digit at that index and insert it back\n" +
            "to another or at the same place in the number in order to find the" +
            "smallest number you can get.\n" +
            "Input long value:\n");

    private final String task;

    Description(String task) {
        this.task = task;
    }

    public String getTask() {
        return this.task;
    }
}
