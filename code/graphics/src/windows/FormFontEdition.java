/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import say.swing.JFontChooser;

/**
 *
 * @author agust
 */
public class FormFontEdition extends javax.swing.JDialog {

    /**
     * Creates new form FormFontEdition
     */
    public FormFontEdition(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.myParetn = (Init) parent;
        initButtonFonts();
        
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        listFont = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        axesFont = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Font");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        jLabel3.setText("List Font");
        jPanel4.add(jLabel3);

        listFont.setText(" ");
        listFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFontActionPerformed(evt);
            }
        });
        jPanel4.add(listFont);

        jPanel2.add(jPanel4);

        jLabel4.setText("Axes Font");
        jPanel5.add(jLabel4);

        axesFont.setText(" ");
        axesFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFontActionPerformed(evt);
            }
        });
        jPanel5.add(axesFont);

        jPanel2.add(jPanel5);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFontActionPerformed
        JFontChooser fc = new JFontChooser();
        JOptionPane.showMessageDialog(this, fc,"Please Choose a Font", JOptionPane.PLAIN_MESSAGE);
        
        JButton bt = (JButton) evt.getSource();
        if(bt.equals(this.listFont))
            this.myParetn.getList().setFont(fc.getSelectedFont());
        
        if(bt.equals(this.axesFont))
            this.myParetn.getGraphicSpace().setAxesFont(fc.getSelectedFont());
        
        initButtonFonts();
        this.myParetn.getGraphicSpace().repaint();
       //((Init)this.getParent()).getList().repaint();
    }//GEN-LAST:event_btFontActionPerformed

    
    private void initButtonFonts(){
        String text ="";
        Font f = null;
        
        //ListFont
        f = this.myParetn.getList().getFont();
        text = f.getFamily() + " - " + f.getStyle() + " - " +f.getSize();
        this.listFont.setText(text);
        
        //AxesFont
        f =  this.myParetn.getGraphicSpace().getAxesFont();
        text = f.getFamily() + " - " + f.getStyle() + " - " +f.getSize();
        this.axesFont.setText(text);
    }
    /**
     * @param args the command line arguments
     */
   
    Init myParetn;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton axesFont;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton listFont;
    // End of variables declaration//GEN-END:variables
}
