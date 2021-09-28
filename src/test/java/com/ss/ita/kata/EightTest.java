package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;



public class EightTest extends EightDataProvider {

    @Test(dataProvider = "dptpMPG")
    public void testMpgToKPM( Eight impl,float mpg, float result) {
        Assert.assertEquals(impl.mpgToKPM(mpg), result);
    }

    @Test(dataProvider = "countPositivesSumNegatives")
    public void testCountPositivesSumNegatives( Eight impl, int[] input, int[] result) {
        Assert.assertEquals(impl.countPositivesSumNegatives(input), result);
    }
}