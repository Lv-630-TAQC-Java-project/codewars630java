package com.ss.ita.kata.implementation.vladdmytriv;

import static java.lang.Double.parseDouble;
import static java.lang.String.*;

public class Six implements com.ss.ita.kata.Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String[] bookMass = book
                .replaceAll("[^a-zA-Z0-9 .\n]", "")
                //.replaceAll("[-+!?/@#$%^&*(){},'`~Ё:<>=;]", "")
                .split("\n");
        int numberOfPurchase = bookMass.length - 1;

        double expense = 0;
        double originalBalance = parseDouble(bookMass[0]);
        bookMass[0]="Original Balance: " + originalBalance;
        for (int i = 1; i < bookMass.length; i++) {
            String[] oneLine = bookMass[i].split(" ");
            double price = parseDouble(oneLine[2]);
            expense += price;
            String newBalance = valueOf(originalBalance - price);
            bookMass[i] = join(" ", oneLine).concat(" Balance " + newBalance);
        }
        String finalLine = join("\n", bookMass).concat("\nTotal expense " + format("%.2f",expense) + "\nAverage expense " + format("%.2f",expense / numberOfPurchase)).replaceAll(",",".");
        return finalLine;
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
