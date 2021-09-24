package com.ss.ita.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

		System.out.println("\tSelected author: " + usersArray[authorNumber - 1].getName());
	}

	public int initTask() {
		int chooseTypeView = 0;
		int kyu = 0;
		List<Integer> taskLs = new ArrayList<Integer>();
		int taskNumber = -10;
		Description[] descArray = Description.values();
		do {
			System.out.print(
					"Press 1: For show all tasks\r\nPress 2: For show tasks by KYU\r\nPress 0: For Users menu: ");
			chooseTypeView = cs.readInt();
			try {
				if (chooseTypeView == 0 || chooseTypeView == 1 || chooseTypeView == 2) {

					switch (chooseTypeView) {
					case (0): {
						taskNumber = 0;
						break;
					}
					case (1): {
						for (int i = 0; i < descArray.length; i++) {
							System.out.println(
									"\t" + (i + 1) + ". " + descArray[i].getKyu() + " KYU - " + descArray[i].getName());
						}

						do {
							System.out.print("Select tasks number for run or press 0 for Users menu: ");
							taskNumber = cs.readInt();
							try {
								if (taskNumber == 0) {
									break;
								}
								if (taskNumber > 0 && taskNumber <= descArray.length) {
									break;
								} else {
									throw new IllegalArgumentException("Bad choose! Input number from 1 to "
											+ descArray.length + " or press O for User menu");
								}
							} catch (IllegalArgumentException e) {
								System.out.println(e.getMessage());
							}
						} while (true);

						break;
					}

					case (2): {
						do {
							System.out.print("Input KYU from 5 to 8 or press 0 for Tasks menu: ");
							kyu = cs.readInt();
							try {
								if (kyu == 0) {
									taskNumber = -1;
									break;
								}
								if (kyu >= 5 && kyu <= 8) {
									for (int i = 0; i < descArray.length; i++) {
										if (descArray[i].getKyu() == kyu) {
											System.out.println("\t" + (i + 1) + ". " + descArray[i].getKyu() + " KYU - "
													+ descArray[i].getName());
											taskLs.add(i + 1);
										}
									}
									do {
										System.out.print("Select tasks number for run or 0 for Tasks menu: : ");
										taskNumber = cs.readInt();
										try {
											if (taskNumber == 0) {
												taskNumber = -1;
												break;
											}
											if (taskNumber >= taskLs.get(0)
													&& taskNumber <= taskLs.get(taskLs.size() - 1)) {
												break;
											} else {
												throw new IllegalArgumentException(
														"Bad choose! Input number from " + (taskLs.get(0) + 1) + " to "
																+ (taskLs.get(taskLs.size() - 1) + 1));
											}

										} catch (IllegalArgumentException e) {
											System.out.println(e.getMessage());
										}
									} while (true);

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
					throw new IllegalArgumentException("Bad choose! Input 1, 2 or 0");
				}

			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());

			}
		} while (true);

		return taskNumber;
	}

	public void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = "";
		boolean flag = true;
		boolean userMenu = false;
		boolean taskMenu = false;
		do {

			do {
				userMenu = false;
				initUser();
				do {
					taskMenu = false;
				switch (initTask()) {
				case(-1):{
					taskMenu = true;
					break;
				}
				case (0): {
					userMenu = true;
					break;
				}
				case (1): {
					runTasks.TASK_8_1();
					break;
				}
				case (2): {
					runTasks.TASK_8_2();
					break;
				}
				case (3): {
					runTasks.TASK_8_3();
					break;
				}
				case (4): {
					runTasks.TASK_8_4();
					break;
				}
				case (5): {
					runTasks.TASK_8_5();
					break;
				}
				case (6): {
					runTasks.TASK_8_6();
					break;
				}
				case (7): {
					runTasks.TASK_8_7();
					break;
				}
				case (8): {
					runTasks.TASK_8_8();
					break;
				}
				case (9): {
					runTasks.TASK_8_9();
					break;
				}
				}
				}while (taskMenu);
				
				
			} while (userMenu);
			
			do {
				System.out.print("\nContinue (y/n)? :");
				// answer = cs.readString();
				try {
					answer = br.readLine();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					if (answer.toLowerCase().equals("n") || answer.toLowerCase().equals("y")) {
						if (answer.toLowerCase().equals("n")) {
							flag = false;
							System.out.print("\nApplication terminate.");
							break;
						}
						break;
					} else {
						throw new IllegalArgumentException("Inccorect anwer. Input \'y\' or \'n\': ");
					}

				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			} while (true);

		} while (flag);
	}

}
