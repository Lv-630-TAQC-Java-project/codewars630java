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
                {new com.ss.ita.kata.implementation.ErrDmitry404.EightImpl()},
                {new com.ss.ita.kata.implementation.VladGranat.EightImpl()},
                {new com.ss.ita.kata.implementation.TarasKr.EightImpl()},
                {new com.ss.ita.kata.implementation.Percifalll.EightImpl()},
                {new com.ss.ita.kata.implementation.NyxLex.EightImpl()},
                {new com.ss.ita.kata.implementation.NazarYakh.EightImpl()},
                {new com.ss.ita.kata.implementation.YevgenAleksandrovich.EightImpl()}

        };
    }

    @DataProvider
    public static Object[][] sevenImplPackProvider() {
        return new Object[][] {
                {new com.ss.ita.kata.implementation.anastasia8755.SevenImpl()},
                {new com.ss.ita.kata.implementation.dzhyv.SevenImpl()},
                {new com.ss.ita.kata.implementation.vladdmytriv.SevenImpl()},
                {new com.ss.ita.kata.implementation.ErrDmitry404.SevenImpl()},
                {new com.ss.ita.kata.implementation.VladGranat.SevenImpl()},
                {new com.ss.ita.kata.implementation.TarasKr.SevenImpl()},
                {new com.ss.ita.kata.implementation.Percifalll.SevenImpl()},
                {new com.ss.ita.kata.implementation.NyxLex.SevenImpl()},
                {new com.ss.ita.kata.implementation.NazarYakh.SevenImpl()},
                {new com.ss.ita.kata.implementation.YevgenAleksandrovich.SevenImpl()}

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
