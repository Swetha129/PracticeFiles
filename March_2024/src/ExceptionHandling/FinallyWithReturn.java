package ExceptionHandling;

class Output {
    public int Output(int a, int b) {
        int c = a / b;
        return c;
    }
}

public class FinallyWithReturn {
    public static void main(String[] args) {
        int result;
            try {
               Output output = new Output();
                result = output.Output(2, 0);
                System.out.println("Result " + result);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception " + e.getMessage());
            } finally {
                    Output output = new Output();
                     result = output.Output(2, 2);
                    System.out.println("Result " + result);
                }
            }

    }
