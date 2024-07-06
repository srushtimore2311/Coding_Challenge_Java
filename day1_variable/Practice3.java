package day1_variable;
import java.util.*;
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen =sc.nextFloat();
        float eraser =sc.nextFloat();


        float total_cost= (pencil+pen+eraser);
        double gst= total_cost*0.18;
        double total_gst_sum=total_cost +gst;
        System.out.println("cost of pencil:"+pencil);
        System.out.println("cost of pen:"+pen);
        System.out.println("cost of eraser:"+eraser);
        System.out.println("Total cost of item is:"+total_gst_sum);
    }
}
