// Question3:WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case

package day3_conditional;
import java.util.*;
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day =sc.nextInt();
        switch(day){
            case 1: System.out.println("monday");
            break;
            case 2: System.out.println("tuesday");
            break;
            case 3: System.out.println("wednsday");
            break;
            case 4: System.out.println("thursday");
            break;
            case 5: System.out.println("friday");
            break;
            case 6: System.out.println("saturday");
            break;
            case 7: System.out.println("sunday");
            break;
        }  
    }
    

    
}
