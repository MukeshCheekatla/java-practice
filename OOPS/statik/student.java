package OOPS.statik;

public class student {
    
    static int age =23;
    static void study()
     {
        System.out.println("Student is studying");
     }
     public static void main(String[] args) {
        
        System.out.println(student.age);
        student.study();

        System.out.println("-------");
        System.out.println(age); //ClassName.Variable -> classname.age -> student.age
        study();                 // ClassName.methodname() -> Classname.study() -> Student.study()


     }
}

