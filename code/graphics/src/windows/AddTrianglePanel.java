/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import javax.swing.JCheckBox;

/**
 *
 * @author agust
 */
public class AddTrianglePanel extends javax.swing.JPanel {

    /**
     * Creates new form addPointPanel
     */
    public AddTrianglePanel() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pointAX = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pointAY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pointBX = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pointBY = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pointCX = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pointCY = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        fill = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(500, 300));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout1.setAlignOnBaseline(true);
        jPanel4.setLayout(flowLayout1);

        jLabel2.setText("VertexA X");
        jPanel4.add(jLabel2);

        pointAX.setPreferredSize(new java.awt.Dimension(80, 28));
        pointAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointAXActionPerformed(evt);
            }
        });
        jPanel4.add(pointAX);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("(Ex: 1.8) ");
        jPanel4.add(jLabel6);

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel3.setText("VertexA Y");
        jPanel5.add(jLabel3);

        pointAY.setPreferredSize(new java.awt.Dimension(80, 28));
        jPanel5.add(pointAY);

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("(Ex: 1.8) ");
        jPanel5.add(jLabel7);

        jPanel1.add(jPanel5);

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel4.setText("VertexB X");
        jPanel6.add(jLabel4);

        pointBX.setPreferredSize(new java.awt.Dimension(80, 28));
        jPanel6.add(pointBX);

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("(Ex: 1.8) ");
        jPanel6.add(jLabel8);

        jPanel1.add(jPanel6);

        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout2.setAlignOnBaseline(true);
        jPanel7.setLayout(flowLayout2);

        jLabel5.setText("VertexB Y");
        jPanel7.add(jLabel5);

        pointBY.setPreferredSize(new java.awt.Dimension(80, 28));
        jPanel7.add(pointBY);

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("(Ex: 1.8) ");
        jPanel7.add(jLabel9);

        jPanel1.add(jPanel7);

        java.awt.FlowLayout flowLayout3 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout3.setAlignOnBaseline(true);
        jPanel9.setLayout(flowLayout3);

        jLabel10.setText("VertexC X");
        jPanel9.add(jLabel10);

        pointCX.setPreferredSize(new java.awt.Dimension(80, 28));
        jPanel9.add(pointCX);

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("(Ex: 1.8) ");
        jPanel9.add(jLabel11);

        jPanel1.add(jPanel9);

        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel12.setText("VertexC Y");
        jPanel10.add(jLabel12);

        pointCY.setPreferredSize(new java.awt.Dimension(80, 28));
        jPanel10.add(pointCY);

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("(Ex: 1.8) ");
        jPanel10.add(jLabel13);

        jPanel1.add(jPanel10);

        java.awt.FlowLayout flowLayout4 = new java.awt.FlowLayout();
        flowLayout4.setAlignOnBaseline(true);
        jPanel11.setLayout(flowLayout4);

        fill.setText("Fill");
        fill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillActionPerformed(evt);
            }
        });
        jPanel11.add(fill);

        jPanel1.add(jPanel11);

        add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jScrollPane1.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 204, 204));
        jTextArea1.setColumns(40);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea1.setRows(5);
        jTextArea1.setText("All the vertex formed by the points A, B, C \nhave to be differents and they can't be on the\nsame line.");
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel8.add(jScrollPane1);

        add(jPanel8, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void pointAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointAXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pointAXActionPerformed

    private void fillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillActionPerformed

    
    public double getPointAX() {
        return Double.parseDouble(pointAX.getText());
    }

    public double getPointAY() {
        return Double.parseDouble(pointAY.getText());
    }

    
    public double getPointBX() {
        return Double.parseDouble(pointBX.getText());
    }

    public double getPointBY() {
        return Double.parseDouble(pointBY.getText());
    }
    
    public double getPointCX() {
        return Double.parseDouble(pointCX.getText());
    }

    public double getPointCY() {
        return Double.parseDouble(pointCY.getText());
    }

    public boolean isFill() {
        return this.fill.isSelected();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox fill;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField pointAX;
    private javax.swing.JTextField pointAY;
    private javax.swing.JTextField pointBX;
    private javax.swing.JTextField pointBY;
    private javax.swing.JTextField pointCX;
    private javax.swing.JTextField pointCY;
    // End of variables declaration//GEN-END:variables
}
