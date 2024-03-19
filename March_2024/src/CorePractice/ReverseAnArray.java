package CorePractice;

import java.util.Arrays;

public class ReverseAnArray {
    public ReverseAnArray() {
    }

    public static void main(String[] args) {
        String[] a = new String[]{"This", "is", "a", "Java", "Program"};
        StringBuilder reversed = new StringBuilder();

        for(int i = a.length; i > 0; --i) {
            reversed.append(a[i - 1]).append(" ");
        }

        String[] reversedArray = reversed.toString().split(" ");
        System.out.println(Arrays.toString(reversedArray));
    }
}
