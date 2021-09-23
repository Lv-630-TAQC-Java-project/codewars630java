package com.ss.ita.utils;

import com.ss.ita.kata.implementation.users.User;

public class Menu {
	public void run() {
		int userNum = 0;
		ConsoleScanner cs = new ConsoleScanner();
		User.print();
		System.out.print("Input users nember: ");
		userNum = cs.readInt();
		Runner run = new Runner();
		switch (userNum) {
		case (1): {
			run.setUser(User.VLADYSLAV_DMYTRIV);
		}
		case (5): {
			run.setUser(User.TARAS_KRASITSKYI);
		}
		}
	}
}
