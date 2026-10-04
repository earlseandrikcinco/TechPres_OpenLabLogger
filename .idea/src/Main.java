import java.util.Scanner;

/**
 * Main - entry point, menu, and main loop.
 *
 * OWNER: Member 4 (Control flow and input section)
 * JAVA CONCEPTS TO TEACH: public static void main, while loop, switch (and why "break"
 *                         matters), Scanner, String.trim(), Integer.parseInt + try-catch
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LabService lab = new LabService();
        boolean running = true;

        // TODO: while (running) { ... }
        //   1. print the menu
        //        [1] Log Student Entrance
        //        [2] View Session Logs
        //        [3] Log Student Exit
        //        [4] Save Logs & Exit
        //   2. read the choice as a String and convert with Integer.parseInt.
        //      Wrap it in try-catch (NumberFormatException) so typing "A" does not crash;
        //      treat bad input as 0 and print "Invalid choice, try again".
        //   3. switch (choice):
        //        case 1: ask for ID and name (scanner.nextLine().trim()), reject blank input,
        //                then lab.login(id, name);   break;
        //        case 2: lab.viewLogs();             break;
        //        case 3: ask for ID, call lab.logout(id), print found / not found;  break;
        //        case 4: try { int n = FileSaver.saveToFile(lab.getLogs()); print n saved; running = false; }
        //                catch (IOException e) { print a friendly warning; keep running }
        //                (remember to import java.io.IOException)
        //                break;
        //        default: print "Invalid choice, try again";
        //   Demo idea: remove one "break" live and show the fall-through bug.

        scanner.close();
        System.out.println("Program exited.");
    }
}
