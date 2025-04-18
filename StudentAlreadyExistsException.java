// StudentAlreadyExistsException.java

// Custom exception class to handle cases where a student with the same PRN already exists
public class StudentAlreadyExistsException extends Exception {

    // Constructor that takes an error message and passes it to the Exception class
    public StudentAlreadyExistsException(String message) {
        super(message); // Call to superclass constructor with the custom message
    }
}
