package com.ss.ita.kata.implementation.NazarYakh;

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
        result.append("Original_Balance:_" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            count++;
            String[] line = arr[i].split("[ ]+");
            current -= Double.parseDouble(line[2]);
            total += Double.parseDouble(line[2]);
            String u = String.format("\n%s_%s_%s_Balance_%.2f", line[0], line[1], line[2], current);
            result.append(u);
        }
        result.append(String.format("\nTotal expense_%.2f\nAverage expense__%.2f", total, total / count));
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
        for (String s: splitStrng){
            temp = s;
            if (town.equals(temp.split(":")[0])){
                line = s;
                System.out.println(line);
                break;
            }
        }

        // If city is not in the list, return -1
        if (line.length() == 0){
            return -1;
        }

        // List of all values for the year
        String[] arrOfLine = line.replaceAll("[^0-9.0-9 ]", "").trim().split(" ");

        // Sum of all values for the year
        double sum = 0;
        for (String s: arrOfLine){
            sum += Double.parseDouble(s);
        }

        // Return average double value
        return sum/(arrOfLine.length);
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
        for (String s: arr){
            temp = s;
            if (town.equals(temp.split(":")[0])){
                line = s;
                break;
            }
        }

        if (line.length() == 0 || line.length() == town.length()){
            return -1;
        }

        String[] res = line.replaceAll("[^0-9.0-9 ]", "").trim().split(" ");
        for (String s: res){
            sum += Math.pow((Double.parseDouble(s) - mean), 2);
        }

        return sum/res.length;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0)
            return "";

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
