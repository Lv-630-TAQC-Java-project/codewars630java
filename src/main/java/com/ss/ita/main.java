package com.ss.ita;

import com.ss.ita.kata.implementation.users.User;
import com.ss.ita.utils.Menu;
import com.ss.ita.utils.Runner;

public class main {
    public static void main(String[] args) {
        Menu m = new Menu();
        m.run();
        Runner runner = new Runner();
        runner.setUser(User.YURIY_KURIAN);
        runner.TASK_8_8();
    }
}
