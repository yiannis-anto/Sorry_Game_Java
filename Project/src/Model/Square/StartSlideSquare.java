
package Model.Square;


public class StartSlideSquare extends SlideSquare {
    
    private boolean hasPawn;
    //private String color;
    //int X1, X2, Y1, Y2;
    
    /**
     * <b>constructor</b>: Constructs a new instance of StartSlideSquare
     * @param color
     * @param X1
     * @param X2
     * @param Y1
     * @param Y2
     * @param Pa
     */
    public StartSlideSquare(String color, int X1, int X2, int Y1, int Y2, boolean Pa){
          super(color, X1, X2, Y1 ,Y2, Pa);
        
    }
}
