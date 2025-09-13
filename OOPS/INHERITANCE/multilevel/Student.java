package OOPS.INHERITANCE.multilevel;

public class Student {
    public static void main(String[] args) {
        Department d= new Department();

        System.out.println(d.Name);
        System.out.println(d.deprtName);
        System.out.println(d.Co);

        d.exams();
        d.fest();
        d.provideplacement();
    }
}
