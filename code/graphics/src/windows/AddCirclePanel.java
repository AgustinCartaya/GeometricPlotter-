/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import javax.swing.JTextField;

/**
 *
 * @author agust
 */
public class AddCirclePanel extends javax.swing.JPanel {

    /**
     * Creates new form addPointPanel
     */
    public AddCirclePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        centerX = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        centerY = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        radius = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        fill = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(500, 300));
        setLayout(new java.awt.BorderLayout());

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jScrollPane1.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 204, 204));
        jTextArea1.setColumns(40);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea1.setRows(5);
        jTextArea1.setText("The radius have to be bigger than zero. ");
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel8.add(jScrollPane1);

        add(jPanel8, java.awt.BorderLayout.SOUTH);

        jPanel1.setLayout(new java.awt.GridLayout(2, 2));

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout1.setAlignOnBaseline(true);
        jPanel4.setLayout(flowLayout1);

        jLabel2.setText("Point X");
        jPanel4.add(jLabel2);

        centerX.setPreferredSize(new java.awt.Dimension(80, 28));
        centerX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centerXActionPerformed(evt);
            }
        });
        jPanel4.add(centerX);

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("(Ex: 1.8) ");
        jPanel4.add(jLabel4);

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel3.setText("Point Y");
        jPanel5.add(jLabel3);

        centerY.setPreferredSize(new java.awt.Dimension(80, 28));
        centerY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centerYActionPerformed(evt);
            }
        });
        jPanel5.add(centerY);

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("(Ex: 1.8) ");
        jPanel5.add(jLabel5);

        jPanel1.add(jPanel5);

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel8.setText("radius");
        jPanel7.add(jLabel8);

        radius.setPreferredSize(new java.awt.Dimension(80, 28));
        radius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiusActionPerformed(evt);
            }
        });
        jPanel7.add(radius);

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("(Ex: 1.8) ");
        jPanel7.add(jLabel9);

        jPanel1.add(jPanel7);

        java.awt.FlowLayout flowLayout3 = new java.awt.FlowLayout();
        flowLayout3.setAlignOnBaseline(true);
        jPanel11.setLayout(flowLayout3);

        fill.setText("Fill");
        fill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillActionPerformed(evt);
            }
        });
        jPanel11.add(fill);

        jPanel1.add(jPanel11);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void centerYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centerYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_centerYActionPerformed

    public double getCenterX() {
        return Double.parseDouble(centerX.getText());
    }

    public double getCenterY() {
        return Double.parseDouble(centerY.getText());
    }
    
    public double getRadius() {
        return Double.parseDouble(radius.getText());
    }

    public boolean isFill() {
        return this.fill.isSelected();
    }

    private void centerXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centerXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_centerXActionPerformed

    private void radiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiusActionPerformed

    private void fillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField centerX;
    private javax.swing.JTextField centerY;
    private javax.swing.JCheckBox fill;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField radius;
    // End of variables declaration//GEN-END:variables
}
