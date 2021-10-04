package com.ss.ita.kata.implementation.dzhyv;

import com.ss.ita.kata.Six;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long n = 0;
        long sum = 0;
        long count = 0;
        while (sum < m) {
            count++;
            n = count * count * count;
            sum = sum + n;
        }
        return sum == m ? count : -1;
    }

    @Override
    public String balance(String book) {
        String redactedBook = book.replaceAll("[^a-zA-Z0-9 .\n]", "");
        redactedBook = redactedBook.trim().replaceAll(" +", " ");
        String[] splitBook = redactedBook.split("\n");
        double originalBalance = Double.valueOf(splitBook[0]);
        String returnLine = "Original Balance: " + String.format("%.2f", originalBalance) + "\\r\\n";
        double newBalance = originalBalance;
        double totalExpense = 0;
        int count = 0;
        for (int i = 1; i < splitBook.length; i++) {
            if (!(splitBook[i].isEmpty())) {
                String[] splitLine = splitBook[i].split(" ");
                Double value = Double.valueOf(splitLine[2]);
                newBalance = newBalance - value;
                returnLine = returnLine + splitLine[0] + " " + splitLine[1] + " " + String.format("%.2f", value)
                        + " Balance " + String.format("%.2f", newBalance) + "\\r\\n";
                totalExpense = totalExpense + value;
                count++;
            } else {
                count--;
            }
        }
        return returnLine + "Total expense  " + String.format("%.2f", totalExpense) + "\\r\\nAverage expense  "
                + String.format("%.2f", (totalExpense / count));
    }

    @Override
    public double f(double x) {
        return x / (Math.sqrt(x + 1) + 1);
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
        double meanValue = mean(town, strng);
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
        String[] cityData = strTown.split(",");
        for (String i : cityData) {
            String[] monthData = i.split(" ");
            double diff = Double.valueOf(monthData[1]) - meanValue;
            sum = sum + diff * diff;
        }
        return sum / cityData.length;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind.isEmpty()) {
            return "";
        }

        String[] matches = Arrays.stream(resultSheet.split(",")).filter(s -> s.contains(toFind + " "))
                .toArray(String[]::new);
        if (matches.length == 0) {
            return toFind + ":This team didn't play!";
        }
        Pattern pattern = Pattern
                .compile("((\\s?[0-9]*[A-Z]*[a-z]+)+)\\s(\\d+)\\s((\\s?[0-9]*[A-Z]*[a-z]+)+)\\s(\\d+)");
        int wins = 0;
        int loses = 0;
        int draws = 0;
        int scored = 0;
        int conc = 0;
        for (String str : matches) {
            if (str.matches(".+\\d+\\.\\d+.+"))
                return "Error(float number):" + str;
            String team;
            int team1Score;
            int team2Score;
            Matcher matcher = pattern.matcher(str);
            if (!matcher.matches()) {
                continue;
            }
            team = matcher.group(1);
            team1Score = Integer.parseInt(matcher.group(3));
            team2Score = Integer.parseInt(matcher.group(6));
            int finalScore = (team.equals(toFind)) ? team1Score : team2Score;
            int otherScore = (finalScore == team1Score) ? team2Score : team1Score;
            if (finalScore > otherScore) {
                wins++;
            }
            if (finalScore < otherScore) {
                loses++;
            }
            if (finalScore == otherScore) {
                draws++;
            }
            scored = scored + finalScore;
            conc = conc + otherScore;
        }
        return toFind + ":W=" + wins + ";D=" + draws + ";L=" + loses + ";Scored=" + scored + ";Conceded=" + conc
                + ";Points=" + ((wins * 3) + draws);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        String returnString = "";
        for (String firstLetter : lstOf1stLetter) {
            int sum = 0;
            for (String art : lstOfArt) {
                if (art.charAt(0) == firstLetter.charAt(0)) {
                    String[] split = art.split(" ");
                    sum = sum + Integer.parseInt(split[1]);
                }
            }
            returnString = returnString + "(" + firstLetter + " : " + sum + ") - ";
        }
        return returnString.substring(0, returnString.length() - 3);
    }

    @Override
    public String toString() {
        String[] arr = this.getClass().getPackage().getName().split("\\.");
        return arr[arr.length - 1];
    }
}
