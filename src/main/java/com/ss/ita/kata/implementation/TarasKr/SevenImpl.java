package com.ss.ita.kata.implementation.TarasKr;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
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
