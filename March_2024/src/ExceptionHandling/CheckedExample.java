package ExceptionHandling;

public class CheckedExample {

    public static void main(String[] args) {
        try {
            Class.forName("NonExistingClass");
        } catch (ClassNotFoundException var2) {
            System.err.println("Class Not Found exception " + var2.getMessage());
        }

    }
}