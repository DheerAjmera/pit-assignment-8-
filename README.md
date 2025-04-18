# pit-assignment-8
# Student-Data-Entry
This Java project is a console-based Student Data Entry System that allows adding, displaying, searching, updating, and deleting student records. It uses custom exceptions for error handling and encapsulates student details using object-oriented principles, providing a clean and interactive menu-driven interface.

## Features
- Add Student: Add a new student record with validation to prevent duplicate PRNs.
- Display Students: View all stored student records.
- Search Student:
  - By PRN
  - By Name
  - By Position (Index in list)
- Update Student: Modify student information based on PRN.
- Delete Student: Remove a student record using PRN.
- Robust Exception Handling:
  - StudentNotFoundException
  - InvalidInputException
  - StudentAlreadyExistsException

## Project Structure
- Student.java                       Model class for Student object
- StudentOperations.java             Contains all operations (add, display, search, update, delete)
- StudentNotFoundException.java      Custom exception when a student is not found
- InvalidInputException.java         Custom exception for invalid user inputs
- StudentAlreadyExistsException.java Custom exception for duplicate PRNs
- Main.java                          Main entry point and menu-driven CLI

## How to Run
1. Clone the repository using Git: https://github.com/Ameya2137/Student-Data-Entry.git
2. Navigate into the project directory: cd Student-Data-Entry
3. Compile all Java files: javac *.java
4. Run the main program: java Main
