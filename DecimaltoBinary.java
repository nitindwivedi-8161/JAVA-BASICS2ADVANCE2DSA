public class DecimaltoBinary {

    // DECIMAL TO BINARY CONVERSION
    
    public static void decToBin(int n){
        int myNum=n;
        int pow=0;
        int binNum=0;
        
        while(n>0){
            int rem=n%2;
            binNum=binNum +(rem*(int)Math.pow(10,pow));

            pow++;
            n=n/2;


        }
        System.out.println("binary form of "+myNum + " = " + binNum);
    }
    public static void printS(){
        int s=45;
    }
    public static void main(String[] args) {
        //decToBin(12);

    
        //method scope
        //System.out.println(s); --> this will throw an error
        //int s=45;
        //System.out.println(s); --> this will also throw an error because s id defined only in above method not in main function

        {

            // block scope
            int s=45;
            System.out.println(s);// here error will not ocuur 
        }
       // System.out.println(s);--> here error will occur because it is defined in above method not in this method
    }
    
}
