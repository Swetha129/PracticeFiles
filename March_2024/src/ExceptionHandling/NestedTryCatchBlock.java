package ExceptionHandling;

public class NestedTryCatchBlock {

    public static void main(String[] args) {
        int[] a = new int[]{4, 3, 2, 1, 0};

        try {
            for(int i = 0; i <= a.length; ++i) {
                try {
                    int c = a[i] / a[i + 1];
                    System.out.println("Result: " + c);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception " + e.getMessage());
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException " + e.getMessage());
        }

    }
}