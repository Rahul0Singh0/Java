import java.util.*;

class Cmp implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        if(a < b) {
            return 1;
        }
        if(a > b) {
            return -1;
        }
        return 0;
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // by default min heap
        // PriorityQueue<Integer> p = new PriorityQueue<>();
        // Max Heap
        PriorityQueue<Integer> p = new PriorityQueue<>(new Cmp());
        p.add(20);
        p.add(30);
        p.add(15);
        p.add(10);
        // p.peek() // top element return
        // System.out.println(p.peek());
        p.forEach((x) -> System.out.println(x));
        p.poll(); // remove top element
        p.forEach((x) -> System.out.println(x));
    } 
}