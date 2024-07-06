package day4_loop;
import java.util.*;
public class Continue_tenmultiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       do{
        System.out.println("enter number:");
        int n =sc.nextInt();
        if(n%10==0){
            continue;
        }
        System.out.println(n);

       } while(true);
    }
}
