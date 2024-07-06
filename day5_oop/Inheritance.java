package day5_oop;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();

    }
}

// parent class
class Animal{
    String color;

    void eat(){
        System.out.println("eatrs");
    }

    void breathe(){
        System.out.println("breathe");
    }
}

// child class

class Fish extends Animal{
int fins;

void swim(){
    System.out.println("swims in water");
}
    
}