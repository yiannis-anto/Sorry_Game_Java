
package Model.card;


import Model.Pawn.Pawn;
import Model.Square.Square;


public class NumberTenCard  extends NumberCard {
    
    /**
     * <b>constructor</b>: Constructs a new instance of NumberTenCard
     * @param d
     * @param m
     */
    public NumberTenCard(String d, int m) {
        super(d, m);
    }
    
    /**
     * <b>transformer(mutative)</b>: moves the pawn p on board b
     * @param p
     * @param b 
     */
    public int movePawn(Pawn p, Square[] squares){
        
        int X1, X2, Y1, Y2;
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
       else if (squares[k+i].get_has_Pawn() == true) {
           squares[k].set_has_Pawn(false);
           squares[k-1].set_has_Pawn(true);
           p.setPos(k -1);
           
       }
       else {
           return p.getPos();
       }
       
       return p.getPos();
    }
    
   
   
    
}
