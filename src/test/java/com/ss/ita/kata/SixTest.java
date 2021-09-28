package com.ss.ita.kata;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SixTest extends SixDataProvider {
    @Test(dataProvider = "rainfallMean")
    public void mean(Six impl, String town, String rainfallSheet, double expected) {
        assertEquals(impl.mean(town, rainfallSheet), expected, 0.1);
    }

    @Test(dataProvider = "rainfallVariance")
    public void variance(Six impl, String town, String rainfallSheet, double expected) {
        assertEquals(impl.variance(town, rainfallSheet), expected, 0.1);
    }
}
