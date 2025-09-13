package OOPS.method.methodoverloading;

public class methodoverloading {

    void display()
    {
        System.out.println("Hello");
    }

    void display(int x)
    {
        System.out.println(x);
    }

    void display(double x)
    {
        System.out.println(x);
    }
    
    void display(int x, String y)
    {
        System.out.println(x+" "+y);
    }

    void display(String x, int y)
    {
        System.out.println(x);  
    }
}
