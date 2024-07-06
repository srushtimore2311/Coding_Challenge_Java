package day10_arraylist;
import java.util.*;;
public class Max_number {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(1);        

        // min_value value is -(oo)infinity
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
           
        } System.out.println("maximum number in aarylist"+max); 
    }
}
