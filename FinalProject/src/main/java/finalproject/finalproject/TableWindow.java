/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.finalproject;

import java.awt.Color;

/**
 *
 * @author qazwsx922
 */
public class TableWindow extends javax.swing.JFrame {

    /**
     * Creates new form TableWindow
     */
    public TableWindow() {
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

        T1 = new javax.swing.JPanel();
        T3 = new javax.swing.JPanel();
        T4 = new javax.swing.JPanel();
        T2 = new javax.swing.JPanel();
        SetFreeT1 = new javax.swing.JButton();
        SetDirtyT1 = new javax.swing.JButton();
        SetUsedT1 = new javax.swing.JButton();
        SetFreeT2 = new javax.swing.JButton();
        SetDirtyT2 = new javax.swing.JButton();
        SetUsedT2 = new javax.swing.JButton();
        SetFreeT3 = new javax.swing.JButton();
        SetDirtyT3 = new javax.swing.JButton();
        SetUsedT3 = new javax.swing.JButton();
        SetUsedT4 = new javax.swing.JButton();
        SetFreeT4 = new javax.swing.JButton();
        SetDirtyT4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T1.setBackground(new java.awt.Color(255, 255, 255));
        T1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout T1Layout = new javax.swing.GroupLayout(T1);
        T1.setLayout(T1Layout);
        T1Layout.setHorizontalGroup(
            T1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        T1Layout.setVerticalGroup(
            T1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        getContentPane().add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 90));

        T3.setBackground(new java.awt.Color(255, 255, 255));
        T3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout T3Layout = new javax.swing.GroupLayout(T3);
        T3.setLayout(T3Layout);
        T3Layout.setHorizontalGroup(
            T3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        T3Layout.setVerticalGroup(
            T3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        getContentPane().add(T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 140, 90));

        T4.setBackground(new java.awt.Color(255, 255, 255));
        T4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout T4Layout = new javax.swing.GroupLayout(T4);
        T4.setLayout(T4Layout);
        T4Layout.setHorizontalGroup(
            T4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        T4Layout.setVerticalGroup(
            T4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        getContentPane().add(T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 140, 90));

        T2.setBackground(new java.awt.Color(255, 255, 255));
        T2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout T2Layout = new javax.swing.GroupLayout(T2);
        T2.setLayout(T2Layout);
        T2Layout.setHorizontalGroup(
            T2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        T2Layout.setVerticalGroup(
            T2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        getContentPane().add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, 90));

        SetFreeT1.setText("Set Free");
        SetFreeT1.setPreferredSize(new java.awt.Dimension(98, 29));
        SetFreeT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetFreeT1ActionPerformed(evt);
            }
        });
        getContentPane().add(SetFreeT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 80, -1));

        SetDirtyT1.setText("Set Dirty");
        SetDirtyT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDirtyT1ActionPerformed(evt);
            }
        });
        getContentPane().add(SetDirtyT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 80, -1));

        SetUsedT1.setText("Set Used");
        SetUsedT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUsedT1ActionPerformed(evt);
            }
        });
        getContentPane().add(SetUsedT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 80, 30));

        SetFreeT2.setText("Set Free");
        SetFreeT2.setPreferredSize(new java.awt.Dimension(98, 29));
        SetFreeT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetFreeT2ActionPerformed(evt);
            }
        });
        getContentPane().add(SetFreeT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 80, -1));

        SetDirtyT2.setText("Set Dirty");
        SetDirtyT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDirtyT2ActionPerformed(evt);
            }
        });
        getContentPane().add(SetDirtyT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 80, -1));

        SetUsedT2.setText("Set Used");
        SetUsedT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUsedT2ActionPerformed(evt);
            }
        });
        getContentPane().add(SetUsedT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 80, 30));

        SetFreeT3.setText("Set Free");
        SetFreeT3.setPreferredSize(new java.awt.Dimension(98, 29));
        SetFreeT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetFreeT3ActionPerformed(evt);
            }
        });
        getContentPane().add(SetFreeT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 80, -1));

        SetDirtyT3.setText("Set Dirty");
        SetDirtyT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDirtyT3ActionPerformed(evt);
            }
        });
        getContentPane().add(SetDirtyT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 80, -1));

        SetUsedT3.setText("Set Used");
        SetUsedT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUsedT3ActionPerformed(evt);
            }
        });
        getContentPane().add(SetUsedT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 80, 30));

        SetUsedT4.setText("Set Used");
        SetUsedT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUsedT4ActionPerformed(evt);
            }
        });
        getContentPane().add(SetUsedT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 80, 30));

        SetFreeT4.setText("Set Free");
        SetFreeT4.setPreferredSize(new java.awt.Dimension(98, 29));
        SetFreeT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetFreeT4ActionPerformed(evt);
            }
        });
        getContentPane().add(SetFreeT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 80, -1));

        SetDirtyT4.setText("Set Dirty");
        SetDirtyT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDirtyT4ActionPerformed(evt);
            }
        });
        getContentPane().add(SetDirtyT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetFreeT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetFreeT1ActionPerformed
         // TODO add your handling code here:
         T1.setBackground(Color.green);
         
        
         
    }//GEN-LAST:event_SetFreeT1ActionPerformed

    private void SetDirtyT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetDirtyT1ActionPerformed
        // TODO add your handling code here:
        T1.setBackground(Color.yellow);
    }//GEN-LAST:event_SetDirtyT1ActionPerformed

    private void SetFreeT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetFreeT2ActionPerformed
        // TODO add your handling code here:
        T2.setBackground(Color.green);
    }//GEN-LAST:event_SetFreeT2ActionPerformed

    private void SetDirtyT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetDirtyT2ActionPerformed
        // TODO add your handling code here:
        T2.setBackground(Color.yellow);
    }//GEN-LAST:event_SetDirtyT2ActionPerformed

    private void SetFreeT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetFreeT3ActionPerformed
        // TODO add your handling code here:
        T3.setBackground(Color.green);
    }//GEN-LAST:event_SetFreeT3ActionPerformed

    private void SetDirtyT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetDirtyT3ActionPerformed
        // TODO add your handling code here:
        T3.setBackground(Color.yellow);
    }//GEN-LAST:event_SetDirtyT3ActionPerformed

    private void SetFreeT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetFreeT4ActionPerformed
        // TODO add your handling code here:
        T4.setBackground(Color.green);
    }//GEN-LAST:event_SetFreeT4ActionPerformed

    private void SetDirtyT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetDirtyT4ActionPerformed
        // TODO add your handling code here:
        T4.setBackground(Color.yellow);
    }//GEN-LAST:event_SetDirtyT4ActionPerformed

    private void SetUsedT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetUsedT1ActionPerformed
        // TODO add your handling code here:
        T1.setBackground(Color.red);
    }//GEN-LAST:event_SetUsedT1ActionPerformed

    private void SetUsedT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetUsedT2ActionPerformed
        // TODO add your handling code here:
        T2.setBackground(Color.red);
    }//GEN-LAST:event_SetUsedT2ActionPerformed

    private void SetUsedT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetUsedT3ActionPerformed
        // TODO add your handling code here:
        T3.setBackground(Color.red);
    }//GEN-LAST:event_SetUsedT3ActionPerformed

    private void SetUsedT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetUsedT4ActionPerformed
        // TODO add your handling code here:
        T4.setBackground(Color.red);
    }//GEN-LAST:event_SetUsedT4ActionPerformed


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
            java.util.logging.Logger.getLogger(TableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SetDirtyT1;
    private javax.swing.JButton SetDirtyT2;
    private javax.swing.JButton SetDirtyT3;
    private javax.swing.JButton SetDirtyT4;
    private javax.swing.JButton SetFreeT1;
    private javax.swing.JButton SetFreeT2;
    private javax.swing.JButton SetFreeT3;
    private javax.swing.JButton SetFreeT4;
    private javax.swing.JButton SetUsedT1;
    private javax.swing.JButton SetUsedT2;
    private javax.swing.JButton SetUsedT3;
    private javax.swing.JButton SetUsedT4;
    private javax.swing.JPanel T1;
    private javax.swing.JPanel T2;
    private javax.swing.JPanel T3;
    private javax.swing.JPanel T4;
    // End of variables declaration//GEN-END:variables
}
