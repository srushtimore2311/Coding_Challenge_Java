package day8_function_method;
// Question 1 : Write a Java method to compute the average of three numbers..

public class Practice1 {
    public static float Average(float a,float b,float c){
        float avg=(a+b+c)/3;
        return avg;

    }
    public static void main(String[] args) {
       float avg= Average(3,4,5);
       System.out.println("the avrage of three numbers is:" +avg);
    }
}
