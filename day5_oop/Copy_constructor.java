package day5_oop;

public class Copy_constructor {
        public static void main(String[] args) {
        Student s1=new Student();
        s1.name="srushti";
        s1.roll=11;
        s1.password="1234";
        s1.marks[0]=100;
        s1.marks[1]=50;
        
        
        Student s2=new Student(s1);  
        s1.marks[1]=40;
        s2.password="xyz";
        
        for(int i=0;i<2;i++)
        System.out.println(s2.marks[i]);
        
        }
    }
    
    class Student{
        String name;
        int roll;
        String password;
        int marks[];
        
        Student(){
            marks=new int[2];
             System.out.println("hello");
        }
        
        // // shallow copy constructor
        // Student(Student s1){
        //     this.name=s1.name;
        //     this.roll=s1.roll;
        //     this.marks=s1.marks;
        // }

        // deep copy constructor
        Student(Student s1){
            this.name=s1.name;
            this.roll=s1.roll;
            for(int i=0; i<marks.length;i++){
               this.marks[i]=s1.marks[i];
            }
        }
    }
    
    
    
    
    

