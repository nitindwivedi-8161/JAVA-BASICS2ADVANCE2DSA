import java.util.*;
public class BinoamialFunction {
    // public static int factorial(int n){
    //     int f=1;
    //     for(int i=1;i<=n;i++){
    //         f=f*i;

    //     }
    //     return f;

    // }
    
    // public static int binCoeff(int n,int r){
    //     int fact_n=factorial(n);
    //     int fact_r=factorial(r);
    //     int fact_nmr= factorial(n-r);

    //     int binCoeff=fact_n/(fact_r*fact_nmr);
    //     return binCoeff;
    // }

    // FUNCTION OVERLOADING-->functions to calculate sum of two numbers 

    //public static int sum(int a,int b){
    //    return a+b;
    //}
    // Function to calculate sum of three numbers
    //public static int sum(int a, int b, int c){
    //    return a+b+c;

    //}

    // FUNCTION OVERLOADING using datatypes-->function to calculate integer sum
    public static int sum(int a,int b){
        return a+b;
    }

    // function to calculate float sum
    public static float sum( float a,float b){
        return a+b;
    }


    public static void main(String[] args) {
        //System.out.println(binCoeff(5,2));
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f, 4.8f));
    }
    
}
