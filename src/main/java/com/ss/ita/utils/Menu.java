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
		System.out.println("Input authors number: ");
		authorNumber = cs.readInt();

		runTasks.setUser(User.GRANAT_VLAD);
		System.out.println("Tasks: ");
		System.out.println("\tSome tasks list: ");
		System.out.println("\tSome tasks list: ");
		System.out.println("Input tasks number: ");
		System.out.println("\tShow description task: ");

	}

}
