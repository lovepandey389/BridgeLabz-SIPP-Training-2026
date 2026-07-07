import java.util.ArrayList;
import java.util.HashMap;

public class SmartClassroomAttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    public static void markAttendance(String subject, String student) {

        if (!attendance.containsKey(subject)) {
            attendance.put(subject, new ArrayList<String>());
        }

        ArrayList<String> students = attendance.get(subject);

        if (students.contains(student)) {
            System.out.println(student + " is already marked present in " + subject);
        } else {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        }

    }

    public static void displayAttendance() {

        System.out.println("\n----- Attendance Report -----");

        for (String subject : attendance.keySet()) {

            System.out.println("\nSubject : " + subject);

            ArrayList<String> students = attendance.get(subject);

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total Students : " + students.size());

        }

    }

    public static void main(String[] args) {

        markAttendance("Java", "Rahul");
        markAttendance("Java", "Amit");
        markAttendance("Java", "Rahul");

        markAttendance("Python", "Neha");
        markAttendance("Python", "Riya");
        markAttendance("Python", "Neha");

        markAttendance("DBMS", "Karan");
        markAttendance("DBMS", "Simran");

        displayAttendance();

    }

}

// Time Complexity
// Operation	Complexity
// Add Subject	O(1)
// Check Duplicate Student	O(n)
// Mark Attendance	O(n)
// Display Attendance	O(n)