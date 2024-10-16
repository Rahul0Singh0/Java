import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Point {
    int x;
    int y;
}

public class TreeSetDemo {
    public static void main(String[] args) {
        // This implementation provides guaranteed log(n) time cost for the basic operations(add, remove, and others)
        // Ordered
        // TreeSet<Integer> ts = new TreeSet<>(List.of(10, 20, 30, 40, 50, 60, 70));
        SortedSet<Integer> ts = new TreeSet<>(List.of(10, 20, 30, 40, 50, 60, 70));
        ts.add(25);
        System.out.println(ts);
    }
}
