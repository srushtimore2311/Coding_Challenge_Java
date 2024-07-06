package day1_variable;

import java.util.Scanner;

public class Classpractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        float radius=sc.nextFloat();
        // addition of two number take input from system
        int sum=a+b;
        System.out.println("addition of two numbers:"+sum);

        // multiplication of two number take input from system
        int multiply=a*b;
        System.out.println("Multipication of two numbers:"+multiply);

        // area of circle 
       float area= 3.14f* radius* radius;
       System.out.println("Area of Circle:"+area);


 
    }
    
}
