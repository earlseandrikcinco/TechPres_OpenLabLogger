import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FileSaver {

    private static final String FILE_NAME = "open_lab_attendance_log.txt";

    public static int saveToFile(List<StudentLog> logs) throws IOException {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMM d, yyyy hh:mm a");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(FILE_NAME,true))) {
            for (StudentLog student : logs) {
                br.write("|ID: " + student.getStudentId()
                        + "| Name: " + student.getName()
                        + "| Log-in Time: " + student.getLoginTime().format(fmt) + "|");
                br.newLine();
            }
        }

        return logs.size();
    }
}
