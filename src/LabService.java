import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class LabService {

    // State
    private ArrayList<StudentLog> logs = new ArrayList<>();

    // Actions
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
        return logs.removeIf(log -> log.getStudentId().equals(studentId));
    }

    public ArrayList<StudentLog> getLogs() {return logs;}
}
