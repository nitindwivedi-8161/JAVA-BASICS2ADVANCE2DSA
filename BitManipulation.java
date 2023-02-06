import java.util.*;
public class BitManipulation {

//Q.CHECK IF A NUMBER IS ODD OR EVEN

    public static void oddOrEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            //even number
            System.out.println("even number");
        }
        else{
            //odd number
            System.out.println("odd number");
        }
    }

//Q.GET Ith bit
    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

//Q.SET Ith bit
public static int setIthBit(int n,int i){
    int bitMask=1<<i;
    return n | bitMask;
}

//clear Ith bit
public static int clearIthBit(int n,int i){
    int bitMask=~(1<<i);
    return n & bitMask;
}
// update Ith bit
public static int updateIthBit(int n,int i,int newBit){
    if(newBit==0){
        return clearIthBit(n,i);
    }
    else{
        return setIthBit(n, i);
    }  
}

    public static void main(String args[]){

    //BITWISE OPERATORS
        //BINARY AND &
        // System.out.println((5 & 6));
        //BINARY OR|
        // System.out.println((5|6));
        //Binary XOR ^
        // System.out.println((5^6));
        //Binary Ones'sComplement ~(Tilde) it is also known as NOT operator works only on single operator
        // System.out.println((~5));// try to calculate (~0)
        // Binary left shift <<
        // System.out.println(5<<2);
        // Binary Right shift >>
        // System.out.println(6>>1);

        // oddOrEven(3);
        // oddOrEven(11);
        // oddOrEven(14);

        // System.out.println(getIthBit(10,2 ));
        // System.out.println(getIthBit(10,3 ));

        //System.out.println(setIthBit(10, 2));
        //System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
    }
    
}
