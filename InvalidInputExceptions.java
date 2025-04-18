// InvalidInputException.java

// Custom exception class to handle invalid user input
public class InvalidInputException extends Exception {

    // Constructor accepts a custom error message and passes it to the Exception class
    public InvalidInputException(String message) {
        super(message); // Call to superclass constructor with the error message
    }
}
