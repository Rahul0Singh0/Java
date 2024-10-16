import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
        // Unordered Set
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        hs.forEach((x) -> System.out.println(x));
    }
}
