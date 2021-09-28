package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class EightDataProvider extends DataProviderImpl {
    @DataProvider(name = "dptpMPG")
    public Object[][] dptpMPG() {
         Object[][] param = new Object[][]{
                 {-10, -1},
                 {0, 0},
                 {10, 3.54f},
                 {30, 10.62f}
         };
         return combine(eightImplPackProvider(),param);
    }

    @DataProvider(name = "wilson")
    public Object[][] amIWilson(){
        Object[][] params = new Object[][]{
                {1, false},
                {3, false},
                {5, true},
                {13, true},
                {541, false},
                {563, true}
        };

        return combine(eightImplPackProvider(), params);
    }
}
