package org.launchcode.java.studios;

import java.lang.reflect.Array;
import java.util.ArrayList;;
import java.util.Scanner;

public class gradebook {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("PLease enter your students(or ENTER to finish):");

//        Get students names
        do {
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                students.add(newStudent);
            }
        } while(!newStudent.equals(""));

//        Get student grades
        for (String student : students) {
            System.out.println("Grades for " + student + "; ");
            Double grade = in.nextDouble();
            grades.add(grade);

        }

//        Print class roster
        System.out.println("/nClass roster:");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " " +
                    "(" + grades.get(i) + ")");
            sum += grades.get(i);

        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}
