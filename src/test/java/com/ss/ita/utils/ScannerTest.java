package com.ss.ita.utils;

import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.testng.Assert.assertEquals;

public class ScannerTest extends ScannerDataProvider {
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
    public void testReadInvalidInt(String input) {
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

    @Test(dataProvider = "dpReadValidBigInteger")
    public void testReadBigInteger(String input, BigInteger expected) {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        consoleScanner = new ConsoleScanner();
        BigInteger actual = consoleScanner.readBigInteger();
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpReadInvalidBigInteger")
    public void testReadInvalidBigInteger(String input) {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        consoleScanner = new ConsoleScanner();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        consoleScanner.readBigInteger();
        String actual = output.toString().replaceAll("\r", "");
        assertEquals(actual, "Incorrect input! Please enter BigInteger.\n");
    }

    @Test(dataProvider = "readValidBigDecimal")
    public void testReadValidBigDecimal(String input, BigDecimal expected) {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        consoleScanner = new ConsoleScanner();
        BigDecimal actual = consoleScanner.readBigDecimal();
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "readInvalidBigDecimal")
    public void testInvalidReadBigDecimal(String input) {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        consoleScanner = new ConsoleScanner();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        consoleScanner.readBigDecimal();

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

    @Test(dataProvider = "dpReadInvalidDoubleArray")
    public void testReadInvalidDoubleArray(String input) {

        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        consoleScanner = new ConsoleScanner();
        consoleScanner.readDoubleArray();
        String actual = output.toString().replaceAll("\r", "");
        assertEquals(actual, "Length of the array:Incorrect input! Please enter double.\n");
    }

    @Test
    public void testReadIntArray() {
    }

    @Test(dataProvider = "dpReadValidOnlyForStock")
    public void testOnlyForStockSummaryMethod(String input) {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        String expected = "str ser";
        consoleScanner = new ConsoleScanner();
        String actual = consoleScanner.readString();
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpReadInvalidOnlyForStock")
    public void testReadInvalidOnlyForStockSummaryMethod(String input) {

        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        consoleScanner = new ConsoleScanner();
        consoleScanner.onlyForStockSummaryMethod();
        String actual = output.toString().replaceAll("\r", "");
        assertEquals(actual, "Incorrect input! Please enter string array.\n");
    }


    @Test
    public void testReadStringArray() {
    }
}