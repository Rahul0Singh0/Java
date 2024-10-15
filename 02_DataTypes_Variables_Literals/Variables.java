public class Variables {
    public static void main(String[] args) {
//        Variables declaration
        byte b = 5; // [-128, 127]
        System.out.println(b);
        b = 127;
        System.out.println(b);
//        b = 128;
//        System.out.println(b);
        short s = 300; // 2byte
        int a = 2894;
        float e = 23.5f;
        double c = 45.673;
        System.out.println(s+" "+a+" "+e+" "+c);
    }
}
