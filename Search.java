import java.util.*;
public class Search {

//Q. LINEAR SEARCH
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;//key does not exist
    }

//Q.LARGEST NUMBER IN ARRAY
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;//-infinity
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest value is :"+smallest);
        return largest;
    }

    //Q.BINARY SEARCH

    public static int binarySearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;

        while(start <= end){
            int mid=(start+end)/2;

            //comparisons
            if(numbers[mid] == key){
                return mid;
            }

            if(numbers[mid]<key){//right
                start=mid+1;
            }else{//left
                end=mid-1;
            }
        }
        return -1; // to show value does not exi st
    }
    

    //Q.REVERSE AN ARRAY

    public static void reverse(int numbers[]){
        int first=0;
        int last=numbers.length-1;

        while(first<last){
            //swap
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++; //because first is going one step ahead
            last--; //because last is going one step back

        }
    }

    //Q.PAIRS IN ARRAY

    public static void printPairs(int numbers[]){

        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];//2,4,6,8,10
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr + ","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs:"+tp);
    }


    //Q.PRINT SUBARRAYS-->

    public static void printSubarrays(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){ //print
                    System.out.print(numbers[k]+" ");//subaarys
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays="+ts);
    }



    public static void main(String[] args) {
        // int numbers[]={2,4,6,8,10,12,14,16};
        // //String menu[]={"dosa","chole","samosa"}
        // int key=10;
        
        // int index=linearSearch(numbers, key);
        // if(index==-1){
        //     System.out.println("NOT FOUND");
        // }else{
        //     System.out.println("KEY IS AT INDEX:"+index);
        // }

        //int numbers[]={1,2,6,3,5};
        //System.out.println("Largest values is :"+ getLargest(numbers));

        int numbers[]={2,4,6,8,10};
        //int key=10;

        //System.out.println("INDEX FOR KEY IS :" +binarySearch(numbers, key));
        
        /* reverse(numbers);
        //print
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println(); */

        //printPairs(numbers);
        printSubarrays(numbers);
    }
}
    

