
package Controller;

import Model.Deck.Deck;
import Model.Turn.Turn;
import Model.player.Player;
import java.util.ArrayList;


public class Controller {
    
    private int fold;
    private ArrayList<Player> players = new ArrayList<Player>();
    private Player p1, p2;
    private Turn turn = new Turn();
    private Deck allcards = new Deck();
    
    
    /**
     * <b>constructor</b>: Constructs a new Controller and sets the game as 
     * eligible to start 
     * <b>postcondition</b>: constructs a new Controller,with new 2 players
     */
    public Controller(){
        
        p1 = new Player("p1", "RED ", 0);
        p2 = new Player("p2", "YELLOW", 1);
        players.add(p1);
        players.add(p2); 
        
    }
    
    /**
     * <b>transformer(mutative)</b>:if a player press the button fold
     * it increases the variable fold (fold++)
     * 
     * <p><b>Postcondition:</b> increase the fold variable(fold++) 
     */
    public void set_Fold(){
        
    }
    
    public void new_Game(){
        
    }
    
    /**
     * <b>Observer</b>:Return true if a game(one player has the pawn at home) has finished
     * <p><b>Postcondition:</b> Return true if a game(one player has the pawn at home) has finished
     * @return true if a game(one player has the pawn at home) has finished, false otherwise
     */
    public boolean GameHasFinished(){
        
        return false;
    }
    
    
    /**
     * <b>Accessor(selector)</b>:Returns which player has the turn 
     *   <p><b>Postcondition:</b> Returns which player has the turn 
     * @return which player has the turn (for example 0 if p1 has the turn )
     */
    public int seeTurn(){
        
        return turn.getID();
    }
    
    
    /**
    *<b>transformer(mutative)</b> set who player will play
    * <p><b>Postcondition:</b> players turn has been set
     * @param i
    */
    public void set_Turn(){
       if (turn.getID() == 0){
           turn.setID(1);
       }
       else {
           turn.setID(0);
       }
       
    }
  
    
}
