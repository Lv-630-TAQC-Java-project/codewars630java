package com.ss.ita.kata.implementation.NazarYakh;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
//        return (p-bef);
        int result;

        if (bef > aft){
            result = Math.min(p-bef, p-aft);
        } else {
            result = Math.max(p-bef, p-aft);
        }

        return result;
    }
}
