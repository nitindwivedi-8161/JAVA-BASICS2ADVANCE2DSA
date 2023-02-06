public class inheritance {
    public static void main(String args[]){
       Dog dobby=new Dog();
       dobby.eat();
       dobby.legs=4;
       System.out.println(dobby.legs);
    }
    
}
//BASE CLASS-->
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walks(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("SWIM");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("FLY")
    }
}
// class Dog extends Mammal{
//     int breed;
// }

//DERIVED CLASS or SUBCLASS-->
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swims in wear");
//     }
// }