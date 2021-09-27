package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class EightDataProvider extends DataProviderImpl {
    @DataProvider(name = "dptpMPG")
    public Object[][] dptpMPG() {
         Object[][] param = new Object[][]{{-10, -1}, {0, 0}, {10, 3.54f}, {30, 10.62f}};
         return combine(eightImplPackProvider(),param);
    }

    @DataProvider(name = "countPositivesSumNegatives")
    public Object[][] countPositivesSumNegatives(){
        Object[][] param = new Object[][]{
                {new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15},
                        new int[] {10, -65}},
                {new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14},
                        new int[] {8, -50}}};
        return combine(eightImplPackProvider(),param);
    }
}
