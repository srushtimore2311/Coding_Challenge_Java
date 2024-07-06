package day10_arraylist;
import java.util.*;
public class Print_arraylist {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code onlin
    
    public static void main(String[] args) {
        int n=5;
        ArrayList<Integer> arr1=new ArrayList<Integer>(n);
          ArrayList<Integer> arr2=new ArrayList<Integer>();
        System.out.println("Array list 1" +arr1);
         System.out.println("Array list 2" +arr2);
         
         for(int i=1; i<=10;i++){
             if(arr1.size()<n){
                 arr1.add(i);
             }
                arr2.add(i);
              System.out.println("Array list 1" +arr1);
             System.out.println("Array list 2" +arr2); 
         }
    }
}

