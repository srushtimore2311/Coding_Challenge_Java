package day10_arraylist;
// in these [array is sorted]  they will give target suppose 5 then in array we have to find how many pairs avalable in array means if array element sum is targert value then give output true otherwise false
import java.util.ArrayList;
import java.util.*;

public class Pair_sum_brute_force {

    public static boolean Pairsum(ArrayList<Integer>list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;

                } 

            }
            
        }return false;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(Pairsum(list,target));
    }
}

