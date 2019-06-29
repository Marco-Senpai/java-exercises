package org.launchcode.java.school;

public class Student {

    private static int newStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;


    }

    public Student(String name, int studentID) {
        this(name, studentId, 0, 0);
    }

    public Student(String name, int studentId) {
        this(name, newStudentId);
        newStudentId++;
    }

}
