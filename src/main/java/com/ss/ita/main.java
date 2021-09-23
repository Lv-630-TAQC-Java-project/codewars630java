package com.ss.ita;

import com.ss.ita.kata.implementation.users.User;
import com.ss.ita.utils.ConsoleScanner;
import com.ss.ita.utils.Menu;
import com.ss.ita.utils.Runner;
import com.ss.ita.utils.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Run!");
        Menu m = new Menu();
        m.run();

        ConsoleScanner cs = new ConsoleScanner();

        Runner runner = new Runner();
        runner.setUser(User.YURIY_KURIAN);
        runner.TASK_8_9();

    }
}
