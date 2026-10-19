import java.time.LocalDateTime;

/**
 * StudentLog - the DATA MODEL.
 * One object = one student check-in.
 *
 * OWNER: (OOP section)
 * JAVA CONCEPTS TO TEACH: class vs object, private fields (encapsulation),
 *                         constructor, getters, LocalDateTime.now()
 */
public class StudentLog {

    // ---- Fields (private = encapsulation) ----
    private String studentId;
    private String name;
    private LocalDateTime loginTime;   // set automatically, users never type the time

    // ---- Constructor ----
    public StudentLog(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.loginTime = LocalDateTime.now();
    }

    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public LocalDateTime getLoginTime() {
        return loginTime;
    }

}
