
package Model.card;

import Model.Pawn.Pawn;
import Model.Square.Square;


public class NumberSevenCard extends NumberCard {
    
    
   
    /**
     * <b>constructor</b>: Constructs a new instance of NumberSevenCard
     * @param d
     * @param m
     */
    public NumberSevenCard(String d, int m) {
        super(d,m);
    }
  
    /**
     * <b>transformer(mutative)</b>: Moves two Pawns with total 7 moves
     * one pawn with a moves
     * one pawn with b moves
     * @param p1
     * @param p2
     * @param a
     * @param b 
     * @param squares 
     */
   public int  movePawn(Pawn p, Square[] squares ) {
                  
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
