import java.time.LocalDateTime;

/**
 * StudentLog - the DATA MODEL.
 * One object = one student check-in.
 *
 * OWNER: Member 3 (OOP section)
 * JAVA CONCEPTS TO TEACH: class vs object, private fields (encapsulation),
 *                         constructor, getters, LocalDateTime.now()
 */
public class StudentLog {

    // ---- Fields (private = encapsulation) ----

    // TODO: private String studentId;
    // TODO: private String name;
    // TODO: private LocalDateTime loginTime;   // set automatically, users never type the time

    // ---- Constructor ----

    /**
     * Creates a new log entry.
     * TODO: assign studentId and name from the parameters.
     * TODO: set loginTime = LocalDateTime.now().
     */
    public StudentLog(String studentId, String name) {
        // TODO
    }

    // ---- Getters ----

    /** TODO: return the student ID. */
    public String getStudentId() {
        return ""; // TODO: replace
    }

    /** TODO: return the student's name. */
    public String getName() {
        return ""; // TODO: replace
    }

    /** TODO: return the login time. */
    public LocalDateTime getLoginTime() {
        return null; // TODO: replace
    }
}
