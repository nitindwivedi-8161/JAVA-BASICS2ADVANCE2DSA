import java.util.*;
public class switchstatement {
    public static void main(String[] args) {
        // int number=2;
        // switch(number){
        //     case 1 : System.out.println("samosa");
        //                 break;
        //     case 2 : System.out.println("burger");
        //                 break;
        //     case 3 : System.out.println("mango shake");
        //                 break;
        //     default : System.out.println(":we wake up");
        // }

        char ch  ='a'; // we may also use char instead of integer and also put cases in random order
        switch(ch){
            case 'a' : System.out.println("samosa");
                        break;
            case 'b': System.out.println("burger");
                        break;
            case 'd' : System.out.println("mango shake");
                        break;
            default : System.out.println(":we wake up");
        }
    }
}
