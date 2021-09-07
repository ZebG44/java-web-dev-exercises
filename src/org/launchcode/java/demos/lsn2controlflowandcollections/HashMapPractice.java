package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> namesAndIds = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your student's name (or ENTER to finish):");

        // Get student names and IDs
        do {

            System.out.print("Student name: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Student ID: ");
                Integer studentId = input.nextInt();
                namesAndIds.put(studentId, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));
        input.close();

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : namesAndIds.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
        System.out.println("Number of students in roster: " + namesAndIds.size());
    }
}
