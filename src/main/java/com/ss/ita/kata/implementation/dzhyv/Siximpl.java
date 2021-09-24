package com.ss.ita.kata.implementation.dzhyv;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
    	long n = 0;
        long sum = 0;
        long count = 0;
        while (sum < m){
          count++;
          n = count * count * count;
          sum = sum + n;
          }
        return sum == m ? count : -1;
    }

    @Override
	  public String balance(String book) {
		String redactedBook = book.replaceAll("[^a-zA-Z0-9 .\n]", "");
		redactedBook = redactedBook.trim().replaceAll(" +", " ");
		String[] splitBook = redactedBook.split("\n");
		double originalBalance = Double.valueOf(splitBook[0]);
		String returnLine = "Original Balance: " + String.format("%.2f", originalBalance) + "\\r\\n";
		double newBalance = originalBalance;
		double totalExpense = 0;
		int count = 0;
		for (int i = 1; i < splitBook.length; i++) {
			if (!(splitBook[i].isEmpty())) {
				String[] splitLine = splitBook[i].split(" ");
				Double value = Double.valueOf(splitLine[2]);
				newBalance = newBalance - value;
				returnLine = returnLine + splitLine[0] + " " + splitLine[1] + " " + String.format("%.2f", value)
						+ " Balance " + String.format("%.2f", newBalance) + "\\r\\n";
				totalExpense = totalExpense + value;
				count++;
			} else {
				count--;
			}
		}
		return returnLine + "Total expense  " + String.format("%.2f", totalExpense) + "\\r\\nAverage expense  "
				+ String.format("%.2f", (totalExpense / count));
	}

	@Override
	public double f(double x) {
		return 0;
	}

	@Override
	public double mean(String town, String strng) {
		String[] search = strng.split("\n");
		String strTown = "";
		for (String searching : search) {
			if (searching.contains(town + ":")) {
				strTown = searching;
			}
		}
		double sum = 0;
		if (strTown.equals("")) {
			return -1;
		}
		strTown = strTown.replace(town + ":", "");
		String[] cityData = strTown.split(",");
		for (String i : cityData) {
			String[] monthData = i.split(" ");
			sum += Double.valueOf(monthData[1]);
		}
		return sum / cityData.length;
	}

	@Override
	public double variance(String town, String strng) {
		double meanValue = mean(town, strng);
		double sum = 0;
		String[] search = strng.split("\n");
		String strTown = "";
		for (String searching : search) {
			if (searching.contains(town + ":")) {
				strTown = searching;
			}
		}
		if (strTown.equals("")) {
			return -1;
		}
		strTown = strTown.replace(town + ":", "");
		String[] cityData = strTown.split(",");
		for (String i : cityData) {
			String[] monthData = i.split(" ");
			double diff = Double.valueOf(monthData[1]) - meanValue;
			sum = sum + diff * diff;
		}
		return sum / cityData.length;
	}

	@Override
	public String nbaCup(String resultSheet, String toFind) {
		return null;
	}

	@Override
	public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
			return "";
		}
		String returnString = "";
		for (String firstLetter : lstOf1stLetter) {
			int sum = 0;
			for (String art : lstOfArt) {
				if (art.charAt(0) == firstLetter.charAt(0)) {
					String[] split = art.split(" ");
					sum = sum + Integer.parseInt(split[1]);
				}
			}
			returnString = returnString + "(" + firstLetter + " : " + sum + ") - ";
		}
		return returnString.substring(0, returnString.length() - 3);
	}
}
