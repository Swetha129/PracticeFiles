package CorePractice;

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}
public class CustomException {
    public CustomException() {
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 5, -1};

        try {
            int[] num1 = a;

            for(int i = 0; i < a.length; i++) {
                int num = num1[i];
                if (num < 0) {
                    throw new MyException("Number less than 0");
                }
            }
        } catch (MyException var6) {
            System.out.println("Caught Exceptin");
        }

    }
}
