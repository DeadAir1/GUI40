package Chess;

public class Pawn extends Figure {
    public Pawn(boolean isWhite,Coordinates coordinates) {
        super(isWhite,coordinates);
    }

    protected boolean isLegalMove(Coordinates to,Board board) {
        if(firstMove){
            if(to.y-this.coordinates.y>2) return false;
        }else{
            if(to.y-this.coordinates.y>1) return false;
        }
      if((to.x<=8 && to.y <=8) && (to.x>=1 && to.y>=1)){
          for (int i = 0; i < board.figures.length; i++) {
              if(board.figures[i].coordinates==to){
                  return false;
              }else if(!firstMove && (board.figures[i].coordinates.y==this.coordinates.y+1)) return false;


          }
      }else return false;

      firstMove=false;
        return true;
    }

}

