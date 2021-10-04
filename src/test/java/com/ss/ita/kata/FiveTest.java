package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FiveTest extends FiveDataProvider {

    @Test(dataProvider = "dpSumSolve")
    public void testSumSolve(Five impl, double m, double result) {
        Assert.assertEquals(impl.solveSum(m), result);
    }

    @Test(dataProvider = "dpGap")
    public void testGap(Five impl, int g, long m, long n, long[] expectedResult) {
        Assert.assertEquals(impl.gap(g, m, n), expectedResult);
    }

    @Test(testName = "21. Test number of trailing zeros of N!", dataProvider = "dpZeros")
    public void testZeros(Five impl, int n, int expected) {
        Assert.assertEquals(impl.zeros(n), expected);
    }

    @Test(testName = "19. Test Artificial rain", dataProvider = "dpArtificialRain")
    public void testArtificialRain(Five impl, int[] garden, int expected) {
        Assert.assertEquals(impl.artificialRain(garden), expected);
    }

    @Test(dataProvider = "dpSmallest")
    public void testSmallest(Five impl, long number, long[] expected) {
        Assert.assertEquals(impl.smallest(number), expected);

    }
}

