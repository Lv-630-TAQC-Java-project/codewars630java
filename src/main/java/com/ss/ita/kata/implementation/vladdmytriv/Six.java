package com.ss.ita.kata.implementation.vladdmytriv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        int wins = 0, loses = 0, draws = 0, scored = 0, conceded = 0;

        if (toFind.equals("")) return "";

        String[] teamGames = Arrays.stream(resultSheet.split(","))
                .filter(s -> s.contains(toFind))
                .toArray(String[]::new);

        if (teamGames.length == 0) return String.format("%s:This team didn't play!", toFind);

        Pattern pattern = Pattern.compile("((\\s?[0-9]*[A-Z]*[a-z]+)+)\\s(\\d+)\\s((\\s?[0-9]*[A-Z]*[a-z]+)+)\\s(\\d+)");
        for (String gameInfo : teamGames) {
            if (gameInfo.matches(".+\\d+\\.\\d+.+")) return "Error(float number):" + gameInfo;
        }
            return null;
        }
    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
