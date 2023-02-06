import java.util.*;
public class loop3 {
    public static void main(String[] args) {
    /** 
        for (int i=1; i<=10; i++){   //for(initialistaion; condition ; updation)
            System.out.println("Hello World");
        }
    */

    //Q.Print SQUARE pattern-->
    /**  for(int lines=1;lines<=4;lines++){
        System.out.println("****");
    }
    **/
    //Q.Print Reverse of a number-->
    /**Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();

    while( n > 0){
        int lastDigit = n % 10;
        System.out.print(lastDigit);
        n=n/10;  //n/=10
    }
    System.out.println();
    **/

    //Q. Reverse the given number-->
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    
    int rev=0;
    while(n>0){
        int lastDigit = n%10;
        rev =(rev*10)+lastDigit;
        n=n/10;
    }
    System.out.println(rev);

    }
    
}
