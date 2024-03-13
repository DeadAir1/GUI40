package Chess;

public class Board {
    Figure [][] figuresAtBoard=new Figure[8][8];

    void move(Coordinates from,Coordinates to){
        if(figuresAtBoard[to.y][to.x]==null ||
                figuresAtBoard[to.y][to.x].isWhite!=figuresAtBoard[from.y][from.x].isWhite){
            if(figuresAtBoard[from.y][from.x].isLegalMove(to)){
            figuresAtBoard[to.y][to.x]=figuresAtBoard[from.y][from.x];
            figuresAtBoard[from.y][from.x]=null;
            System.out.println("Udalo sie");
            }
        }else System.out.println(" Nie udalo sie");
    }

    public Board() {
        fillBoardWithFigure();
    }
    public  void printBoard(){
        for (int i = 0; i < figuresAtBoard.length; i++) {
            for (int j = 0; j < figuresAtBoard[i].length; j++) {
                System.out.print(figuresAtBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    void fillBoardWithFigure(){
        for (int i = 0; i <8 ; i++) {
            figuresAtBoard[1][i]=new Pawn(true,new Coordinates(1,i));
        figuresAtBoard[6][i]=new Pawn(false,new Coordinates(6,i));
        }
    }
}
