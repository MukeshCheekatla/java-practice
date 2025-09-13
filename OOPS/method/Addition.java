package OOPS.method;

public class Addition {

    // Method with Arguments and without return statement //
    void add(int a , int b)
    {
        int sum=a+b;
        System.out.println("sum of "+a+" and "+b+" is "+sum );
    }

    public static void main(String[] args) {
        Addition a=new Addition();
        a.add(10, 20);
        a.add(20,30);

    }
}
