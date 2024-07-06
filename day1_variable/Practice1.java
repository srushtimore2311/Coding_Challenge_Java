// In a program,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.

package day1_variable;
import java.util.*;
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
         
        int average=(a+b+c)/3;
  
        System.out.println(average);
    }
    
}
