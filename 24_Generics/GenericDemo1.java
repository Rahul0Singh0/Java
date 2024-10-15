// Note: GenericDemo1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// to remove above warning we use anotation
@SuppressWarnings("unchecked")

class Data<T> {
    private T obj;
    public void setData(T v) {
        obj = v;
    }
    public T getData() {
        return obj;
    }
}

class MyArray<T> {
    T A[] = (T[])new Object[10];
    int length = 0;
    public void append(T v) {
        A[length++] = v;
    }
    public void display() {
        for(int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

public class GenericDemo1 {
    public static void main(String[] args) {
        // Data<Integer> d = new Data<>();
        // d.setData(new Integer(10));
        // d.setData(10); // Autoboxing
        // d.setData("Hi"); // incampatible types
        // System.out.println(d.getData());

        MyArray<Integer> ma = new MyArray<>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.display();

    }
}
