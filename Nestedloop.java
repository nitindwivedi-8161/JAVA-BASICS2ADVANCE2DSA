import java.util.*;
public class Nestedloop {
    public static void main(String args[]){

    //Q.Print Star Pattern-->

    /**     for(int i = 1; i <= 4; i++){  
            //one line   
            for(int j = 1; j <= i; j++){      //inner loop
                System.out.print("*");
            }
            //next line
            System.out.println();
        }
        **/

    //Q.Print Inverted-Star pattern-->
    // int n=4 --total number of lines
    /**for(int i = 1; i <= 4;i++){ //for(int line=1;line<=n;line++)
        for(int j = 4;j >= i;j--){//for(int star=1;star<=n-line+1;star++)
            System.out.print("*");
        }
        System.out.println();
    }
    */

    //Q.Print HALF_PYRAMID Pattern-->
    int n=4;
    for(int line=1; line<=n;line++){
        //numbers print
        for(int number=1;number<=line;number++){
            System.out.print(number);
        }
        System.out.println();
    }

    }
    
}
