// Multiple parameters allowed
// class MyArray<T,S> {}

interface A{}
class B extends A{}
class C extends A{}

@SuppressWarnings("unchecked")

class MyArray<T extends A> {
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

class MyArray2 extends MyArray<String> {
    
}

public class GenericDemo2 {
    public static void main(String[] args) {
        MyArray<A> ma = new MyArray<>();
        MyArray<B> ma1 = new MyArray<>();
        MyArray<C> ma2 = new MyArray<>();
        // MyArray<Integer> ma3 = new MyArray<>(); // can't do that


        // MyArray2 ma = new MyArray2();
        // ma.append("HI");
        // ma.append("Hello");
        // ma.append("Go");
        // ma.display();
    }  
}
