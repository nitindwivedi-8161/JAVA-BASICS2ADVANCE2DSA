import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Function {
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    } 

    public static int calculateSum(int num1 ,int num2){ //parameters or formal parameters in function definition
        int sum= num1+num2;
        return sum;
        //System.out.println("sum is :"+sum);
    }

    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

        //System.out.println("a = "+a);
        //System.out.println("b = "+b);

    }
    public static void main(String args[]) { // here public static is access modifier
        //Scanner sc=new Scanner(System.in);
        //int a =sc.nextInt();
        //int b=sc.nextInt();
        //int sum = calculateSum(a,b);//arguments or actual parameters
        //System.out.println("sum is :"+sum);
        //calculateSum(a,b);// function calling  
        //printHelloWorld();// function calling 

        // swap - values ex
        int a=5;
        int b=10;
        swap(a,b);//function calling
        System.out.println("a = "+a);
        System.out.println("b = "+b); // printing in main function
        


        //swap code 
       //int temp=a;
        //a=b;
        //b=temp;

        //System.out.println("a = "+a);
        //System.out.println("b = "+b);
    }
    
}
