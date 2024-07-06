package day10_arraylist;

import java.util.ArrayList;

public class Swap_two_number {

    public static void swap(ArrayList<Integer>num,int idx1,int idx2){
        int temp=num.get(idx1);
        num.set(idx1,idx2);
        num.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(2);
        num.add(5);
        num.add(9);
        num.add(3);
        num.add(6);

        int idx1=1;
        int idx2=3;
        System.out.println(num);
        swap(num, idx1, idx2);
        System.out.println(num);

    }
}
