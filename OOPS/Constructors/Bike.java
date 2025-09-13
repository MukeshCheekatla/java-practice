package OOPS.Constructors;

public class Bike {

    // Parameterized custom Constructor
    Bike(int a)
    {
        System.out.println("Cost :"+a);
    }
    public static void main(String[] args) {
        new Bike(8);
    }
}
