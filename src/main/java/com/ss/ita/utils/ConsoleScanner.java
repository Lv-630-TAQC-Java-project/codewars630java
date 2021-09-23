package com.ss.ita.utils;

import java.math.BigDecimal;
import java.math.BigInteger;


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
            if (scanner.hasNextFloat()) {
                return scanner.nextFloat();
            } else {
                System.out.println("Incorrect input! Please enter float.");
                scanner.next();
            }
        }
    }


    @Override
    public double readDouble() {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Incorrect input! Please enter double.");
                scanner.next();
            }
        }
    }

    @Override
    public String readString() {
        while (true) {
            if (scanner.hasNext()) {
                return scanner.nextLine();
            } else {
                System.out.println("Incorrect input! Please enter string.");
                scanner.next();
            }
        }
    }

    @Override
    public BigInteger readBigInteger() {
        while (true) {
            if (scanner.hasNext()) {
                return scanner.nextBigInteger();
            } else {
                System.out.println("Incorrect input! Please enter BigInteger.");
            }
        }
    }

    @Override
    public BigDecimal readBigDecimal() {
        while (true) {
            if (scanner.hasNext()) {
                return scanner.nextBigDecimal();
            } else {
                System.out.println("Incorrect input! Please enter BigDecimal.");
            }
        }
    }

    @Override
    public double[] readDoubleArray() {
        System.out.print("Length of the array:");
        double[] array = new double[(int) readDouble()];

        int i = 0;
        while (i < array.length) {
            String line = scanner.next();
            if (line.matches("-?\\d+(\\.\\d+)?")) {
                array[i] = Double.parseDouble(line);
                i++;
            } else {
                System.out.println("Incorrect input! Please enter double.");
            }
        }
        return array;
    }

    @Override
    public int[] readIntArray() {
        System.out.print("Length of the array:");
        int[] array = new int[readInt()];

        int i = 0;
        while (i < array.length) {
            String line = scanner.next();
            if (line.matches("-?\\d+(\\.\\d+)?")) {
                array[i] = Integer.parseInt(line);
                i++;
            } else {
                System.out.println("Incorrect input! Please enter integer.");
            }
        }
        return array;
    }

    @Override
    public String[] onlyForStockSummaryMethod() {
        while (true) {
            if (scanner.hasNext()) {
                return new String[]{scanner.next()};
            } else {
                System.out.println("Incorrect input! Please enter String[].");
            }
        }
    }

    @Override
    public String[] readStringArray() {
        while (true) {
            if (scanner.hasNext()) {
                return new String[]{scanner.next()};
            } else {
                System.out.println("Incorrect input! Please enter String[].");
            }
        }
    }
}
