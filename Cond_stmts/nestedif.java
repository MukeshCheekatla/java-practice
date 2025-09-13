package Cond_stmts;

public class nestedif {
    public static void main(String[] args) {
    //  String id ="admin";
    //  int password= 12345;
    //  if (id=="admin"){

    //     if(password==12345)
    //     {
    //         System.out.println("Login succcessful");
    //     }
    //     else{
    //         System.out.println("incorrect password");
    //     }
    //  }
    //  else{
    //     System.out.println("invslid id");
    //  }
    System.out.println();
    char Gender='M';
    int age =18;
    if (Gender =='M')
    {
        System.out.println("Gender is Male");
        if (age>=21)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not eligible to marry");
        }
    }
    else if (Gender =='F')
    {
        System.out.println("Gender is FeMale");
        if (age>=18)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not eligible to marry");
        }
    }
    }
}
