import java.util.*;
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));
        al1.add(10);
        al1.add(0, 5); // at index 0
        al1.addAll(1, al2); // from index 1
        al1.add(70);
        al1.set(7, 100); // override or set the value at particular index
        System.out.println(al1.contains(50));
        System.out.println(al1.indexOf(70));
        System.out.println(al1.lastIndexOf(70));
        System.out.println(al1);
        for(int i = 0; i < al1.size(); i++) {
            System.out.println(al1.get(i));
        }

        for(Integer x : al1) {
            System.out.println(x);
        }

        for(var x : al1) {
            System.out.println(x);
        }

        for(Iterator<Integer> it = al1.iterator(); it.hasNext(); ) {
            java.lang.Integer x = it.next();
            System.out.println(x);
        }

        al1.forEach(n->show(n)); // lambda expression inside forEach
    }    
    static void show(int n) {
        if(n > 60) 
            System.out.println(n);
    }
}
