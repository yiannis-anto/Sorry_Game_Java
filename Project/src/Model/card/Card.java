package Model.card;

import Model.Board.Board;
import Model.Pawn.Pawn;
import Model.Square.Square;
import java.io.IOException;



/**
 * Contains the methods signuatures needed for
 * creating a simple card or a special card
 * 
 */
public abstract class Card {
    
    private int moves;
    private boolean isThrown;
    private String description;
    
    public Card(String d,int m){
        
        description = d;
        moves = m;
        
    }
   
    
    /**
     * set the description for the card
     * <b>Postcondition:</b> The description of the card has been set
     * @param des
     */
    public void setDescription(String d){
        description = d;
    }
    
    /**
     * Get the description for the card
     * <b>Postcondition:</b> The string representation of a card is returned
     * @return The string representation of a card 
     */
    public String getDescription(){
        
        return description;
    }
    
    /**
     *  <b>transformer</b>: set True if the card is thrown
     * 
     * @param t sets if a card is thrown
     */
    public void setThrow(boolean t){
        isThrown = t;
    }
    
    /**
     *  <b>accessor</b>: return true if a card is thrown, false otherwise
     * @return true if a card is thrown, false otherwise
     */
    public boolean getThrow(){
        
        return isThrown;
    }
    
    
    /**
     * <b>transformer</b>: sets the moves for the card
     * @param i 
     */
    public void setMoves(int i){
       moves = i;
    }
    
    /**
     * <b>accessor</b>: return how many moves can do
     * @return the number moves
     */
    public int  getMoves(){
        
        return moves;
    }
   
    /**
     * move a given pawn on board b with moves spaces.
     * 
     * @param p
     * @param squares
     * 
     */
    
   public int movePawn(Pawn p, Square[] squares){
       
       return 0;
   }
   
   
    
}
