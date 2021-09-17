package com.ss.ita.kata.implementation.NazarYakh;

public class SixImpl implements com.ss.ita.kata.Six {
    @Override
    public long findNb(long m) {
        long num = 0;
        long sum = 0;
        while(sum < m){
            num += 1;
            sum +=  (num*num*num);
        }
        if(sum == m){
            return num;
        }
        return -1;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
