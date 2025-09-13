package OOPS.method.methodoverriding;

public class Car extends Vehicle{
    

    void start()
    {
        super.start();
        System.out.println("Car started");
    }

    void shiftgears()
    {
        System.out.println("shifted");
    }

    public static void main(String[] args) {
        
        Car c= new Car();

        c.start();

    }
}
