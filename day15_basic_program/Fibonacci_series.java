package day15_basic_program;

public class Fibonacci_series {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        System.out.println(first);
        System.out.println(second);
        int n=5;
        for(int i=2;i<n;i++){
            int sum=first+second;
            System.out.println(sum);
            first=second;
            second=sum;
        }
        
    }
    
}
