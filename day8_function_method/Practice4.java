package day8_function_method;
// Question 5 :
// Write a Java method to compute the sum of the digits in an integer.
// (Hint : Approach this question in the following way :
// a. Take a variable sum = 0
// b. Find the last digit of the number
// c. Add it to the sum
// d. Repeat a & b until the number becomes 0 )

import java.util.Scanner;

public class Practice4 {

    
    public static int Sumdigit(int n){
        int sum=0;
        while (n>0) {
            int  lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;
        }
        return sum;
        
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Sumdigit(num));
    }
}
