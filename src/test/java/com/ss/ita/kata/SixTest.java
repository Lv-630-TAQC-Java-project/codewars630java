package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SixTest extends SixDataProvider {

    @Test(dataProvider = "dpBalance")
    public void testBalance(Six impl, String input, String result) {
        Assert.assertEquals(impl.balance(input), result);
    }

    @Test(dataProvider = "rainfallMean")
    public void mean(Six impl, String town, String rainfallSheet, double expected) {
        Assert.assertEquals(impl.mean(town, rainfallSheet), expected, 0.1);
    }

    @Test(dataProvider = "rainfallVariance")
    public void variance(Six impl, String town, String rainfallSheet, double expected) {
        Assert.assertEquals(impl.variance(town, rainfallSheet), expected, 0.1);
    }

    @Test(dataProvider = "dpRainfallMean")
    public void testRainfallMean(Six impl, String town, String rainfallSheet, double expected) {
        assertEquals(impl.mean(town, rainfallSheet), expected, 0.1);
    }

    @Test(dataProvider = "dpRainfallVariance")
    public void testRainfallVariance(Six impl, String town, String rainfallSheet, double expected) {
        assertEquals(impl.variance(town, rainfallSheet), expected, 0.1);
    }

    @Test(dataProvider = "dpStockSummary")
    public void testStockSummary(Six impl, String[] letters, String[] arts, String expected) {
        assertEquals(impl.stockSummary(letters, arts), expected);
    }
}
