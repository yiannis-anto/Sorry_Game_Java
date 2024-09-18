
package Model.Pawn;


public class Pawn {
    
    private int startX1 , startX2, startY1, startY2;
    private int pos;
    private String col;
    private boolean finish = false;
    
    
    /**
     *<b>constructor</b>: Constructs a new instance of Pawn with 
     * @param x
     * @param y
     * @param col 
     */
    public Pawn(String color, int p, int x1, int x2, int y1, int y2){
        col = color;
        pos = p;
        startX1 = x1;
        startX2 = x2;
        startY1 = y1;
        startY2 = y2;
    }
    
    public void  setPos(int p){
        pos = p;
    }
    
    public int getPos(){
        return pos;
    }
    
    public String getColor(){
        return col;
    }
    
    /**
     * <b>transformer(mutative)</b>: set a pawn at x coordinate
     * <p><b>Postcondition:</b>: the cordinate has been seted at x
     * @param x is the coordinate
     */
    public void setX(int x){
       
    }
    
    
    /**
     *  <b>accessor(selector)</b>: Return the x coordinate
     * 
     * <p><b>Postcondition:</b> the coordinate of the x has been returned
     * @return return the x coordinate
     */
    public int getX(){
        
        
        return 0;
    }
    
    
    /**
     * <b>transformer(mutative)</b>: set a pawn at y coordinate
     * <p><b>Postcondition:</b>: the cordinate has been seted at y
     * 
     */
    public void setY(){
        
        
    }
    
    
    /**
     * <b>accessor(selector)</b>: Return the y coordinate
     * <p><b>Postcondition:</b> the coordinate of the y has been returned
     * 
     * @return  return the y coordinate
     */
    public int getY(){
        
        return 0;
    }
    
    
         
}
