package OOPS.Blocks;

public class Test {
    

    {
        System.out.println("Non-static block-1");
    }

    {
        System.out.println("Non-static block-2");
    }
     public static void main(String[] args) 
        {
            System.out.println("hui");
            new Test();
            System.out.println("hui");

        }

        
     {
            System.out.println("Non-static block-3");
        }
}
 