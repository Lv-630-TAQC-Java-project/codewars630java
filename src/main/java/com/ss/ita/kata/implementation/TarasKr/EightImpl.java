package com.ss.ita.kata.implementation.TarasKr;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
	/**
	 * Nathan loves cycling. Because Nathan knows it is important to stay hydrated,
	 * he drinks 0.5 litres of water per hour of cycling. You get given the time in
	 * hours and you need to return the number of litres Nathan will drink, rounded
	 * to the smallest value.
	 * 
	 * @param time - A time
	 * @exception IllegalArgumentException IF (time < 0)
	 * @return the number of litres rounded to the smallest value.
	 */
	@Override
	public int liters(double time) {
		if (time < 0) {
			throw new IllegalArgumentException("Illegar argument! Time is non-negative.");
		}
		return (int) (0.5 * time);
	}
   
    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
