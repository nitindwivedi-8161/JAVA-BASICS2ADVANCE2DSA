import java.util.*;
public class typeconversion {
    public static void main(String[] args) {
// Type Conversion-->

       byte b = 127;
       int a=b;

       System.out.println(a);

       // Type Casting

       int A= 12;
       //byte K=A;--> This may be result in possible loosy conversion from into to byte
        byte K= (byte)A;
        System.out.println(K);
        

    }
    
}
 
   