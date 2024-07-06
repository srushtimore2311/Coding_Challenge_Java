package day4_loop;
// resverse the given  number[reverse_number=(reverse_number*10)+lastdigit]
public class Reverse_number {
    public static void main(String[] args) {
   int n= 99876;
   int rev=0;
   while (n>0) {
    int lastdigit=n%10;
    rev=(rev*10)+lastdigit;
    n=n/10;
    
   }
   System.out.println(rev);
    
    }
}
