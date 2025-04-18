// StudentNotFoundException.java

// Custom exception class to handle cases where a student is not found
public class StudentNotFoundException extends Exception {

    // Constructor that takes a message and passes it to the parent Exception class
    public StudentNotFoundException(String message) {
        super(message); // Call to superclass constructor with the error message
    }
}
