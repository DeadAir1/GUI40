package Chess;

public class Pawn extends Figure{
    boolean isFirstMove=true;
    public Pawn(boolean isWhite,Coordinates coordinates) {
        super(isWhite,coordinates);
    }
    //White
    // jezeli nie firstMove to Y moze byc wiekszy na 1,else na 2
    //Black
    //jezeli nie firstMove to Y moze byc mniejszy  na 1,else na 2
    @Override
    public boolean isLegalMove(Coordinates to) {
        if(to.x!=this.coordinates.x)
            return false;
        if(isWhite){
        if(!isFirstMove){
            if(to.y+this.coordinates.y>1 || to.y + this.coordinates.y==0){
                return false;
            }
        }else {
            if(to.y-this.coordinates.y>2 || to.y == this.coordinates.y)
                return false;
        }
        }else{
            if(!isFirstMove){
                if(this.coordinates.y-to.y>1 || to.y == this.coordinates.y){
                    return false;
                }
                //return this.coordinates.y - to.y <= 1 && to.y != this.coordinates.y;
            }else {
                if(this.coordinates.y-to.y>2 || to.y == this.coordinates.y)
                    return false;
            }

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
