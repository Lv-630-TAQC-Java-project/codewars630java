package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class FiveDataProvider extends DataProviderImpl {

    @DataProvider(name = "dpSumSolve")
    public Object[][] dpSumSolve() {
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

    @DataProvider(name = "dpZeros")
    public Object[][] dpZeros() {
        Object[][] param = new Object[][]{
                {-5, -1},
                {0, 0},
                {6, 1},
                {125, 31}
        };
        return combine(fiveImplPackProvider(), param);
    }

    @DataProvider(name = "dpArtificialRain")
    public Object[][] dpArtificialRain() {
        Object[][] param = new Object[][]{
                {new int[]{1},1},
                {new int[]{-1, 2, 5, 6, 4, 3}, -1},
                {new int[]{ 4, 5, -2, 5, -1}, -1},
                {new int[]{2, 1, 3, 2, 1}, 4},
                {new int[]{4, 3, 2, 1}, 4},
                {new int[]{1, 2, 1, 3}, 3},
                {new int[]{2, 1, 2}, 2},
                {new int[]{5, 4, 3, 2, 2, 2, 1}, 7},
                {new int[]{1, 1, 1, 2, 2, 2, 3, 3, 4, 5}, 10}
        };
        return combine(fiveImplPackProvider(), param);
    }

    @DataProvider(name = "dpInvalidArtificialRain")
    public Object[][] dpInvalidArtificialRain() {
        Object[][] param = new Object[][]{
                {new int[]{-1, 2, 5, 6, 4, 3}, -1},
                {new int[]{ 4, 5, -2, 5, -1}, -1}
        };
        return combine(fiveImplPackProvider(), param);
    }

    @DataProvider(name = "dpSmallest")
    public Object[][] dpSmallest() {
        Object[][] params = new Object[][]{
                {261235, new long[]{126235, 2, 0}},
                {209917, new long[]{29917, 0, 1}},
                {285365, new long[]{238565, 3, 1}},
                {269045, new long[]{26945, 3, 0}},
                {296837, new long[]{239687, 4, 1}}

        };
        return combine(fiveImplPackProvider(), params);
    }
}

