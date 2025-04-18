// StudentOperations.java

import java.util.*; // Importing the utility package for using ArrayList and other utilities

public class StudentOperations {
    private ArrayList<Student> students; // List to store Student objects

    // Constructor initializes the ArrayList
    public StudentOperations() {
        this.students = new ArrayList<>();
    }
    // Method to add a new student to the list
    public void addStudent(Student student) throws StudentAlreadyExistsException {
        // Check for duplicate PRN
        for (Student s : students) {
            if (s.getPRN() == student.getPRN()) {
                throw new StudentAlreadyExistsException("Student with PRN " + student.getPRN() + " already exists.");
            }
        }
        // If no duplicate, add student to the list
        students.add(student);
    }
