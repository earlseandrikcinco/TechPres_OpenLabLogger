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

    // TODO: private ArrayList<StudentLog> logs = new ArrayList<>();

    // ---- Actions ----

    /**
     * Option [1]: adds a new student.
     * TODO: create a new StudentLog(studentId, name) and add it to the list.
     * TODO: print a confirmation including the automatic timestamp.
     */
    public void login(String studentId, String name) {
        // TODO
    }

    /**
     * Option [2]: prints every active student.
     * TODO: if the list is empty, print "No active sessions" (must not crash).
     * TODO: otherwise use an enhanced for loop and print ID, name, and login time.
     *       Format the time with DateTimeFormatter.ofPattern("MMM d, yyyy hh:mm a").
     */
    public void viewLogs() {
        // TODO
    }

    /**
     * Option [3]: removes a student by ID.
     * Returns true if someone was removed, false if the ID was not found.
     * TODO: compare IDs with .equals() (NOT ==). Great teaching moment.
     * TODO: remove with removeIf, OR a classic loop that breaks right after remove.
     *       Removing inside a for-each loop without breaking throws
     *       ConcurrentModificationException (optional live demo).
     */
    public boolean logout(String studentId) {
        return false; // TODO: replace
    }

    /**
     * Gives FileSaver access to the list.
     * TODO: return the list.
     */
    public ArrayList<StudentLog> getLogs() {
        return null; // TODO: replace
    }
}
