package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SixTest extends SixDataProvider {

    @Test(dataProvider = "balance")
    public void testBalance(Six impl,String input, String result) {
        Assert.assertEquals(impl.balance(input),result);
    }

}