public class Interfaces {
    public static void main(String args[]){
        King k = new King();
        k.moves();
        Pawn p = new Pawn();
        p.moves();
    }
}

interface ChessPlayer{
    void moves(); // this is bydefault public and abstract
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal - (by 1 step)");
    }
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal - (in all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left");
    }
}

class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("up(by 1 step)");
    }
}
