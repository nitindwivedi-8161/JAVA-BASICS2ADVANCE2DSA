import java.util.*;
public class loop {
    public static void main (String args[ ]){
        

        //Q:Print numbers from 1 to 5

       /*  System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5) */;

        /*
         * Syntax of foor loops:
         * 
         * for(initialaisation;condition;increment/decrement)
         * {
         * // body
         * 
         * }
         */

         // solving above questions using loop
         /* for(int num = 1; num <= 5; num += 1){
            System.out.println(num);
        } */
        //print numbers from 1 to n where n is something which user will input 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int num = 1;num <=n;num+=1){
            System.out.println(num+" ");
            System.out.print(num+" ");
        }

    }
    
}
