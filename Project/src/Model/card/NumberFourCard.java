
package Model.card;



import Model.Pawn.Pawn;
import Model.Square.Square;


public class NumberFourCard extends NumberCard {

    /**
     * <b>constructor</b>: Constructs a new instance of NumberFourCard
     * @param d
     * @param m
     */
    public NumberFourCard(String d, int m) {
       super(d, m);
    }
   
    /**
     * <b>transformer(mutative)</b>: move the pawn p on board b
     * @param p 
     */
    @Override
    public int movePawn(Pawn p, Square[] squares) {
                     
                  
                   int  i = getMoves();
                   int k = p.getPos();
                  
                   if (k+i < 0){
                       k = 59 +(k+i);
                       i = 0;
                   } else if( k + i > 59){
                       k = 59 - (k+i);
                   }
                  

                   if (squares[k+i].get_has_Pawn() == false){
                       squares[k].set_has_Pawn(false);
                       squares[k+i].set_has_Pawn(true);
                       p.setPos(k+i);

                   }
                   else {
                       return p.getPos();
                   }

                   return p.getPos();

                }
}
    

