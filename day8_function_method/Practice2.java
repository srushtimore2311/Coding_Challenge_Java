package day8_function_method;
// Question 2 : Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your
// method.
import java.util.*;

public class Practice2 {

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }

    }public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        if(isEven(num)){
            System.out.println("the value is even:"+num);
        }else{
            System.out.println("the value is odd:"+num);
        }
        
    }
    
}
