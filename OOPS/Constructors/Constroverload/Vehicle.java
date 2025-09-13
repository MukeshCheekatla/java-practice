package OOPS.Constructors.Constroverload;

public class Vehicle {
    
    Vehicle(String brand, int cost)
    {
        System.out.println("brand "+brand+" Cost:"+cost);
    }

    Vehicle(String brand)
    {
        System.out.println("brand "+brand);
        
    }

    Vehicle(String brand, String fuel)
    {
        System.out.println("brand "+brand);

    }

    Vehicle()
    {
        System.out.println("Nothing brow");
    }

    public static void main(String[] args) {
        new Vehicle("BMW");
        new Vehicle("Audi", "diesel");
        new Vehicle();
        
        
    }
}
