package ExceptionHandling;

public class ArithmeticExceptionHandling {
    public ArithmeticExceptionHandling() {
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException var5) {
            System.out.println("Division not possible ");
        }

    }
}