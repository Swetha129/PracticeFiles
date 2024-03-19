package CorePractice;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        String[] ar = new String[]{"Hi", "Hello", "Java", "Programming", "Training"};

        try {
            for(int i = 0; i <= ar.length; ++i) {
                System.out.print(ar[i] + " ");
            }
        } catch (Exception var3) {
            System.out.println("\nException caught");
        }

    }
}
