import java.util.*;
public class elseif {
    public static void main(String[] args) {
        // int age =13;

        // if(age>=18){
        //     System.out.println("adult");
        // }
        // else if(age>=13 && age < 18){
        //     System.out.println("teenegers");
        // }
        // else{
        //     System.out.println("Child");
        // }

// income tax calculator
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax;// java automatically gives it 0 value

        // if (income<500000){
        //     tax=0;

        // }
        // else if(income >= 500000 && income <1000000){
        //     tax=(int) (income * 0.2);// typecasting
            
        // }
        // else{
        //     tax=(int) (income * 0.3);    
        // }
        // System.out.println("tax is " + tax);


// Print the largest of three numbers
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if((A>=B) && (A>=C)){
            System.out.println(" A is the largest of 3");
        }
        else if(B>=C){
            System.out.println("B is the largest of 3");
        }
        else{
            System.out.println("C is the largest of 3");
        }
    }
    
}
