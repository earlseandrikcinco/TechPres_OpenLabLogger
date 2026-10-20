/**
 * This file is for earl
 * ALT + SHIFT + . to increase font size
 */

import java.util.ArrayList;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<StudentLog> logs = new ArrayList<>();
        logs.add(new StudentLog("1111111", "Ana"));
        logs.add(new StudentLog("2222222", "Ben"));
        logs.add(new StudentLog("3333333", "Cy"));

        // BROKEN: removing while looping
        for (StudentLog log : logs) {
            if (log.getStudentId().equals("1111111")) {
                logs.remove(log);

            }
        }

        // FIX:
        // logs.removeIf(log -> log.getStudentId().equals("1111111"));
        // System.out.println("Remaining: " + logs.size());
    }
}