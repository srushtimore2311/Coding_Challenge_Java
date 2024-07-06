package day5_oop;

public class Poly_overriding {
    public static void main(String[] args) {
        Dear d1=new Dear();
        d1.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}

class Dear extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}
