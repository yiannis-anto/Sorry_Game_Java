
package Model.Turn;

import Model.player.Player;
import java.util.ArrayList;


public class Turn {
    
    private int currentID;
    
    
    /**
     * <b>Transformer(Mutative):</b>
     * Checks how many pawn has the player
     */
    public void NumberOfPawns(){
        
    }
    
    
    /**
     * <b>Accessor(Selector):</b> returns the player's ID whose turn is to play
     * <b>Postcondition:</b> returns the player's ID whose turn is to play
     * @return the player's ID whose turn is to play
     */
    public int getID(){
        
        return currentID;
    }
    
    /**
     *   Constructor.
     *   Creates a new instance of turn
     */
    public Turn(){
        currentID = 1;
        
    }
    
    /**
     * <b>Transformer(Mutative):</b> Sets the player's turn.(which player has the turn to play)
     * <b>Postcondition:</b> Player's turn has been set.
     * 
     * 
     * @param i
     */
    public void setID(int i){
        currentID = i;
    }
    
    
     
    
}
