/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import elements.Abstract;
import elements.Graphicable;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import shortcuts.Sc;


/**
 *
 * @author agust
 */
public class GraphicElementCellRendered  extends JLabel implements ListCellRenderer{
    
    private Color visibleElementColor,
                  abstractElementColor;


    public GraphicElementCellRendered(){
       //this.mouseOverColor = new Color(121,235,187);
       this.visibleElementColor = new Color(141,255,207);
       this.abstractElementColor = Color.PINK;
    }
    

    public Color getVisibleElementColor() {
        return visibleElementColor;
    }

    public void setVisibleElementColor(Color visibleElementColor) {
        this.visibleElementColor = visibleElementColor;
    }
    
    public Color getAbstractElementColor() {
        return abstractElementColor;
    }

    public void setAbstractElementColor(Color visibleAbstractElementColor) {
        this.abstractElementColor = visibleAbstractElementColor;
    }


    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        GraphicElementList entry = (GraphicElementList) value;
  
      setText(index + "  "+ value.toString());
      setIcon(entry.getIcon());
   

      

          
        if (isSelected) {
         setBackground(list.getSelectionBackground());
         setForeground(list.getSelectionForeground());
        }
        else {
            if( entry.getElement() instanceof Graphicable){
                Graphicable g = ((Graphicable)entry.getElement());
                if(g.isVisible())
                  setBackground(this.visibleElementColor);
                else
                  setBackground(list.getBackground());

                  if(g.isMouseOver())
                        setBackground(Sc.alphaColor(getBackground(), 0.6,true));
               setForeground(list.getForeground());
            }
            else{
                Abstract a = ((Abstract)entry.getElement());
                if(a.isListMouseOver())
                    setBackground(Sc.alphaColor(getBackground(), 0.6,true));
                else
                    setBackground(this.abstractElementColor);
            }
        }
      
      
  
      setEnabled(list.isEnabled());
      setFont(list.getFont());
      setOpaque(true);
  
      return this;
   }
    
}
