
package Model.card;

import Controller.Controller;
import Model.Pawn.Pawn;
import Model.Square.Square;

public class NumberOneCard extends NumberCard{
    
    Controller control;
    
    
    private boolean inStart;

    /**
     * <b>constructor</b>: Constructs a new instance of NumberOneCard
     * @param d
     * @param m
     */
    public NumberOneCard(String d, int m) {
        super(d, m);
       
    }
    
    /**
     * <b>transformer(mutative)</b>: set true if the pawn is on the startSquare
     * <p><b>Postcondition:</b> 
     * @param start 
     */
    public void setStart(boolean start){
        
    }
    
    /**
     * <b>accessor(selector)</b>: Returns true if t
     * he pawn is on the startSquare,false otherwise
     * @return true if the pawn is on the startSquare,false otherwise
     */
    public boolean getStart(){
        
        return inStart;
    }
    
    /**
     * <b>transformer(mutative)</b>: move the pawn p on board b
     * @param p
     * @param b 
     * 
     */
   @Override
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
