package OOPS.scanner;

import java.util.Scanner;

public class sol1 {
    public static void main(String[] args) {
        ass1 ass=new ass1();
        Scanner sc= new Scanner(System.in);

        for (int i=0; i<=5; i++)
        {
            System.out.println("Enter a number to check");
            int x = sc.nextInt();
            ass.cpon(x);
        }
        sc.close();
    }
}
