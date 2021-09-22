package com.ss.ita.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class ConsoleScanner implements Scanner {
    private final java.util.Scanner scanner = new java.util.Scanner(System.in);

    @Override
    public int readInt() {
        while (true) {
            if (scanner.hasNext()) {
                return scanner.nextInt();
            } else {
                System.out.println("Incorrect input! Please enter int.");
                scanner.next();
            }
        }
    }

    @Override
    public long readLong() {
        while (true) {
            if (scanner.hasNext()) {
                return scanner.nextLong();
            } else {
                System.out.println("Incorrect input. Please enter long.");
                scanner.next();
            }
        }
    }

    @Override
    public float readFloat() {
        while (true) {
            if (scanner.hasNext()) {
                return scanner.nextFloat();
            } else {
                System.out.println("Incorrect input! Please enter float.");
                scanner.next();
            }
        }
    }


    @Override
    public double readDouble() {
        while(true){
            if (scanner.hasNext()){
                return scanner.nextDouble();
            } else {
                System.out.println("Incorrect input! Please enter double.");
            }
        }
    }

    @Override
    public String readString() {
        while (true) {
            if (scanner.hasNext()){
                return scanner.nextLine();
            } else {
                System.out.println("Incorrect input! Please enter string.");
                scanner.next();
            }
        }
    }

    @Override
    public BigInteger readBigInteger() {
        while (true){
            if (scanner.hasNext()){
                return scanner.nextBigInteger();
            } else{
                System.out.println("Incorrect input! Please enter BigInteger.");
            }
        }
    }

    @Override
    public BigDecimal readBigDecimal() {
        while(true){
            if (scanner.hasNext()){
                return scanner.nextBigDecimal();
            } else {
                System.out.println("Incorrect input! Please enter BigDecimal.");
            }
        }
    }

    @Override
    public double[] readDoubleArray() {
        while(true){
            if (scanner.hasNext()){
                return new double[]{scanner.nextDouble()};
            } else {
                System.out.println("Incorrect input! Please enter double[].");
            }
        }
    }

    @Override
    public int[] readIntArray() {
        while(true){
            if (scanner.hasNext()){
                return new int[]{scanner.nextInt()};
            } else {
                System.out.println("Incorrect input! Please enter int[].");
            }
        }
    }

    @Override
    public String[] onlyForStockSummaryMethod() {
        while(true){
            if (scanner.hasNext()){
                return new String[]{scanner.next()};
            } else {
                System.out.println("Incorrect input! Please enter String[].");
            }
        }
    }

    @Override
    public String[] readStringArray() {
        while(true){
            if (scanner.hasNext()){
                return new String[]{scanner.next()};
            } else {
                System.out.println("Incorrect input! Please enter String[].");
            }
        }
    }
}
