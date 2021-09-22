package com.ss.ita.kata.implementation.dzhyv;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
    	long newAvrg;
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
          sum = arr[i] + sum; 
        }
        newAvrg = (int)Math.ceil((navg*(arr.length + 1)) - (sum)); 
        if (newAvrg <= 0) {
          throw new IllegalArgumentException();
        }
        return newAvrg;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
    	return Math.min(p - bef, aft + 1);
    }
}
