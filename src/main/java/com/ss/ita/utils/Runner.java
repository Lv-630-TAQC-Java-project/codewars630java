package com.ss.ita.utils;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.implementation.users.UsersList;

public class Runner {
    private static ConsoleScanner scanner = new ConsoleScanner();
//    private Eight eight;
//    private Seven seven;
//    private Six six;
//    private Five five;
    private UsersList user;

    public void usersMenu() {
        printUsers();

        int number = 1; // scanner.readInt();
        UsersList user = UsersList.getUserByNum(number);

        // choose kata

        switch (chooseKata()) {
            case 8:
                handleEightKata(user.getHolder().getEightImpl());
        }
    }

    public void handleEightKata(Eight kata) {
        System.out.println(
                        "1 - liters\n" +
                        "2 - getVolumeOfCuboid\n" +
                        "Choose task number:"
        );
        switch (2 /* scanner.readInt() */){
            case 2:
                //scanner.readDouble()
                kata.liters(0.1);
        }
    }

    public int chooseKata() {
        System.out.println(
                        "8 - Eight kata\n" +
                        "7 - Seventh kata\n" +
                        "6 - Sixth kata\n" +
                        "5 - Fifth kata\n" +
                        "Choose kata:\n"
        );

        return 1; // scanner.readInt();
    }

    public void setUser(UsersList user){
        this.user = user;
    }

    public void printUsers() {
        for (UsersList user : UsersList.values()) {
            String line = String.format("%2d\t%20s", user.getNumber(), user.getName());
            System.out.println(line);
        }
    }
}
