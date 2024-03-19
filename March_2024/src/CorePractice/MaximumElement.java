package CorePractice;

public class MaximumElement {
    static int[] a = new int[]{1, 2, 3, 4, 5};

    static int largest() {
        int max = a[0];

        for(int i = 1; i < a.length; ++i) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Largest number in the given array is " + largest());
    }
}
