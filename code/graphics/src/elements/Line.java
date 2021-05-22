
package elements;

import elements.Graphicable;
import java.awt.Color;
import java.util.Objects;

/**
 *
 * @author Agustin Cartaya
 */
public class Line extends Basic implements Graphicable{
    //--------- Internal variables ---------

    
    // extremes of the line
    private Point pointA,
                  pointB;


    private boolean visible;
    
    private boolean mouseOver;
    
    private static Color normalColor,
                         mouseOverColor;
    
    public static final Color DEFAULT_NORMAL_COLOR = new Color(0,168,243);
    public static final Color DEFAULT_MOUSE_OVER_COLOR = new Color(255,212,18);


    //--------- Constructors ---------
    
    /**
     * creates one line between pointA et pointB 
     * @param pointA
     * @param pointB
     */
    public Line(Point pointA, Point pointB) throws Exception {
        if(Line.validLine(pointA, pointB)){
            this.pointA = pointA;
            this.pointB = pointB;
            this.visible = true;
            setNewColor(Line.getNormalColor());
        }else
            throw new Exception("Invelid Line");
        
    }
    
    /**
     * creates one line between pointA et pointB of the Line l
     * @param l
     */
    public Line(Line l, String name) throws Exception{
        this(l.pointA, l.pointB);
    }
    
    //--------- Getters and Setters ---------
    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        if(pointA != null && !pointA.equals(this.pointB))
            this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        if(pointB != null && !pointB.equals(this.pointA))
            this.pointB = pointB;
    }

    
    
    public static void setNormalColor(Color normalColor){
        Line.normalColor = normalColor;
    }
    
    public static Color getNormalColor(){
        if(Line.normalColor == null)
            Line.normalColor = Line.DEFAULT_NORMAL_COLOR;
        return Line.normalColor;
    }
    
    public static void setMouseOverColor(Color mouseOverColor){
        Line.mouseOverColor = mouseOverColor;
    }
    
    public static Color getMouseOverColor(){
        if(Line.mouseOverColor == null)
            Line.mouseOverColor = Line.DEFAULT_MOUSE_OVER_COLOR;
        return Line.mouseOverColor;
    }

    
    //--------- useful methods ---------
    public double getLength(){
        return this.pointA.getDistance(this.pointB);
    }
    
    public static boolean validLine(Point a, Point b){
        if (a == null || b == null)
            return false;
        if(a.equals(b))
            return false;
        return true;
    }
    
    //--------- Override methods ---------
    
    
    // Object Class ----------------------
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.pointA);
        hash = 17 * hash + Objects.hashCode(this.pointB);
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
        final Line other = (Line) obj;

        if ( !(Objects.equals(this.pointA, other.pointB) && Objects.equals(this.pointB, other.pointA)) ) {
            
            if (!Objects.equals(this.pointA, other.pointA)) {
                return false;
            }
            
            if (!Objects.equals(this.pointB, other.pointB)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "[ A: " + pointA + " , B " + pointB + " ]";
    }

    // ELement Class ----------------------
    @Override
    public String getType() {
        return "Line";
    }
    
    @Override
    public String getAbb() {
        return "L";
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
            setColor(Line.getMouseOverColor());
        else
            setColor(this.getColorBackup());

    }
    
    @Override
    public String getElementDescription() {
        String des ="Type: "+getType()+
                "\nName: "+getName()+
                "\nExtreme A: "+this.pointA+
                "\nExtreme B: "+this.pointB+
                "\nLength C: "+getLength();

        return des;
        
    }
    
    
    
}
