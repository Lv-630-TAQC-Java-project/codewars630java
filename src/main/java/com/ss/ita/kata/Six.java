package com.ss.ita.kata;

import java.util.List;

public interface Six {
    long findNb(double m);

    String balance(String book, String redactedBook);

    double f(double x);

    static abstract List<Double> mean(String town, String strng);

    double variance(String town, String strng);

    String nbaCup(String resultSheet, String toFind);

    String stockSummary(String[] lstOfArt, String[] lstOf1stLetter);
}
