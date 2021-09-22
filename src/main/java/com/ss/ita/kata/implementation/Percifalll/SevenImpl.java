package com.ss.ita.kata.implementation.Percifalll;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    /**
     * Vasya stands in line with number of people p (including Vasya),
     * but he doesn't know exactly which position he occupies.
     * He can say that there are no less than b people standing in front of him
     * and no more than a people standing behind him.
     * Find the number of different positions Vasya can occupy.
     * Input
     * As an input you have 3 numbers:
     * 1. Total amount of people in the line;
     * 2. Number of people standing in front of him
     * 3. Number of people standing behind him
     */
    @Override
    public int whereIsHe(int p, int bef, int aft) {
        // Variables "bef" and "after" are used as bounds of positions
        // that Vasya can occupy
        if (p <= 0 ) return 0;
        int positionsCount = 0;

        for (int i = 0; i <= p; i++){
            // Here we check if position is after left/front bound
            if (i - 1 >= bef){
                // And here we check if position is before right/back bound
                if (p - i <= aft){
                    positionsCount++;
                }
            }
        }
        return positionsCount;
    }
}
