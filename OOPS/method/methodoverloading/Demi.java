package OOPS.method.methodoverloading;

public class Demi {

    public static void main(String[] args) {
        System.out.println("hui");
        main(0);
        main(0);
    }
    
    public static void main(int a) {
        System.out.println("hui");
    }

    public static void main(float b) {
        System.out.println("hui");
    }
}
