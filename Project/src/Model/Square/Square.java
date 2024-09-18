package Model.Square;

/**
 * make a square for the board
 *
 */
public abstract class Square {
    
    private boolean hasPawn;
    private String color;
    int X1, X2, Y1, Y2;
    
    public Square(String color, int X1, int X2, int Y1, int Y2, boolean Pa){
        this.color = color;
        this.X1 = X1;
        this.X2 = X2;
        this.Y1 = Y1;
        this.Y2 = Y2;
        hasPawn = Pa;
    }
         
    /**
     *  <b>Transformer:</b> sets the color for the square
     * <b>Postcondition:</b> the color for the square has been seted
     */
   private void setColor(String color){
       this.color = color;
   } 
   
   /**
    * <b>accessor</b>: Returns the color of the square
    *  <b>Postcondition:</b> the color of the card has been returned.
    * @return the color of the square
    */
    public String getColor(){
       
       return color;
   }
    
    /**
     * <b>Transformer:</b> set the state of the square
     * <p><b>Postcondition:</b> the hasPawn has been seted
     * @param p boolean true if the square has pawn or false is the square hasnt pawn
     */
    public void set_has_Pawn(boolean p){
        
        hasPawn = p;
    }
    
    
    /**
     * <b>Observer</b> Return true if the square has pawn false otherwise
     * <p><b>Postcondition:</b> return true if the square has pawn
     * @return true if the square has pawn or false if the square is empty
     */
    public boolean get_has_Pawn(){
        
        return hasPawn;
    }
    
    public int getX1(){
        return X1;
    }
    
    public int getX2(){
        return X2;
    }
    
    public int getY1(){
        return Y1;
    }
    
    public int getY2(){
        return Y2;
    }
    
}
