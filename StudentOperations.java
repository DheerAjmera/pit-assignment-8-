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
    // Method to search student by their position (index in the list)
    public Student searchByPosition(int index) throws InvalidInputException {
        if (index < 0 || index >= students.size()) {
            // Index is out of bounds
            throw new InvalidInputException("Invalid index. Must be between 0 and " + (students.size() - 1));
        }
        return students.get(index); // Return student at given index
    }

    // Method to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            // If no student records exist
            System.out.println("No student records found.");
        } else {
            // Loop through and display each student
            for (Student s : students) {
                s.display();
            }
        }
    }

        // Method to search student by PRN
    public Student searchByPRN(int prn) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getPRN() == prn) {
                return s; // Return student if PRN matches
            }
        }
        // Throw exception if student not found
        throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }

    // Method to search student by name
    public Student searchByName(String name) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s; // Return student if name matches (case-insensitive)
            }
        }
        // Throw exception if student not found
        throw new StudentNotFoundException("Student with name \"" + name + "\" not found.");
    }

    // Method to update an existing student's information
    public boolean updateStudent(int prn, String name, String branch, String batch, float cgpa) throws StudentNotFoundException {
        Student s = searchByPRN(prn); // Find student by PRN
        // Update student's details
        s.setName(name);
        s.setBranch(branch);
        s.setBatch(batch);
        s.setCGPA(cgpa);
        return true;
    }

    
