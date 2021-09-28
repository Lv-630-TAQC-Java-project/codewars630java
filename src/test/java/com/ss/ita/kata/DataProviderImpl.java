package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

import java.util.LinkedList;
import java.util.List;

public class DataProviderImpl {

    @DataProvider
    public static Object[][] eightImplPackProvider() {
        return new Object[][] {
                {new com.ss.ita.kata.implementation.anastasia8755.EightImpl()},
                {new com.ss.ita.kata.implementation.dzhyv.EightImpl()},
                {new com.ss.ita.kata.implementation.vladdmytriv.EightImpl()},
                {new com.ss.ita.kata.implementation.NazarYakh.EightImpl()},
//                {new com.ss.ita.kata.implementation.ErrDmitry404.EightImpl()},
        };
    }
    @DataProvider
    public static Object[][] sevenImplPackProvider() {
        return new Object[][] {
                {new com.ss.ita.kata.implementation.anastasia8755.SevenImpl()},
                {new com.ss.ita.kata.implementation.dzhyv.SevenImpl()},
//                {new com.ss.ita.kata.implementation.ErrDmitry404.SevenImpl()},
                {new com.ss.ita.kata.implementation.vladdmytriv.SevenImpl()},
                {new com.ss.ita.kata.implementation.NazarYakh.SevenImpl()},
                {new com.ss.ita.kata.implementation.NyxLex.SevenImpl()},
                {new com.ss.ita.kata.implementation.Percifalll.SevenImpl()},
                {new com.ss.ita.kata.implementation.TarasKr.SevenImpl()},
                {new com.ss.ita.kata.implementation.vladdmytriv.SevenImpl()},
                {new com.ss.ita.kata.implementation.VladGranat.SevenImpl()},
                {new com.ss.ita.kata.implementation.YevgenAleksandrovich.SevenImpl()},
        };
    }
    @DataProvider
    public static Object[][] sixImplPackProvider() {
        return new Object[][]{
                {new com.ss.ita.kata.implementation.anastasia8755.SixImpl()},
                {new com.ss.ita.kata.implementation.dzhyv.SixImpl()},
//                {new com.ss.ita.kata.implementation.ErrDmitry404.SixImpl()},
                {new com.ss.ita.kata.implementation.vladdmytriv.SixImpl()},
                {new com.ss.ita.kata.implementation.NazarYakh.SixImpl()},
                {new com.ss.ita.kata.implementation.NyxLex.SixImpl()},
                {new com.ss.ita.kata.implementation.Percifalll.SixImpl()},
                {new com.ss.ita.kata.implementation.TarasKr.SixImpl()},
                {new com.ss.ita.kata.implementation.vladdmytriv.SixImpl()},
                {new com.ss.ita.kata.implementation.VladGranat.SixImpl()},
                {new com.ss.ita.kata.implementation.YevgenAleksandrovich.SixImpl()},
        };
    }
    @DataProvider
    public static Object[][] fiveImplPackProvider() {
        return new Object[][]{
                {new com.ss.ita.kata.implementation.anastasia8755.FiveImpl()},
                {new com.ss.ita.kata.implementation.dzhyv.FiveImpl()},
//                {new com.ss.ita.kata.implementation.ErrDmitry404.FiveImpl()},
                {new com.ss.ita.kata.implementation.vladdmytriv.FiveImpl()},
                {new com.ss.ita.kata.implementation.NazarYakh.FiveImpl()},
                {new com.ss.ita.kata.implementation.NyxLex.FiveImpl()},
                {new com.ss.ita.kata.implementation.Percifalll.FiveImpl()},
                {new com.ss.ita.kata.implementation.TarasKr.FiveImpl()},
                {new com.ss.ita.kata.implementation.vladdmytriv.FiveImpl()},
                {new com.ss.ita.kata.implementation.VladGranat.FiveImpl()},
                {new com.ss.ita.kata.implementation.YevgenAleksandrovich.FiveImpl()},
        };
    }

    public static Object[][] combine(Object[][] impl,Object[][] data){
        List<Object[]> matrix = new LinkedList<Object[]>();
        for (Object[] imp : impl) {
            for (Object[] inputParam : data) {
                int totalLength = imp.length + inputParam.length;
                Object[] temp = new Object[totalLength];
                temp[0] = imp[0];
                for (int i = 1; i < temp.length; i++) {
                    temp[i] = inputParam[i - 1];
                }
                matrix.add(temp);
            }
        }
        return matrix.toArray(new Object[0][0]);

    }
}
