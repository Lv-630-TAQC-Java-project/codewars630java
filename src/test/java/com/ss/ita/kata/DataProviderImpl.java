package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

import java.util.LinkedList;
import java.util.List;

public class DataProviderImpl {

    @DataProvider
    public static Object[][] eightImplPackProvider() {
        return new Object[][] {
                {new com.ss.ita.kata.implementation.NyxLex.EightImpl()},
                {new com.ss.ita.kata.implementation.dzhyv.EightImpl()},
                {new com.ss.ita.kata.implementation.vladdmytriv.EightImpl()},
                {new com.ss.ita.kata.implementation.ErrDmitry404.EightImpl()}

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
