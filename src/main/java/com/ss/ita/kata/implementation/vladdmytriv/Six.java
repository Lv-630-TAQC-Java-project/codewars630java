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
            Matcher matcher = pattern.matcher(gameInfo);
            if (!matcher.matches()) continue;

            String firstTeam = matcher.group(1);
            String secondTeam = matcher.group(4);
            int firstTeamScore = Integer.parseInt(matcher.group(3));
            int secondTeamScore = Integer.parseInt(matcher.group(6));
            int toFindTeamScore = (firstTeam.equals(toFind)) ? firstTeamScore : secondTeamScore;
            int otherTeamScore = (toFindTeamScore == firstTeamScore) ? secondTeamScore : firstTeamScore;

            if (toFindTeamScore == otherTeamScore) draws++;
            if (toFindTeamScore > otherTeamScore) wins++;
            if (toFindTeamScore < otherTeamScore) loses++;
            scored += toFindTeamScore;
            conceded += otherTeamScore;
        }
        return String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",
                toFind, wins, draws, loses, scored, conceded, wins * 3 + draws);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
