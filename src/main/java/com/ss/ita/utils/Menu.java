package com.ss.ita.utils;

import com.ss.ita.kata.implementation.users.User;
import com.ss.ita.kata.implementation.NazarYakh.SixImpl;

public class Menu {
	ConsoleScanner scanner = new ConsoleScanner();
	public void run() {
//		System.out.println("Convert a String to a Number");
//		System.out.println("Enter X");
//		new Runner();
//		double input = scanner.readDouble();
//		double res = new SixImpl().f(input);
//		System.out.println(res);
		Runner runner = new Runner();
		runner.setUser(User.NAZAR_YAKH);
		runner.TASK_6_3();
//		runner.setUser(User.YURIY_KURIAN);
//		runner.TASK_8_9();

	}
	
}
