package com.ss.ita.kata.implementation.TarasKr;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
	/**
	 * The accounts of the "Fat to Fit Club (FFC)" association are supervised by
	 * John as a volunteered accountant. The association is funded through financial
	 * donations from generous benefactors. John has a list of the first n
	 * donations: [14, 30, 5, 7, 9, 11, 15] He wants to know how much the next
	 * benefactor should give to the association so that the average of the first n
	 * + 1 donations should reach an average of 30. After doing the math he found
	 * 149. He thinks that he made a mistake. Could you help him?
	 * 
	 * if dons = [14, 30, 5, 7, 9, 11, 15] then new_avg(dons, 30) --> 149
	 * 
	 * The function new_avg(arr, navg) should return the expected donation (rounded
	 * up to the next integer) that will permit to reach the average navg.
	 * 
	 * Should the last donation be a non positive number (<= 0) John wants us to
	 * throw (or raise) an error or
	 * 
	 * return Nothing in Haskell return None in F#, Ocaml, Scala return -1 in C,
	 * Fortran, Nim, PowerShell, Go, Pascal, Prolog, Lua, Perl echo ERROR in Shell
	 * raise-argument-error in Racket so that he clearly sees that his expectations
	 * are not great enough.
	 * 
	 * Notes:
	 * 
	 * all donations and navg are numbers (integers or floats), arr can be empty.
	 * See examples below and "Test Samples" to see which return is to be done.
	 * 
	 * @param arr
	 * @param navg
	 * 
	 * @return expected donation (rounded up to the next integer)
	 */
	@Override
	public long newAvg(double[] arr, double navg) {
		long resAvg = 0;
		double sumArr = 0;

		for (double elementArr : arr) {
			sumArr += elementArr;
		}
		resAvg = (long) Math.ceil(navg * (arr.length + 1) - sumArr);
		if (resAvg <= 0) {
			throw new IllegalArgumentException("ERROR");
		}
		return resAvg;
	}
	/**
	 * Your task is to write a function which returns the sum of following series
	 * upto nth term(parameter).
	 * 
	 * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +... Rules: You need to round the
	 * answer to 2 decimal places and return it as String.
	 * 
	 * If the given value is 0 then it should return 0.00
	 * 
	 * You will only be given Natural Numbers as arguments.
	 * 
	 * Examples: SeriesSum(1) => 1 = "1.00" SeriesSum(2) => 1 + 1/4 = "1.25"
	 * SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
	 */

	@Override
	public String seriesSum(int n) {
		double tmpRes = 0;
		for (int i = 1; i <= n; i++) {
			tmpRes += 1.0 / (3 * (i - 1) + 1);
		}
		return String.format("%.2f", tmpRes);
	}

	@Override
	public int whereIsHe(int p, int bef, int aft) {
		return 0;
	}
}
