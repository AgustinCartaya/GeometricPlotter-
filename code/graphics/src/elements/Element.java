/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import java.awt.Color;

/**
 *
 * @author agust
 */
public abstract class Element {
    // color of the element
    private Color color, colorBackup;
    
    private String  name,
                    type,
                    abb;

    
    public abstract String getType();
    public abstract String getAbb();
    public abstract String getElementDescription();
    
    //--------- Getters and Setters ---------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public Color getColor() {
        return this.color;
    }
    

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void setNewColor(Color color){
        this.colorBackup = color;
        this.color = color;
    }
    
    public void setColorBackup(Color color) {
        this.colorBackup = color;
    }
    
    public Color getColorBackup() {
        return this.colorBackup;
    }
    
}
