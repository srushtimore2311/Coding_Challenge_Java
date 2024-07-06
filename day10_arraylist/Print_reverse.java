package day10_arraylist;
// print arraylist in reverse order
import java.util.*;
public class Print_reverse {

    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        for(int i=num.size()-1;i>=0;i--){
            
            System.err.print(num.get(i));
}
    }
}
