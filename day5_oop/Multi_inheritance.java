package day5_oop;

public class Multi_inheritance {
    public static void main(String[] args) {
        Dog d1= new Dog();
        d1.breed();
        d1.eat();

        Animal a1=new Animal();
        a1.breathe();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eatrs");
    }

    void breathe(){
        System.out.println("breathe");
    }
}

class Mammal extends Animal{
    void legs(){
        System.out.println("legs");
    }
}

class Dog extends Mammal{
    void breed(){
        System.out.println("diffrent types of dog");
    }
}