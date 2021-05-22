/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicSpaces;

import elements.Circle;
import elements.Element;
import elements.Triangle;
import elements.Line;
import elements.Graphicable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import javax.swing.JButton;
import javax.swing.JPanel;
import elements.Point;
import elements.Rectangle;
import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.lang.model.util.Elements;
import shortcuts.Sc;

/**
 *
 * @author agust
 */
public class GraphicSpace extends JPanel{
    
    private SpaceType space;
    
    private Color colorAxes,
                  colorLabels,
                  colorGrid;
    
    private boolean axesVisibility,
                    gridVisibility,
                    labelsVisibility;

    private double lineWidth,
                   pointWidth,
                   fillTransparence; 

    private Font defaultFont,
                 axesFont;
    
    private int zoom = 32,
                positionW = 0,
                positionH = 0,
                mouseSpeed = 10,
                normalSeparation = 32;
    

    
      
    /**
     * Constructor
     * @param space 
     */
    public GraphicSpace( SpaceType space ){
        
        this.space = space;
        this.axesVisibility = true;
        this.gridVisibility = true;
        this.labelsVisibility = true;
        setDefaultsColors();
        this.lineWidth = 2;
        setPointWidth(1);
        this.fillTransparence = 0.5;
        this.defaultFont = this.getFont();
        this.axesFont = this.defaultFont;
        this.zoom = this.zoom;
        this.addMouseWheelListener( new GraphicSpaceMouseEvents());

    }
    
    
    
    public Font getDefaultFont() {
        return defaultFont;
    }

    public void setDefaultFont(Font defaultFont) {
        this.defaultFont = defaultFont;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public int getPositionW() {
        return positionW;
    }

    public void setPositionW(int positionW) {
        this.positionW = positionW;
    }

    public int getPositionH() {
        return positionH;
    }

    public void setPositionH(int positionH) {
        this.positionH = positionH;
    }

    public int getMouseSpeed() {
        return mouseSpeed;
    }

    public void setMouseSpeed(int mouseSpeed) {
        this.mouseSpeed = mouseSpeed;
    }

    public Font getAxesFont() {
        return axesFont;
    }

    public void setAxesFont(Font axesFont) {
        this.axesFont = axesFont;
    }
    
    public double getFillTransparence() {
        return fillTransparence;
    }

    public void setFillTransparence(double fillTransparence) {

        if(fillTransparence < 0)
            fillTransparence = 0;
        else if (fillTransparence > 1)
            fillTransparence = 1;

        this.fillTransparence = fillTransparence;
    }
    
    public boolean isAxesVisibility() {
        return axesVisibility;
    }

    public void setAxesVisibility(boolean axesVisibility) {
        this.axesVisibility = axesVisibility;
    }

    public boolean isGridVisibility() {
        return gridVisibility;
    }

    public void setGridVisibility(boolean gridVisibility) {
        this.gridVisibility = gridVisibility;
    }

    public boolean isLabelsVisibility() {
        return labelsVisibility;
    }

    public void setLabelsVisibility(boolean labelsVisibility) {
        this.labelsVisibility = labelsVisibility;
    }


    
    public void setDefaultsColors(){
        this.colorAxes = Color.BLACK;
        this.colorLabels = Color.RED;
        this.colorGrid = new Color( 200,200,200);
        setBackground(Color.WHITE);
    }
    
    
    public Color getColorAxes() {
        return colorAxes;
    }

    public void setColorAxes(Color colorAxes) {
        this.colorAxes = colorAxes;
    }

    public Color getColorLabels() {
        return colorLabels;
    }

    public void setColorLabels(Color colorLabels) {
        this.colorLabels = colorLabels;
    }

    public Color getColorGrid() {
        return colorGrid;
    }

    public void setColorGrid(Color colorGrid) {
        this.colorGrid = colorGrid;
    }

    public double getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
    }

    public double getPointWidth() {
        return pointWidth;
    }

    public void setPointWidth(double pointWidth) {
        this.pointWidth = pointWidth * 8;
    }
    
    
    /**
     * method in charge of painting all the elements 
     * @param g 
     */
    @Override
    public void paint(Graphics g){
        
        super.paint(g);
        if(this.space instanceof Space2D ){
            Space2D space2D = (Space2D)space;
            Graphics2D g2 = (Graphics2D)g;
            
            g2.translate(this.getWidth()/2 + positionW, this.getHeight()/2 + positionH);
            
            
            

            //drawing axes
            if(this.gridVisibility || this.labelsVisibility){
                
                g2.setFont(this.axesFont);
                //Horizontal grids
               for(int i = 0; i<=this.getHeight()/2; i+=this.zoom ){
               // for(int i = -this.getHeight()/2 - this.positionH; i<=this.getHeight()/2 -this.positionW; i+=this.zoom ){
                  
                   // for(int i = 0; i<=this.getHeight()/(2*this.zoom); i++ ){
                    if(this.gridVisibility){
                        g2.setColor( this.colorGrid);
                      //g2.drawLine(-this.getWidth()/2 - this.positionW, i * (this.zoom)-this.positionH, this.getWidth()/2 - this.positionW, i * this.zoom -this.positionH);
                      //g2.drawLine(-this.getWidth()/2 - this.positionW, -i * (this.zoom)-this.positionH, this.getWidth()/2 - this.positionW, -i * this.zoom-this.positionH);
                      // g2.drawLine(-this.getWidth()/2 - this.positionW, i, this.getWidth()/2 - this.positionW, i);

                       //top grids
                        g2.drawLine(-this.getWidth()/2 - this.positionW, i , this.getWidth()/2 - this.positionW, i );
                        //bottom grids
                        g2.drawLine(-this.getWidth()/2 - this.positionW, -i, this.getWidth()/2 - this.positionW, -i);    
                    }

                    if(this.labelsVisibility && i!=0){
                        g2.setColor(this.colorLabels);
                        g2.drawString(""+i/this.zoom, -15, (-i)+5);
                        g2.drawString("-"+i/this.zoom, -15, i+5);
                    }
                }
                //Vertical grids
                for(int i = 0; i<=this.getWidth()/2; i+=this.zoom ){
                    
                
                    if(this.gridVisibility){
                        g2.setColor(this.colorGrid);
                        g2.drawLine(i, -this.getHeight()/2 - this.positionH , i , this.getHeight()/2  - this.positionH);
                        g2.drawLine(-i, -this.getHeight()/2 - this.positionH , -i, this.getHeight()/2  - this.positionH );
                    }

                    if(this.labelsVisibility && i!=0){
                        g2.setColor(this.colorLabels);
                        g2.drawString("-"+i/this.zoom, -i-5, 15);
                        g2.drawString(""+i/this.zoom, i-5, 15);
                    }
                }
                g2.setFont(this.defaultFont);
                
             }
            
            if(this.axesVisibility){
                g2.setColor(this.colorAxes);
                //Horizontal Axes
                g2.drawLine(-this.getWidth()/2 - this.positionW, 0, this.getWidth()/2- this.positionW, 0);
                //System.out.println(-this.getWidth()/2 + this.positionW + "  buscando");
                //Vertical Axes
                g2.drawLine(0, -this.getHeight()/2 - this.positionH, 0, this.getHeight()/2 -this.positionH);
            }

            
            
            //drawing components
           
            for(Element element: space2D.getElements()){
                
                if(element instanceof Graphicable && ((Graphicable)element).isVisible()){
                    g2.setColor(((Element) element).getColor());
                    //g2.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL));
                    switch (element.getType().toLowerCase()){

                        case "point":
                            Point p =(Point)element;
                            g2.fillOval((int)(p.getX()* this.zoom-this.pointWidth/2),
                                        (int)(p.getY()* ( -this.zoom ) -this.pointWidth/2),
                                        (int)this.pointWidth,
                                        (int)(this.pointWidth));
               
                            break;

                        case "line":
                            g2.setStroke( new BasicStroke( (float) this.lineWidth) );
                            Line l = (Line)element;
                            g2.drawLine((int)(l.getPointA().getX()* this.zoom), (int)(l.getPointA().getY()* ( -this.zoom ) ),
                                            (int)(l.getPointB().getX()* this.zoom), (int)(l.getPointB().getY()* ( -this.zoom ) ));
                            g2.setStroke( new BasicStroke( 1 ) );    
                            break;

                        case "circle":
                            
                               Circle c = (Circle)element;
                               if(c.isFill()){
                                     g2.setColor(Sc.alphaColor(c.getColor(), this.fillTransparence));
                                     g2.fillOval((int)((c.getCenter().getX() - c.getRadius())* this.zoom),
                                           (int)((c.getCenter().getY()+c.getRadius())* ( -this.zoom ) ),
                                           (int)(c.getRadius() * 2 * this.zoom),
                                           (int)(c.getRadius() * 2 * this.zoom) );
                               }
                               else{
                                        g2.drawOval((int)((c.getCenter().getX() - c.getRadius())* this.zoom),
                                           (int)((c.getCenter().getY() + c.getRadius())* ( -this.zoom ) ),
                                           (int)(c.getRadius() * 2 * this.zoom),
                                           (int)(c.getRadius() * 2 * this.zoom) );
                               }
                                   
                            
                            break;


                        case "triangle":
                            
                            Triangle t = (Triangle)element;                
                            int[]x = new int  []{(int)(t.getPointA().getX()* this.zoom),(int)(t.getPointB().getX()* this.zoom),(int)(t.getPointC().getX()* this.zoom)};
                            int[]y = new int  []{(int)(t.getPointA().getY()* ( -this.zoom ) ),(int)(t.getPointB().getY()* ( -this.zoom ) ),(int)(t.getPointC().getY()* ( -this.zoom ) )};

                            Shape s = new Polygon(x,y,3);

                            if(t.isFill()){
                                g2.setColor(Sc.alphaColor(t.getColor(), this.fillTransparence));
                                g2.fill(s);
                            }    
                            else
                                g2.draw(s);
                            
                            break;
                            
                        case "rectangle":
                            Rectangle r = (Rectangle)element;   
                            if(r.isFill()){
                                g2.setColor(Sc.alphaColor(r.getColor(), this.fillTransparence));
                                g2.fillRect((int)(r.getInitialPoint().getX()* this.zoom),
                                            (int)(r.getInitialPoint().getY()* this.zoom),
                                            (int)(r.getWidth()* this.zoom),
                                            (int)(r.getHeight()* this.zoom));
                            }    
                            else
                                g2.drawRect((int)(r.getInitialPoint().getX()* this.zoom),
                                            (int)(r.getInitialPoint().getY()* this.zoom),
                                            (int)(r.getWidth()* this.zoom),
                                            (int)(r.getHeight()* this.zoom));
                            
                            break;


                    }
                }
            }
            

        }
       
        
    }
    
    private class GraphicSpaceMouseEvents implements MouseWheelListener{

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            if (e.isControlDown())
                if (e.getWheelRotation() > 0) 
                    positionW +=mouseSpeed;
                else
                     positionW-=mouseSpeed;
            else if(e.isShiftDown())
                if (e.getWheelRotation() > 0) 
                    positionH +=mouseSpeed;
                else
                     positionH-=mouseSpeed;
            else
                if (e.getWheelRotation() > 0) 
                    zoom = (zoom <= mouseSpeed )?1:zoom - mouseSpeed;
                else 
                    zoom=(zoom > 200)?200:zoom+mouseSpeed;
            System.out.println(positionH);
            repaint();
        }
            
            
    }
    
}
