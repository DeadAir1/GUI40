package Chess;

public class Board {
    Board instance;
    Figure [] figures=new Figure[32];

    private Board() {
    }
    public Board getInstance(){
        if(instance==null){
            instance=new Board();
        }
        return instance;
    }


         void addFigures(){
         figures[0]=new Pawn(true,new Coordinates(0,1));
         }
         void move (Coordinates from,Coordinates to){
             for (int i = 0; i < figures.length; i++) {
                 if(figures[i]!=null){
                     if(figures[i].coordinates==from){
                         if(figures[i].isLegalMove(to,getInstance())){
                             figures[i].coordinates=to;
                         }
                     break;
                     }
                 }
             }
         }

}
