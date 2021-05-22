/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import elements.Graphicable;
import elements.Point;
import java.awt.Color;
import java.util.Objects;

/**
 *
 * @author agust
 */
public class Rectangle extends Figure implements Graphicable {
    
    //vertex
    private Point initialPoint;
    
    private double width,
                  height;

    private boolean visible,
                    mouseOver;
    
    private static Color normalColor,
                         mouseOverColor;
    
    public static final Color DEFAULT_NORMAL_COLOR = new Color(0,168,243);
    public static final Color DEFAULT_MOUSE_OVER_COLOR = new Color(255,212,18);

    
    //--------- Constructors ---------
    
        
     /**
     * Creates one Rectangle of vertex pointA, pointB, pointC
     * @param pointA
     * @param pointB
     * @param pointC
     */
    public Rectangle(Point initialPoint, double width, double height) throws Exception {
        if( width>0 && height>0 ){
            this.initialPoint = initialPoint;
            this.width = width;
            this.height = height;
            this.visible = true;
            setNewColor(Rectangle.getNormalColor());
        }else
            throw new Exception("Invalid Rectangle"); 
        
    }

     /**
     * Creates one Rectangle of vertex equals to the vertex of t
     * @param r
     */
    public Rectangle(Rectangle r ) throws Exception{
          this(r.initialPoint, r.width, r.height);  
    }
    
    //--------- Getters and Setters ---------

    public Point getInitialPoint() {
        return initialPoint;
    }

    public void setInitialPoint(Point initialPoint) {
        if( initialPoint != null)
            this.initialPoint = initialPoint;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0)
            this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
         if(height > 0)
            this.height = height;
    }
    
    
    
    
    
     public static void setNormalColor(Color normalColor){
        Rectangle.normalColor = normalColor;
    }
    
    public static Color getNormalColor(){
        if(Rectangle.normalColor == null)
            Rectangle.normalColor = Rectangle.DEFAULT_NORMAL_COLOR;
        return Rectangle.normalColor;
    }
    
    public static void setMouseOverColor(Color mouseOverColor){
        Rectangle.mouseOverColor = mouseOverColor;
    }
    
    public static Color getMouseOverColor(){
        if(Rectangle.mouseOverColor == null)
            Rectangle.mouseOverColor = Rectangle.DEFAULT_MOUSE_OVER_COLOR;
        return Rectangle.mouseOverColor;
    }

    
    
    //--------- useful methods ---------

    //--------- Override methods --------- 
    
    // Object Class ----------------------
    @Override
    public String toString() {
        return "[ Initial Point " + this.initialPoint + " Width " + this.width + " Height " + this.height + " ]";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.initialPoint);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (!Objects.equals(this.initialPoint, other.initialPoint)) {
            return false;
        }
        return true;
    }

  
    // ELement Class ----------------------
    @Override
    public String getType() {
        return "Rectangle";
    }
       
    @Override
    public String getAbb() {
        return "R";
    }
    
    // Graphicable Interface ----------------------  
    @Override
    public boolean isVisible() {
        return this.visible;
    }

    @Override
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    @Override
    public boolean isMouseOver() {
        return this.mouseOver;
    }

    @Override
    public void setMouseOver(boolean mouseOver) {
        this.mouseOver = mouseOver;
        
        if(mouseOver)
            setColor(Rectangle.getMouseOverColor());
        else
            setColor(this.getColorBackup());

    }

    //Figure Class ---------------------- 
    @Override
    public boolean contains(Point p) {
        if(p.getX() >= this.initialPoint.getX() && p.getX() <= (this.initialPoint.getX() + this.getWidth()) && 
            p.getY() >= this.initialPoint.getY() && p.getY() <= (this.initialPoint.getY() + this.getHeight()))
            return true;
        return false;
    }
    
    @Override
    public double getArea(){
        return this.width * this.height;
        
        
    }
    
    @Override
    public double getPerimeter(){
        return this.width * 2 + this.height * 2;
    }
    
    
    @Override
    public String getElementDescription() {
        String des ="Type: "+getType()+
                "\nName: "+getName()+
                "\nINitial Point: "+this.initialPoint+
                "\nWidth: "+this.width+
                "\nHeight: "+this.height+
                "\nArea: "+getArea()+
                "\nPerimeter: "+getPerimeter();
        return des;
        
    }
    
}
