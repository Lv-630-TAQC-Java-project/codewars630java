package com.ss.ita.utils;

import com.ss.ita.kata.*;
import com.ss.ita.kata.implementation.users.User;

public class Runner {
    private ConsoleScanner scanner = new ConsoleScanner();
    private Eight eight;
    private Seven seven;
    private Six six;
    private Five five;

    public void setUser(User user){
        Holder holder = user.getHolder();

        eight = holder.getEightImpl();
        seven = holder.getSevenImpl();
        six = holder.getSixImpl();
        five = holder.getFiveImpl();
    }

    public void TASK_8_1(){
        System.out.println("Get number of litres Nathan will drink during entered time");
        System.out.println("Enter time");
        new Runner();
        double input = Double.parseDouble(scanner.readString());
        int res = eight.liters(input);
        System.out.println(res);
    }

    public void TASK_8_2() {
        System.out.println("Calculate the volume of a cuboid ");
        System.out.println("Enter length");
        new Runner();
        double length = Double.parseDouble(scanner.readString());
        System.out.println("Enter width");
        double width = Double.parseDouble(scanner.readString());
        System.out.println("Enter height");
        double height = Double.parseDouble(scanner.readString());
        double res = eight.getVolumeOfCuboid(length,width,height);
        System.out.println(res);
    }
    public void TASK_8_3() {}
    public void TASK_8_4() {}
    public void TASK_8_5() {}
    public void TASK_8_6() {}
    public void TASK_8_7() {}
    public void TASK_8_8() {}
    public void TASK_8_9() {}

    public void TASK_7_1() {}
    public void TASK_7_2() {}
    public void TASK_7_3() {}

    public void TASK_6_1() {}
    public void TASK_6_2() {}
    public void TASK_6_3() {}
    public void TASK_6_4() {}
    public void TASK_6_5() {
    	System.out.println("Ranking NBA teams");
    	System.out.println("Enter team to find");
        new Runner();
    	String teamName = scanner.readString();
    	System.out.println("Enter match results in separated by ;");
    	String resultSheet = scanner.readString();
    	System.out.println("Result: " + six.nbaCup(resultSheet, teamName));
    }
    public void TASK_6_6() {
    	System.out.println("Help the bookseller!");
    	System.out.println("Enter array of codes.Example code: ABART 20");
        new Runner();
    	String[] stocklist = scanner.readStringArray();
    	System.out.println("Enter array of categories.Example category: A");
    	String[] categories = scanner.readStringArray();
    	String res = six.stockSummary(stocklist, categories);
    	System.out.println("Result: " + res);
    }

    public void TASK_5_1() {}
    public void TASK_5_2() {}
    public void TASK_5_3() {}
    public void TASK_5_4() {}
    public void TASK_5_5() {}
    public void TASK_5_6() {}
}
