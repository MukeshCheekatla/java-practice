package OOPS.method.methodoverriding;

public class WhatsApp3 extends WhatsApp2{
    
    void display()
    {
        super.display();
        System.out.println("Blue ticks supported");
    }
    void call()
    {
        super.call();
        System.out.println("video call supported");
    }

    void story()
    {
        System.out.println("Stories");
    }


    
}
