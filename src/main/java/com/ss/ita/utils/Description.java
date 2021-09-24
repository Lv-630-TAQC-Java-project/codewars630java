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
    TASK_6_1("TASK 6.1\n" + "Task is to construct a building which will be a pile of n cubes.\n "
            + "The cube at the bottom will have a volume of n^3, the cube above will have volume of (n-1)^3.\n "
            + "And so on until the top which will have a volume of 1^3.\n"),
    TASK_6_2(
            "TASK 6.2\n" + "You are given a (small) check book as a - sometimes - cluttered (by non-alphanumeric characters) string:\n"
                    + "The first line shows the original balance. Each other line (when not blank) gives information: check number,\n"
                    + " category, check amount. (Input form may change depending on the language).\n"
                    + "First you have to clean the lines keeping only letters, digits, dots and spaces.\n"
                    + "Then return a report as a string. On each line of the report you have to add the new balance.\n "
                    + "Then in the last two lines the total expense and the average expense.\n "),
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
	TASK_6_5("TASK 6.6\n"
			+ "You are given a string with results of NBA teams separated by commas e.g:\n"
			+ "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112\n"
			+ "A team name is composed of one, two or more words built with letters or digits:\n" 
			+ "Atlanta Hawks, Philadelphia 76ers...\n"
			+ "Given a string of results and the name of a team your function nba_cup (or nbaCup or ...) will return as a string:\n"
			+ "the name of the team followed by : , number of wins, draws, loses, scored points, conceded points\n"
			+ "and finally a kind of marks in our ranking system\n"
			+ "a team marks 3 if its a win, 1 if its a draw, 0 if its a loss\n" 
		 	+ "The return format is:\n"
			+ "Team Name:W=nb of wins;D=nb of draws;L=nb of losses;Scored=nb;Conceded=nb;Points=nb"),
	TASK_6_6("TASK 6.6\n" + "A bookseller has lots of books classified in 26 categories labeled A, B, ... Z.\n"
			+ "Each book has a code c of 3, 4, 5 or more characters.\n"
			+ "The 1st character of a code is a capital letter which defines the book category.\n"
			+ "In the bookseller's stocklist each code c is followed by a space and by a positive integer n (int n>=0)\n" 
			+ "which indicates the quantity of books of this code in stock.\n"
			+ "For example an extract of a stocklist could be:\n"
			+ "L = {\"ABART 20\", \"CDXEF 50\", \"BKWRK 25\", \"BTSQZ 89\", \"DRTYM 60\"}\n" 
			+ "You will be given a stocklist (e.g. : L) and a list of categories in capital letters e.g :\n "
			+ "M = {\"A\", \"B\", \"C\", \"W\"} "
			+ " and your task is to find all the books of L with codes belonging to each category of M \n" 
			+ "and to sum their quantity according to each category.\n"
			+ "For the lists L and M of example you have to return the string:\n"
			+ "(A : 20) - (B : 114) - (C : 50) - (W : 0)\n"
			+ "where A, B, C, W are the categories, 20 is the sum of the unique book of category A,\n" 
			+ "114 the sum corresponding to \"BKWRK\" and \"BTSQZ\", 50 corresponding to \"CDXEF\" \n"
			+ "and 0 to category 'W' since there are no code beginning with W."),
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
