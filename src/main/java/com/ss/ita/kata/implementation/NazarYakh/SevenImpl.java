package com.ss.ita.kata.implementation.NazarYakh;
import java.util.Arrays;
import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        if (navg < 0){
            throw new IllegalArgumentException("Only Positive Numbers");
        }
        double result = navg * (arr.length + 1) - Arrays.stream(arr).parallel().sum();
        return (long) Math.ceil(result);
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
