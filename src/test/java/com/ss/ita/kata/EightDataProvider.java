package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class EightDataProvider extends DataProviderImpl {
    @DataProvider(name = "dptpMPG")
    public Object[][] dptpMPG() {
         Object[][] param = new Object[][]{{-10, -1}, {0, 0}, {10, 3.54f}, {30, 10.62f}};
         return combine(eightImplPackProvider(),param);
    }

    @DataProvider(name = "dpVolumeOfCuboid")
    public Object[][] dpVolumeOfCuboid(){
         Object[][] param = new Object[][]{
               {5, 5, 5, 125},
               {2, 3, 4, 24},
               {5, 10, 0, 0}};

       return combine(eightImplPackProvider(), param);
    }
}
