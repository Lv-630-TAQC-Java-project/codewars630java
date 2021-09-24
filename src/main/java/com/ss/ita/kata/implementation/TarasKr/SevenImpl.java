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
     * <p>
     * if dons = [14, 30, 5, 7, 9, 11, 15] then new_avg(dons, 30) --> 149
     * <p>
     * The function new_avg(arr, navg) should return the expected donation (rounded
     * up to the next integer) that will permit to reach the average navg.
     * <p>
     * Should the last donation be a non positive number (<= 0) John wants us to
     * throw (or raise) an error or
     * <p>
     * return Nothing in Haskell return None in F#, Ocaml, Scala return -1 in C,
     * Fortran, Nim, PowerShell, Go, Pascal, Prolog, Lua, Perl echo ERROR in Shell
     * raise-argument-error in Racket so that he clearly sees that his expectations
     * are not great enough.
     * <p>
     * Notes:
     * <p>
     * all donations and navg are numbers (integers or floats), arr can be empty.
     * See examples below and "Test Samples" to see which return is to be done.
     *
     * @param arr
     * @param navg
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
     * <p>
     * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +... Rules: You need to round the
     * answer to 2 decimal places and return it as String.
     * <p>
     * If the given value is 0 then it should return 0.00
     * <p>
     * You will only be given Natural Numbers as arguments.
     * <p>
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

    /**
     * Vasya stands in line with number of people p (including Vasya), but he
     * doesn't know exactly which position he occupies. He can say that there are no
     * less than b people standing in front of him and no more than a people
     * standing behind him. Find the number of different positions Vasya can occupy.
     * <p>
     * Input As an input you have 3 numbers:
     * <p>
     * 1. Total amount of people in the line;
     * <p>
     * 2. Number of people standing in front of him
     * <p>
     * 3. Number of people standing behind him
     * <p>
     * Examples: WhereIsVasya.whereIsHe(3, 1, 1) // => 2 The possible positions are:
     * 2 and 3
     * <p>
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
