package OOPS.method;

public class mainclass {
    public static void main(String[] args) {
        solution s =new solution();
        s.m1();
        System.out.println("---");

        s.m2("ram ",21);
        System.out.println("----");

        String result=s.m3();
        System.out.println(result);
        System.out.println(s.m3());
        System.out.println("---");

        int sum =s.m4(4, 5);
        System.out.println(sum);
    }
}
