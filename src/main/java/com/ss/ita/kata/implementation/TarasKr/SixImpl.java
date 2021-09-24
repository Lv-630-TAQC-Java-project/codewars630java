package com.ss.ita.kata.implementation.TarasKr;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixImpl implements com.ss.ita.kata.Six {
    /**
     * Your task is to construct a building which will be a pile of n cubes. The
     * cube at the bottom will have a volume of n^3, the cube above will have volume
     * of (n-1)^3 and so on until the top which will have a volume of 1^3.
     * <p>
     * You are given the total volume m of the building. Being given m can you find
     * the number n of cubes you will have to build?
     * <p>
     * The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be
     * an integer m and you have to return the integer n such as n^3 + (n-1)^3 + ...
     * + 1^3 = m if such a n exists or -1 if there is no such n.
     * <p>
     * Examples: findNb(1071225) --> 45
     * <p>
     * findNb(91716553919377) --> -1
     *
     * @param m
     */
    @Override
    public long findNb(long m) {
        long nCube = 0;
        long n = 0;
        while (nCube < m) {
            n += 1;
            nCube += (n * n * n);

        }
        return nCube == m ? n : -1;
    }

    /**
     * You are given a (small) check book as a - sometimes - cluttered (by
     * non-alphanumeric characters) string:
     * <p>
     * "1000.00 125 Market 125.45 126 Hardware 34.95 127 Video 7.45 128 Book 14.32
     * 129 Gasoline 16.10" The first line shows the original balance. Each other
     * line (when not blank) gives information: check number, category, check
     * amount. (Input form may change depending on the language).
     * <p>
     * First you have to clean the lines keeping only letters, digits, dots and
     * spaces.
     * <p>
     * Then return a report as a string (underscores show spaces -- don't put them
     * in your solution. They are there so you can see them and how many of them you
     * need to have): "Original_Balance:_1000.00 125_Market_125.45_Balance_874.55
     * 126_Hardware_34.95_Balance_839.60 127_Video_7.45_Balance_832.15
     * 128_Book_14.32_Balance_817.83 129_Gasoline_16.10_Balance_801.73
     * Total_expense__198.27 Average_expense__39.65"
     *
     * @param book input string
     * @return report as a string
     */
    @Override
    public String balance(String book) {
        String formatedBook = "";
        String resultBook = "";
        int startPos = 0;
        int endPos = 0;
        List<String> lsBook = new ArrayList<String>();
        double balance = 0;
        double totalExpence = 0;
        String pattern = "[a-zA-Z 0-9\\.\\n]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(book);
        if (m.matches()) {
            formatedBook = book;
        } else {
            m.reset();

            while (m.find()) {
                formatedBook += (book.substring(m.start(), m.end()));
            }
        }

        endPos = formatedBook.indexOf("\n", startPos);
        while (endPos != -1) {
            lsBook.add(formatedBook.substring(startPos, endPos));
            startPos = endPos + 1;
            endPos = formatedBook.indexOf("\n", startPos);
        }
        lsBook.add(formatedBook.substring(startPos));

        pattern = "(\\d+)(\\D+)(\\d+\\.{0,1}\\d{0,2})";
        p = Pattern.compile(pattern);
        resultBook += "Original Balance: " + lsBook.get(0) + "\\r\\n";
        balance = Double.valueOf(lsBook.get(0));
        for (int i = 1; i < lsBook.size(); i++) {
            m = p.matcher(lsBook.get(i));
            while (m.find()) {
                balance -= Double.valueOf(m.group(3));
                resultBook = resultBook + m.group(1) + " " + m.group(2).trim() + " " + m.group(3).trim() + " Balance "
                        + String.format("%.2f", balance) + "\\r\\n";
                totalExpence += Double.valueOf(m.group(3));
            }
        }
        resultBook += "Total expense  " + String.format("%.2f", (totalExpence)) + "\\r\\n";
        resultBook += "Average expense  " + String.format("%.2f", (totalExpence / (lsBook.size() - 1)));
        return resultBook;

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
        return null;
    }
}
