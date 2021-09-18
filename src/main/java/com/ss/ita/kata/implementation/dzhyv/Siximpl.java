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
		return null;
	}
}
