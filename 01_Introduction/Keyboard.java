import java.lang.*;
import java.util.*;
public class Keyboard {
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // int a,b,c;
        // System.out.println("Enter two number");
        // a = s.nextInt();
        // b = s.nextInt();
        // System.out.println(s.hasNextInt()); // true if given value integer
        // c = a+b;
        // System.out.println("Sum of two number is "+c);
        Scanner sc = new Scanner(System.in);
        sc.useRadix(2); // binary form
        int x = sc.nextInt(); // takes binary value and convert into decimal and return it
        System.out.println(x);
        sc.useRadix(7); // [0, 6]
        x = sc.nextInt();
        System.out.println(x);
    }
}
