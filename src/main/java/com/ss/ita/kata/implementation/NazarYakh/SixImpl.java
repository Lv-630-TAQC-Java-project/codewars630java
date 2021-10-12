package com.ss.ita.kata.implementation.NazarYakh;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class SixImpl implements com.ss.ita.kata.Six {
    @Override
    public long findNb(long m) {
        long num = 0;
        long sum = 0;
        while (sum < m) {
            num += 1;
            sum += (num * num * num);
        }
        if (sum == m) {
            return num;
        }
        return -1;
    }

    @Override
    public String balance(String book) {
        String t = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] arr = t.split("[\\n]+");
        double current = Double.parseDouble(arr[0]);
        double total = 0;
        int count = 0;
        StringBuilder result = new StringBuilder();
        result.append("Original Balance: " + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            count++;
            String[] line = arr[i].split("[ ]+");
            current -= Double.parseDouble(line[2]);
            total += Double.parseDouble(line[2]);
            String u = String.format(Locale.US,"\n%s %s %s Balance %.2f", line[0], line[1], line[2], current);
            result.append(u);
        }
        result.append(String.format(Locale.US,"\nTotal expense %.2f\nAverage expense %.2f", total, total / count));
        return result.toString();
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(x + 1));
    }

    @Override
    public double mean(String town, String strng) {
        if (town == null || strng == null) {
            return -1;
        }

        // Split trng by \n
        String[] splitStrng = strng.split("\n");

        // Split strng by town
        String line = "";
        String temp = "";
        for (String s : splitStrng) {
            temp = s;
            if (town.equals(temp.split(":")[0])) {
                line = s;
                System.out.println(line);
                break;
            }
        }

        // If city is not in the list, return -1
        if (line.length() == 0) {
            return -1;
        }

        // List of all values for the year
        String[] arrOfLine = line.replaceAll("[^0-9.0-9 ]", "").trim().split(" ");

        // Sum of all values for the year
        double sum = 0;
        for (String s : arrOfLine) {
            sum += Double.parseDouble(s);
        }

        // Return average double value
        return sum / (arrOfLine.length);
    }

    @Override
    public double variance(String town, String strng) {
        if (town == null || strng == null) {
            return -1;
        }
        String[] arr = strng.split("\n");
        double sum = 0;
        double mean = mean(town, strng);
        String temp = "";
        String line = "";
        for (String s : arr) {
            temp = s;
            if (town.equals(temp.split(":")[0])) {
                line = s;
                break;
            }
        }

        if (line.length() == 0 || line.length() == town.length()) {
            return -1;
        }

        String[] res = line.replaceAll("[^0-9.0-9 ]", "").trim().split(" ");
        for (String s : res) {
            sum += Math.pow((Double.parseDouble(s) - mean), 2);
        }

        return sum / res.length;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
//        toFind = new String("Boston Celtics");
        List<String> games = Arrays
                .stream(resultSheet.split(","))
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
            boolean teamFirst = teams.get(i)[0].equals(toFind);
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

        if (lstOfArt == null || lstOfArt.length == 0) return "";
        if (lstOf1stLetter == null || lstOf1stLetter.length == 0) return "";

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
