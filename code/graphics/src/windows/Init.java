/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import elements.Abstract;
import graphicSpaces.Space2D;
import graphicSpaces.GraphicSpace;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import elements.Point;
import elements.Circle;
import elements.Element;
import elements.Graphicable;
import elements.Triangle;
import elements.Rectangle;
import elements.Line;
import java.util.ArrayList;
import shortcuts.Sc;

/**
 *
 * @author agust
 */
public final class Init extends javax.swing.JFrame {

    /**
     * Creates new form Init
     */
    

    public Init() {
        
        initComponents();
        initGrapichSpace();
        initElementList();
        this.setLocationRelativeTo(null);
 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        elementsList = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbAdd = new javax.swing.JButton();
        jbClear = new javax.swing.JButton();
        jbClearAll = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lock = new javax.swing.JRadioButton();
        unlock = new javax.swing.JRadioButton();
        jpanelCenter = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        axesVisibility = new javax.swing.JCheckBox();
        gridVisibility = new javax.swing.JCheckBox();
        labelsVisibility = new javax.swing.JCheckBox();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addDefaultElements = new javax.swing.JMenuItem();
        showElementDescriptions = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        showColorsForm = new javax.swing.JMenuItem();
        showFontform = new javax.swing.JMenuItem();
        showMouseform = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(1, 1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 130));

        elementsList.setForeground(new java.awt.Color(51, 51, 51));
        elementsList.setSelectionBackground(new java.awt.Color(204, 204, 204));
        elementsList.setSelectionForeground(new java.awt.Color(51, 51, 51));
        elementsList.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                elementsListMouseMoved(evt);
            }
        });
        elementsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elementsListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(elementsList);

        jPanel3.add(jScrollPane1);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.GridLayout(2, 1));

        jPanel2.setLayout(new java.awt.GridLayout(1, 3));

        jbAdd.setText("Add");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });
        jPanel2.add(jbAdd);

        jbClear.setText("Clear");
        jbClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearActionPerformed(evt);
            }
        });
        jPanel2.add(jbClear);

        jbClearAll.setText("Clear all");
        jbClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearAllActionPerformed(evt);
            }
        });
        jPanel2.add(jbClearAll);

        jPanel4.add(jPanel2);

        buttonGroup1.add(lock);
        lock.setText("Lock");
        lock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockActionPerformed(evt);
            }
        });
        jPanel6.add(lock);

        buttonGroup1.add(unlock);
        unlock.setSelected(true);
        unlock.setText("Unlock");
        unlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockActionPerformed(evt);
            }
        });
        jPanel6.add(unlock);

        jPanel4.add(jPanel6);

        jPanel1.add(jPanel4, java.awt.BorderLayout.SOUTH);

        jSplitPane1.setLeftComponent(jPanel1);

        jpanelCenter.setLayout(new java.awt.BorderLayout());

        axesVisibility.setSelected(true);
        axesVisibility.setText("Axes");
        axesVisibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                axesVisibilityActionPerformed(evt);
            }
        });
        jPanel5.add(axesVisibility);

        gridVisibility.setSelected(true);
        gridVisibility.setText("Grids");
        gridVisibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridVisibilityActionPerformed(evt);
            }
        });
        jPanel5.add(gridVisibility);

        labelsVisibility.setSelected(true);
        labelsVisibility.setText("Labels");
        labelsVisibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelsVisibilityActionPerformed(evt);
            }
        });
        jPanel5.add(labelsVisibility);

        jpanelCenter.add(jPanel5, java.awt.BorderLayout.SOUTH);

        jSplitPane1.setRightComponent(jpanelCenter);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Graphics");

        addDefaultElements.setText("Add default Elements");
        addDefaultElements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDefaultElementsActionPerformed(evt);
            }
        });
        jMenu1.add(addDefaultElements);

        showElementDescriptions.setText("Elements Description");
        showElementDescriptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showElementDescriptionsActionPerformed(evt);
            }
        });
        jMenu1.add(showElementDescriptions);

        menuBar.add(jMenu1);

        jMenu2.setText("Preferences");

        showColorsForm.setText("Colors");
        showColorsForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showColorsFormActionPerformed(evt);
            }
        });
        jMenu2.add(showColorsForm);

        showFontform.setText("Fonts");
        showFontform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFontformActionPerformed(evt);
            }
        });
        jMenu2.add(showFontform);

        showMouseform.setText("Mouse");
        showMouseform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMouseformActionPerformed(evt);
            }
        });
        jMenu2.add(showMouseform);

        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearAllActionPerformed
        this.space2D.resetSpace();
        this.graphicSpace.repaint();
        
        initElementList();
    }//GEN-LAST:event_jbClearAllActionPerformed

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
       if(this.lastTypeAdded == null || this.lastTypeAdded.equals(""))
           this.lastTypeAdded = "Point";
        new FormAddElement(this,true,lastTypeAdded);
    }//GEN-LAST:event_jbAddActionPerformed

    private void showElementDescriptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showElementDescriptionsActionPerformed

        new ElementsDescriptionPanel(this,false);
    }//GEN-LAST:event_showElementDescriptionsActionPerformed

    private void axesVisibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_axesVisibilityActionPerformed
        this.graphicSpace.setAxesVisibility( this.axesVisibility.isSelected());
        this.graphicSpace.repaint();
    }//GEN-LAST:event_axesVisibilityActionPerformed

    private void gridVisibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridVisibilityActionPerformed
        this.graphicSpace.setGridVisibility( this.gridVisibility.isSelected());
        this.graphicSpace.repaint();
    }//GEN-LAST:event_gridVisibilityActionPerformed

    private void labelsVisibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelsVisibilityActionPerformed
       this.graphicSpace.setLabelsVisibility( this.labelsVisibility.isSelected());
       this.graphicSpace.repaint();
    }//GEN-LAST:event_labelsVisibilityActionPerformed

    private void addDefaultElementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDefaultElementsActionPerformed
       addDefaultElements();
    }//GEN-LAST:event_addDefaultElementsActionPerformed

    private void jbClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearActionPerformed
        //System.out.println("tamanio " +  this.dlm.getSize() );

        
        int[] x =this.elementsList.getSelectedIndices();
        for(int i = x.length - 1 ; i>=0; i--){
                        //System.out.println("Eliminando " +i);
                        GraphicElementList ele = (GraphicElementList)dlm.elementAt(x[i]);
            this.space2D.removeElement(ele.getElement());            
            this.dlm.remove(x[i]);

        }



        this.graphicSpace.repaint();
    }//GEN-LAST:event_jbClearActionPerformed

    private void elementsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elementsListMouseClicked
       
        if(this.dlm.size()>0){
            
        
           if (evt.getClickCount() == 2) {

               // Double-click detected
               int index = this.elementsList.locationToIndex(evt.getPoint());
                Element element = ((GraphicElementList)this.dlm.getElementAt(index)).getElement();
                if(element instanceof Graphicable)
                    ((Graphicable)element).setVisible(! ((Graphicable)element).isVisible());

               this.graphicSpace.repaint();
              // System.out.println(list.getModel().getElementAt(index));
           }
        }
    }//GEN-LAST:event_elementsListMouseClicked

    private void elementsListMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elementsListMouseMoved
        if(this.dlm.size()>0){
            int index = this.elementsList.locationToIndex(evt.getPoint());
            Element element = ((GraphicElementList)this.dlm.getElementAt(index)).getElement();
            for(Element e: this.space2D.getElements()){
                
                 if(element instanceof Graphicable)
                     ((Graphicable)e).setMouseOver(element.equals(e));
                 else if (element instanceof Abstract)
                     ((Abstract)e).setListMouseOver(element.equals(e));
            }
                    
            this.elementsList.repaint();
            this.graphicSpace.repaint();

        }
        
    }//GEN-LAST:event_elementsListMouseMoved

    private void showColorsFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showColorsFormActionPerformed
        new FormColorEdition(this,false);

    }//GEN-LAST:event_showColorsFormActionPerformed

    private void showFontformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFontformActionPerformed
        new FormFontEdition(this, false);
    }//GEN-LAST:event_showFontformActionPerformed

    private void showMouseformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMouseformActionPerformed
        new FormMouseEdition(this, false);
    }//GEN-LAST:event_showMouseformActionPerformed

    private void lockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockActionPerformed
       boolean isLock = this.unlock.isSelected();
           this.jbAdd.setEnabled(isLock);
           this.jbClear.setEnabled(isLock);
           this.jbClearAll.setEnabled(isLock);
           this.addDefaultElements.setEnabled(isLock);
       
       
    }//GEN-LAST:event_lockActionPerformed
    
    public void addElement(Element e){
        //this.elementsList.getModel().
        this.space2D.addElement(e);
        this.graphicSpace.repaint();
        dlm.addElement(new GraphicElementList (e));
        lastTypeAdded = e.getType();
    }
    
    public ArrayList<Element> getAllElements(){
        if(this.dlm.size() == this.space2D.getSize())
            return this.space2D.getElements();
        return null;
    }

    public void addDefaultElements(){
        try{
            double maxX = this.graphicSpace.getWidth()/64-1;

            double maxY = this.graphicSpace.getHeight()/64-1;


            Point p1 = new Point(Sc.rmd(-maxX, maxX, 2),Sc.rmd(-maxY, maxY, 2));
            p1.setNewColor(new Color(Sc.rmd(0,255),Sc.rmd(0,255),Sc.rmd(0,255)));
            p1.setVisible(false);

            Point p2 = new Point(Sc.rmd(-maxX, maxX, 2),Sc.rmd(-maxY, maxY, 2));
            p2.setNewColor(new Color(Sc.rmd(0,255),Sc.rmd(0,255),Sc.rmd(0,255)));


            Point p3 = new Point(Sc.rmd(-maxX, maxX, 2),Sc.rmd(-maxY, maxY, 2));
            p3.setNewColor(new Color(Sc.rmd(0,255),Sc.rmd(0,255),Sc.rmd(0,255)));

            Point p4 = new Point(Sc.rmd(-maxX, maxX, 2),Sc.rmd(-maxY, maxY, 2));

            Line l1 = new Line(p1,p4);
            l1.setNewColor(new Color(Sc.rmd(0,255),Sc.rmd(0,255),Sc.rmd(0,255)));

            Line l2 = new Line(p2,p3);

            Circle c1 = new Circle ( p1, Sc.rmd(0.5,3.0,2) );      
            c1.setNewColor(new Color(Sc.rmd(0,255),Sc.rmd(0,255),Sc.rmd(0,255)));
            c1.setFill(true);

            Circle c2 = new Circle ( p2, Sc.rmd(0.5,3.0,2));
            c2.setNewColor(new Color(Sc.rmd(0,255),Sc.rmd(0,255),Sc.rmd(0,255)));


            Triangle t1 = new Triangle (p1,p2,p3);
            t1.setNewColor(new Color(Sc.rmd(0,255),Sc.rmd(0,255),Sc.rmd(0,255)));
            t1.setFill(true);
            
            Rectangle r1 = new Rectangle (p4, Sc.rmd(0.1,maxX,2), Sc.rmd(0.1,maxX,2) );
            r1.setFill(true);

            addElement(p1);
            addElement(p2);
            addElement(p3);
            addElement(p4);
            addElement(c1);
            addElement(c2);
            addElement(l1);
            addElement(l2);
            addElement(t1);
            addElement(r1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, Sc.firstToUpper(e.getMessage()) + "\nElements not created", "Sorry we have problems", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void initGrapichSpace(){
        space2D = new Space2D();
        this.graphicSpace = new GraphicSpace( space2D );
        this.jpanelCenter.add(graphicSpace, BorderLayout.CENTER);
        this.graphicSpace.repaint();
    }
    
    public void initElementList(){

        dlm = new DefaultListModel();
        this.elementsList.setModel(dlm);
        this.elementsList.setCellRenderer(new GraphicElementCellRendered());
        
        //System.out.println(((GraphicElementCellRendered)this.elementsList.getCellRenderer()).getMouseOver());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Init.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Init.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Init.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Init.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Init().setVisible(true);
            }
        });
    }
    
  
    public GraphicSpace getGraphicSpace(){
        return this.graphicSpace;
    }
    
    public JList<String> getList(){
        return this.elementsList;
    }
    

    
    
    private DefaultListModel dlm;
    private Space2D space2D;
    private GraphicSpace graphicSpace;
    private String lastTypeAdded;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addDefaultElements;
    private javax.swing.JCheckBox axesVisibility;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JList<String> elementsList;
    private javax.swing.JCheckBox gridVisibility;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbClear;
    private javax.swing.JButton jbClearAll;
    private javax.swing.JPanel jpanelCenter;
    private javax.swing.JCheckBox labelsVisibility;
    private javax.swing.JRadioButton lock;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem showColorsForm;
    private javax.swing.JMenuItem showElementDescriptions;
    private javax.swing.JMenuItem showFontform;
    private javax.swing.JMenuItem showMouseform;
    private javax.swing.JRadioButton unlock;
    // End of variables declaration//GEN-END:variables
}
