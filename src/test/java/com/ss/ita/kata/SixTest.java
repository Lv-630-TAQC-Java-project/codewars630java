package com.ss.ita.kata;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SixTest extends SixDataProvider {
    @Test(dataProvider = "dpRainfallMean")
    public void testRainfallMean(Six impl, String town, String rainfallSheet, double expected) {
        assertEquals(impl.mean(town, rainfallSheet), expected, 0.1);
    }

    @Test(dataProvider = "dpRainfallVariance")
    public void testRainfallVariance(Six impl, String town, String rainfallSheet, double expected) {
        assertEquals(impl.variance(town, rainfallSheet), expected, 0.1);
    }

    @Test(dataProvider = "dpStockSummary")
    public void testStockSummary(Six impl,String[] letters,String[] arts,String expected) {
        assertEquals(impl.stockSummary(arts,letters), expected);
    }
}
