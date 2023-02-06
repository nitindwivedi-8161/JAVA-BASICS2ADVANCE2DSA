import java.util.*;
public class Arrays {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }

    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        update(marks);// call by refernce 

        // print our marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

        //different ways of defining arrays 
        //int marks[]=new int[50];
        //int numbers[]={1,2,3};
        //int moreNumbers[]={4,5,6};
        //String fruits[]={"apple","mango","orange"};

// Input operation in Arrays
        // int marks[] = new int[49];

        // Scanner sc=new Scanner(System.in);

        // System.out.println("length of array ="+marks.length);
        //marks[0]=sc.nextInt();
        //marks[1]=sc.nextInt();
        //marks[2]=sc.nextInt();

        //System.out.println("phys :"+marks[0]);
        //System.out.println("chem :"+marks[1]);
        //System.out.println("maths :"+marks[2]);

        //update
        //marks[0]=100;
        //marks[0]=marks[0]+1;


       
    }
    
}
