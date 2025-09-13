package OOPS.Constructors;

public class Student {
    int age;

    Student(int a)
    {
        age=a;
    }
    public static void main(String[] args) {
        
        Student s1= new Student(20);
        Student s2= new Student(25);
        System.out.println(s1.age);
        System.out.println(s2.age);
    }
}
