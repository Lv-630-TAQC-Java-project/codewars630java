package com.ss.ita.utils;

public class Menu {
    private final Runner runner;
    private final Scanner scanner;

    private final Runnable[] fifthKataMethods;
    private final Runnable[] sixthKataMethods;
    private final Runnable[] seventhKataMethods;
    private final Runnable[] eightKataMethods;

    public Menu() {
        runner = new Runner();
        scanner = new ConsoleScanner();

        // Creating arrays for each kata
        // that will contain corresponding methods
        fifthKataMethods = new Runnable[]{
                runner::TASK_5_1,
                runner::TASK_5_2,
                runner::TASK_5_3,
                runner::TASK_5_4,
                runner::TASK_5_5,
                runner::TASK_5_6
        };

        sixthKataMethods = new Runnable[]{
                runner::TASK_6_1,
                runner::TASK_6_2,
                runner::TASK_6_3,
                runner::TASK_6_4,
                runner::TASK_6_5,
                runner::TASK_6_6
        };

        seventhKataMethods = new Runnable[]{
                runner::TASK_7_1,
                runner::TASK_7_2,
                runner::TASK_7_3
        };

        eightKataMethods = new Runnable[]{
                runner::TASK_8_1,
                runner::TASK_8_2,
                runner::TASK_8_3,
                runner::TASK_8_4,
                runner::TASK_8_5,
                runner::TASK_8_6,
                runner::TASK_8_7,
                runner::TASK_8_8,
                runner::TASK_8_9
        };
    }

    public void run() {
        System.out.println("##Codewars tasks run menu");

        user:
        while (true) {
            System.out.println("\n#User selection");
            printUserList();

            // getting valid user number
            while (true) {
                System.out.print("Choose option:");
                int userNumber = scanner.readInt();

                if (userNumber == 0) break user;
                if (userNumber > 0 && userNumber <= User.values().length) {
                    runner.setUser(User.values()[userNumber - 1]);
                    break;
                } else System.out.println("Wrong user number");
            }

            // choosing kata to run
            kata:
            while (true) {
                System.out.println("\n" + "#Kata selection" + "\n");
                System.out.print("Choose option" + "\n" +
                        "\t" + "8 - eight kata" + "\n" +
                        "\t" + "7 - seventh kata" + "\n" +
                        "\t" + "6 - sixth kata" + "\n" +
                        "\t" + "5 - fifth kata" + "\n" +
                        "\t" + "0 - choose another user" + "\n" +
                        "Input:"
                );

                int number = scanner.readInt();

                switch (number) {
                    case 8:
                        runEightKata();
                        break;
                    case 7:
                        runSeventhKata();
                        break;
                    case 6:
                        runSixthKata();
                        break;
                    case 5:
                        runFifthKata();
                        break;
                    case 0:
                        break kata;
                    default:
                        System.out.println("\n" + "Invalid kata number");
                        break;
                }
            }
        }
    }

    private void runFifthKata() {
        System.out.println("\n" + "# Kata 5");

        do {
            System.out.println("\n" + "Tasks list" + "\n" +
                    "\t" + "1 - Artificial rain" + "\n" +
                    "\t" + "2 - Gap in primes" + "\n" +
                    "\t" + "3 - Trailing zeros in factorial" + "\n" +
                    "\t" + "4 - Perimeter of squares in a rectangle" + "\n" +
                    "\t" + "5 - Which x for that sum" + "\n" +
                    "\t" + "6 - Find the smallest"
            );
        } while (runSelectedMethod(fifthKataMethods));
    }

    private void runSixthKata() {
        System.out.println("\n" + "# Kata 6");

        do {
            System.out.println("\n" + "Tasks list" + "\n" +
                    "\t" + "1 - Build a pile of cubes" + "\n" +
                    "\t" + "2 - Easy balance checking" + "\n" +
                    "\t" + "3 - Float point approximation" + "\n" +
                    "\t" + "4 - Rainfall" + "\n" +
                    "\t" + "5 - Ranking NBA" + "\n" +
                    "\t" + "6 - Help the bookseller!"
            );
        } while (runSelectedMethod(sixthKataMethods));
    }

    private void runSeventhKata() {
        System.out.println("\n" + "# Kata 7");

        do {
            System.out.println("\n" + "Tasks list" + "\n" +
                    "\t" + "1 - Looking for a benefactor" + "\n" +
                    "\t" + "2 - Sum of the first nth term of Series" + "\n" +
                    "\t" + "3 - Where is Vasya?"
            );
        } while (runSelectedMethod(seventhKataMethods));
    }

    private void runEightKata() {
        System.out.println("\n" + "# Kata 8");

        do {
            System.out.println("\n" + "Tasks list" + "\n" +
                    "\t" + "1 - Keep Hydrated!" + "\n" +
                    "\t" + "2 - Volume of a cuboid" + "\n" +
                    "\t" + "3 - Miles per gallon to kilometers per liter" + "\n" +
                    "\t" + "4 - To square or not to square" + "\n" +
                    "\t" + "5 - Count of positives / sum of negatives" + "\n" +
                    "\t" + "6 - Convert a String to a Number!" + "\n" +
                    "\t" + "7 - Willson primes" + "\n" +
                    "\t" + "8 - Formatting decimal places" + "\n" +
                    "\t" + "9 - Find numbers which are divisible by given number" + "\n" +
                    "\t" + "0 - Select another kata"
            );
        } while (runSelectedMethod(eightKataMethods));
    }

    private void printUserList() {
        String format = "\t%2d  %17s";
        System.out.println(String.format(format, 0, "Close the program"));
        for (int i = 0; i < User.values().length; i++) {
            System.out.println(
                    String.format(format, i + 1, User.values()[i].getName())
            );
        }
    }

    /**
     * This method receives <b>methods array</b>.<br>
     * Then it asks user to select a task number in console.<br>
     * After it check if number is correct and runs corresponding <b>method</b> from <b>array</b>.
     *
     * @param methods array of methods
     * @return false if user chose to move back to task selection
     */
    private boolean runSelectedMethod(Runnable[] methods) {
        while (true) {
            System.out.print("Input:");
            int taskNumber = scanner.readInt();

            if (taskNumber == 0) return false;
            if (taskNumber > 0 && taskNumber <= methods.length) {
                methods[taskNumber - 1].run();
                return true;
            } else System.out.println("Wrong task number");
        }
    }
}
