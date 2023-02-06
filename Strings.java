import java.io.ObjectInputStream.GetField;
import java.util.*;

import javax.sound.midi.Synthesizer;
public class Strings {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();// for next line 

    }

    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path){
        int x = 0; 
        int y = 0;

        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);

            // south
            if(dir=='S'){
                y--;
            }
            //north
            else if(dir=='N'){
                y++;
            }
            //west
            else if(dir=='W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);//here Math.sqrt will return double value and here it may cause error so to avoid the error we may type cast it 

    }

    public static String substring(String str,int si,int ei){
        String substr="";//new string initaializing with empty
        for( int i  = si; i < ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

// Convert Letters to Uppercase
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");// initializing with empty string
        
        char ch =Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){ // we will start i with 1 beacause we have alreadt checked string at 0
            if(str.charAt(i) == ' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));   
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }


//compressed string
    public static String compress(String str){
        String newStr = "";
        //aaabc
        for(int i=0; i<str.length(); i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count >1){
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String str2 = new String("xyz@#1234");

        //Strings are IMMUTABLE

        // Scanner sc =new Scanner(System.in);
        // String name;
        // name=sc.nextLine();//next function will take only one word whereas nextline takes entire line 
        // System.out.println(name);


        //String Length
        // String fullName= "Tony Stark";
        // System.out.println(fullName.length());

        //concatenation
        // String firstName="Nitin";
        // String lastName="Dwivedi";
        // String fullName=firstName+" "+lastName;
        // printLetters(fullName);// function calling

        //String str="racecar";
        //System.out.println(isPalindrome(str));//function calling

        // String path="WNEENESENNN";//NS
        // System.out.println(getShortestPath(path));

        // String s1="Tony";
        // String s2="Tony";
        // String s3=new String("Tony");

        // if(s1==s2){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }

        // if(s1==s3){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }

        // if(s1.equals(s3)){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }

//Substring
        // String str="HelloWorld";
        // System.out.println(str.substring(0,5));//java's inbuilt function

        //System.out.println(substring(str,0,5 ));// function calling 

//print the largest string for the given set of Strings--> will see it lexographically
        // String fruits[]={"apple","mango","banana"};

        // String largest=fruits[0];// assuming the first string as the largest
        // for(int i=1;i<fruits.length;i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest=fruits[i];
        //     }
        // }
        // System.out.println(largest);

// String Builder
    //    StringBuilder sb =new StringBuilder("");// initialized with empty
    //    for(char ch='a';ch <='z';ch++){
    //     sb.append(ch);
    //    } // abcdefghijkl
    //    //O(26) --time complexity
    //    //O(26*n^2)
    //    System.out.println(sb);//System.out.println(sb.length());

// CONVERTS LETTER TO Uppercase
    //    String str="hi, i am shradha";
    //    System.out.println(toUpperCase(str));

// String Compression -->
        String str="aaabbcccdd";// abcd-->abcd
        System.out.println(compress(str));

    }   
}
