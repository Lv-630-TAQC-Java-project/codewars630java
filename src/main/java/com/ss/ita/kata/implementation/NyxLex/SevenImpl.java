package com.ss.ita.kata.implementation.NyxLex;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        int counter = 4;
        double sum=1;

        for (int i = 1; i < n; i++) {
            sum+=(double) 1/counter;
            counter+=3;

        }
        double scale = Math.pow(10, 2);

        return String.valueOf(Math.round(sum * scale) / scale);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
