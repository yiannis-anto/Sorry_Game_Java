
package Model.player;

import Model.Pawn.Pawn;
import java.util.ArrayList;

/**
 * 
 * Player class describes the characteristics of a player
 * and provides methods
 */

public class Player {
    
    static int k = 0;
    private String name;
    private int choice, ID;
    private boolean hasPlayed, finished ;
    private String color;
   
    public Pawn[] pawns = new Pawn[2];;
   
    
    /**
     * <b>constructor</b>: Constructs a new Player with the given
     * parameter name, color  and ID.
     * 
     * <b>postcondition</b>: Creates and initializes a player with the given
     * name, color and ID
     * 
     * @param name is the name of the player
     * @param color is the color of the player
     * @param ID  is the ID of the player
     */
    
    public Player(String name, String color, int ID){
        
        this.name = name;
        this.color = color;
        this.choice = 0;
        this.ID = ID;
        this.finished = false;
        this.hasPlayed = false;
        
    }
    
    /**
     *  <b>Accessor(selector)</b>: Returns the ID of a player 
     *  <b>postcondition</b>: Returns the ID of the player
     * @return the ID of the player
     */
    public int getID(){
        return ID;
    }
    
    
    /**
     * <b>transformer(mutative)</b>: it sets the ID of a player
     * <b>postcondition</b>: the ID of the player is changed to id
     * @param id the new ID of the player
     */
    public void setID(int id){
        ID = id;
    }
    
    /**
     * <b>accessor(selector)</b>:Returns the name of the player
     * <p><b>Postcondition:</b> returns the name of the player </p>
     * @return the the name of the player
     */
    public String getName(){
        
        return name;
    }
    
    
    /**
     * <b>accessor(selector)</b>:Returns the choice of a player( how to play a card)
     * <p><b>Postcondition:</b> Returns the choice of a player (how to play a card)
     * @return the choice 
     */
    public int getChoice(){
        
        return this.choice;
    }
    
    public void setChoice(int i){
        choice = i;
    }
    
    
    /**
     * <b>transformer(mutative)</b>: sets the variable hasPlayed to true
     * <p><b>Postcondition:</b>  sets the variable hasPlayed to true</p>
     */
    public void Played(){
        
    }
    
    /**
     * <b>transformer(mutative)</b>: Sets the variable finished to true
     * <p><b>Postcondition:</b>  sets the variable finished to true</p>
     * 
     */
    public void has_finished(){
        
    }
    
    /**
     *  <b>Observer</b>:Returns if a player has finished the game)
     *  <p><b>Postcondition:</b> Returns if a player has finished the game)
     * @return  true if a player has finished the game , false otherwise
     */
    public boolean get_has_finished(){
        return this.finished;
    }

    
    
}
