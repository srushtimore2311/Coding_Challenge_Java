package day16_recursion;
// decreasing number using recursion
public class Decresing_number {

    public static void PrintDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintDec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        PrintDec(n);

    }
    
}
