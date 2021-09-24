package com.ss.ita.kata.implementation.NyxLex;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Double.parseDouble;
import static java.lang.Math.pow;
import static java.lang.String.*;

public class SixImpl implements com.ss.ita.kata.Six {
    @Override
    public long findNb(long m) {
        long x = 1;
        long y = 0;
        while (y <= m) {

            y += pow(x, 3);
            if (y == m) return x;
            x += 1;
        }
        return -1;
    }

    @Override
    public String balance(String book) {
        String[] bookMass = book
                .replaceAll("[-+!?/@#$%^&*(){},'`~Ё:<>=;]", "")
                .split("\n");
        int numberOfPurchase = bookMass.length - 1;

        double expense = 0;
        double originalBalance = parseDouble(bookMass[0]);
        double price;
        double scale = Math.pow(10, 2);
        BigDecimal bd = new BigDecimal(originalBalance);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        originalBalance = Math.ceil(originalBalance * scale) / scale;
        bookMass[0] = "Original Balance: " + bd;
        for (int i = 1; i < bookMass.length; i++) {
            String[] oneLine = bookMass[i].split(" ");
            price = parseDouble(oneLine[2]);
            expense += price;
            String newBalance = valueOf(originalBalance - price);

            price = Math.ceil(price * scale) / scale;
            originalBalance -= price;

            originalBalance = Math.round(originalBalance * scale) / scale;

            double number = parseDouble(newBalance);

            number = Math.round(number * scale) / scale;

            String newBalance_2 = valueOf(number);
            bookMass[i] = join(" ", oneLine).concat(" Balance " + newBalance_2);
        }
        return join("\\r\\n", bookMass).concat("\\r\\nTotal expense " + format("%.2f", expense)
                + "\\r\\nAverage expense " + format("%.2f", expense / numberOfPurchase)).replaceAll(",", ".");
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(x + 1));
    }


    @Override
    public double mean(String town, String strng) {
        String[] strArr = strng.split("\n");
        String str = "0";
        for (String s : strArr) {
            if (s.contains(town + ":")) {
                str = s;
            }
        }
        double sum = 0;

        str = str.replace(town + ":", "");
        String[] cityData = str.split(",");
        for (String s : cityData) {
            String[] monthData = s.split(" ");
            sum += parseDouble(monthData[1]);
        }
        if (str.equals("0"))
            return -1;

        return sum / 12;
    }

    @Override
    public double variance(String town, String strng) {
        double sum = 0;
        String[] strArr = strng.split("\n");
        String str = "0";
        for (String s : strArr) {
            if (s.contains(town + ":")) {
                str = s;
            }
        }

        str = str.replace(town + ":", "");

        String[] cityData = str.split(",");
        for (String i : cityData) {
            String[] monthData = i.split(" ");
            double a = mean(town, strng);
            double diff = parseDouble(monthData[1]) - a;
            sum += diff * diff;
        }

        if (str.equals("0"))
            return -1;

        return sum / 12;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        String[] nbaResults = Arrays.stream(resultSheet.split(","))
                .filter(s -> s.contains(toFind + " "))
                .toArray(String[]::new);

        Pattern pattern = Pattern.compile("((\\s?[0-9]*[A-Z]*[a-z]+)+)\\s(\\d+)\\s((\\s?[0-9]*[A-Z]*[a-z]+)+)\\s(\\d+)");
        int wins = 0, loses = 0, draws = 0, scored = 0, conceded = 0;
        for (String gameInfo : nbaResults) {
            String team;
            int firstTeamScore, secondTeamScore;
            Matcher matcher = pattern.matcher(gameInfo);
            if (!matcher.matches()) continue;
            team = matcher.group(1);
            firstTeamScore = Integer.parseInt(matcher.group(3));
            secondTeamScore = Integer.parseInt(matcher.group(6));
            int finalScore = (team.equals(toFind)) ? firstTeamScore : secondTeamScore;
            int otherScore = (finalScore == firstTeamScore) ? secondTeamScore : firstTeamScore;
            if (finalScore == otherScore)
                draws++;
            if (finalScore > otherScore)
                wins++;
            if (finalScore < otherScore)
                loses++;
            if (finalScore == otherScore)
                draws++;
            scored += finalScore;
            conceded += otherScore;
        }

        if (nbaResults.length == 0)
            return toFind + ":This team didn't play!";

        return format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",
                toFind, wins, draws, loses, scored, conceded, wins * 3 + draws);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String eachLetter : lstOf1stLetter) {
            int sum = 0;
            for (String art : lstOfArt) {
                if (art.charAt(0) == eachLetter.charAt(0)) {
                    String[] split = art.split(" ");
                    sum = sum + Integer.parseInt(split[1]);
                }
            }
            stringBuilder.append("(").append(eachLetter).append(" : ").append(sum).append(") - ");
        }
        return stringBuilder.substring(0, stringBuilder.length() - 3);
    }
}


