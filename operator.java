class operator
{
    /**
     * @param args
     */
    public static void main(String[] args) {
        
    
    ///string + anything= concatination//

    // Arithmetic operators//
        int c = 10;
        int d = 5;
        System.out.println(c + d); // Addition
        System.out.println(c - d); // Subtraction
        System.out.println(c * d); // Multiplication
        System.out.println(c / d); // Division
        System.out.println(c % d); // Modulus

    // Assignment operators//
        int e = 15;
        e += 5; // e = e + 5
        System.out.println("Value of e after +=: " + e);
        e -= 3; // e = e - 3
        System.out.println("Value of e after -=: " + e);
        e *= 2; // e = e * 2
        System.out.println("Value of e after *=: " + e);
        e /= 4; // e = e / 4
        System.out.println("Value of e after /=: " + e);
        e %= 3; // e = e % 3
        System.out.println("Value of e after %=: " + e);

    //Relational operators//
        int x =10;
        int y = 20;
        System.out.println(x > y); // false
        System.out.println(x < y); // true
        System.out.println(x == y); // false
        System.out.println(x != y); // true

    // Logical operators//
        boolean p = true;
        boolean q = false;
        System.out.println(p && q); // false
        System.out.println(p || q); // true
        System.out.println(!p); // false

    // Unary operators//
        int a=2;
        int b= 3;
        // a= b++;
        // System.out.println(a);
        // b= a--;
        // System.out.println(b);
        // a=--b;
        // System.out.println(a);
    
    // Terinary Operators//
        
        int result =a<b?a:b;
        System.out.println(" "+a+ +b+" "+result);
   
    //bitwise operators//
        System.out.println("bitwise and ="+(a & b)); //and

        System.out.println(a|b);//or

        System.out.println(a^b);//xor
        System.out.println(~b);//not

        System.out.println(a<<1);
        System.out.println(a>>1);
        System.out.println(a>>>1);

    
}

}