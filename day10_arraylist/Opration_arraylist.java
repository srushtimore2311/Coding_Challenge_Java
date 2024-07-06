package day10_arraylist;
import java.util.*;
import java.util.ArrayList;
public class Opration_arraylist {
    
    public static void main(String[] args) {
       
        ArrayList<Integer>num1=new ArrayList<Integer>();
        // add element 
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(1,10);

        System.out.println(num1.size());
        
        // get element
       System.out.println( num1.get(3));

    //    remove element
      num1.remove(3);

    //   set element at index
    num1.set(2, 20);


    // contain elements
    System.out.println( num1.contains(20));
    System.out.println( num1.contains(5));
      System.out.println(num1);

    //   size of an array 
// for(int i=0;i<num1.size();i++){
//     System.out.print(num1.get(i) +" ");
// }
         
    }
}
