package com.ss.ita.kata.implementation.dzhyv;

public class Siximpl implements com.ss.ita.kata.Six {
    @Override
    public long findNb(long m) {
    	long n = 0;
        long sum = 0;
        long count = 0;
        while (sum < m){
          count++;
          n = count * count * count;
          sum = sum + n;
          }
        return sum == m ? count : -1;
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
        return null;
    }
}
