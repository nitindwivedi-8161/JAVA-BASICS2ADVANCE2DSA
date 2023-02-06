import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        // Q: Find the largest of three numbers
        // int max=a;
        // if(b>max){
        //     max=b;

        // }
        // if(c>max){
        //     max =c;

        // }
        // System.out.println(max);

        // Another way to solve this problem is by using Math.max class of java 
        int max= Math.max(c,Math.max(a,b));
        System.out.println(max);

    }
              
}
