package Chess;

public class Pawn extends Figure{
    boolean isFirstMove=true;
    public Pawn(boolean isWhite,Coordinates coordinates) {
        super(isWhite,coordinates);
    }

    @Override
    public boolean isLegalMove(Coordinates to) {
        if(!isFirstMove){
            if(to.y-this.coordinates.y>1 || to.y- this.coordinates.y==0){
                return false;
            }else if(to.x-this.coordinates.x>1)
                return false;
        }else {
            if(to.y-this.coordinates.y>2 || to.y - this.coordinates.y==0)
                return false;
            else if(to.x-this.coordinates.x!=0)
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pawn{" +
                "isWhite=" + isWhite +
                '}';
    }
}
