package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FiveTest extends FiveDataProvider {
        @Test(dataProvider = "dpGap")
        public void testGap(Five impl, int g, long m, long n, long[] expectedResult) {
            Assert.assertEquals(impl.gap(g, m, n), expectedResult);
        }
    }

