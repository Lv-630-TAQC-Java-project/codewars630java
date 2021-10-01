package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class EightDataProvider extends DataProviderImpl {
    @DataProvider(name = "dpTpMPG")
    public Object[][] dpTpMPG() {
        Object[][] param = new Object[][]{
                {-10, -1},
                {0, 0},
                {10, 3.54f},
                {30, 10.62f}
        };
        return combine(eightImplPackProvider(), param);
    }

    @DataProvider(name = "dpAmIWilson")
    public Object[][] dpAmIWilson() {
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

    @DataProvider(name = "dpCountPositivesSumNegatives")
    public Object[][] dpCountPositivesSumNegatives() {
        Object[][] param = new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15},
                        new int[]{10, -65}},
                {new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14},
                        new int[]{8, -50}}};
        return combine(eightImplPackProvider(), param);
    }

    @DataProvider(name = "dpVolumeOfCuboid")
    public Object[][] dpVolumeOfCuboid() {
        Object[][] param = new Object[][]{
                {5, 5, 5, 125},
                {2, 3, 4, 24},
                {5, 10, 0, 0}};

        return combine(eightImplPackProvider(), param);
    }

    @DataProvider(name = "dpDivisibleBy")
    public Object[][] dpDivisibleBy() {
        Object[][] param = new Object[][]{
                {new int[]{2,4,6,8,3,45,0,10,-12,-14},2,
                        new int[]{2,4,6,8,0,10,-12,-14}},
                {new int[]{-2,23,112,6,-20,25},5,
                        new int[]{-20,25}}};
        return combine(eightImplPackProvider(), param);
    }

    @DataProvider(name = "dpLiters")
    public Object[][] dpLiters() {
        Object[][] param = new Object[][]{
                {1, 0},
                {4, 2},
                {3, 1},
                {8.6, 4},
                {12.9, 6},
                {-10.3, -1},
                {-1, -1},
                {-5, -1}
        };

        return combine(eightImplPackProvider(), param);
    }

}
