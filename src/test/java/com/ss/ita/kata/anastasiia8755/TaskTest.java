package com.ss.ita.kata.anastasiia8755;

import com.ss.ita.kata.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.ss.ita.kata.implementation.users.User.SYDOR_ANASTASIA;

public class TaskTest {

    Holder holder = SYDOR_ANASTASIA.getHolder();
    private Eight eight = holder.getEightImpl();
    private Seven seven = holder.getSevenImpl();
    private Six six = holder.getSixImpl();
    private Five five = holder.getFiveImpl();

    @Test(testName = "3.Test miles per gallon to kilometers per liter")
    public void mpgToKPM() {
        Assert.assertEquals(eight.mpgToKPM(-10), -1);
        Assert.assertEquals(eight.mpgToKPM(10), 3.54f);
        Assert.assertEquals(eight.mpgToKPM(0), 0);
    }

    @DataProvider(name = "dptpMPG")
    public Object[][] dptpMPG() {
        return new Object[][]{{-10, -1}, {0, 0}, {10, 3.54f}, {30, 10.62f}};
    }

    @Test(testName = "3.1 Test miles per gallon to kilometers per liter with data provider", dataProvider = "dptpMPG")
    public void mpgToKPMDP(float mpg, float result) {
        Assert.assertEquals(eight.mpgToKPM(mpg), result);
    }

    @DataProvider(name = "whereIsVasya")
    public Object[][] dpwhereIsVasya() {
        return new Object[][]{{3, 1, 1, 2}, {5, 2, 3, 3}, {0, 0, 0, 0}};
    }

    @Test(testName = "12. Test where is Vasya", dataProvider = "whereIsVasya")
    public void whereIsVasya(int p, int bef, int aft, int res) {
        Assert.assertEquals(seven.whereIsHe(p, bef, aft), res);
    }

    @DataProvider(name = "zeros")
    public Object[][] DPzeros() {
        return new Object[][]{{0, 0}, {6, 1}, {14, 2}, {1123, 277}, {125, 31}};
    }

    @Test(testName = "21. Test number of trailing zeros of N!", dataProvider = "zeros")
    public void zeros(int n, int res) {
        Assert.assertEquals(five.zeros(n), res);
    }
}
