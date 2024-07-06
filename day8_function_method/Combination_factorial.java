package day8_function_method;

public class Combination_factorial {
   public static int Factorial(int n){
    int f=1;
    for(int i=1;i<=n;i++){
      f=f*i; 
    }
    return f;
    
}
public static int bincoff(int n,int r) {
    int a=Factorial(n);
    int b=Factorial(r);
    int nmr=Factorial(n-r);

    int bincoff=a/(b*nmr);

    return bincoff;
}
public static void main(String[] args) {
   
System.out.println(bincoff(5, 2));
}
}
