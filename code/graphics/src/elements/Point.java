
package elements;

import java.awt.Color;

/**
 *
 * @author Agustin Cartaya
 */
public class Point extends Basic implements Graphicable {
    

    //--------- Internal variables ---------

    
    // Horizontal and vertical position
    private double x,
                   y;


    private boolean visible,
                    mouseOver;

    private static Color normalColor,
                         mouseOverColor;
    
    public static final Color DEFAULT_NORMAL_COLOR = new Color(0,168,243);
    public static final Color DEFAULT_MOUSE_OVER_COLOR = new Color(255,212,18);
    //--------- Constructors ---------
    
    /** 
     * creates a point in the coordinates (x,y)
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        setX(x); //pourqoi cette advertence?
        setY(y);
        this.visible = true;
        setNewColor(Point.getNormalColor());//je comprends pas l'advertence
        
    }

    /**
     * creates a point width the coordinates of the point p
     * @param p 
     */
    public Point(Point p){
        this( p.x, p.y);
    }

    //--------- Getters and Setters ---------

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    
    public static void setNormalColor(Color normalColor){
        Point.normalColor = normalColor;
    }
    
    public static Color getNormalColor(){
        if(Point.normalColor == null)
            Point.normalColor = Point.DEFAULT_NORMAL_COLOR;
        return Point.normalColor;
    }
    
    public static void setMouseOverColor(Color mouseOverColor){
        Point.mouseOverColor = mouseOverColor;
    }
    
    public static Color getMouseOverColor(){
        if(Point.mouseOverColor == null)
            Point.mouseOverColor = Point.DEFAULT_MOUSE_OVER_COLOR;
        return Point.mouseOverColor;
    }

    

    //--------- useful methods ---------

    /**
     * returns the distance between this point and the point p
     * @param p
     * @return double
     */
    public double getDistance(Point p){
        if( p == null || p.equals(this))
            return 0;
        
        return Math.sqrt( Math.pow(this.x - p.x, 2) +  Math.pow(this.y - p.y, 2));
    }
    
     
    //--------- Override methods ---------
    
    
    // Object Class ----------------------
    @Override
    public String toString() {
        
        String s = "( " + "x: " ;
        
        if(x-(int)x !=0)
            s+=x;
        else
            s+=(int)x;
        
        s+=" ; y: ";
        
        if(y-(int)y !=0)
            s+=y;
        else
            s+=(int)y;
        
        s +=" )";
        
        return s;
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
        final Point other = (Point) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        return hash;
    }


    // ELement Class ----------------------
    @Override
    public String getType() {
        return "Point";
    }
    
     @Override
    public String getAbb() {
        return "P";
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
            setColor(Point.getMouseOverColor());
        else
            setColor(this.getColorBackup());

    }
    
    @Override
    public String getElementDescription() {
        String des ="Type: "+getType()+
                "\nName: "+getName()+
                "\nX: "+this.x+
                "\nX: "+this.y;

        return des;
        
    }
    

    
    
}
