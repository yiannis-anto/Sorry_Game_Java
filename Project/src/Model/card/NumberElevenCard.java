
package Model.card;

import Model.Pawn.Pawn;
import Model.Square.Square;

public class NumberElevenCard extends NumberCard {
    
  
    private boolean move;

    /**
     * <b>constructor</b>: Constructs a new instance of NumberElevenCard
     * @param d
     * @param m
     */
    public NumberElevenCard(String d, int m) {
        super(d, m);
    }
    
    
    /**
     * <b>transformer(mutative)</b>: check if can swap two different color pawns
     * @param p
     * @param p2 
     * @param squares 
     */
    @Override
    public int movePawn(Pawn p,  Square[] squares) {
        
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
    
