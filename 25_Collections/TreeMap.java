// import java.util.TreeMap;
// import java.util.Map;
import java.util.*;

public class TreeMap {
    public static void main(String[] args) {
        HashMap<Integer, String> tm = new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        tm.put(4, "E");
        System.out.println(tm);
    }
}
