package com.ss.ita.kata.implementation.vladdmytriv;

import java.util.*;
import static java.lang.Double.*;
import static java.lang.String.*;

public class Six implements com.ss.ita.kata.Six {
    @Override
    public long findNb(long m) {
        return 0;
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
