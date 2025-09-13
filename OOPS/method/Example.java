package OOPS.method;

public class Example {

    // Method with arguments and with return statement
    int findsquare(int n)
    {
        return n*n;
    }
    public static void main(String[] args) {
        Example e= new Example();
        int result= e.findsquare(5);
        System.out.println(result);
        System.out.println(e.findsquare(9));
    }
}
