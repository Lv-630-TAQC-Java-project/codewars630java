package com.ss.ita.utils;

import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

import static org.testng.Assert.*;

public class ScannerTest extends ScannerDataProvider{
    private Scanner consoleScanner;

    @Test(dataProvider = "readValidInt")
    public void testReadValidInt(String input, int expected) {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        consoleScanner = new ConsoleScanner();
        int actual = consoleScanner.readInt();
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "readInvalidInt")
    public void testReadInvalidInt(String input){
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        consoleScanner = new ConsoleScanner();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        consoleScanner.readInt();

        String actual = output.toString().replaceAll("\r", "");
        assertEquals(actual, "Incorrect input! Please enter int.\n");
    }

    @Test(dataProvider = "readValidLong")
    public void testReadLong(String input, long expected) {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        consoleScanner = new ConsoleScanner();
        long actual = consoleScanner.readLong();
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "readInvalidLong")
    public void testInvalidReadLong(String input) {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        consoleScanner = new ConsoleScanner();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        consoleScanner.readLong();
        String actual = output.toString().replaceAll("\r", "");
        assertEquals(actual, "Incorrect input! Please enter long.\n");
    }

    @Test
    public void testReadFloat() {
    }

    @Test
    public void testReadDouble() {
    }

    @Test
    public void testReadString() {
    }

    @Test
    public void testReadBigInteger() {
    }

    @Test
    public void testReadBigDecimal() {
        InputStream input = new ByteArrayInputStream("123".getBytes());
        System.setIn(input);
        Scanner scanner = new ConsoleScanner();
        BigDecimal actual = scanner.readBigDecimal();
        BigDecimal expected = new BigDecimal("123");
        assertEquals(actual, expected);
    }
    @Test
    public void testInvalidReadBigDecimal() {
        InputStream input = new ByteArrayInputStream("asd\n123".getBytes());
        System.setIn(input);
        Scanner scanner = new ConsoleScanner();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        scanner.readBigDecimal();

        String actual = output.toString().replaceAll("\r", "");
        assertEquals(actual, "Incorrect input! Please enter BigDecimal.\n");
    }

    @Test(dataProvider = "dpReadValidDoubleArray")
    public void testReadDoubleArray(String input, double[] expected) {

        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        consoleScanner = new ConsoleScanner();
        double[] actual = consoleScanner.readDoubleArray();
        assertEquals(actual, expected);
    }

    @Test
    public void testReadIntArray() {
    }

    @Test
    public void testOnlyForStockSummaryMethod() {
    }

    @Test
    public void testReadStringArray() {
    }
}