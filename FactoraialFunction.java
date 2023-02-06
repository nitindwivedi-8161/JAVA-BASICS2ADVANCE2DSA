import java.util.*;
public class FactoraialFunction {

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;

        }
        return f;

    }
    
    
    public static void main(String args[]){
        System.out.println(factorial(7)); // we may also call n instead of 7

    }
}
