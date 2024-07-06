package day5_oop;

public class Abstract_interfaces {
    public static void main(String[] args) {
        Queen q= new Queen();
        q.moves();
    }
}

interface Chessboard{
    void moves();
}

class Queen implements Chessboard{
    public void moves(){
        System.out.println("it will go vertically ,horizontally,cross,backword ,forword");
    }
}

class Rook implements Chessboard{
    public void moves(){
        System.out.println("it will go vertically ,horizontally");
    }
}

class King  implements Chessboard{
    public void moves(){
        System.out.println("it will go in all directions");
    }
}