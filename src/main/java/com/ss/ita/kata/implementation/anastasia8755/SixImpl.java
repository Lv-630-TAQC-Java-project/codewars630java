package com.ss.ita.kata.implementation.anastasia8755;

public class SixImpl implements com.ss.ita.kata.Six {
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
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        String result = "";
        for (String firstLetter : lstOf1stLetter) {
            int sum = 0;
            for (String art : lstOfArt) {
                if (art.charAt(0) == firstLetter.charAt(0)) {
                    String[] split = art.split(" ");
                    sum += Integer.parseInt(split[1]);
                }
            }
            result += "(" + firstLetter + " : " + sum + ") - ";
        }
        return result.substring(0, result.length() - 3);
    }
}
