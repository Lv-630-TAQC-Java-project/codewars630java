package com.ss.ita.kata.implementation.NazarYakh;

public class SixImpl implements com.ss.ita.kata.Six {
    @Override
    public long findNb(long m) {
        long num = 0;
        long sum = 0;
        while(sum < m){
            num += 1;
            sum +=  (num*num*num);
        }
        if(sum == m){
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
