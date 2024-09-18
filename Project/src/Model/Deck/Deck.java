
package Model.Deck;

import java.util.Collections;
import Model.Square.EndSlideSquare;
import Model.Square.InternalSlideSquare;
import Model.Square.SafetyZoneSquare;
import Model.Square.SimpleSquare;
import Model.Square.Square;
import Model.Square.StartSlideSquare;
import Model.card.Card;
import Model.card.NumberElevenCard;
import Model.card.NumberFourCard;
import Model.card.NumberOneCard;
import Model.card.NumberSevenCard;
import Model.card.NumberTenCard;
import Model.card.NumberTwoCard;
import Model.card.SimpleNumberCard;
import Model.card.SorryCard;
import java.awt.Canvas;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


/**
 * This class creates a new Collection of cards.
 *
 */

public class Deck {
    
    
    ArrayList<Card> cards = new ArrayList<Card>();
    public Square[] squares = new Square[70]; 
   
   
    
    /**
     * 
     * <b>Transformer:</b> initialize the board with the pawns
     */
    public void init_Board(){
        squares[0] = (new EndSlideSquare("RED", 160, 20, 40, 40, false));
        squares[1] = (new SimpleSquare("No color", 200, 20, 40, 40, false));
        squares[2] = (new SimpleSquare("No color", 240, 20, 40, 40, false));
        squares[3] = (new SimpleSquare("No color", 280, 20, 40, 40, false));
        squares[4] = (new SimpleSquare("No color", 320, 20, 40, 40, false));
        squares[5] = (new StartSlideSquare("RED", 360, 20, 40, 40, false));
        squares[6] = (new InternalSlideSquare("RED", 400, 20, 40, 40, false));
        squares[7] = (new InternalSlideSquare("RED", 440, 20, 40, 40, false));
        squares[8] = (new InternalSlideSquare("RED", 480, 20, 40, 40, false));
        squares[9] = (new EndSlideSquare("RED", 520, 20, 40, 40, false));
        squares[10] = (new SimpleSquare("No color", 560, 20, 40, 40, false));
        squares[11] = (new SimpleSquare("No color", 600, 20, 40, 40, false));
        squares[12] = (new StartSlideSquare("BLUE", 600, 60, 40, 40, false));
        squares[13] = (new InternalSlideSquare("BLUE", 600, 100, 40, 40, false));
        squares[14] = (new InternalSlideSquare("BLUE", 600, 140, 40, 40, false));
        squares[15] = (new EndSlideSquare("BLUE", 600, 180, 40, 40, false));
        squares[16] = (new SimpleSquare("No color", 600, 220, 40, 40, false));
        squares[17] = (new SimpleSquare("No color", 600, 260, 40, 40, false));
        squares[18] = (new SimpleSquare("No color", 600, 300, 40, 40, false));
        squares[19] = (new SimpleSquare("No color", 600, 340, 40, 40, false));
        squares[20] = (new StartSlideSquare("BLUE", 600, 380, 40, 40, false));
        squares[21] = (new InternalSlideSquare("BLUE", 600, 420, 40, 40, false));
        squares[22] = (new InternalSlideSquare("BLUE", 600, 460, 40, 40, false));
        squares[23] = (new InternalSlideSquare("BLUE", 600, 500, 40, 40, false));
        squares[24] = (new EndSlideSquare("BLUE", 600, 540, 40, 40, false));
        squares[25] = (new SimpleSquare("No color", 600, 580, 40, 40, false));
        squares[26] = (new SimpleSquare("No color", 600, 620, 40, 40, false));
        squares[27] = (new StartSlideSquare("YELLOW", 560, 620, 40, 40, false));
        squares[28] = (new InternalSlideSquare("YELLOW", 520, 620, 40, 40, false));
        squares[29] = (new InternalSlideSquare("YELLOW", 480, 620, 40, 40, false));
        squares[30] = (new EndSlideSquare("YELLOW", 440, 620, 40, 40, false));
        squares[31] = (new SimpleSquare("No color", 400, 620, 40, 40, false));
        squares[32] = (new SimpleSquare("No color", 360, 620, 40, 40, false));
        squares[33] = (new SimpleSquare("No color", 320, 620, 40, 40, false));
        squares[34] = (new SimpleSquare("No color", 280, 620, 40, 40, false));
        squares[35] = (new StartSlideSquare("YELLOW", 240, 620, 40, 40, false));
        squares[36] = (new InternalSlideSquare("YELLOW", 200, 620, 40, 40, false));
        squares[37] = (new InternalSlideSquare("YELLOW", 160, 620, 40, 40, false));
        squares[38] = (new InternalSlideSquare("YELLOW", 120, 620, 40, 40, false));
        squares[39] = (new EndSlideSquare("YELLOW", 80, 620, 40, 40, false));
        squares[40] = (new SimpleSquare("No color", 40, 620, 40, 40, false));
        squares[41] = (new SimpleSquare("No color", 0, 620, 40, 40, false));
        squares[42] = (new StartSlideSquare("GREEN", 0, 580, 40, 40, false));
        squares[43] = (new InternalSlideSquare("GREEN", 0, 540, 40, 40, false));
        squares[44] = (new InternalSlideSquare("GREEN", 0, 500, 40, 40, false));
        squares[45] = (new EndSlideSquare("GREEN", 0, 460, 40, 40, false));
        squares[46] = (new SimpleSquare("No color", 0, 420, 40, 40, false));
        squares[47] = (new SimpleSquare("No color", 0, 380, 40, 40, false));
        squares[48] = (new SimpleSquare("No color", 0, 340, 40, 40, false));
        squares[49] = (new SimpleSquare("No color", 0, 300, 40, 40, false));
        squares[50] = (new StartSlideSquare("GREEN", 0, 260, 40, 40, false));
        squares[51] = (new InternalSlideSquare("GREEN", 0, 220, 40, 40, false));
        squares[52] = (new InternalSlideSquare("GREEN", 0, 180, 40, 40, false));
        squares[53] = (new InternalSlideSquare("GREEN", 0, 140, 40, 40, false));
        squares[54] = (new EndSlideSquare("GREEN", 0, 100, 40, 40, false));
        squares[55] = (new SimpleSquare("No color", 0, 60, 40, 40, false));
        squares[56] = (new SimpleSquare("No color", 0, 20, 40, 40, false));
        squares[57] = (new StartSlideSquare("RED", 40, 20, 40, 40, false));
        squares[58] = (new InternalSlideSquare("RED", 80, 20, 40, 40, false));
        squares[59] = (new InternalSlideSquare("RED", 120, 20, 40, 40, false));
        squares[60] = (new SafetyZoneSquare("RED", 80, 60, 40, 40, false));
        squares[61] = (new SafetyZoneSquare("RED", 80, 100, 40, 40, false));
        squares[62] = (new SafetyZoneSquare("RED", 80, 140, 40, 40, false));
        squares[63] = (new SafetyZoneSquare("RED", 80, 180, 40, 40, false));
        squares[64] = (new SafetyZoneSquare("RED", 80, 220, 40, 40, false));
        squares[65] = (new SafetyZoneSquare("YELLOW", 520, 580, 40, 40, false));
        squares[66] = (new SafetyZoneSquare("YELLOW", 520, 540, 40, 40, false));
        squares[67] = (new SafetyZoneSquare("YELLOW", 520, 500, 40, 40, false));
        squares[68] = (new SafetyZoneSquare("YELLOW", 520, 460, 40, 40, false));
        squares[69] = (new SafetyZoneSquare("YELLOW", 520, 420, 40, 40, false));
        
    }
    
    /**
     * Constructor
     * <b>Postcondition</b>Creates a new Deck with a new card ArrayList.
     * 
     */
    public Deck() {
        
        
        init_Board();    
        init_Cards();
        shuffleCards();
        
    }
    
    public Square[] getSquares(){
        return squares;
    }
    
    
    public void init_Cards(){
        for (int i = 0; i < 4; i++){
             cards.add( new SimpleNumberCard( "Move one of your pawns 3 spaces forward", 3 ) );
             cards.add ( new SimpleNumberCard( "Move one of your pawns 5 spaces forward", 5 ) );
             cards.add ( new SimpleNumberCard( "Move one of your pawns 8 spaces forward", 8 ) );
             cards.add ( new SimpleNumberCard( "Move one of your pawns 12 spaces forward",12 ) );
             cards.add  ( new NumberOneCard( "Move one of your pawns 1 space forward...", 1 ));
             cards.add  ( new NumberTwoCard( "Move one of your pawns 2 spaces forward...and play again", 2 ) );
             cards.add (  new NumberFourCard( "Move one of your pawns 4 spaces back", -4) );
             cards.add  ( new NumberSevenCard("Move one of your pawns 7 spaces forward or choose two pawns", 7));
             cards.add  ( new NumberTenCard( "Move one of your pawns 10 spaces forward or 1 space back", 10));
             cards.add  ( new NumberElevenCard("Move one of your pawns 11 spaces forward or swap with other pawn", 11) );
             cards.add ( new SorryCard("Swap one of your pawns with one of pawns of the opponent") );
         
        }
    }
    
    /**
     * <b>Transformer:</b> shuffles the 44 cards.
     * <b>Precondition:</b> if the card deck is empty.
     * <b>Postcondition:</b> The cards have been shuffled.
     *
     */
    public void shuffleCards(){
        
        Collections.shuffle(cards);
    }
    
    /**
     * <b>Observer:</b> Returns true if this list contains no elements.
     * <b>Postcondition:</b> Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
    public boolean isEmpty(){
        
        if (cards.isEmpty() == true){
            return true;
        }
           
        return false;
    }
    
    /**
     * <b>Transformer:</b> Removes a card from the list.
     * <b>Postcondition:</b> A card has been removed from the list.
     * @param i 
     */
    
    public void removeCard(int i){
        cards.remove(i);
    }
    
    /**
     * <b>Accessor:</b> returns the card in position 'index'
     * @param index
     * @return the card in position 'index'
     */
    
    public Card getCard(int i){
        
        return cards.get(i);
    }
    
    /**
     * <b>Transformer:</b> Returns the size of a list.
     * <b>Postcondition:</b> The size of the list has been returned.
     * @return size of the list
     */
    
    public int CardsSize(){
        
       return cards.size();
    }
    
    /**
     * <b>Accessor:</b> returns all the cards
     * <b>Postcondition:</b> the card in position 'index' has been returned
     * @return 
     */
    
    public ArrayList<Card> getCards(){
        
        return this.cards;
    }
    
    
    /**
     * <b>Transformer:</b> Check if the player cant do any move
     * <b>Postcondition:</b> change player
     * 
     */
    public void checkFold(){
        
    
}

      
    
}
