import java.util.*;
public class breakcontinue {
    public static void main(String[] args) {
    /**   for(int i = 1; i <= 5; i++){
            if(i==3){
                break;
            }
            System.out.println(i);

        }
        System.out.println("i am out of the loop");
        */

    //Q.keep entering numbers till user enters a multiple of 10-->
    /**   Scanner sc = new Scanner(System.in);
       
      do{
        System.out.print("enter your number:");
        int n=sc.nextInt();
        if(n % 10==0){
            break;
        }
        System.out.println(n);
       }while(true);
**/

// CONTINUE STATEMENT-->
/**   for(int i=1; i<=5;i++){
        if(i==3){
           continue; 
        }
        System.out.println(i);
    }**/

//Q.Display all the numbers entered by user except multiples of 10-->
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter your number :");
            int n=sc.nextInt();

            if (n%10==0){
                continue;
            }
            System.out.println("number was :"+n);
        }while(true);

    }
    
}
