package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SevenTest extends SevenDataProvider {

    @Test
    public void testNewAvg() {
    }

    @Test
    public void testSeriesSum() {
    }

    @Test(testName = "12. Test where is Vasya", dataProvider = "dpWhereIsVasya")
    public void testWhereIsHe(Seven impl, int p, int bef, int aft, int res) {
        Assert.assertEquals(impl.whereIsHe(p, bef, aft), res);
    }
}