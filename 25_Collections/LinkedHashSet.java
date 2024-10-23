import java.util.*;

public class LinkedHashSet {
    public static void main(String[] args) {
        // Sorted Order
        HashSet<String> lhs = new HashSet<>();
        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");
        lhs.add("B");
        // lhs.forEach(System.out::println);
        Iterator<String> it = lhs.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
