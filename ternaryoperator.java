public class ternaryoperator {
    public static void main(String[] args) {
        int number = 4;

        // using ternary operator we will check the even or odd here;
        String type = ((number % 2 ) == 0) ? "even" : "odd";
        System.out.println(type);

// Check if a student will pass or fail;

        int marks =31;

        // using ternary operator

        String status=(marks >=33) ? "pass" : "fail";
        System.out.println(status);

    }
    
}
