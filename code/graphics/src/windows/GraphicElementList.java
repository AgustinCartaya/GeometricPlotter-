/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import elements.Element;
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author agust
 */
public class GraphicElementList {
    
    private String value;
    private ImageIcon icon;
    private Element element;
    
    public GraphicElementList(Element element){
  
        this.value = element.getName()+ " " + element.toString();
        Image img = new ImageIcon("src/sources/" + element.getType().toLowerCase()+"1.gif").getImage();
        this.icon = new ImageIcon(img.getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        this.element = element;
    }
    
    public String getValue() {
      return value;
   }
  
   public ImageIcon getIcon() {
      return icon;
   }

   public Element getElement(){
       return this.element;
   }
   
    @Override
   public String toString() {
      return value;
   }
    
}
