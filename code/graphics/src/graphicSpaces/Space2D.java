/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicSpaces;

import elements.Element;
import elements.Element;
import elements.Graphicable;
import java.util.ArrayList;

/**
 *
 * @author agust
 */
public class Space2D extends SpaceType{
    
    private double scaleX;
    private double scaleY;
    
    private ArrayList <Element> elements;
    
    private int indexPoint,
                indexLine,
                indexCircle,
                indexTriangle,
                indexRectangle;
    

    public Space2D(double scaleX, double scaleY) {
        if(scaleX > 0 && scaleY > 0){
            this.scaleX = scaleX;
            this.scaleY = scaleY;
             
            this.elements = new ArrayList <Element>();
            this.indexCircle = 0;
            this.indexLine = 0;
            this.indexPoint = 0;
            this.indexTriangle = 0;
             this.indexRectangle = 0;
          /*  points = new ArrayList <Point>();
            lines = new ArrayList <Line>();
            circles = new ArrayList <Circle>();
            triangles = new ArrayList <Triangle>();*/
        }
       
    }
    
    public Space2D(){
        this(1,1);
    }

    public double getScaleX() {
        return scaleX;
    }

    public void setScaleX(double scaleX) {
        if(scaleX > 0)
            this.scaleX = scaleX;
    }

    public double getScaleY() {
        return scaleY;
    }

    public void setScaleY(double scaleY) {
        if(scaleY > 0)
            this.scaleY = scaleY;
    }
    
    
    public ArrayList<Element> getElements() {
        return elements;
    }
    
    public void addElement(Element element) {
        String elementName = element.getAbb();
        
        switch(element.getType().toLowerCase()){
            
            case "point":
                elementName += (++this.indexPoint);
                break;
                
            case "line":
                elementName += (++this.indexLine);
                break;
                
            case "triangle":
                elementName += (++this.indexTriangle);
                break;
                
            case "rectangle":
                elementName += (++this.indexRectangle);
                break;
                
            case "circle":
                elementName += (++this.indexCircle);
                break;
                

        }
        this.elements.add(element);
        element.setName(elementName);
        
    }
    
    public int getSize(){
        return this.elements.size();
    }
    
    public void removeElement(int index){
        if(index >= 0 && index < getSize())
            this.elements.remove(index);
    }
    
    public void removeElement(Element element){
        if(this.elements.contains(element))
            this.elements.remove(element);
    }
    
    public void removeElement(String name){
        int i=0;
        boolean eliminado = false;
        while(!eliminado){
            if(this.elements.get(i).getName().equals(name))
               this.elements.remove(i);
            i++;
        }
    }
    
   
    public void addElements(ArrayList<Element> elements){
        for(Element e: elements){
            this.elements.add(e);
        }
    }
    

    @Override
    public int getnSpace() {
        return 2;
    }

    @Override
    public void resetSpace() {
        this.elements.clear();
       /* points.clear();
        lines.clear();
        circles.clear();
        triangles.clear();*/
        
    }
    
    
    
    public int getOver(){
        int i =0;
        for(Element g: this.elements){
            if(((Graphicable)g).isMouseOver())
                i++;
        }
    return i;
    }
    
}
