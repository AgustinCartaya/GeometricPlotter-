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
public class Triangle extends Figure implements Graphicable {
    
    //vertex
    private Point pointA,
                  pointB,
                  pointC;

    private boolean visible,
                    mouseOver;
    
    private static Color normalColor,
                         mouseOverColor;
    
    public static final Color DEFAULT_NORMAL_COLOR = new Color(0,168,243);
    public static final Color DEFAULT_MOUSE_OVER_COLOR = new Color(255,212,18);

    
    //--------- Constructors ---------
    
        
     /**
     * Creates one Triangle of vertex pointA, pointB, pointC
     * @param pointA
     * @param pointB
     * @param pointC
     */
    public Triangle(Point pointA, Point pointB, Point pointC) throws Exception {
        if( Triangle.validTrianlge(pointA, pointB, pointC)){
            this.pointA = pointA;
            this.pointB = pointB;
            this.pointC = pointC;
            this.visible = true;
            setNewColor(Triangle.getNormalColor());
        }else
            throw new Exception("Invalid Triangle"); 
        
    }

     /**
     * Creates one Triangle of vertex equals to the vertex of t
     * @param t
     */
    public Triangle(Triangle t ) throws Exception{
          this(t.pointA, t.pointB, t.pointC );  
    }
    
    //--------- Getters and Setters ---------
    
    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        if(pointA != null && !this.pointB.equals(pointA) && !this.pointC.equals(pointA))
            this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        if(pointB != null && !this.pointA.equals(pointB) && !this.pointC.equals(pointB))
            this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        if(pointC != null && !this.pointA.equals(pointC) && !this.pointB.equals(pointC))
            this.pointC = pointC;
    }

    
    
    
     public static void setNormalColor(Color normalColor){
        Triangle.normalColor = normalColor;
    }
    
    public static Color getNormalColor(){
        if(Triangle.normalColor == null)
            Triangle.normalColor = Triangle.DEFAULT_NORMAL_COLOR;
        return Triangle.normalColor;
    }
    
    public static void setMouseOverColor(Color mouseOverColor){
        Triangle.mouseOverColor = mouseOverColor;
    }
    
    public static Color getMouseOverColor(){
        if(Triangle.mouseOverColor == null)
            Triangle.mouseOverColor = Triangle.DEFAULT_MOUSE_OVER_COLOR;
        return Triangle.mouseOverColor;
    }

    
    
    //--------- useful methods ---------
    public static boolean validTrianlge(Point a, Point b, Point c){
        if( a == null || b == null || c == null)
            return false;
         if(a.equals(b) || a.equals(c) || b.equals(c))
             return false;
         if( (a.getY()-b.getY())/(a.getX()-b.getX()) ==  (c.getY()-b.getY())/(c.getX()-b.getX()) )
             return false;
         
        return true;
    }
    //--------- Override methods --------- 
    
    // Object Class ----------------------
    @Override
    public String toString() {
        return "[ v1 " + pointA + " v2 " + pointB + " v3 " + pointC + " ]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.pointA);
        hash = 97 * hash + Objects.hashCode(this.pointB);
        hash = 97 * hash + Objects.hashCode(this.pointC);
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
        final Triangle other = (Triangle) obj;
        if (!Objects.equals(this.pointA, other.pointA)) {
            return false;
        }
        if (!Objects.equals(this.pointB, other.pointB)) {
            return false;
        }
        if (!Objects.equals(this.pointC, other.pointC)) {
            return false;
        }
        return true;
    }

    // ELement Class ----------------------
    @Override
    public String getType() {
        return "Triangle";
    }
       
    @Override
    public String getAbb() {
        return "T";
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
            setColor(Triangle.getMouseOverColor());
        else
            setColor(this.getColorBackup());

    }

    //Figure Class ---------------------- 
    @Override
    public boolean contains(Point p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double getArea(){
        double s = getPerimeter() / 2;
        
        return Math.sqrt( s * (s- this.pointA.getDistance(this.pointB) ) * 
                              (s- this.pointA.getDistance(this.pointC) ) * 
                              (s- this.pointC.getDistance(this.pointB) ) );
        
        
    }
    
    @Override
    public double getPerimeter(){
        return this.pointA.getDistance(this.pointB) + 
                this.pointA.getDistance(this.pointC) + 
                this.pointB.getDistance(this.pointC);
    }
    
    
    @Override
    public String getElementDescription() {
        String des ="Type: "+getType()+
                "\nName: "+getName()+
                "\nVertex A: "+this.pointA+
                "\nVertex B: "+this.pointB+
                "\nVertex C: "+this.pointC+
                "\nArea: "+getArea()+
                "\nPerimeter: "+getPerimeter();
        return des;
        
    }
    
}
