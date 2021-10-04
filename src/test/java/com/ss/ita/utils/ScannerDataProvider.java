package com.ss.ita.utils;

import org.testng.annotations.DataProvider;

import java.math.BigInteger;

public class ScannerDataProvider {
    @DataProvider(name = "readValidInt")
    public Object[][] readValidInt(){
        return new Object[][]{
                {"12345", 12345},
                {"-2147483648", -2147483648},
                {"2147483647", 2147483647}
        };
    }

    @DataProvider(name = "readInvalidInt")
    public Object[][] readInvalidInt(){
        return new Object[][]{
                {"sometext\n1"},
                {"-2147483649\n1"},
                {"2147483648\n1"}
        };
    }

    @DataProvider(name = "readValidLong")
    public Object[][] readValidLong(){
        return new Object[][]{
                {"12345", 12345L},
                {"-2147483649", -2147483649L},
                {"2147483649", 2147483649L},
                {"-9223372036854775808", -9223372036854775808L},
                {"9223372036854775807", 9223372036854775807L}
        };
    }

    @DataProvider(name = "readInvalidLong")
    public Object[][] readInvalidLong(){
        return new Object[][]{
                {"sometext\n1"},
                {"-9223372036854775809\n1"},
                {"9223372036854775808\n1"}
        };
    }

    @DataProvider(name ="dpReadValidBigInteger")
    public Object[][] readValidBigInteger(){
        return new Object[][]{
                {"444", new BigInteger("444")},
                {"1234589585", new BigInteger("1234589585")},
                {"9223372036854775807", new BigInteger("9223372036854775807")},
                {"-9223372036854775807", new BigInteger("-9223372036854775807")}
        };
    }

    @DataProvider(name ="dpReadInvalidBigInteger")
    public Object[][] readInvalidBigInteger(){
        return new Object[][]{
                {"text\n1"},
                {"123.5\n 1"}
        };
    }

    @DataProvider(name = "dpReadInvalidDoubleArray")
    public Object[][] dpReadInvalidDoubleArray(){
        return new Object[][]{
                {new String ("3\ni\n0.00 2.5 -3.2") },

        };
    }
}
