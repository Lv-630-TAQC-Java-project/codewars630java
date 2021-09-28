package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class FiveDataProvider extends DataProviderImpl {
    @DataProvider(name = "dpGap")
    public Object[][] dpGap() {
        long[] res1 = {5, 7};
        long[] res2 = {163, 167};
        Object[][] param = new Object[][]{
                {2, 5, 7, res1},
                {2, 5, 5, null},
                {4, 130, 200, res2}
        };
        return combine(fiveImplPackProvider(), param);
    }
}

