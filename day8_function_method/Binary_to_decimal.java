package day8_function_method;

public class Binary_to_decimal {

    public static void  Bintodec(int n) {
    int binary_number=n;
    int pow=0;
    int dec=0;
    while (n>0) {
        int lastdigit=n%10;
        dec=dec+(lastdigit*(int)Math.pow(2,pow));
        pow ++;
        n=n/10;
    }
    System.out.println("the binary number is"+binary_number +" the decimal number is:"+dec);
        
    }
    public static void main(String[] args) {
        Bintodec(101);
    }
    
}