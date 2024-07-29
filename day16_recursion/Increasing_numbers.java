package day16_recursion;
// print increasing number using recursion

public class Increasing_numbers {

    public static void PrintInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        PrintInc(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n=5;
        PrintInc(n);
    }
    
}
