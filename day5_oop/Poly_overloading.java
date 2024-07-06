package day5_oop;

public class Poly_overloading {

    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum(12.4f,56.6f));
        System.out.println(cal.sum(5,6,7));
    }
   

}


class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}