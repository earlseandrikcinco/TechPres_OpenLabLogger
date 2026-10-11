import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * LabService - holds the list of active students and the actions on it.
 *
 * OWNER: Member 5 (Collections and memory section)
 * JAVA CONCEPTS TO TEACH: ArrayList<T> and generics, enhanced for loop,
 *                         references vs objects, garbage collection (what happens to a removed
 *                         student?), == vs .equals() on Strings, removeIf / Iterator
 */
public class LabService {

    // ---- State ----

    private ArrayList<StudentLog> logs = new ArrayList<>();

    // ---- Actions ----

    /**
     * Option [1]: adds a new student.
     * TODO: create a new StudentLog(studentId, name) and add it to the list.
     * TODO: print a confirmation including the automatic timestamp.
     */
    public void login(String studentId, String name) {
        // TODO
    }


    public void viewLogs() {
        if (logs.isEmpty()) {
            System.out.println("No active sessions");
            return;
        } else {

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMM d, yyyy hh:mm a");
            for (StudentLog log : logs) {
                System.out.println("|ID: " + log.getStudentId() + "| Name: " + log.getName() + "| Log-in Time: " + log.getLoginTime().format(fmt) +"|");
            }
        }
    }


    public boolean logout(String studentId) {
        return logs.removeIf(log -> log.getStudentId().equals(studentId));
    }


    public ArrayList<StudentLog> getLogs() {

        return logs;
    }
}
