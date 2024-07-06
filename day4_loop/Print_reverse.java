package day4_loop;
// print given reverse number
public class Print_reverse {
    public static void main(String[] args) {
        int n=10899;
        while (n>0) {
            int remain=n%10;
            System.out.print(remain+" ");
            n=n/10;
        }
    }
   
}
