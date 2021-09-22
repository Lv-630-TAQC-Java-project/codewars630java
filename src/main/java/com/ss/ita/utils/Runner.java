package com.ss.ita.utils;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Five;
import com.ss.ita.kata.Seven;
import com.ss.ita.kata.Six;

public class Runner {
    private Eight eight;
    private Seven seven;
    private Six six;
    private Five five;
    private ConsoleScanner sc;

    public void TASK_8_1() {
        System.out.println("Enter the time in hours: ");
        double liters = sc.readDouble();
        while (liters <= 0) {
            System.out.println("Please enter number >= 0");
            liters = sc.readDouble();
        }
        System.out.println("Result: " + eight.liters(liters));
    }
}
