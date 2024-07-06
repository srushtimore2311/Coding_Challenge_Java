package day5_oop;
// what will be the output of this code?
public class Practice4 {
    public static void main(String[] args) {
        Vehicle obj1=new Car();
        obj1.print1();

        Vehicle obj2=new Vehicle();
        obj2.print();

    }
}

class Vehicle{
    void print(){
        System.out.println("base class(vehicle)");
    }
}

class Car extends Vehicle{
    void print1(){
        System.out.println("derived class(car)");
    }
}
