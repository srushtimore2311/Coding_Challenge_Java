// WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative

package day3_conditional;
import java.util.*;
public class Practice1 {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int num=sc.nextInt() ;

       if(num>0){
        System.out.println("number is positive");
       }
       else{
        System.out.println("number is negavtive");
       }
    }
    
}
