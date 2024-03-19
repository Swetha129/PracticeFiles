package ExceptionHandling;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        String[] numbers = new String[]{"20", "5", "0", "x"};

        try {
            for(int i = 0; i <= numbers.length; ++i) {
                try {
                    int a = Integer.parseInt(numbers[i]);
                    int b = Integer.parseInt(numbers[i + 1]);
                    int result = a / b;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception " + e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Number Format Exception " + e.getMessage());
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}