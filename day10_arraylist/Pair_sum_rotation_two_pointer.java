package day10_arraylist;
// in these we can find elemnt number = target but in rotation and with unsorted array
import java.util.ArrayList;
import java.util.Scanner;

public class Pair_sum_rotation_two_pointer {
    public static boolean Pairsum(ArrayList<Integer>list,int target){
        int n=list.size();
        int breakpoint=-1;
       for(int i=0;i<list.size();i++){
        breakpoint=i;
        break;
       }
        int left=breakpoint+1;
        int right=breakpoint;
        while (left !=right) {

            // case 1
            if(list.get(left)+list.get(right)==target){
                return true;
            }
            if (list.get(left)+list.get(right)<target) {
                left=(left+1)%n;
            }
            else {
                right=(n+right-1)%n;
            }

            
        }
        return false;
    
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
