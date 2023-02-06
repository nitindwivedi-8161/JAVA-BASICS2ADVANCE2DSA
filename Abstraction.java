public class Abstraction {
    public static void main(String args[]){
        // Horse h=new Horse();
        // h.eat();
        // h.walk();

        // Chicken c=new Chicken();
        // c.eat();
        // c.walk();

        // //Animal a=new Animal(); error because object for abstract class will not be created 
        // System.out.println(h.color);

        Mustang myHorse=new Mustang();//Animal->Horse -> Mustang

    }
}


abstract class Animal{
    String color;
    Animal(){  // constructor  also parent class constructor will be called first than child class
        //color="brown";
        System.out.println("animal constructor called");
    }
    // non abstract method
    void eat(){
        System.out.println("animal eats");
    }
    
    //this is abstract method where we can not create instances or objects
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor called");
    }

}

class Chicken extends Animal{
    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}