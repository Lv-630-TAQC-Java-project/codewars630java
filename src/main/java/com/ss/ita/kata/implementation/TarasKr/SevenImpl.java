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
	 * Vasya stands in line with number of people p (including Vasya), but he
	 * doesn't know exactly which position he occupies. He can say that there are no
	 * less than b people standing in front of him and no more than a people
	 * standing behind him. Find the number of different positions Vasya can occupy.
	 * 
	 * Input As an input you have 3 numbers:
	 * 
	 * 1. Total amount of people in the line;
	 * 
	 * 2. Number of people standing in front of him
	 * 
	 * 3. Number of people standing behind him
	 * 
	 * Examples: WhereIsVasya.whereIsHe(3, 1, 1) // => 2 The possible positions are:
	 * 2 and 3
	 * 
	 * WhereIsVasya.whereIsHe(5, 2, 3) // => 3 The possible positions are: 3, 4 and
	 * 5
	 */
	@Override
	public int whereIsHe(int p, int bef, int aft) {
		int count = 0;
		for (int i = bef + 1; i <= p; i++) {
			for (int j = p - aft; j <= p; j++) {
				if (i == j) {
					++count;
					break;
				}

			}
		}
		return count;
	}
}
