package com.ss.ita.utils;

import com.ss.ita.kata.implementation.users.User;

public class Menu {
	public void run() {
		ConsoleScanner cs = new ConsoleScanner();
		Runner runTasks = new Runner();
		int authorNumber = 0;
		for (User element : User.values()) {
			System.out.println("\t" + element.getId() + ". " + element.getName());
		}
		System.out.print("Input authors number: ");
		authorNumber = cs.readInt();
		User[] usersArray = User.values();
		try {
		if (authorNumber >= 1 && authorNumber <= 10) {
			runTasks.setUser(usersArray[authorNumber - 1]);
			System.out.println(usersArray[authorNumber - 1].getName());
		} else {
			throw new IllegalArgumentException("Error!");
		}
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

		System.out.println("Tasks: ");
		System.out.println("\tSome tasks list: ");
		System.out.println("\tSome tasks list: ");
		System.out.println("Input tasks number: ");
		System.out.println("\tShow description task: ");

	}

}
