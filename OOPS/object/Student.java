package OOPS.object;

// accesing no stactic variable inside same class
public class Student {
    //Non static variable
    int age=20;
    String name="rahul";
    public static void main(String[] args) {
        Student s= new Student(); //objedct creation
        System.out.println(s.age);
        System.out.println(s.name);
    }

}
