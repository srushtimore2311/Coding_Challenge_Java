package day10_arraylist;

import java.util.*;
import java.lang.Integer;
// multi dimensional arraylist 
public class Multi_dimentional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i=1;i<=5;i++){
        list1.add(i);
        }
        mainlist.add(list1);

        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=2;i<=10;i++){
            if(i%2==0){
                list2.add(i);
            }
        }
        mainlist.add(list2);

        ArrayList<Integer>list3=new ArrayList<>();
        for(int i=3;i<=15;i++){
            if(i%3==0){
                list3.add(i);
            }
        }
        mainlist.add(list3);

      System.out.println(mainlist);

    //   print multidimentional list
    for (int i = 0; i < mainlist.size(); i++) {
        ArrayList<Integer> currentlist = mainlist.get(i);
        for (int j = 0; j < currentlist.size(); j++) { // Corrected condition
            System.out.print(currentlist.get(j)); // Removed extra semicolon
        }
        System.out.println();
    }
    


    }
}
