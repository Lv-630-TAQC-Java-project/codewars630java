package com.ss.ita.utils;

import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

import static org.testng.Assert.*;

public class ScannerTest {
    private final Scanner consoleScanner = new ConsoleScanner();

    @Test
    public void testReadInt() {
    }

    @Test
    public void testReadLong() {
        InputStream input = new ByteArrayInputStream("123".getBytes());
        System.setIn(input);
        Scanner scanner = new ConsoleScanner();
        long actual = scanner.readLong();
        assertEquals(actual, 123L);
    }

    @Test
    public void testInvalidReadLong() {
        InputStream input = new ByteArrayInputStream("jyeu\n123".getBytes());
        System.setIn(input);
        Scanner scanner = new ConsoleScanner();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        scanner.readLong();

        String actual = output.toString().replaceAll("\r", "");
        assertEquals(actual, "Incorrect input. Please enter long.\n");
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

    @Test
    public void testReadDoubleArray() {
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