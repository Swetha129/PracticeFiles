package CorePractice;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfAnElement {
    public FrequencyOfAnElement() {
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("hi");
        arrayList.add("Hello");
        arrayList.add("hi");
        System.out.println("The frequency of the word code is: " + Collections.frequency(arrayList, "hello"));
    }
}
