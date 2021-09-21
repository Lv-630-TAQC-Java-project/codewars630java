package com.ss.ita.kata.implementation.Percifalll;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        if (toFind.equals("")) return "";

        String[] teamMatches = Arrays.stream(resultSheet.split(","))
                .filter(s -> s.contains(toFind + " "))
                .toArray(String[]::new);

        if (teamMatches.length == 0) return String.format("%s:This team didn't play!", toFind);

        // Regex pattern to find teams and scores by groups
        Pattern pattern = Pattern.compile("((\\s?[0-9]*[A-Z]*[a-z]+)+)\\s(\\d+)\\s((\\s?[0-9]*[A-Z]*[a-z]+)+)\\s(\\d+)");
        int wins = 0, loses = 0, draws = 0, scored = 0, conceded = 0;
        for (String gameInfo : teamMatches) {
            if (gameInfo.matches(".+\\d+\\.\\d+.+")) return "Error(float number):" + gameInfo;

            String firstTeam, secondTeam;
            int firstTeamScore, secondTeamScore;

            Matcher matcher = pattern.matcher(gameInfo);
            if (!matcher.matches()) continue;

            firstTeam = matcher.group(1);
            secondTeam = matcher.group(4);
            firstTeamScore = Integer.parseInt(matcher.group(3));
            secondTeamScore = Integer.parseInt(matcher.group(6));

            int toFindScore = (firstTeam.equals(toFind)) ? firstTeamScore : secondTeamScore;
            int otherScore = (toFindScore == firstTeamScore) ? secondTeamScore : firstTeamScore;

            if (toFindScore == otherScore) draws++;
            if (toFindScore > otherScore) wins++;
            if (toFindScore < otherScore) loses++;

            scored += toFindScore;
            conceded += otherScore;
        }
        return String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",
                toFind, wins, draws, loses, scored, conceded, wins * 3 + draws);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
