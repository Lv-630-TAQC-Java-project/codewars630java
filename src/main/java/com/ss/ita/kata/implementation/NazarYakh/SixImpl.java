package com.ss.ita.kata.implementation.NazarYakh;

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
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0)
            return "";

        StringBuilder output = new StringBuilder();

        for (String letter : lstOf1stLetter) {
            int counter = 0;
            for (String name : lstOfArt) {
                if (name.charAt(0) == letter.charAt(0)) {
                    String[] parts = name.split(" ");
                    counter += Integer.parseInt(parts[1]);
                }
            }
            output.append("(")
                    .append(letter.charAt(0))
                    .append(" : ")
                    .append(counter)
                    .append(") - ");
        }
        return output.toString().replaceAll(" - $", "");
    }
}
