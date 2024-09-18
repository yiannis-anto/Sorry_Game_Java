
package Model.card;

import Model.Board.Board;
import Model.Pawn.Pawn;
import Model.Square.Square;


public class NumberTwoCard  extends NumberCard {
    
    
   
    /**
     * <b>constructor</b>: Constructs a new instance of NumberTwoCard
     * @param d
     * @param m
     */
    public NumberTwoCard(String d, int m ) {
        super(d, m);
    }
    
   /**
     * <b>transformer(mutative)</b>: moves the pawn p on board b
     * @param p 
     */
    @Override
    public int movePawn(Pawn p, Square[] squares){
        
        int X1, X2, Y1, Y2;
       int  i = getMoves();
       int k = p.getPos();
       
       if (k+i > 59){
                   k = k+i - 59;
                   i = 0;

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
