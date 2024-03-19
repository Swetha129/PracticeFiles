package ExceptionHandling;

class InvalidInputException extends Exception {
    public InvalidInputException(String s) {
        super(s);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int input = -1;

        try {
            if (input < 0) {
                throw new InvalidInputException("Input is less than 0");
            }
            System.out.println("Input is greater than 0");
        } catch (InvalidInputException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            System.out.println("Finally Block");
        }

    }
}