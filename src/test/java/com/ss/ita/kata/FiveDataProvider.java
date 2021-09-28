package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class FiveDataProvider  extends DataProviderImpl{

    @DataProvider(name = "sumSolve")
    public Object[][] sumSolve() {
        Object[][] param = new Object[][]{
                {2.00, 5.000000000000e-01},
                {2.00, 5.000000000000e-01}};
        return combine(fiveImplPackProvider(),param);
    }
}
