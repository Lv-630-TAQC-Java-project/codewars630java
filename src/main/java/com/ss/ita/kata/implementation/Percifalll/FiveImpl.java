package com.ss.ita.kata.implementation.Percifalll;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] garden) {
        int left = 0, area = 0, record = 1;
        for(int i = 1; i < garden.length; i++){
            if(garden[i] < garden[i - 1]) left = i;
            else if(garden[i] > garden[i-1]){
                area = Math.max(area, record);
                record = i - left;
            }
            record++;
        }
        return Math.max(area, record);
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
