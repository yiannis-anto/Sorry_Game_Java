/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Square;


public class SafetyZoneSquare extends Square {
    
    private boolean hasPawn;
    private String color;
    int X1, X2, Y1, Y2;
    
    /**
     * <b>constructor</b>: Constructs a new instance of SafetyZoneSquare
     * parent class Square
     * @param color
     * @param X1
     * @param X2
     * @param Y1
     * @param Y2
     * @param Pa
     */
    
    public SafetyZoneSquare(String color,int X1, int X2, int Y1, int Y2, boolean Pa){
        super(color, X1, X2, Y1, Y2 , Pa);
    }
    
}
