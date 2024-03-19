package JavaCollections;
//Implement a function to remove duplicate elements from a singly linked list, preserving the original
//order of elements

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromArrayList {
        public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
        {
            ArrayList<T> newList = new ArrayList<T>();
            for (T element : list) {
                if (!newList.contains(element)) {
                    newList.add(element);
                }
            }
            return newList;
        }
        public static void main(String args[])
        {
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(100, 1000, 1, 2, 2, 3, 3, 4, 3, 4, 5, 7));
            System.out.println("ArrayList with duplicates: " + list);
            ArrayList<Integer> newList = removeDuplicates(list);
            System.out.println("ArrayList with duplicates removed: " + newList);
        }
    }


