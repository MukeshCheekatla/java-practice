package OOPS.variables;

class Zebra
{
    double height =5.5;

    void display()
    {
        double height =3.3;
        System.out.println(height);
        System.out.println(this.height);
    }

    public static void main(String[] args) 
    {
        Zebra z= new Zebra();
        z.display();
    }
}
