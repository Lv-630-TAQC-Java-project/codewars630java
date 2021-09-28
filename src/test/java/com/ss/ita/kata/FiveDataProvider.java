package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class FiveDataProvider extends DataProviderImpl {

    @DataProvider(name = "sumSolve")
    public Object[][] sumSolve() {
        Object[][] param = new Object[][]{
                {2.00, 5.000000000000e-01},
                {2.00, 5.000000000000e-01}};
        return combine(fiveImplPackProvider(), param);
    }

    @DataProvider(name = "dpGap")
    public Object[][] dpGap() {
        Object[][] param = new Object[][]{
                {2, 5, 7, new long[]{5, 7}},
                {2, 5, 5, null},
                {4, 130, 200, new long[]{163, 167}}
        };
        return combine(fiveImplPackProvider(), param);
    }
}

