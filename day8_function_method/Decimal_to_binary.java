package day8_function_method;

public class Decimal_to_binary {

    public static void Decitobin(int n){
        int pow=0;
        int dec=0;
        while (n>0) {
            int last=n%2;
            dec= dec+(last*(int)Math.pow(10, pow));
            pow++;
            n=n/2;

        }
        System.out.println(dec);


    }
    public static void main(String[] args) {
        Decitobin(7);
    }
}