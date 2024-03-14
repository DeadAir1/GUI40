package Chess;

public class Game {
    public static void main(String[] args) {
        Board board=new Board();
            board.printBoard();
       board.move(new Coordinates(1,1),new Coordinates(2,1));
        board.move(new Coordinates(6,1),new Coordinates(5,1));
        System.out.println();
    board.printBoard();
    }
}
