package com.ss.ita.kata.implementation.vladdmytriv;

import static java.lang.Double.parseDouble;
import java.util.*;
import static java.lang.Double.*;
import static java.lang.String.*;

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
        return x / (1 + Math.sqrt(x + 1));
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
        int count = 0;
        ArrayList<Integer> counts = new ArrayList<Integer>();
        ArrayList<String> category = new ArrayList<String>();

        if (lstOfArt == null || lstOf1stLetter == null) {
            return "";
        }

        for (int j = 0; j < lstOf1stLetter.length; j++) {
            for (int i = 0; i < lstOfArt.length; i++) {
                if (lstOfArt[i].startsWith(lstOf1stLetter[j])) {
                    String[] howMuch = lstOfArt[i].split(" ");
                    count += parseDouble(howMuch[1]);
                }
            }
            counts.add(count);
            count = 0;
        }
        for (int k = 0; k < lstOf1stLetter.length; k++) {
           String categoryWithNumber = "(".concat(lstOf1stLetter[k].concat(" : " + String.valueOf(counts.get(k)))).concat(")");
           category.add(categoryWithNumber);
        }
        String result =join(" - ",category);
        return result;
    }
}
