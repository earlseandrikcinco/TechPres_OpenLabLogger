import java.io.IOException;
import java.util.List;

/**
 * FileSaver - writes the logs to a text file (APPEND ONLY).
 *
 * OWNER: Member 6 (Exceptions and file I/O section)
 * JAVA CONCEPTS TO TEACH: checked exceptions, "throws", try-with-resources,
 *                         FileWriter in append mode, IOException
 */
public class FileSaver {

    private static final String FILE_NAME = "open_lab_attendance_log.txt";

    /**
     * Appends every log to the file and returns how many records were saved.
     * Old records must never be overwritten.
     *
     * TODO: open the file with new FileWriter(FILE_NAME, true) inside a try-with-resources
     *       block so it closes automatically (explain what try-with-resources replaces).
     * TODO: for each log, write one line: ID | name | login time.
     * TODO: return the number of records written.
     *
     * This method declares "throws IOException": the CALLER (Main) must handle it
     * with try-catch and show a friendly message instead of crashing.
     */
    public static int saveToFile(List<StudentLog> logs) throws IOException {
        return 0; // TODO: replace
    }
}
