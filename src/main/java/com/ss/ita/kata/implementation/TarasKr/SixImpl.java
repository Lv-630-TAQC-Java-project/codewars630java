package com.ss.ita.kata.implementation.TarasKr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SixImpl implements com.ss.ita.kata.Six {
	/**
	 * Your task is to construct a building which will be a pile of n cubes. The
	 * cube at the bottom will have a volume of n^3, the cube above will have volume
	 * of (n-1)^3 and so on until the top which will have a volume of 1^3.
	 * <p>
	 * You are given the total volume m of the building. Being given m can you find
	 * the number n of cubes you will have to build?
	 * <p>
	 * The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be
	 * an integer m and you have to return the integer n such as n^3 + (n-1)^3 + ...
	 * + 1^3 = m if such a n exists or -1 if there is no such n.
	 * <p>
	 * Examples: findNb(1071225) --> 45
	 * <p>
	 * findNb(91716553919377) --> -1
	 *
	 * @param m
	 */
	@Override
	public long findNb(long m) {
		long nCube = 0;
		long n = 0;
		while (nCube < m) {
			n += 1;
			nCube += (n * n * n);

		}
		return nCube == m ? n : -1;
	}

	/**
	 * You are given a (small) check book as a - sometimes - cluttered (by
	 * non-alphanumeric characters) string:
	 * <p>
	 * "1000.00 125 Market 125.45 126 Hardware 34.95 127 Video 7.45 128 Book 14.32
	 * 129 Gasoline 16.10" The first line shows the original balance. Each other
	 * line (when not blank) gives information: check number, category, check
	 * amount. (Input form may change depending on the language).
	 * <p>
	 * First you have to clean the lines keeping only letters, digits, dots and
	 * spaces.
	 * <p>
	 * Then return a report as a string (underscores show spaces -- don't put them
	 * in your solution. They are there so you can see them and how many of them you
	 * need to have): "Original_Balance:_1000.00 125_Market_125.45_Balance_874.55
	 * 126_Hardware_34.95_Balance_839.60 127_Video_7.45_Balance_832.15
	 * 128_Book_14.32_Balance_817.83 129_Gasoline_16.10_Balance_801.73
	 * Total_expense__198.27 Average_expense__39.65"
	 *
	 * @param book input string
	 * @return report as a string
	 */
	@Override
	public String balance(String book) {
		String formatedBook = "";
		String resultBook = "";
		int startPos = 0;
		int endPos = 0;
		List<String> lsBook = new ArrayList<String>();
		double balance = 0;
		double totalExpence = 0;
		String pattern = "[a-zA-Z 0-9\\.\\n]+";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(book);
		if (m.matches()) {
			formatedBook = book;
		} else {
			m.reset();

			while (m.find()) {
				formatedBook += (book.substring(m.start(), m.end()));
			}
		}

		endPos = formatedBook.indexOf("\n", startPos);
		while (endPos != -1) {
			lsBook.add(formatedBook.substring(startPos, endPos));
			startPos = endPos + 1;
			endPos = formatedBook.indexOf("\n", startPos);
		}
		lsBook.add(formatedBook.substring(startPos));

		pattern = "(\\d+)(\\D+)(\\d+\\.{0,1}\\d{0,2})";
		p = Pattern.compile(pattern);
		resultBook += "Original Balance: " + lsBook.get(0) + "\\r\\n";
		balance = Double.valueOf(lsBook.get(0));
		for (int i = 1; i < lsBook.size(); i++) {
			m = p.matcher(lsBook.get(i));
			while (m.find()) {
				balance -= Double.valueOf(m.group(3));
				resultBook = resultBook + m.group(1) + " " + m.group(2).trim() + " " + m.group(3).trim() + " Balance "
						+ String.format("%.2f", balance) + "\\r\\n";
				totalExpence += Double.valueOf(m.group(3));
			}
		}
		resultBook += "Total expense  " + String.format("%.2f", (totalExpence)) + "\\r\\n";
		resultBook += "Average expense  " + String.format("%.2f", (totalExpence / (lsBook.size() - 1)));
		return resultBook;

	}

	/**
	 * Consider the function
	 * 
	 * f: x -> sqrt(1 + x) - 1 at x = 1e-15.
	 * 
	 * We get: f(x) = 4.44089209850062616e-16
	 * 
	 * or something around that, depending on the language.
	 * 
	 * This function involves the subtraction of a pair of similar numbers when x is
	 * near 0 and the results are significantly erroneous in this region. Using pow
	 * instead of sqrt doesn't give better results.
	 * 
	 * A "good" answer is 4.99999999999999875... * 1e-16.
	 * 
	 * Can you modify f(x) to give a good approximation of f(x) in the neighborhood
	 * of 0?
	 */
	@Override
	public double f(double x) {
		return x / (1 + Math.sqrt(x + 1));
	}

	@Override
	public double mean(String town, String strng) {
		return 0;
	}

	@Override
	public double variance(String town, String strng) {
		return 0;
	}

	/**
	 * You are given a string with results of NBA teams (see the data in "Sample
	 * Tests") separated by commas e.g:
	 * 
	 * r = Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta
	 * Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112, Los Angeles Clippers 100
	 * Boston Celtics 120.
	 * 
	 * A team name is composed of one, two or more words built with letters or
	 * digits: Atlanta Hawks, Philadelphia 76ers...
	 * 
	 * Given a string of results and the name of a team (parameter : to_find) your
	 * function nba_cup (or nbaCup or ...) will return as a string
	 * 
	 * the name of the team followed by : and the number of matches won by the team
	 * the number of draws the number of matches lost by the team the total number
	 * of points scored by the team the total number of points conceded by the team
	 * and finally a kind of marks in our ranking system
	 * 
	 * a team marks 3 if it is a win a team marks 1 if it is a draw a team marks 0
	 * if it is a loss. The return format is:
	 * 
	 * "Team Name:W=nb of wins;D=nb of draws;L=nb of
	 * losses;Scored=nb;Conceded=nb;Points=nb" Remarks: The team name "" returns "".
	 * 
	 * If a team name can't be found in the given string of results you will return
	 * "Team Name:This team didn't play!" (See examples below).
	 * 
	 * The scores must be integers. If a score is a float number (abc.xyz...) you
	 * will return: "Error(float number):the concerned string"
	 * 
	 * Examples: nba_cup(r, "Los Angeles Clippers") -> "Los Angeles
	 * Clippers:W=1;D=0;L=1;Scored=204;Conceded=208;Points=3"
	 * 
	 * nba_cup(r, "Boston Celtics") -> "Boston
	 * Celtics:W=1;D=0;L=0;Scored=120;Conceded=100;Points=3"
	 * 
	 * nba_cup(r, "") -> ""
	 * 
	 * nba_cup(r, "Boston Celt") -> "Boston Celt:This team didn't play!"
	 * 
	 * r0="New York Knicks 101.12 Atlanta Hawks 112" nba_cup(r0, "Atlanta Hawks") ->
	 * "Error(float number):New York Knicks 101.12 Atlanta Hawks 112"
	 * 
	 * @param resultSheet
	 * @param toFind
	 * @return
	 */
	@Override
	public String nbaCup(String resultSheet, String toFind) {
		int wins = 0;
		int draws = 0;
		int losses = 0;
		int point = 0;
		int scored = 0;
		int consered = 0;
		String pattern = "((\\s?[0-9]*[A-Z]*[a-z]+)*)\\s([0-9\\.]+)\\s((\\s?[0-9]*[A-Z]*[a-z]+)*)\\s([0-9\\.]+)";
		List<String[]> lstOfResult = new ArrayList<String[]>();
		List<String> lsTeamResults = Arrays.stream(resultSheet.split(",")).filter(s -> s.contains(toFind))
				.collect(Collectors.toList());
		Pattern p = Pattern.compile(pattern);
		Matcher m;
		String resultString = "";
		if (toFind.equals("")) {
			return "";
		}
		for (String pairResult : lsTeamResults) {

			m = p.matcher(pairResult);
			m.find();
			try {
				lstOfResult.add(new String[] { m.group(1), m.group(3), m.group(4), m.group(6) });
			} catch (Exception e) {
				return "Error(float number):" + pairResult;
			}

		}
		if (lstOfResult.isEmpty()) {
			return toFind + ":This team didn't play!";
		}
		for (String[] pairResult : lstOfResult) {
			if (!pairResult[0].equals(toFind) && !pairResult[2].equals(toFind)) {
				return toFind + ":This team didn't play!";
			}
			if (Integer.parseInt(pairResult[1]) == Integer.parseInt(pairResult[3])) {
				draws++;
				point += 1;
				scored += Integer.parseInt(pairResult[1]);
				consered += Integer.parseInt(pairResult[3]);
			}
			if (pairResult[0].equals(toFind)) {
				if (Integer.parseInt(pairResult[1]) > Integer.parseInt(pairResult[3])) {
					wins++;
					point += 3;
					scored += Integer.parseInt(pairResult[1]);
					consered += Integer.parseInt(pairResult[3]);

				} else {
					losses++;
					scored += Integer.parseInt(pairResult[1]);
					consered += Integer.parseInt(pairResult[3]);
				}
			} else {
				if (Integer.parseInt(pairResult[1]) < Integer.parseInt(pairResult[3])) {
					wins++;
					scored += Integer.parseInt(pairResult[3]);
					consered += Integer.parseInt(pairResult[1]);
					point += 3;
				} else {

					scored += Integer.parseInt(pairResult[3]);
					consered += Integer.parseInt(pairResult[1]);
					losses++;
				}
			}
		}

		resultString = String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d", toFind, wins, draws, losses,
				scored, consered, point);
		return resultString;
	}
	

	/**
	 * A bookseller has lots of books classified in 26 categories labeled A, B, ...
	 * Z. Each book has a code c of 3, 4, 5 or more characters. The 1st character of
	 * a code is a capital letter which defines the book category. In the
	 * bookseller's stocklist each code c is followed by a space and by a positive
	 * integer n (int n >= 0) which indicates the quantity of books of this code in
	 * stock. For example an extract of a stocklist could be: L = {"ABART 20",
	 * "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}. or L = ["ABART 20", "CDXEF
	 * 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"] or .... You will be given a
	 * stocklist (e.g. : L) and a list of categories in capital letters e.g :
	 * 
	 * M = {"A", "B", "C", "W"} or M = ["A", "B", "C", "W"] or ... and your task is
	 * to find all the books of L with codes belonging to each category of M and to
	 * sum their quantity according to each category.
	 * 
	 * For the lists L and M of example you have to return the string (in
	 * Haskell/Clojure/Racket a list of pairs):
	 * 
	 * (A : 20) - (B : 114) - (C : 50) - (W : 0) where A, B, C, W are the
	 * categories, 20 is the sum of the unique book of category A, 114 the sum
	 * corresponding to "BKWRK" and "BTSQZ", 50 corresponding to "CDXEF" and 0 to
	 * category 'W' since there are no code beginning with W.
	 * 
	 * If L or M are empty return string is "" (Clojure and Racket should return an
	 * empty array/list instead).
	 * 
	 * @param lstOfArt       String[] stocklist
	 * @param lstOf1stLetter String[] category list
	 * 
	 * @return String
	 */
	@Override
	public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		int countBooks = 0;
		List<String> lstResult = new ArrayList<String>();
		String resultString = "";

		if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
			return "";
		}
		String pattern = "([A-Z]{1}[A-Z]{2,}[ ])([0-9]+)";
		Pattern p = Pattern.compile(pattern);
		for (String firstLetter : lstOf1stLetter) {
			countBooks = 0;
			for (String element : lstOfArt) {
				if (element.charAt(0) == firstLetter.charAt(0)) {
					Matcher m = p.matcher(element);
					m.find();
					countBooks += Integer.parseInt(m.group(2));
				}
			}
			lstResult.add("(" + firstLetter + " : " + countBooks + ")");
		}
		if (lstResult.size() > 1) {
			resultString += lstResult.get(0);
			for (int i = 1; i < lstResult.size(); i++) {
				resultString += " - " + lstResult.get(i);
			}
		} else {
			resultString += lstResult.get(0);
		}
		return resultString;
	}

}
