
package Model.card;


import Model.Pawn.Pawn;
import Model.Square.Square;
import java.io.IOException;


public class NumberCard extends Card {
    
    private int value;
    
    
    /**
     * <b>constructor</b>: Constructs a new instance of number card
     * 
     * 
     * @param d
     * @param m
     */
    public NumberCard(String d, int m){
        super(d, m);
    }

   
    /**
     * <b>transformer(mutative)</b>: moves the pawn p on board b
     * @param p 
     */
    
    @Override
    public int movePawn(Pawn p, Square[] squares) {
        return 0;
    }
    
    
}