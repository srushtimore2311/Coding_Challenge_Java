package day5_oop;

public class Hierarchial_inheritance {
    
    public static void main(String[] args) {
        Bird b1=new Bird();
        b1.eat();
        b1.fly();

    }
}

class Animal{
    void eat(){
        System.out.println("all animals it some food ");
    }

    void Breathe(){
        System.out.println("all animals have breathe");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("fish is swim");
    }
    
}

class Bird extends Animal{
    void fly(){
        System.out.println("birds fly");
    }
}

class Mammal{
    void walk(){
        System.out.println("all mammals are walk");
    }
}
