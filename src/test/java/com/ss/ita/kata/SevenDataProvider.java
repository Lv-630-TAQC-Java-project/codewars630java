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
                {1, "1,00"},
                {2, "1,25"},
                {5, "1,57"}};
        return combine(sevenImplPackProvider(), param);
    }

    @DataProvider(name = "dpNewAvg")
    public Object[][] dpNewAvg() {
        Object[][] param = new Object[][]{
                {new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0}, 92.0, 645},
                {new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90.0, 628},
                {new double[]{19.0, 40.0, 2.0, 33.0, 90.0, 7.0}, 99.0, 502},
        };
        return combine(sevenImplPackProvider(), param);
    }

    @DataProvider(name = "dpExcNewAvg")
    public Object[][] dpExcNewAvg() {
        Object[][] param = new Object[][]{
                {new double[]{14, 30, 5, 7, 9, 11, 15}, 2}
        };
        return combine(sevenImplPackProvider(), param);
    }
}
