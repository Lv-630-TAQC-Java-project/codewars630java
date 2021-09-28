package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SevenDataProvider extends DataProviderImpl{
    @DataProvider(name = "dpSeriesSum")
    public Object[][] dpSeriesSum(){
        Object[][] param = new Object[][]{
                {1, "1,00"},
                {2, "1,25"},
                {5, "1,57"}};
        return combine(sevenImplPackProvider(), param);
    }
}
