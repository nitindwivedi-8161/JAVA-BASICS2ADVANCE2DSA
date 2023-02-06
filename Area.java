import java.util.*;
public class Area {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float rad=sc.nextFloat();
        float area= 3.14f* rad * rad ;// here if we will not declare 3.14 as 3.14f compiler will understand it as decimal value so we need to define it this way 
        
       
        System.out.println(area);

    
}
}

