package day5_oop;
// what will be the output of these code[a.error,b.0 2,c.1 2,d.2 2]
public class Practice5 {
    public static void main(String[] args) {
        System.out.println(Book.count);
        Book b1=new Book(150);
        Book b2=new Book(250);
        System.out.println(Book.count);
    }
}

class Book{
    int price;
    static int count;

    public Book(int price){
        this.price=price;
        count++;
    }
}
