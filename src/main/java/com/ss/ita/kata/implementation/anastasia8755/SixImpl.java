package com.ss.ita.kata.implementation.anastasia8755;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixImpl implements com.ss.ita.kata.Six {
    @Override
    public long findNb(long m) {
        for (int cubeCount = 0; ; cubeCount++) {
            //n^3 + (n-1)^3 + ... + 1^3 = m if m=0 => cubeCount=0
            if (m > 0) {
                long currCubeVol = (long) Math.pow(cubeCount + 1, 3);
                m = (long) m - currCubeVol;

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
