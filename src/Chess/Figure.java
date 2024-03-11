package Chess;

public abstract class Figure {
    boolean isWhite;
    boolean firstMove=true;
    Coordinates coordinates;

    public Figure(boolean isWhite,Coordinates coordinates) {
        this.isWhite = isWhite;
        this.coordinates=coordinates;
    }

    protected abstract boolean isLegalMove(Coordinates to,Board board);
}
