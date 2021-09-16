package com.ss.ita.kata.implementation.vladdmytriv;

import com.ss.ita.kata.Seven;

import java.text.DecimalFormat;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0.00;
        if(n==0){
            return String.valueOf(sum);
        }
        else {
            for (int j = 0; j < n; j++) {
                sum += 1.0 / (double) (1 + j * 3);
            }
            double sum1 = Math.round(sum*100)/100D;
            return String.valueOf(sum1);
        }
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
