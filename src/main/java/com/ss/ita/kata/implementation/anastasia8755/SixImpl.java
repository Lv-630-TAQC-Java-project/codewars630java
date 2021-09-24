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

        String[] search = strng.split("\n");
        String strTown = "";
        for (String searching : search) {
            if (searching.contains(town + ":")) {
                strTown = searching;
            }
        }
        double sum = 0;
        if (strTown.equals("")) {
            return -1;
        }
        strTown = strTown.replace(town + ":", "");
        String[] cityData = strTown.split(",");
        for (String i : cityData) {
            String[] monthData = i.split(" ");
            sum += Double.valueOf(monthData[1]);
        }
        return sum / cityData.length;
    }

    @Override
    public double variance(String town, String strng) {

        double average = mean(town, strng);
        double sum = 0;
        String[] search = strng.split("\n");
        String strTown = "";
        for (String searching : search) {
            if (searching.contains(town + ":")) {
                strTown = searching;
            }
        }
        if (strTown.equals("")) {
            return -1;
        }
        strTown = strTown.replace(town + ":", "");
        String[] city = strTown.split(",");
        for (String i : city) {
            String[] month = i.split(" ");
            double disp = Double.valueOf(month[1]) - average;
            sum += Math.pow(disp, 2);
        }
        return sum / city.length;
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
