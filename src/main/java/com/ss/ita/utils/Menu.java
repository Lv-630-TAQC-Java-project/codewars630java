package com.ss.ita.utils;

import java.util.ArrayList;
import java.util.List;

import com.ss.ita.kata.implementation.users.User;

public class Menu {
	private ConsoleScanner cs;
	private Runner runTasks;

	public Menu() {
		cs = new ConsoleScanner();
		runTasks = new Runner();
	}

	public void initUser() {
		System.out.println("Authors: ");
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

	public int initTask() {
		int chooseTypeView = 0;
		int kyu = 0;
		List<Integer> taskLs = new ArrayList<Integer>();
		int taskNumber = 0;
		Description[] descArray = Description.values();
		do {
			System.out.print("For show all tasks  press 1, for show tasks by KYU press 2: ");
			chooseTypeView = cs.readInt();
			try {
				if (chooseTypeView == 1 || chooseTypeView == 2) {

					switch (chooseTypeView) {

					case (1): {
						for (int i = 0; i < descArray.length; i++) {
							System.out.println(
									"\t" + (i + 1) + ". " + descArray[i].getKyu() + " KYU - " + descArray[i].getName());

						}

						do {
							System.out.print("Select tasks number for run: ");
							taskNumber = cs.readInt();
							try {
								if (taskNumber > 0 && taskNumber <= descArray.length) {
									break;
								} else {
									throw new IllegalArgumentException(
											"Bad choose! Input number from 1 to " + descArray.length);

								}

							} catch (IllegalArgumentException e) {
								System.out.println(e.getMessage());
							}
						} while (true);

						break;
					}

					case (2): {
						do {
							System.out.print("Input KYU from 5 to 8: ");
							kyu = cs.readInt();
							try {
								if (kyu >= 5 && kyu <= 8) {
									for (int i = 0; i < descArray.length; i++) {
										if (descArray[i].getKyu() == kyu) {
											System.out.println("\t" + (i + 1) + ". " + descArray[i].getKyu() + " KYU - "
													+ descArray[i].getName());
										}
									}
									break;
								} else {
									throw new IllegalArgumentException("Bad choose! Input from 5 or 8.");
								}
							} catch (IllegalArgumentException e) {
							}
						} while (true);
						break;
					}

					}

					break;
				} else {
					throw new IllegalArgumentException("Bad choose! Input 1 or 2.");
				}

			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());

			}
		} while (true);

		return taskNumber;
	}

	public void run() {

		initUser();
		switch (initTask()) {
		case (1): {
			runTasks.TASK_8_1();

		}
		}

	}

}
