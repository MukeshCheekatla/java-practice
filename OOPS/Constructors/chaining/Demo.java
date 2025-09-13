package OOPS.Constructors.chaining;

public class Demo 
{
    Demo(int a)
    {
        System.err.println(a);
    }
    Demo()
    {
        this(10);
        System.out.println(2);
    }

    public static void main(String[] args) {
        
        new Demo();

        System.out.println("hui");

    }
}
