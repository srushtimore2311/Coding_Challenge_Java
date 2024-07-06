package day5_oop;

public class Abstract_method {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();
        h1.eat();
        System.out.println(h1.color);
    }
}


abstract class Animal {
    String color;
    Animal(){
    color= "brown";
    }

void eat(){
    System.out.println("animal eats");
}   
abstract void walk();
}

class Horse extends Animal{
    void changeColor(){
        color="dark brown";
    }

    void walk(){
        System.out.println("horse walk on 4 legs");
    }
 
}

class Chicken extends Animal{
    void changeColor(){
        color="yellow";
    }

    void walk(){
        System.out.println("chicken walks on 2 legs");
    }
}