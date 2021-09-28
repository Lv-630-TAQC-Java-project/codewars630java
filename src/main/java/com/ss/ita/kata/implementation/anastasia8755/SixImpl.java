package com.ss.ita.kata.implementation.anastasia8755;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SixImpl implements com.ss.ita.kata.Six {
    @Override
    public long findNb(long m) {
        for (int cubeCount = 0; ; cubeCount++) {
            //n^3 + (n-1)^3 + ... + 1^3 = m if m=0 => cubeCount=0
            if (m > 0) {
                long currCubeVol = (long) Math.pow(cubeCount + 1, 3);
                m = m - currCubeVol;

            } else if (m == 0) {
                return cubeCount;

            } else if (m < 0) {
                return (-1);
            }
        }
    }

    @Override
    public String balance(String book) {


        String resultBook = "";
        String formBook = "";
        int start = 0;
        int end = 0;
        List<String> Book = new ArrayList<String>();  //import java.util.*; import java.util.regex.Matcher; import java.util.regex.Pattern;
        double balance = 0;
        double totalExpence = 0;
        String pattern = "[a-zA-Z 0-9\\.\\n]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(book);
        if (m.matches()) {
            formBook = book;
        } else {
            m.reset();

            while (m.find()) {
                formBook += (book.substring(m.start(), m.end()));
            }
        }

        end = formBook.indexOf("\n", start);
        while (end != -1) {
            Book.add(formBook.substring(start, end));
            start = end + 1;
            end = formBook.indexOf("\n", start);
        }
        Book.add(formBook.substring(start));

        pattern = "(\\d+)(\\D+)(\\d+\\.{0,1}\\d{0,2})";
        p = Pattern.compile(pattern);
        resultBook += "Original Balance: " + Book.get(0) + "\\r\\n";
        balance = Double.valueOf(Book.get(0));
        for (int i = 1; i < Book.size(); i++) {
            m = p.matcher(Book.get(i));
            while (m.find()) {
                balance -= Double.valueOf(m.group(3));
                resultBook = resultBook + m.group(1) + " " + m.group(2).trim() + " " + m.group(3).trim() + " Balance "
                        + String.format("%.2f", balance) + "\\r\\n";
                totalExpence += Double.valueOf(m.group(3));
            }
        }
        resultBook += "Total expense  " + String.format("%.2f", (totalExpence)) + "\\r\\n";
        resultBook += "Average expense  " + String.format("%.2f", (totalExpence / (Book.size() - 1)));
        return resultBook;
    }

    @Override
    public double f(double x) {
        return x / (Math.sqrt(1 + x) + 1);
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
        List<String> games = Arrays.stream(resultSheet.split(","))
                .filter(x -> x.contains(toFind + " "))
                .collect(Collectors.toList());

        if (toFind.isEmpty()) {
            return "";
        }
        if (games.isEmpty()) {
            return toFind + ":This team didn't play!";
        }
        List<String[]> teams = games.stream()
                .map(game -> game.split("\\s\\d+(\\W|$)"))
                .collect(Collectors.toList());
        List<Integer[]> scores = games.stream()
                .map(game -> Arrays.stream(game.split(" "))
                        .filter(x -> x.matches("\\d+"))
                        .map(Integer::valueOf).toArray(Integer[]::new))
                .collect(Collectors.toList());
        int wins = 0, draws = 0, lose = 0, scored = 0, conceded = 0, points = 0;
        for (int i = 0; i < teams.size(); i++) {
            try {
                boolean draw = scores.get(i)[0] == scores.get(i)[1];
            } catch (ArrayIndexOutOfBoundsException e) {
                return "Error(float number):" + games.get(i);
            }
            boolean teamFirst = teams.get(i)[0].equals(toFind); //import java.util.*; import java.util.stream.Collectors;
            if (teamFirst) {
                scored += scores.get(i)[0];
                conceded += scores.get(i)[1];
            } else {
                scored += scores.get(i)[1];
                conceded += scores.get(i)[0];
            }
            if (scores.get(i)[0] == scores.get(i)[1]) {
                draws++;
                points++;
            } else if (scores.get(i)[0] < scores.get(i)[1]) {
                if (teamFirst) {
                    lose++;
                } else {
                    wins++;
                    points += 3;
                }
            } else {
                if (teamFirst) {
                    wins++;
                    points += 3;
                } else {
                    lose++;
                }
            }
        }
        return String.format(toFind + ":W=%s;D=%s;L=%s;Scored=%s;Conceded=%s;Points=%s",
                wins, draws, lose, scored, conceded, points);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        String result = "";
        for (String firstLetter : lstOf1stLetter) {
            int sum = 0;
            for (String art : lstOfArt) {
                if (art.charAt(0) == firstLetter.charAt(0)) {
                    String[] split = art.split(" ");
                    sum += Integer.parseInt(split[1]);
                }
            }
            result += "(" + firstLetter + " : " + sum + ") - ";
        }
        return result.substring(0, result.length() - 3);
    }
}
