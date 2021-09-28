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
    public void testMpgToKPM( Eight impl, float mpg, float result) { Assert.assertEquals(impl.mpgToKPM(mpg), result); }

    @Test(dataProvider = "dpVolumeOfCuboid")
    public void testVolumeOfCuboid(Eight impl, double lenght, double wight, double height, double expectedResult){
        Assert.assertEquals(impl.getVolumeOfCuboid(lenght, wight, height), expectedResult);}
}
