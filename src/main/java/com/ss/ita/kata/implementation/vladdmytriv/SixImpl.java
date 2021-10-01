package com.ss.ita.kata.implementation.vladdmytriv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Double.parseDouble;
import static java.lang.Math.pow;
import static java.lang.String.*;

public class SixImpl implements com.ss.ita.kata.Six {

    @Override
    public long findNb(long m) {
        for (int n = 0; ; n++) {
            if (m > 0) {
                int cubeVol = (int) pow(n + 1, 3);
                m -= cubeVol;
            } else {
                if (m == 0) {
                    return n;
                }
            }
        }
    }


    @Override
    public String balance(String book) {
        String[] bookMass = book
                .replaceAll("[^a-zA-Z0-9 .\n]", "")
                .split("\n");
        int numberOfPurchase = bookMass.length - 1;

        double expense = 0;
        double originalBalance = parseDouble(bookMass[0]);
        double between = originalBalance;
        bookMass[0] = "Original Balance: " + format("%.2f",originalBalance);
        for (int i = 1; i < bookMass.length; i++) {
            String[] oneLine = bookMass[i].split(" ");
            double price = parseDouble(oneLine[2]);
            expense += price;
            between -= price;
            String newBalance = String.valueOf(format("%.2f", between));
            bookMass[i] = join(" ", oneLine).concat(" Balance " + newBalance);
        }
        String finalLine = join("\n", bookMass).concat("\nTotal expense " + format("%.2f", expense) + "\nAverage expense " + format("%.2f", expense / numberOfPurchase)).replaceAll(",", ".");
        return finalLine;
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(x + 1));
    }

    public String getTownWithMonthRainfall(String town, String strng) {
        String[] dataBase = strng.split("\n");
        String oneLine = "";
        for (String townRainfall : dataBase) {
            if (townRainfall.contains(town + ":")) {
                oneLine = townRainfall.replaceAll("[^0-9 ,.]", "");
            }
        }
        if (oneLine.equals("")) {
            return String.valueOf(-1);
        }
        return oneLine;
    }

    @Override
    public double mean(String town, String strng) {
        double perYear = 0;
        String[] monthes = getTownWithMonthRainfall(town, strng).split(",");
        for (int k = 0; k < monthes.length; k++) {
            perYear += parseDouble(monthes[k]);
        }
        if (perYear == -1) {
            return -1;
        } else {
            return perYear / monthes.length;
        }
    }


    @Override
    public double variance(String town, String strng) {
        double sumOfDiff = 0;
        double average = mean(town, strng);
        if (average == -1) {
            return -1;
        } else {
            String[] rainfallsPerMonth = getTownWithMonthRainfall(town, strng).split(",");
            int numberOfMonths = rainfallsPerMonth.length;
            double diff = 0;
            for (int i = 0; i < numberOfMonths; i++) {
                diff = pow((average - parseDouble(rainfallsPerMonth[i])), 2);
                sumOfDiff += diff;
            }
            return sumOfDiff / numberOfMonths;
        }
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
            String categoryWithNumber = "(".concat(lstOf1stLetter[k].concat(" : " + counts.get(k))).concat(")");
            category.add(categoryWithNumber);
        }
        String result = join(" - ", category);
        return result;
    }
}