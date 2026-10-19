import java.io.IOException;
import java.util.Scanner;

/**
 * Main - entry point, menu, and main loop.
 *
 * OWNER: Member 4 (Control flow and input section)
 * JAVA CONCEPTS TO TEACH: public static void main, while loop, switch (and why "break"
 *                         matters), Scanner, String.trim(), Integer.parseInt + try-catch
 */
public class Main {
    // main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LabService lab = new LabService();
        boolean running = true;
        // while loop
        while (running) {

            System.out.println();
            System.out.println("===================================");
            System.out.println("=      Open Lab Attendance        =");
            System.out.println("===================================");
            System.out.println("= [1] Log Student Entrance        =");
            System.out.println("= [2] View Session Logs           =");
            System.out.println("= [3] Log Student Exit            =");
            System.out.println("= [4] Save Logs & Exit            =");
            System.out.println("===================================");
            System.out.print("Choice: ");

            String text = scanner.nextLine().trim(); // scanner
            int choice;
            try { // try-catch
                choice = Integer.parseInt(text); // Integer.parseInt
            } catch (NumberFormatException e) {
                choice = 0;
            }
            //switch
            switch (choice) {
                case 1:
                    String id = readNonBlank(scanner, "Enter 7-digit student ID: ");
                    if (!isValidId(id)) {
                        System.out.println("Please enter a valid 7-digit ID number.");
                        break;
                    }
                    String name = readNonBlank(scanner, "Enter student name: ");
                    lab.login(id, name);
                    break;

                case 2:
                    lab.viewLogs();
                    break;

                case 3:
                    String idToLogout = readNonBlank(scanner, "Enter the Student ID to log out: ");
                    if (lab.logout(idToLogout)) {
                        System.out.println("Student " + idToLogout + " logged out. See you next time!");
                    } else {
                        System.out.println("The ID " + idToLogout + " could not be found.");
                    }
                    break;

                case 4:
                    try {
                        int saved = FileSaver.saveToFile(lab.getLogs());
                        System.out.println(saved + " log(s) saved.");
                        running = false;
                    } catch (IOException e) {
                        System.out.println("WARNING: Could not save logs: " + e.getMessage());
                        System.out.println("Nothing was lost; choose 4 again to retry.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice, try again");
                    break;
            }
        }
        scanner.close();
        System.out.println("Program exited.");
    }

    private static String readNonBlank(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim(); // .trim()
            if (!line.isEmpty()) {
                return line;
            }
            System.out.println("Input cannot be blank. Try again.");
        }
    }

    private static boolean isValidId(String id) {
        if (id.length() != 7) {
            return false;
        }
        try {
            Integer.parseInt(id);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
