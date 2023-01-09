package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer studentID;
        String studentName;
        String studentIDString;

        System.out.println("Enter the student IDs (or hit ENTER to finish).");

        do {
           System.out.print("Student ID:");
           studentID = input.nextInt();
           studentIDString = studentID.toString();

           if (!studentIDString.isEmpty()) {
               System.out.print("Student name:");
               studentName = input.nextLine();
               students.put(studentID, studentName);

               input.nextLine();
           }

        } while(!studentIDString.isEmpty());

        System.out.println("\nClass roster:");


        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " - " + student.getValue());
        }
    }
}
