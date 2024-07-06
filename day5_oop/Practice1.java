package day5_oop;
// find out the correct statement to assing name object [a.s->name="aman", b.Student.name="aman", c.s.name="aman"]

public class Practice1 {
    public static void main(String[] args) {
        Student s =new Student();
        s.name="aman";
        System.out.println(s.name);
    }
}


class Student{
    String name;
    int marks;
}
