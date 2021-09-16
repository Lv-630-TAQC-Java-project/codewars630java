package com.ss.ita.kata.implementation.dzhyv;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
    	double sum = 0;
        double divisor = 1;
        for (int i = 0; i < n; i++){
          sum = sum + 1/divisor;
          divisor = divisor + 3;
        }
        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
