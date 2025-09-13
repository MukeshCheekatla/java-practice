package OOPS.object;


public class std {
    String name;
    int marks;
    public static void main(String[] args) {
        std s1= new std();
        std s2 = new std();
        s1.name="ram";
        s2.name="syam";
        s1.marks=21;
        s2.marks=36;
        System.out.println(s1.name+" has scored "+s1.marks+" marks");
        System.out.println(s2.name+" "+s2.marks);
    }

}
