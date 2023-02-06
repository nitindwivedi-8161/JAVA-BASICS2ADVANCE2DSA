import java.util.*;
public class operators {
    public static void main(String[] args) {
        int A = 10;
        int B= 5;
//Arithmetic Operation--> Binary operation
        // System.out.println("add = "+(A+B));
        // System.out.println("Subtract= "+ (A-B));
        // System.out.println("Multipy= "+ (A*B));
        // System.out.println("Divison="+(A/B));
        // System.out.println("Modulo(remainder) ="+(A%B));

//Arithmetic Operation -->Unary Operation and its types

    // Pre Increment (++a) here two things take place simultaneously  -->  1. Value Change, 2. Value Use
        //int B = ++A;
        // System.out.println(A);
        // System.out.println(B);

    // Post Increment (a++) here two things will take place simultaneously --> 1.Value Use, 2. Value Change
        //int B = A++;
        // System.out.println(A);
        // System.out.println(B);

    // Pre Decrement (--a) here two things take place simultaneously  -->  1. Value Change, 2. Value Use
        // int B= --A;
        // System.out.println(A);
        // System.out.println(B);
    // Post Decrement (a--) here two things take place simultaneously --> 1.Value Use, 2. Value Change
        // int B=A--;
        // System.out.println(A);
        // System.out.println(B);


// Relational Operation--> Its result will come out to be either True or False
        // System.out.println( (A==B) );
        // System.out.println( (A!=B) );
        // System.out.println( (A>B) );
        // System.out.println( (A<B) );
        // System.out.println( (A>=B) );
        // System.out.println( (A<=B) );


// Logical Operators --> These are of three types

    // 1.Logical And (&&) where if both the statements are true then only our answer is True otherwise False

        // System.out.println( (A>B) && (A<B) );

    // 2. Logical Or (||) it is also called pool operator , if both the statements are false it gives False otherwise True

        // System.out.println( (A<B) || (A>B) );

    
    // 3. Logical Not (!) or Not Operator , It applied only on Single Statement ,it converts Ture ito False and False into True 
         
        // System.out.println( ! (A>B) );
        // System.out.println( ! (A<B) );

// Assignment Operator --> this gives faster result
        // EVERYTIME THESE OPERATIONS WILL PERFORM ON UPDATED A;
    
        System.out.println(A+=10); // A=A+10
        System.out.println(A-=5); //A =A-5
        System.out.println(A*=10); // A=A*10
        System.out.println(A/=10); //A=A/10
        System.out.println(A%=10); //A=A%10
    }
    
}
