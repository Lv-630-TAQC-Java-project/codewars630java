package com.ss.ita.kata;

public interface Eight {
    abstract <time> int liters(double time);

    <time> int liters(double, time);

    double getVolumeOfCuboid(final double length, final double width, final double height);

    float mpgToKPM(final float mpg);

    int[] squareOrSquareRoot(final int[] array);

    int[] countPositivesSumNegatives(final int[] input);

    int stringToNumber(final String str);

    boolean amIWilson(final double n);

    double twoDecimalPlaces(final double number);

    int[] divisibleBy(final int[] numbers, final int divider);
}
