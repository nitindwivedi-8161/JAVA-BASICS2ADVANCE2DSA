import java.util.*;
public class loop2 {
    public static void main(String[] args) {

    //Q.Print Hello World 100 times-->

        /**int counter=1;
        while(counter < 100){
            System.out.println("Hello World");
            counter++;
        }
        **/
    //Q.Print number from 1 to 10-->

       /**  int i=1;
        while(i<11){  // or while(i<=10)
            System.out.println(i);  // if we use the command System.out.print(i)--> isme seedhe line me output aa jaate hain
            i++;  //increasing statement or basically it is updating the i 
        }
        **/
    //Q. Print number from 1 to n-->
    /** Scanner sc=new Scanner(System.in);
        
        int range=sc.nextInt();

        int counter=1;
        while(counter<=range){
            System.out.print(counter + " ");
            counter++;
          }
          System.out.println();
    **/

    //Q.Print sum of first n natural numbers-->
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i=1;
        int sum=0;

        while(i <= n){

            sum+=i;
            System.out.print(i +" ");
            i++;

        }
        System.out.println("sum is "+sum);
    }       
}


