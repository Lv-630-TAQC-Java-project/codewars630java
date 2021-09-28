package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EightTest extends EightDataProvider {

    /*@Test
    public void testLiters() {
    }

    @Test
    public void testGetVolumeOfCuboid() {
    }*/

    @Test(dataProvider = "dptpMPG")
    public void testMpgToKPM(Eight impl, float mpg, float result) {
        Assert.assertEquals(impl.mpgToKPM(mpg), result);
    }

    @Test(dataProvider = "wilson")
    public void amIWilson(Eight impl, double number, boolean expected) {
        assertEquals(impl.amIWilson(number), expected, "Error for number \"" + number + "\";");
    }
}