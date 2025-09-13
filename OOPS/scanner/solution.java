package OOPS.scanner;
import java.util.Scanner;
public class solution {
    
    void add(int a, int b)
    {
        System.out.println(a+b);
    }

    public static void main(String[] args)
    {
        solution s =new solution();
        Scanner sc= new Scanner(System.in);
        
        for(int i=0; i<3; i++)
        {
        System.out.println("Enter a number");
        int a =sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Enter");
        String st= sc.next();
        System.out.println(st);
        s.add(a, b);
        }
        sc.close();
    }
}
