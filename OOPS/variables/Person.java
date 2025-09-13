package OOPS.variables;

public class Person 
{
    int age;
    String name;

    Person(int age, String name)
    {
        this.age =age;
        this.name = name;
    }

    public static void main(String[] args) {
        
        Person p1 =new Person(33,"jaddu" );
        Person p2 = new Person(45, "timmy");

        System.out.println(p1.age+" "+p1.name);
        System.out.println(p2.age+" "+p2.name);
    }
}
