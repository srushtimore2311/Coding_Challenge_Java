package day5_oop;

import javax.sound.midi.Soundbank;

public class Practice6 {
    public static void main(String[] args) {
        Test t =new Test();
        t.set_marks(98);
        System.out.println(Test.marks);
    }
}

class Test{
    static int marks;
    void set_marks(int marks){
        this.marks=marks;
    }
}
