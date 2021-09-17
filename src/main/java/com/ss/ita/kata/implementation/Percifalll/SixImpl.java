package com.ss.ita.kata.implementation.Percifalll;

import java.util.Arrays;

public class SixImpl implements com.ss.ita.kata.Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        if (book == null || book.length() == 0) throw new IllegalArgumentException();

        // Cleaning
        String[] lines = book.split("\n");
        String[] cleanedLines = Arrays.stream(lines)
                .map(s -> s.replaceAll("[^a-zA-Z0-9 .]*", ""))
                .map(s -> s.replaceAll("( {2})+", " "))
                .map(s -> s.replaceAll("\\s*$", ""))
                .toArray(String[]::new);
        cleanedLines[0] = cleanedLines[0].replaceAll("\\s*", "");

        // Getting expenses array from cleaned lines
        double[] expenses = Arrays.stream(
                // Those are info lines with prices and more
                Arrays.copyOfRange(cleanedLines, 1, cleanedLines.length))
                .map(s -> s.split("\\s"))
                .map(array -> array[array.length - 1])
                .mapToDouble(Double::parseDouble)
                .toArray();

        double balance = Double.parseDouble(cleanedLines[0]);
        double sum = Arrays.stream(expenses).sum();
        double avg = Math.round(sum / expenses.length * 100.0) / 100.0;

        cleanedLines[0] = String.format("\n\rOriginal Balance: %.2f", balance);

        double currentBalance = balance;
        for (int i = 1; i < cleanedLines.length; i++) {
            currentBalance -= expenses[i - 1];
            cleanedLines[i] += String.format(" Balance %.2f", currentBalance);
        }

        String[] result = Arrays.copyOf(cleanedLines, cleanedLines.length + 2);
        result[result.length - 2] = String.format("Total expense  %.2f", sum);
        result[result.length - 1] = String.format("Average_expense  %.2f", avg);

        return String.join("\n\r", result);
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
