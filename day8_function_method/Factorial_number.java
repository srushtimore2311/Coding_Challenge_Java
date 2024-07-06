package day8_function_method;
import java.util.*;;
public class Factorial_number {
    
    public static int Factorial(int n){
    int fact=1;
    int i=1;
    while (i<=n) {
        fact=fact*i;
         i++;
         
    }
    return fact;
    }
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    
    }
}
