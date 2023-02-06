import java.util.*;
public class Primenumber {

    //only for n>=2
    public static boolean isPrime(int n){
        //CORNER CASES
        //2
        if(n==2){
            return true;
        }
        
        boolean isPrime=true;
        for(int i=2; i<=n-1;i++){
            if(n%i==0){//completely dividing
                isPrime =false;
                break;
            }
        }
        return isPrime; 
    }
    public static void main(String[] args) {
        System.out.println(isPrime(12));//2

    }

}
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if(n==2){
//             System.out.println("n is prime");
//         }else{
//             boolean isPrime = true;// assuming our number is prime
//         for(int i=2; i<=Math.sqrt(n); i++){
//             if(n % i ==0){ // n is a multiple of i (i is not equal to 1 or n)
//                 isPrime=false;// composite number
//             }
//         }
//         if(isPrime == true){
//             System.out.println("n is prime");
//         }else{
//             System.out.println("n is not prime");
//         }
//     }
// }
//}




