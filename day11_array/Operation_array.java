package day11_array;
import java.util.*;
public class Operation_array {
    public static void main(String[] args) {
        // creating array
        int arr[]=new int[100];
        String name[]={"abc","xyz"};
        System.out.println(arr.length);
        System.out.println(name.length);

        // input and output array
        int marks[]=new int[10];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        System.out.println(marks[1]);

        // update marks
        marks[0]=100;
        System.out.println(marks[0]);
    }
}
