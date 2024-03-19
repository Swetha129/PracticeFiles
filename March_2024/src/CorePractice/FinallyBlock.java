package CorePractice;

public class FinallyBlock {

    public static void main(String[] args) {
        try {
            System.out.println("inside try block");
            System.out.println(17);
        } catch (ArithmeticException var5) {
            System.out.println("Arithmetic Exception");
        } finally {
            System.out.println("finally block executes.");
        }

    }
}
