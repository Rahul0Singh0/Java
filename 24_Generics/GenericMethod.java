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


public class GenericMethod {
    // Bound type here also in Generic method as well as Generic class
    static <T extends Number> void show(T... list) {
        for(T x: list) {
            System.out.println(x);
        }
    }

    // Wild Card => Anytype => does not bounded
    // Unbounded Wild card
    static void fun(MyArray<? extends Number> obj) {
        obj.display();
    }
    public static void main(String[] args) {
        // show(new String[]{"hi", "go", "bye"});
        // show(new Integer[]{1, 2, 3, 4});
        MyArray<Integer> ma = new MyArray<>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
        fun(ma);
    }
};