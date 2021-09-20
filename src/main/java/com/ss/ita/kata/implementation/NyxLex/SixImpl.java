package com.ss.ita.kata.implementation.NyxLex;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Double.parseDouble;
import static java.lang.String.*;

public class SixImpl implements com.ss.ita.kata.Six {
    @Override
    public long findNb(long m) {
        long x = 1;
        long y = 0;
        while (y<=m) {
            y += Math.pow(x, 3);
            if (y == m) return x;
            x += 1;

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
