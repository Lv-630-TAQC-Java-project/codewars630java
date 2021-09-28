package com.ss.ita.kata;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class EightTest extends EightDataProvider {

    @Test(dataProvider = "dpTpMPG")
    public void testMpgToKPM(Eight impl, float mpg, float expected) {
        assertEquals(impl.mpgToKPM(mpg), expected);
    }

    @Test(dataProvider = "dpAmIWilson")
    public void amIWilson(Eight impl, double number, boolean expected) {
        assertEquals(impl.amIWilson(number), expected, "Error for number \"" + number + "\";");
    }

    @Test(dataProvider = "dpCountPositivesSumNegatives")
    public void testCountPositivesSumNegatives(Eight impl, int[] input, int[] expected) {
        assertEquals(impl.countPositivesSumNegatives(input), expected);
    }

    @Test(dataProvider = "dpVolumeOfCuboid")
    public void testVolumeOfCuboid(Eight impl, double lenght, double wight, double height, double expected) {
        assertEquals(impl.getVolumeOfCuboid(lenght, wight, height), expected,0.1);
    }

    @Test(dataProvider = "dpDivisibleBy")
    public void testDivisibleBy(Eight impl, int[] input, int number, int[]expected) {
        assertEquals(impl.divisibleBy(input, number), expected);
    }
}
