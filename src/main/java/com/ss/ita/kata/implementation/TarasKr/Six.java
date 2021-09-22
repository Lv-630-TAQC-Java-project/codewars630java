package com.ss.ita.kata.implementation.TarasKr;

public class Six implements com.ss.ita.kata.Six {
	/**
	 * Your task is to construct a building which will be a pile of n cubes. The
	 * cube at the bottom will have a volume of n^3, the cube above will have volume
	 * of (n-1)^3 and so on until the top which will have a volume of 1^3.
	 * 
	 * You are given the total volume m of the building. Being given m can you find
	 * the number n of cubes you will have to build?
	 * 
	 * The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be
	 * an integer m and you have to return the integer n such as n^3 + (n-1)^3 + ...
	 * + 1^3 = m if such a n exists or -1 if there is no such n.
	 * 
	 * Examples: findNb(1071225) --> 45
	 * 
	 * findNb(91716553919377) --> -1
	 * 
	 * @param m
	 * 
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
		return null;
	}
}
