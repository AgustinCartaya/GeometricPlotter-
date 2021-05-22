
package elements;

import elements.Graphicable;
import elements.Point;
import java.awt.Color;
import java.util.Objects;

/**
 *
 * @author Agustin Cartaya
 */
public class Circle extends Figure implements Graphicable {
    
    
    //--------- Internal variables ---------

    // center of the circle    
    private Point center;
    
    //radius of the circle
    private double radius;

 
    private boolean visible;
    
    private boolean mouseOver;
    
    private static Color normalColor,
                         mouseOverColor;
    
    public static final Color DEFAULT_NORMAL_COLOR = new Color(0,168,243);
    public static final Color DEFAULT_MOUSE_OVER_COLOR = new Color(255,212,18);
    //--------- Constructors ---------
    
     /**
     * Creates one circle of center "center" and radius "radius"
     * @param center
     * @param radius
     */
    public Circle(Point center, double radius) throws Exception {
        if(Circle.validCircle(center, radius)){
            this.center = center;
            this.radius = radius;
            this.visible = true; 
            setNewColor(Circle.getNormalColor());
        }else
            throw new Exception("Invalid circle");

    }
    
     /**
     * Creates one circle of center and radius equals to the circle c
     * @param c
     */
    public Circle(Circle c) throws Exception{
        this(c.center, c.radius);
    }
    
    //--------- Getters and Setters ---------
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        if(center != null)
            this.center = center;
        
        
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0)
            this.radius = radius;
        
        
    }
    
        
    public static void setNormalColor(Color normalColor){
        Circle.normalColor = normalColor;
    }
    
    public static Color getNormalColor(){
        if(Circle.normalColor == null)
            Circle.normalColor = Circle.DEFAULT_NORMAL_COLOR;
        return Circle.normalColor;
    }
    
    public static void setMouseOverColor(Color mouseOverColor){
        Circle.mouseOverColor = mouseOverColor;
    }
    
    public static Color getMouseOverColor(){
        if(Circle.mouseOverColor == null)
            Circle.mouseOverColor = Circle.DEFAULT_MOUSE_OVER_COLOR;
        return Circle.mouseOverColor;
    }

    
    //--------- useful methods ---------
    public static boolean validCircle(Point Center, double radius){
        if(Center == null)
            return false;
        if(radius <= 0)
            return false;
        
        return true;
    }
    /**
     * returns the diameter of the circle
     * @return 
     */
    public double getDiametre(){
        return this.radius * 2;
    }
    

    //--------- Override methods --------- 
    // Object Class ----------------------
    @Override
    public String toString() {
       String s = "[ C: " +center+ ", r: " ;
           
        if(radius-(int)radius!=0)
            s+= radius;
        else
            s +=(int) radius;
        
        s+=" ]";
        
        return s;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.center);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.radius) ^ (Double.doubleToLongBits(this.radius) >>> 32));
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
        final Circle other = (Circle) obj;
        if (Double.doubleToLongBits(this.radius) != Double.doubleToLongBits(other.radius)) {
            return false;
        }
        if (!Objects.equals(this.center, other.center)) {
            return false;
        }
        return true;
    }

    // ELement Class ----------------------
    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public String getAbb() {
        return "C";
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
            setColor(Circle.getMouseOverColor());
        else
            setColor(this.getColorBackup());

    }
    
    //Figure Class ---------------------- 

    @Override
    public boolean contains(Point p){
        
        return  this.center.getDistance(p) <= this.radius ;
    }

    @Override
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String getElementDescription() {
        String des ="Type: "+getType()+
                "\nName: "+getName()+
                "\nCenter: "+this.center+
                "\nRadius: "+this.radius+
                "\nArea: "+getArea()+
                "\nPerimeter: "+getPerimeter();
        return des;
        
    }

    
}
