package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EightTest extends EightDataProvider {

    @Test(dataProvider = "dpTpMPG")
    public void testMpgToKPM(Eight impl, float mpg, float expected) {
        Assert.assertEquals(impl.mpgToKPM(mpg), expected);
    }

    @Test(dataProvider = "dpAmIWilson")
    public void testAmIWilson(Eight impl, double number, boolean expected) {
        Assert.assertEquals(impl.amIWilson(number), expected, "Error for number \"" + number + "\";");
    }

    @Test(dataProvider = "dpCountPositivesSumNegatives")
    public void testCountPositivesSumNegatives(Eight impl, int[] input, int[] expected) {
        Assert.assertEquals(impl.countPositivesSumNegatives(input), expected);
    }

    @Test(dataProvider = "dpVolumeOfCuboid")
    public void testVolumeOfCuboid(Eight impl, double lenght, double wight, double height, double expected) {
        Assert.assertEquals(impl.getVolumeOfCuboid(lenght, wight, height), expected, 0.1);
    }

    @Test(dataProvider = "dpDivisibleBy")
    public void testDivisibleBy(Eight impl, int[] input, int number, int[] expected) {
        Assert.assertEquals(impl.divisibleBy(input, number), expected);
    }

    @Test(dataProvider = "dpLiters")
    public void testLiters(Eight impl, double input, int result) {
        Assert.assertEquals(impl.liters(input), result);
    }

    @Test(dataProvider = "dpStringToNumber")
    public void testStringToNumber(Eight impl, String input, int output) {
        Assert.assertEquals(impl.stringToNumber(input), output);
    }

}
