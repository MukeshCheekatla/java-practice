package OOPS.Blocks;

public class student {

    static int age;
    static{
        System.out.println("initializing");
        student.age = 10;
        System.out.println(age);
    }

    public static void main(String[] args) {
        System.out.println(student.age);
        // System.out.println(age);
    }

    static{
        System.out.println("re initialize");
        age= 20;
    }
}
