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

    @Test(testName = "3.Test miles per gallon to kilometers per liter", dataProvider = "dptpMPG")
    public void testMpgToKPM(Eight impl, float mpg, float result) {
        Assert.assertEquals(impl.mpgToKPM(mpg), result);
    }
}