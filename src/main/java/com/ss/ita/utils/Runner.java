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

    public void TASK_8_1() {}
    public void TASK_8_2() {}
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
    public void TASK_6_5() {}
    public void TASK_6_6() {}

    public void TASK_5_1() {}
    public void TASK_5_2() {}
    public void TASK_5_3() {}
    public void TASK_5_4() {}
    public void TASK_5_5() {}
    public void TASK_5_6() {}
}
