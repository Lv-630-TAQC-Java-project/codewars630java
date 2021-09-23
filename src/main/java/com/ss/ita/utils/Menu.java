package com.ss.ita.utils;

import com.ss.ita.kata.implementation.users.User;

public class Menu {
	public void initUser() {
		System.out.println("Authors: ");
		ConsoleScanner cs = new ConsoleScanner();
		Runner runTasks = new Runner();

		int authorNumber = 0;
		for (User element : User.values()) {
			System.out.println("\t" + element.getId() + ". " + element.getName());
		}

		User[] usersArray = User.values();
		do {
			try {
				System.out.print("Input authors number: ");
				authorNumber = cs.readInt();
				if (authorNumber >= 1 && authorNumber <= 10) {
					runTasks.setUser(usersArray[authorNumber - 1]);
					
					break;
				} else {
					throw new IllegalArgumentException("Error! Input number from 1 to 10");
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		
		System.out.println("Selected author: " + usersArray[authorNumber - 1].getName());
	}
	public void initTask() {
		
	}

	public void run() {
		initUser();

		System.out.println("Tasks: ");
		System.out.println("\tSome tasks list: ");
		System.out.println("\tSome tasks list: ");
		System.out.println("Input tasks number: ");
		System.out.println("\tShow description task: ");

	}

}
