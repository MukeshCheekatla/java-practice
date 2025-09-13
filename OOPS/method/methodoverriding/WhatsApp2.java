package OOPS.method.methodoverriding;

public class WhatsApp2 extends WhatsApp1 {
    
    void display()
    {
        super.display();
        System.out.println("Double ticks supported");
    }

    void call()
    {
        System.out.println("voice call supported");
    }
}
