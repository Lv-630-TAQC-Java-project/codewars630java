package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;



public class FiveTest extends FiveDataProvider {

    @Test(dataProvider = "sumSolve")
    public void testSumSolve(Five impl,double m, double result) {
        Assert.assertEquals(impl.solveSum(m), result);
    }


}