package Chess;

public abstract class Figure implements Moveable{
    boolean isWhite;
    Coordinates coordinates;

    public Figure(boolean isWhite,Coordinates coordinates) {
        this.isWhite = isWhite;
        this.coordinates=coordinates;
    }


}
