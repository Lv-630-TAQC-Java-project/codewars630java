package com.ss.ita.kata.implementation.vladdmytriv;

public class Six implements com.ss.ita.kata.Six {
    @Override
    public long findNb(long m) {
        int n = 0;
        int i = 1;
        do {
            m -= Math.pow(i, 3);
            n++;
        }
        while (m == 0);
        return n;
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
