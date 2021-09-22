package com.ss.ita.kata.implementation.Percifalll;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.math.BigInteger;
import java.util.*;

public class SixImpl implements com.ss.ita.kata.Six {
    /**
     * Your task is to construct a building which will be a pile of n cubes.
     * The cube at the bottom will have a volume of n^3,
     * the cube above will have volume of (n-1)^3 and so on
     * until the top which will have a volume of 1^3.
     *
     * You are given the total volume m of the building.
     * Being given m can you find the number n of cubes you will have to build?
     *
     * The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be an integer m
     * and you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists
     * or -1 if there is no such n.
     */
    @Override
    public long findNb(long m) {
        if (m == 0) return 0;
        long value = m;
        long i;

        for (i = 1; value > 0; i++) {
            value -= (long) Math.pow(i, 3);
        }

        if (value == 0) return i - 1;
        else return -1;
    }

    @Override
    public String balance(String book) {
        if (book == null || book.length() == 0) throw new IllegalArgumentException();

        // Cleaning
        String[] lines = book.split("\n");
        String[] cleanedLines = Arrays.stream(lines)
                .map(s -> s.replaceAll("[^a-zA-Z0-9 .]*", ""))
                .map(s -> s.replaceAll("( {2})+", " "))
                .map(s -> s.replaceAll("\\s*$", ""))
                .toArray(String[]::new);
        cleanedLines[0] = cleanedLines[0].replaceAll("\\s*", "");

        // Getting expenses array from cleaned lines
        double[] expenses = Arrays.stream(
                // Those are info lines with prices and more
                Arrays.copyOfRange(cleanedLines, 1, cleanedLines.length))
                .map(s -> s.split("\\s"))
                .map(array -> array[array.length - 1])
                .mapToDouble(Double::parseDouble)
                .toArray();

        double balance = Double.parseDouble(cleanedLines[0]);
        double sum = Arrays.stream(expenses).sum();
        double avg = Math.round(sum / expenses.length * 100.0) / 100.0;

        cleanedLines[0] = String.format("\n\rOriginal Balance: %.2f", balance);

        double currentBalance = balance;
        for (int i = 1; i < cleanedLines.length; i++) {
            currentBalance -= expenses[i - 1];
            cleanedLines[i] += String.format(" Balance %.2f", currentBalance);
        }

        String[] result = Arrays.copyOf(cleanedLines, cleanedLines.length + 2);
        result[result.length - 2] = String.format("Total expense  %.2f", sum);
        result[result.length - 1] = String.format("Average_expense  %.2f", avg);

        return String.join("\n\r", result);
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
        if (lstOfArt == null || lstOfArt.length == 0) return "";
        if (lstOf1stLetter == null || lstOf1stLetter.length == 0) return "";

        Map<String, List<String>> map = new HashMap<>();
        List<String> categories = Arrays.asList(lstOf1stLetter);
        categories.forEach(c -> map.put(c, new ArrayList<>()));

        for (String code : lstOfArt) {
            String firstLetter = code.substring(0, 1);
            if (categories.contains(firstLetter)) {
                List<String> temp = map.get(firstLetter);
                temp.add(code);
            }
        }

        List<String> formatted = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String category = entry.getKey();
            int sum = entry.getValue().stream()
                    .map(s -> s.replaceAll("\\D*", ""))
                    .mapToInt(Integer::parseInt)
                    .sum();
            formatted.add(String.format("(%s : %d)", category, sum));
        }
        return String.join(" - ", formatted);
    }
}
