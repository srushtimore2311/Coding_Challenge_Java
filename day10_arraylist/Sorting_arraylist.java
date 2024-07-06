package day10_arraylist;

import java.util.*;

public class Sorting_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(9);

        System.out.println(list);
        // sorting elements in asending order 
        Collections.sort(list);
        System.out.println(list);

        // sorting elements in decending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
