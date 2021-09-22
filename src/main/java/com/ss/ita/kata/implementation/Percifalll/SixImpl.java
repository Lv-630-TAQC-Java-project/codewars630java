package com.ss.ita.kata.implementation.Percifalll;

import java.util.*;

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
        return null;
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
