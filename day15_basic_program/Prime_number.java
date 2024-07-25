package day15_basic_program;

public class Prime_number {

    public static boolean Primenumber(int num){
        if(num==2){
            return true;
        }

       for(int i=2;i<=num;i++){
        if(num%2==0){
            return false;
        }

       }return true;

    }
    public static void main(String[] args) {
        int num=23;
        System.out.println(Primenumber(num));
    }
}
