package OOPS.scanner;
import java.util.Scanner;

public class scantest {
    public static void main(String[] args) {

        System.out.println("start");

        Scanner scan = new Scanner(System.in);

        System.out.println("enter age");
        int age = scan.nextInt();
        
        System.out.println("name");
        String name = scan.next();

        System.out.println("salary");
        Double salary = scan.nextDouble();

        System.out.println(age+" "+name+" "+salary);

        scan.close();

    }
}
