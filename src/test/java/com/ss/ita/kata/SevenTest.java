package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SevenTest extends SevenDataProvider {

    @Test(dataProvider = "dpSeriesSum")
    public void testSeriesSum(Seven impl, int n, String expectedResult) {
        Assert.assertEquals(impl.seriesSum(n), expectedResult);
    }

    @Test(testName = "12. Test where is Vasya", dataProvider = "dpWhereIsVasya")
    public void testWhereIsHe(Seven impl, int p, int bef, int aft, int res) {
        Assert.assertEquals(impl.whereIsHe(p, bef, aft), res);
    }

    @Test(testName = "10. Test Looking for benefactor", dataProvider = "dpNewAvg")
    public void testNewAvg(Seven impl, double[] inputArr, double input, long result) {
        Assert.assertEquals(impl.newAvg(inputArr, input), result);
    }

    @Test(expectedExceptions = {IllegalArgumentException.class}, testName = "10. Test exception Looking for benefactor", dataProvider = "dpExcNewAvg")
    public void testExcNewAvg(Seven impl, double[] inputArr, double input) {
        impl.newAvg(inputArr, input);
    }

}