package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SevenTest extends SevenDataProvider {
    @Test(dataProvider = "dpSeriesSum")
    public void testSeriesSum(Seven impl, int n, String expectedResult){
        Assert.assertEquals(impl.seriesSum(n), expectedResult);}
}
