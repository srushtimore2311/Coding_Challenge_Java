package day10_arraylist;
// in these we have to find one pair that value is equal to target in these array is sorted
import java.util.ArrayList;

public class Pair_sum_two_pointer {

    public static boolean Pairsum(ArrayList<Integer>list,int target){
        int left=0;
        int right=list.size()-1;
        while (left !=right) {

            // case 1
            if(list.get(left)+list.get(right)==target){
                return true;
            }
            if (list.get(left)+list.get(right)<target) {
                left++;
            }
            else {
                right --;
            }

            
        }
        return false;
    
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target=5;
        System.out.println(Pairsum(list,target));

    }
}
