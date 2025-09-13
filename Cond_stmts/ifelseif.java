package Cond_stmts;

public class ifelseif {
    
public static void main(String[] args) {
        System.out.println("Start");
        int a=5;
        int b =10;
        if (a>b) 
        {
            System.out.println(a+" is  less than "+b);
        }
        else if(a<b)
         {
            System.out.println(b);
        }
        else
        {
            System.out.println("n is equal to m");
        }
    

    
        System.out.println("Entetr Your marks to validate");
        int m=-1;
        if (m<=100 & m>=80)
        {
            System.out.println("Distinct");
        }
        else if (m<=80 & m>=35)
        {
            System.out.println("7c");
        }
        else if (m>=0 &m<=34)
        {
            System.out.println("fail");
        }
        else{
            System.out.println("Invalid marks");
        }

    // postive or negative
    int x= 10;
    if (x<0)
    {
        System.out.println("negative number");
    }
    else{
        System.out.println("positive number");
    }

    //even or odd
    int i=14;
    
    if(i%2!=0)
    {
        System.out.println("odd");

    }
    else
    {
        System.out.println("even");

    }


    }
    }

