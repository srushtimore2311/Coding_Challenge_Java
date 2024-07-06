package day5_oop;
// which variable(s) can the class person access in the following code?[a.name,b.weight,c.rollnumber,d.schoolname]
// correct answer is name and weight
public class Practice2 {
    public static void main(String[] args) {
        Person p=new Person();
        p.name="srishti";
        p.weight=49;
        System.out.println(p.name);
        System.out.println(p.weight);

    }
}

class Person{
    String name;
    int weight;
}

class Student extends Person{
    int rollNumber;
    String schoolName;
}
