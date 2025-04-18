// Main.java

// Name: Dheer Ajmera
// PRN: 23070126035
// Dept: SY-AIML-A2

import java.util.*; // Importing utility classes like Scanner and Exception types

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner object for input
        StudentOperations operations = new StudentOperations();
        int choice;

        do {
            // Display menu options
            System.out.println("\nMenu:\n1. Add Student\n2. Display Students\n3. Search by PRN\n4. Search by Name\n5. Search by Position\n6. Update Student\n7. Delete Student\n8. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt(); // Taking user choice
            scan.nextLine(); // Consuming the newline character left after nextInt()
            try {
                // Switch case for various user options
                switch (choice) {
                        case 1:
                        // Adding a new student
                        System.out.print("Enter Name: ");
                        String name = scan.nextLine();
                        System.out.print("Enter PRN: ");
                        int prn = scan.nextInt();
                        scan.nextLine(); // Consume newline
                        System.out.print("Enter Branch: ");
                        String branch = scan.nextLine();
                        System.out.print("Enter Batch: ");
                        String batch = scan.nextLine();
                        System.out.print("Enter CGPA: ");
                        float cgpa = scan.nextFloat();
                        scan.nextLine(); // Consume newline
                        // Add the new student to the list
                        operations.addStudent(new Student(name, prn, branch, batch, cgpa));
                        System.out.println("Student added successfully.");
                        break;

                        case 2:
                        // Displaying all students
                        operations.displayStudents();
                        break;

                        case 3:
                        // Searching student by PRN
                        System.out.print("Enter PRN to search: ");
                        prn = scan.nextInt();
                        scan.nextLine(); // Consume newline
                        operations.searchByPRN(prn).display();
                        break;

                        case 4:
                        // Searching student by Name
                        System.out.print("Enter Name to search: ");
                        name = scan.nextLine();
                        operations.searchByName(name).display();
                        break;

                        case 5:
                        // Searching student by their position (index)
                        System.out.print("Enter Position (Index): ");
                        int index = scan.nextInt();
                        scan.nextLine(); // Consume newline
                        operations.searchByPosition(index).display();
                        break;

                        case 6:
                        // Updating an existing student's details
                        System.out.print("Enter PRN of student to update: ");
                        prn = scan.nextInt();
                        scan.nextLine(); // Consume newline
                        System.out.print("Enter New Name: ");
                        name = scan.nextLine();
                        System.out.print("Enter New Branch: ");
                        branch = scan.nextLine();
                        System.out.print("Enter New Batch: ");
                        batch = scan.nextLine();
                        System.out.print("Enter New CGPA: ");
                        cgpa = scan.nextFloat();
                        scan.nextLine(); // Consume newline
                        // Update student record with the new values
                        operations.updateStudent(prn, name, branch, batch, cgpa);
                        System.out.println("Student updated successfully.");
                        break;

                        case 7:
                        // Deleting a student using PRN
                        System.out.print("Enter PRN of student to delete: ");
                        prn = scan.nextInt();
                        scan.nextLine(); // Consume newline
                        operations.deleteStudent(prn);
                        System.out.println("Student deleted successfully.");
                        break;

                        case 8:
                        // Exiting the program
                        System.out.println("Exiting...");
                        break;

                    default:
                        // Handling invalid menu options
                        throw new InvalidInputException("Invalid menu choice. Try again.");
                }
            } catch (StudentNotFoundException | StudentAlreadyExistsException | InvalidInputException e) {
                // Custom exceptions related to student operations
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                // Catching incorrect input format (e.g., text when number expected)
                System.out.println("Invalid input type. Please enter data correctly.");
                scan.nextLine(); // Clear buffer
            }
        } while (choice != 8); // Repeat until user chooses to exit

        scan.close(); // Closing the scanner object
    }
}
