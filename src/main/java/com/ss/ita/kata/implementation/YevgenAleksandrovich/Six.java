package com.ss.ita.kata.implementation.YevgenAleksandrovich;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import static java.lang.Double.parseDouble;
import static java.lang.String.*;
import static java.util.stream.Collectors.averagingDouble;

public abstract class Six implements com.ss.ita.kata.Six {

    //
    //
    /**
     * Your task is to construct a building which will be a pile of n cubes. The cube at the bottom will have a volume of n^3, the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.
     * <p>
     * You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?
     * <p>
     * The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be an integer m and you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.
     * <p>
     * Examples:
     * findNb(1071225) --> 45
     * <p>
     * findNb(91716553919377) --> -1
     */

    public class ASum {

        public long findNb(long m) {
            long sum = 0;
            long count = 0;
            while (sum < m) {
                count +=1;
                sum += count*count*count;
            }
            if (sum == m) {
                return count;
            }
            else return -1;
        }
    }

/**You are given a (small) check book as a - sometimes - cluttered (by non-alphanumeric characters) string:

 "1000.00
 125 Market 125.45
 126 Hardware 34.95
 127 Video 7.45
 128 Book 14.32
 129 Gasoline 16.10"
 The first line shows the original balance. Each other line (when not blank) gives information: check number, category, check amount. (Input form may change depending on the language).

 First you have to clean the lines keeping only letters, digits, dots and spaces.

 Then return a report as a string (underscores show spaces -- don't put them in your solution. They are there so you can see them and how many of them you need to have):

 "Original_Balance:_1000.00
 125_Market_125.45_Balance_874.55
 126_Hardware_34.95_Balance_839.60
 127_Video_7.45_Balance_832.15
 128_Book_14.32_Balance_817.83
 129_Gasoline_16.10_Balance_801.73
 Total_expense__198.27
 Average_expense__39.65"
 On each line of the report you have to add the new balance and then in the last two lines the total expense and the average expense. So as not to have a too long result string we don't ask for a properly formatted result.

 Notes
 See input examples in Sample Tests.
 It may happen that one (or more) line(s) is (are) blank.
 Round to 2 decimals your results.
 The line separator of results may depend on the language \n or \r\n. See examples in the "Sample tests".
 R language: Don't use R's base function "mean()" that could give results slightly different from expected ones.*/
    @Override
    public String balance(String book, String redactedBook) {
        String[] bookMass = book
                .replaceAll("[^a-zA-Z0-9 .\n]", "")
                .split("\n");
        int numberOfPurchase = bookMass.length - 1;
        double expense = 0;
        double originalBalance = parseDouble(bookMass[0]);
        bookMass[0] = "Original Balance: " + originalBalance;
        for (int i = 1; i < bookMass.length; i++) {
            String[] oneLine = bookMass[i].split(" ");
            double price = parseDouble(oneLine[2]);
            expense += price;
            String newBalance = valueOf(originalBalance - price);
            bookMass[i] = join(" ", oneLine).concat(" Balance " + newBalance);
        }
        String finalLine = join("\n", bookMass).concat("\nTotal expense " + format("%.2f", expense) + "\nAverage expense " + format("%.2f", expense / numberOfPurchase)).replaceAll(",", ".");
        return finalLine;
    }

    /**Consider the function

     f: x -> sqrt(1 + x) - 1 at x = 1e-15.

     We get: f(x) = 4.44089209850062616e-16

     or something around that, depending on the language.

     This function involves the subtraction of a pair of similar numbers when x is near 0 and the results are significantly erroneous in this region. Using pow instead of sqrt doesn't give better results.

     A "good" answer is 4.99999999999999875... * 1e-16.

     Can you modify f(x) to give a good approximation of f(x) in the neighborhood of 0?*/
    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(x + 1));

    }
/**dataand data1 are two strings with rainfall records of a few cities for months from January to December. The records of towns are separated by \n. The name of each town is followed by :.

 data and towns can be seen in "Your Test Cases:".

 Task:
 function: mean(town, strng) should return the average of rainfall for the city town and the strng data or data1 (In R and Julia this function is called avg).
 function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.
 Examples:
 mean("London", data), 51.19(9999999999996)
 variance("London", data), 57.42(833333333374)
 * @return*/



//?
    public static class Rainfall {

        public static double mean(String town, String strng) {
            return parseTemp(town, strng).stream()
                    .collect(averagingDouble(n -> n));
        }
////?
        public static double variance(String town, String strng) {
            double mean = mean(town, strng);
            if (mean == -1.0) return -1.0;

            return parseTemp(town, strng).stream()
                    .collect(averagingDouble(n -> (n - mean) * (n - mean)));

        }

        private static List<Double> parseTemp(String town, String strng) {
            List<Double> temps = new ArrayList<>();
            for (String line : strng.split("\\n")) {
                String[] data = line.split(":");
                if (town.equals(data[0])) {
                    for (String weather : data[1].split(",")) {
                        String[] temp = weather.split("\\s");
                        temps.add(Double.parseDouble(temp[1]));
                    }
                    break;
                }
            }

            if (temps.isEmpty()) temps.add(-1.0);

            return temps;
        }
    }


/**You are given a string with results of NBA teams (see the data in "Sample Tests") separated by commas e.g:

 r = Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112, Los Angeles Clippers 100 Boston Celtics 120.

 A team name is composed of one, two or more words built with letters or digits: Atlanta Hawks, Philadelphia 76ers...

 Given a string of results and the name of a team (parameter : to_find) your function nba_cup (or nbaCup or ...) will return as a string

 the name of the team followed by : and
 the number of matches won by the team
 the number of draws
 the number of matches lost by the team
 the total number of points scored by the team
 the total number of points conceded by the team
 and finally a kind of marks in our ranking system

 a team marks 3 if it is a win
 a team marks 1 if it is a draw
 a team marks 0 if it is a loss.
 The return format is:

 "Team Name:W=nb of wins;D=nb of draws;L=nb of losses;Scored=nb;Conceded=nb;Points=nb"
 Remarks:
 The team name "" returns "".

 If a team name can't be found in the given string of results you will return "Team Name:This team didn't play!" (See examples below).

 The scores must be integers. If a score is a float number (abc.xyz...) you will return: "Error(float number):the concerned string"

 Examples:
 nba_cup(r, "Los Angeles Clippers") -> "Los Angeles Clippers:W=1;D=0;L=1;Scored=204;Conceded=208;Points=3"

 nba_cup(r, "Boston Celtics") -> "Boston Celtics:W=1;D=0;L=0;Scored=120;Conceded=100;Points=3"

 nba_cup(r, "") -> ""

 nba_cup(r, "Boston Celt") -> "Boston Celt:This team didn't play!"

 r0="New York Knicks 101.12 Atlanta Hawks 112"
 nba_cup(r0, "Atlanta Hawks") -> "Error(float number):New York Knicks 101.1*/


    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind.trim().isEmpty()) {
            return "";
        }
        int win = 0, draw = 0, loss = 0, score = 0, conceded = 0, points = 0, find = 0;
        String[] games = resultSheet.split(",");
        for (int i = 0; i < games.length; i++) {
            Team[] group = transToTeams(games[i]);
            if (group.length == 0) {
                return "Error(float number):" + games[i];
            }
            int p1 = group[0].getPoint();
            int p2 = group[1].getPoint();
            if (group[0].getName().equals(toFind)) {
                find++;
                score += p1;
                conceded += p2;
                if (p1 > p2) {
                    win ++;
                    points += 3;
                } else if (p1 == p2) {
                    draw ++;
                    points += 1;
                } else {
                    loss ++;
                }
            } else if(group[1].getName().equals(toFind)){
                find++;
                score += p2;
                conceded += p1;
                if (p1 > p2) {
                    loss ++;
                } else if (p1 == p2) {
                    draw ++;
                    points += 1;
                } else {
                    win ++;
                    points += 3;
                }
            }
        }
        if (find == 0) {
            return toFind + ":This team didn't play!";
        }
        return String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",
                toFind, win, draw, loss, score, conceded, points);
    }

    private static Team[] transToTeams(String s) {
        String[] strs = s.split(" ");
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].matches("[0-9]+")) {
                index1 = i;
                break;
            }
        }
        if (index1 < 0) {
            return new Team[]{};
        }
        for (int i = index1+1; i < strs.length; i++) {
            if (strs[i].matches("[0-9]+")) {
                index2 = i;
                break;
            }
        }
        if (index2 < 0) {
            return new Team[]{};
        }
        Team team1 = new Team(String.join(" ", Arrays.copyOf(strs, index1)),Integer.parseInt(strs[index1]));
        Team team2 = new Team(String.join(" ", Arrays.copyOfRange(strs, index1+1, index2)), Integer.parseInt(strs[index2]));
        return new Team[]{team1, team2};
    }
}

class Team {
    private String name;
    private int point;

    public Team(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }


    /**
     * A bookseller has lots of books classified in 26 categories labeled A, B, ... Z. Each book has a code c of 3, 4, 5 or more characters. The 1st character of a code is a capital letter which defines the book category.
     *
     * In the bookseller's stocklist each code c is followed by a space and by a positive integer n (int n >= 0) which indicates the quantity of books of this code in stock.
     *
     * For example an extract of a stocklist could be:
     *
     * L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}.
     * or
     * L = ["ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"] or ....
     * You will be given a stocklist (e.g. : L) and a list of categories in capital letters e.g :
     *
     * M = {"A", "B", "C", "W"}
     * or
     * M = ["A", "B", "C", "W"] or ...
     * and your task is to find all the books of L with codes belonging to each category of M and to sum their quantity according to each category.
     *
     * For the lists L and M of example you have to return the string (in Haskell/Clojure/Racket a list of pairs):
     *
     * (A : 20) - (B : 114) - (C : 50) - (W : 0)
     * where A, B, C, W are the categories, 20 is the sum of the unique book of category A, 114 the sum corresponding to "BKWRK" and "BTSQZ", 50 corresponding to "CDXEF" and 0 to category 'W' since there are no code beginning with W.
     *
     * If L or M are empty return string is "" (Clojure and Racket should return an empty array/list instead).
     */

    /*@Override*/ //?
    public static class StockList {

        public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
            // your code here
            if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";
            List<String> result = new ArrayList<String>();
            for (String letter : lstOf1stLetter) {
                int temp = 0;
                for (String art : lstOfArt) {
                    if (art.startsWith(letter)) temp += Integer.valueOf(art.split(" ")[1]);
                }
                result.add("(" + letter + " : " + temp + ")");
            }

            return String.join(" - ", result);
        }
    }
}
    /*
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
*/
       /*
        return null;
        if (lstOfArt == null || lstOfArt.length == 0)
        if (lstOf1stLetter == null || lstOf1stLetter.length == 0) return "";
*/
        //?
/*
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
                    .map(s -> s.replaceAll("\\D*",""))
                    .mapToInt(Integer::parseInt)
                    .sum();
            formatted.add(format("(%s : %d)", category, sum));
        }
        return join(" - ", formatted);
    }
}
*/


