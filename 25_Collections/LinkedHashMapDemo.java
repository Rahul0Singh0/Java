import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, .75f, true){
            protected boolean removeEldestEntry(Map.Entry e) {
                return size() > 5;
            }
        };
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.put(6, "F");
        String s = lhm.get(2);
        s=lhm.get(5);
        System.out.println(s);
        lhm.forEach((k,v)->System.out.println(k+ " " + v));
    }
}
