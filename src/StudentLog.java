import java.time.LocalDateTime;


public class StudentLog {

    // Fields (private = encapsulation)
    private String studentId;
    private String name;
    private LocalDateTime loginTime;   // set automatically, users never type the time

    // Constructor
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
