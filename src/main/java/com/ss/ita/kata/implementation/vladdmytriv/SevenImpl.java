package com.ss.ita.kata.implementation.vladdmytriv;

import com.ss.ita.kata.Seven;

import java.util.ArrayList;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {

        return null;
    }

    public ArrayList<Integer> whereIsHe(int p, int bef, int aft) {
        ArrayList<Integer> positions = new ArrayList<>();
        int a = 0;
        int b = 0;
        for (int i = 1; i <= p; i++) {
            a=i-1;
            b=p-i;
            if (a >=bef && b <=aft){
                positions.add(i);
            }
        }
        return positions;
    }
}
