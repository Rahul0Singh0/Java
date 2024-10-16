import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        System.out.println(dq);
        // Lamda Expression(Anonymous function)
        dq.pollFirst(); // remove from first index
        dq.forEach((x)->System.out.println(x));
        /*dq.offerFirst(1);
        dq.offerFirst(2);
        dq.forEach((x)->System.out.println(x));
        */
    }
}
