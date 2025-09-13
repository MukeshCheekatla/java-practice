package OOPS.Blocks;

public class car {
    
    static
    {
        System.out.println(1);
    }

    public static void main(String[] args) {
        
        new car();
        System.out.println(3);
        
    }

    {
        System.out.println(2);  
    }


}
