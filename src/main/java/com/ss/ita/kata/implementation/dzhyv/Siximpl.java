package com.ss.ita.kata.implementation.dzhyv;

public class Siximpl implements com.ss.ita.kata.Six {
	@Override
	public long findNb(long m) {
		return 0;
	}

	@Override
	public String balance(String book) {
		return null;
	}

	@Override
	public double f(double x) {
		return 0;
	}

	@Override
	public double mean(String town, String strng) {
		return 0;
	}

	@Override
	public double variance(String town, String strng) {
		return 0;
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
