package JavaCollections;
//Write a function that takes an array of integers as input and returns the maximum and minimum
//elements present in the array.

import java.util.ArrayList;
import java.util.Collections;


public class MaxMinElements {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(55);
        arrayList.add(-45);
        arrayList.add(100);
        arrayList.add(298);
        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));

    }
}

