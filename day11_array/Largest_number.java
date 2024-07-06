package day11_array;
import java.util.*;
public class Largest_number {

    public static int LargestNumber(int num[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(large<num[i]){
                large=num[i];
            }
        }
        return large;
        
    }
    public static void main(String[] args) {
        int num[]={1,2,6,3,5};
        System.out.println("largest value: " +LargestNumber(num));

    }
}
