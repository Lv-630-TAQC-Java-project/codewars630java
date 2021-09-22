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
}
