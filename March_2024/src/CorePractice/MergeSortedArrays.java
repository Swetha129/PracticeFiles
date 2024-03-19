package CorePractice;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void mergeArrays(int[] arr1, int[] arr2, int s1, int s2, int[] arr3) {
        int a = 0;
        int b = 0;
        int c = 0;

        while(a < s1) {
            for(arr3[c++] = arr1[a++]; b < s2; arr3[c++] = arr2[c++]) {
            }

            Arrays.sort(arr3);
        }

    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 5, 7};
        int n1 = arr1.length;
        int[] arr2 = new int[]{2, 4, 6, 8};
        int n2 = arr2.length;
        int[] arr3 = new int[n1 + n2];
        mergeArrays(arr1, arr2, n1, n2, arr3);
        System.out.println("Array after merging");

        for(int i = 0; i < n1 + n2; ++i) {
            System.out.print(arr3[i] + " ");
        }

    }
}