package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;


public class EightTest extends EightDataProvider {

    @Test(dataProvider = "dptpMPG")
    public void testMpgToKPM(Eight impl, float mpg, float result) {
        Assert.assertEquals(impl.mpgToKPM(mpg), result);
    }

    @Test(dataProvider = "wilson")
    public void amIWilson(Eight impl, double number, boolean expected) {
        Assert.assertEquals(impl.amIWilson(number), expected, "Error for number \"" + number + "\";");
    }

    @Test(dataProvider = "countPositivesSumNegatives")
    public void testCountPositivesSumNegatives(Eight impl, int[] input, int[] result) {
        Assert.assertEquals(impl.countPositivesSumNegatives(input), result);
    }

    @Test(dataProvider = "dpVolumeOfCuboid")
    public void testVolumeOfCuboid(Eight impl, double lenght, double wight, double height, double expectedResult) {
        Assert.assertEquals(impl.getVolumeOfCuboid(lenght, wight, height), expectedResult);
    }
}
