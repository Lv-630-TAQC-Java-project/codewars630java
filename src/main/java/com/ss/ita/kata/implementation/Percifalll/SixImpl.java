package com.ss.ita.kata.implementation.Percifalll;

import java.util.Arrays;

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
        if (!strng.contains(town + ":")) return - 1;

        double[] values = getRainfallValues(getTownRainfall(town, strng));

        return Arrays.stream(values).average().orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public double variance(String town, String strng) {
        if (!strng.contains(town + ":")) return - 1;

        double[] values = getRainfallValues(getTownRainfall(town, strng));
        double mean = mean(town, strng);

        return Arrays.stream(values)
                .map(n -> Math.pow(n - mean, 2))
                .average()
                .orElseThrow(IllegalArgumentException::new);
    }

    private static double[] getRainfallValues(String townInfo){
        return Arrays.stream(townInfo.split(","))
                .map(s -> s.split("\\s")[1])
                .mapToDouble(Double::parseDouble)
                .toArray();
    }

    private static String getTownRainfall(String town, String text){
        String[] lines = text.split("\n");
        return Arrays.stream(lines)
                .filter(s -> s.contains(town))
                .map(s -> s.substring(s.indexOf(":") + 1))
                .findFirst()
                .orElse(null);
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
