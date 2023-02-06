import java.util.*;

import javax.swing.plaf.synth.SynthScrollBarUI;
import javax.swing.plaf.synth.SynthStyle;
public class patterns{

    // Q1. PRINT HOLLOW RECTANGLE PATTERN-->
    public static void hollow_rectangle(int totRows, int totCols){
        //outer loop
        for(int i= 1 ; i <= totRows;i++){
            //inner loop
            for(int j=1; j <= totCols;j++){
                //cell - (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    //boundary cells
                    System.out.print("*");
                }else{
                    // for empty spaces 
                    System.out.print(" ");
                }
            }
            // for next line --> 
            System.out.println();
        }
    }

    // Q2.Inverted half pyramid -->
    public static void inverted_rotated_half_pyramid(int n){
        // outer loop
        for (int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            // stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }

    //Q3.INVETED HALF PYRAMID WITH NUMBERS-->
    public static void inverted_half_pyramid_withNumbers(int n){
        //outer loop
        for(int i =1;i<=5;i++){
            //inner loop
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Q4.FLOYD'S TRIANGLE PATTERN-->
    public static void floyds_triangle(int n){
        //outer
        int counter=1;
        for(int i=1;i<=n;i++){
            //inner loop - how many times will counter be printed
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    //Q.5 0-1 Triangle
    public static void zero_one_triangle(int n){
        // outer loop
        for (int i = 1; i <= n;i++){
            // inner loop
            for(int j = 1; j <=i ;j++){
                if((i+j)%2==0){ //even (i+j)=even else odd
                    System.out.print("1");
                }else{
                System.out.print("0");
                }
            }
            System.out.println();

        }
    }

    //Q.6 BUTTERFLY PATTERN-->
    public static void butterfly_pattern(int n){
        //1st half
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            //stars--> i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces-->2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars --> i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for(int i = n;i>=1;i--){
            //stars --> i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces-->2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars --> i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }  
            System.out.println();
        }
        
    }

    //Q.SOLID RHOMBUS-->
    public static void solid_rhombus(int n ){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            //for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //Q.HOLLOW RHOMBUS
    public static void hollow_rhombus(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop

            // spaces 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // boundary rectangle--hollow rectangle
        
                for(int j=1; j <= n;j++){
                    //cell - (i,j)
                    if(i == 1 || i == n || j == 1 || j == n){
                        //boundary cells
                        System.out.print("*");
                    }else{
                        // for empty spaces 
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }

    }

    //Q.DIAMOND PATTERN
    public static void diamond_pattern(int n){
        //first half
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //second half
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }


    //Q.NUMBER PYRAMID-->
    public static void number_pyramid(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // numbers 
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");// this space for the space that is between the numbers
            }
            System.out.println();//next line 
            }
    }
    //Q.PALINDROMIC PATTERN WITH NUMBERS
    public static void palindromic_numbers(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //ascending numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            // descending numbers
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
public static void main (String args[]){
    //hollow_rectangle(4,5); // function calling 
    //inverted_rotated_half_pyramid(4);
    //inverted_half_pyramid_withNumbers(5);
    //floyds_triangle(5);
    //zero_one_triangle(5);
    //butterfly_pattern(4);
    //solid_rhombus(5);
    //hollow_rhombus(5);
    //diamond_pattern(3);
    //number_pyramid(3);
    palindromic_numbers(5);
}
}