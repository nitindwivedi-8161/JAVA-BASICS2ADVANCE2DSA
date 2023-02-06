import java.util.*;
public class typepromotion {
    public static void main (String args []){
        char a='a';
        char b ='b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);
        System.out.println(a);// this is not allowed 


        int  c=10;
        float d=20.25f;
        long e=25;
        double f=30;
        double ans =c+d+e+f;
        System.out.println(ans);

        byte g=5;
        byte h=(g*2);  // this will consider g as int and give the result 10 basically java will consider g*h as an expression
        // type casting byte h=(byte)(g*2);// this will rectify the above error


        System.out.println(h);

    }
    
}
