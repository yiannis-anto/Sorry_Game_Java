
package Model.card;

import Model.Pawn.Pawn;
import Model.Board.Board;
import Model.Square.Square;


public class SorryCard extends Card{
       

     private boolean isThrown = false;
     
     /**
     * <b>constructor</b>: Constructs a new instance of SorryCard
     * 
     * @param d
     */
     public SorryCard(String d){
         super(d, 0);
         
     }
     
     /**
      * <b>transformer(mutative)</b>: check if is possible to swap 2 pawns different color
      * @param p1 
      * @param p2 
      * @param squares 
      */
     public void SwapPawns(Pawn p1,Pawn p2, Square[] squares){
         
     }
  
    
    
}
