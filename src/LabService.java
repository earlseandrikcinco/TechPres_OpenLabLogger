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
        StudentLog newStudent = new StudentLog(studentId, name);

        logs.add(newStudent);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMM d, yyyy hh:mm a");
        System.out.println("Logged in |ID: " + studentId + "| Name: " + name + "| Log-in Time: " + newStudent.getLoginTime().format(fmt) +"|");


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
        //one line version: return logs.removeIf(log -> log.getStudentId().equals(studentId));

        //replace == with .equals later
        for (StudentLog log : logs) {
            if (log.getStudentId() == studentId) {
                logs.remove(log);
                return true;
            }
        }

        return false;

    }


    public ArrayList<StudentLog> getLogs() {

        return logs;
    }
}
