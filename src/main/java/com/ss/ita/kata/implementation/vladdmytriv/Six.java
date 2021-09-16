package com.ss.ita.kata.implementation.vladdmytriv;

public class Six implements com.ss.ita.kata.Six {
    @Override
    public long findNb(long m) {
        for (int n = 0;;n++) {
            if (m > 0) {
                int cubeVol = (int) Math.pow(n + 1, 3);
                m -= cubeVol;
            } else {
                if (m == 0) {
                    return n;
                } else {
                    if (m >= 0) {
                        return (-1);
                    }
                }
            }
        }
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
