package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SevenDataProvider extends DataProviderImpl {

    @DataProvider(name = "dpWhereIsVasya")
    public Object[][] dpWhereIsVasya() {
        Object[][] param = new Object[][]{
                {3, 1, 1, 2},
                {5, 2, 3, 3},
                {0, 0, 0, 0}};
        return combine(sevenImplPackProvider(), param);
    }

    @DataProvider(name = "dpSeriesSum")
    public Object[][] dpSeriesSum() {
        Object[][] param = new Object[][]{
                {1, "1.00"},
                {2, "1.25"},
                {5, "1.57"}};
        return combine(sevenImplPackProvider(), param);
    }
}
