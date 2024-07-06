// In a program,input the side of a square.You have to output the area of the square

package day1_variable;
import java.util.*;
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float length =sc.nextFloat();
        float width =sc.nextFloat();

        float area= length *width;

        System.out.println("area of a square:"+area);
    }
     
}
