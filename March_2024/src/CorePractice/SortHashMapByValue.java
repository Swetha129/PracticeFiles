package CorePractice;

import java.io.PrintStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortHashMapByValue {
    public SortHashMapByValue() {
    }

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        List<Map.Entry<String, Integer>> list = new LinkedList(hm.entrySet());
        Collections.sort(list, (i1, i2) -> {
            return ((Integer)i1.getValue()).compareTo((Integer)i2.getValue());
        });
        HashMap<String, Integer> temp = new LinkedHashMap();
        Iterator var3 = list.iterator();

        while(var3.hasNext()) {
            Map.Entry<String, Integer> aa = (Map.Entry)var3.next();
            temp.put((String)aa.getKey(), (Integer)aa.getValue());
        }

        return temp;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.put("Java", 98);
        hm.put("Python", 85);
        hm.put("C++", 91);
        hm.put("Kotlin", 95);
        hm.put("JavaScript", 79);
        hm.put("C#", 80);
        Map<String, Integer> hm1 = sortByValue(hm);
        Iterator var3 = hm1.entrySet().iterator();

        while(var3.hasNext()) {
            Map.Entry<String, Integer> en = (Map.Entry)var3.next();
            PrintStream var10000 = System.out;
            String var10001 = (String)en.getKey();
            var10000.println("Key = " + var10001 + ", Value = " + en.getValue());
        }

    }
}
