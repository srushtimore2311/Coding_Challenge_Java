// Question2:FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperatureis above 100 and otherwise prints You don't have a fever.

package day3_conditional;

public class Practice2 {
    public static void main(String[] args) {
        double temp=103.5;
        if(temp>=100){
            System.out.println("i have fever");
        }
        else{
            System.out.println("i don't have fever");
        }
    }
}
