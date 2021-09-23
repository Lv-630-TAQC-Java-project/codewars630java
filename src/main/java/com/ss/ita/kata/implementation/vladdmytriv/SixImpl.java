package com.ss.ita.kata.implementation.vladdmytriv;

import java.util.ArrayList;

import static java.lang.Double.*;
import static java.lang.String.*;
import static java.lang.Math.*;

public class SixImpl implements com.ss.ita.kata.Six {
    private static final String data = "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
            "\n" +
            "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
            "\n" +
            "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
            "\n" +
            "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
            "\n" +
            "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5" +
            "\n" +
            "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
            "\n" +
            "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
            "\n" +
            "Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
            "\n" +
            "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" +
            "\n" +
            "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7";

    private static final String data1 = "Rome:Jan 90.2,Feb 73.2,Mar 80.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 147.7,Nov 121.0,Dec 97.9" +
            "\n" +
            "London:Jan 58.0,Feb 38.9,Mar 49.9,Apr 42.2,May 67.3,Jun 52.1,Jul 59.5,Aug 77.2,Sep 55.4,Oct 62.0,Nov 69.0,Dec 52.9" +
            "\n" +
            "Paris:Jan 182.3,Feb 120.6,Mar 188.1,Apr 204.9,May 323.1,Jun 350.5,Jul 336.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
            "\n" +
            "NY:Jan 128.7,Feb 121.8,Mar 151.9,Apr 93.5,May 98.8,Jun 93.6,Jul 142.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
            "\n" +
            "Vancouver:Jan 155.7,Feb 121.4,Mar 132.3,Apr 69.2,May 85.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 69.6,Oct 116.3,Nov 154.6,Dec 171.5" +
            "\n" +
            "Sydney:Jan 123.4,Feb 111.0,Mar 151.3,Apr 129.7,May 123.0,Jun 159.2,Jul 102.8,Aug 90.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
            "\n" +
            "Bangkok:Jan 20.6,Feb 28.2,Mar 40.7,Apr 81.8,May 189.4,Jun 151.7,Jul 198.2,Aug 197.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
            "\n" +
            "Tokyo:Jan 59.9,Feb 81.5,Mar 106.4,Apr 139.2,May 144.0,Jun 186.0,Jul 155.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
            "\n" +
            "Beijing:Jan 13.9,Feb 14.7,Mar 18.2,Apr 18.4,May 43.0,Jun 88.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 38.0,Nov 19.3,Dec 2.7" +
            "\n" +
            "Lima:Jan 11.2,Feb 10.9,Mar 10.7,Apr 10.4,May 10.6,Jun 11.8,Jul 14.4,Aug 13.1,Sep 23.3,Oct 1.7,Nov 0.5,Dec 10.7";


    @Override
    public long findNb(long m) {
        for (int n = 0; ; n++) {
            if (m > 0) {
                int cubeVol = (int) Math.pow(n + 1, 3);
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
                //.replaceAll("[-+!?/@#$%^&*(){},'`~Ё:<>=;]", "")
                .split("\n");
        int numberOfPurchase = bookMass.length - 1;

        double expense = 0;
        double originalBalance = parseDouble(bookMass[0]);
        bookMass[0] = "Original Balance: " + originalBalance;
        for (int i = 1; i < bookMass.length; i++) {
            String[] oneLine = bookMass[i].split(" ");
            double price = parseDouble(oneLine[2]);
            expense += price;
            String newBalance = String.valueOf(originalBalance - price);
            bookMass[i] = join(" ", oneLine).concat(" Balance " + newBalance);
        }
        String finalLine = join("\n", bookMass).concat("\nTotal expense " + format("%.2f", expense) + "\nAverage expense " + format("%.2f", expense / numberOfPurchase)).replaceAll(",", ".");
        return finalLine;
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(x + 1));
    }

    private String[] getTownWithMonthRainfall(String town, String strng) {
        if (strng.contentEquals("data1")) {
            strng = data1;
        }
        if (strng.contentEquals("data")) {
            strng = data;
        } else {
            return new String[]{valueOf(-1)};
        }

        String[] dataBase = strng.split("\n");
        String oneLine = valueOf(-1);
        for (int i = 0; i < dataBase.length; i++) {
            if (dataBase[i].contains(town)) {
                oneLine = dataBase[i].replaceAll("[^0-9 ,.]", "");
            }
        }

        return oneLine.split(",");
    }

    @Override
    public double mean(String town, String strng) {
        double perYear = 0;
        String[] monthes = getTownWithMonthRainfall(town, strng);
        for (int k = 0; k < monthes.length; k++) {
            perYear += parseDouble(monthes[k]);
        }

        return perYear / 12;
    }


    @Override
    public double variance(String town, String strng) {
        double sumOfDiff = 0;

        double average = mean(town, strng);
        String[] rainfallsPerMonth = getTownWithMonthRainfall(town, strng);
        int numberOfMonths = rainfallsPerMonth.length;
        double diff = 0;
        for (int i = 0; i < numberOfMonths; i++) {
            diff = pow((average - parseDouble(rainfallsPerMonth[i])), 2);
            sumOfDiff += diff;
        }
        return sumOfDiff / numberOfMonths;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
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