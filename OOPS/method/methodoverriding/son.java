package OOPS.method.methodoverriding;

public class son extends father {
    
    @Override
    void Bike()
    {
        System.out.println("hui");
    }
    public static void main(String[] args) {
        
        son s =new son();
        s.Bike();
    }
}
