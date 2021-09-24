package com.ss.ita.kata.implementation.anastasia8755;

public class SixImpl implements com.ss.ita.kata.Six {
    @Override
    public long findNb(long m) {
        for (int cubeCount = 0; ; cubeCount++) {
            //n^3 + (n-1)^3 + ... + 1^3 = m if m=0 => cubeCount=0
            if (m > 0) {
                long currCubeVol = (long) Math.pow(cubeCount + 1, 3);
                m = (long) m - currCubeVol;

            } else if (m == 0) {
                return cubeCount;

            } else if (m < 0) {
                return (-1);
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
