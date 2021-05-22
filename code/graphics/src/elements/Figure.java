/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import elements.Element;
import java.awt.Color;

/**
 *
 * @author agust
 */
public abstract class Figure extends Element{
    
   
 
    private boolean fill;
       
    public void setFill(boolean fill){
        this.fill = fill;
    }
    
    public boolean isFill(){
        return this.fill;
    }

    /**
     * returns the Perimeter of the Figure
     * @return 
     */
    public abstract double getPerimeter();
    
    /**
     * returns the Area of the Triangle
     * @return 
     */
    public abstract double getArea();
    
    /**
     * retunr true if the point is inside the Figure
     * @param p
     * @return boolean
     */
    public abstract boolean contains(Point p);
}
