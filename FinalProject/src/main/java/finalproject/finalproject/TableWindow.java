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
    public boolean isOpen;
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
        OrderT1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        waiterName = new javax.swing.JLabel();
        OrderT2 = new javax.swing.JButton();
        OrderT3 = new javax.swing.JButton();
        OrderT4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tables");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(925, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(925, 600));
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

        getContentPane().add(T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 140, 90));

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

        getContentPane().add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, 90));

        SetFreeT1.setText("Ready");
        SetFreeT1.setPreferredSize(new java.awt.Dimension(98, 29));
        SetFreeT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetFreeT1ActionPerformed(evt);
            }
        });
        getContentPane().add(SetFreeT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 90, -1));

        SetDirtyT1.setText("Occupied");
        SetDirtyT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDirtyT1ActionPerformed(evt);
            }
        });
        getContentPane().add(SetDirtyT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 90, -1));

        SetUsedT1.setText("Dirty");
        SetUsedT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUsedT1ActionPerformed(evt);
            }
        });
        getContentPane().add(SetUsedT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 90, 30));

        SetFreeT2.setText("Ready");
        SetFreeT2.setPreferredSize(new java.awt.Dimension(98, 29));
        SetFreeT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetFreeT2ActionPerformed(evt);
            }
        });
        getContentPane().add(SetFreeT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 90, -1));

        SetDirtyT2.setText("Occupied");
        SetDirtyT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDirtyT2ActionPerformed(evt);
            }
        });
        getContentPane().add(SetDirtyT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 90, -1));

        SetUsedT2.setText("Dirty");
        SetUsedT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUsedT2ActionPerformed(evt);
            }
        });
        getContentPane().add(SetUsedT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 90, 30));

        SetFreeT3.setText("Ready");
        SetFreeT3.setPreferredSize(new java.awt.Dimension(98, 29));
        SetFreeT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetFreeT3ActionPerformed(evt);
            }
        });
        getContentPane().add(SetFreeT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 90, -1));

        SetDirtyT3.setText("Occupied");
        SetDirtyT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDirtyT3ActionPerformed(evt);
            }
        });
        getContentPane().add(SetDirtyT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 90, -1));

        SetUsedT3.setText("Dirty");
        SetUsedT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUsedT3ActionPerformed(evt);
            }
        });
        getContentPane().add(SetUsedT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 90, 30));

        SetUsedT4.setText("Dirty");
        SetUsedT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUsedT4ActionPerformed(evt);
            }
        });
        getContentPane().add(SetUsedT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 90, 30));

        SetFreeT4.setText("Ready");
        SetFreeT4.setPreferredSize(new java.awt.Dimension(98, 29));
        SetFreeT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetFreeT4ActionPerformed(evt);
            }
        });
        getContentPane().add(SetFreeT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 90, -1));

        SetDirtyT4.setText("Occupied");
        SetDirtyT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDirtyT4ActionPerformed(evt);
            }
        });
        getContentPane().add(SetDirtyT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 90, -1));

        OrderT1.setText("Order");
        OrderT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderT1ActionPerformed(evt);
            }
        });
        getContentPane().add(OrderT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 80, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Kitchen");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 110, 160));

        LogOut.setText("Log out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, 80, 40));

        waiterName.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        waiterName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waiterName.setText("Hi Waiter");
        getContentPane().add(waiterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, 32));

        OrderT2.setText("Order");
        OrderT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderT2ActionPerformed(evt);
            }
        });
        getContentPane().add(OrderT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, 30));

        OrderT3.setText("Order");
        OrderT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderT3ActionPerformed(evt);
            }
        });
        getContentPane().add(OrderT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 80, 30));

        OrderT4.setText("Order");
        OrderT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderT4ActionPerformed(evt);
            }
        });
        getContentPane().add(OrderT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 80, 30));

        pack();
        setLocationRelativeTo(null);
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

    private void OrderT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderT1ActionPerformed
        // TODO add your handling code here:
        Food food = new Food();
        food.setVisible(true);
    }//GEN-LAST:event_OrderT1ActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        //We want to hide this window, not close it, because it is also used by other waiters and busboys
        //We can save changes to the DB at the end when admin closes the program.
        //We really want to keep the program running the whole time and admin is the one that ends the program.
        this.setVisible(false);

    }//GEN-LAST:event_LogOutActionPerformed

    private void OrderT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderT2ActionPerformed
        // TODO add your handling code here:
        Food food = new Food();
        food.setVisible(true);
    }//GEN-LAST:event_OrderT2ActionPerformed

    private void OrderT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderT3ActionPerformed
        // TODO add your handling code here:
        Food food = new Food();
        food.setVisible(true);
    }//GEN-LAST:event_OrderT3ActionPerformed

    private void OrderT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderT4ActionPerformed
        // TODO add your handling code here:
        Food food = new Food();
        food.setVisible(true);
    }//GEN-LAST:event_OrderT4ActionPerformed
    
    public void setUpView(User currentUser) {
        // In this method we want to check that user is either waiter or busboy
        // Then set up the window according to user type
        
        // Setting Up Name
        this.waiterName.setText("Hi "+currentUser.F_Name);
        
        // Setting Up View for waiter - CANNOT edit table status
        if (currentUser.Type.equals("waiter")) {
            //-----------------------------------------------------------------
            //          Tables Status
            //-----------------------------------------------------------------
            SetFreeT1.setVisible(false);
            SetDirtyT1.setVisible(false);
            SetUsedT1.setVisible(false);

            SetFreeT2.setVisible(false);
            SetDirtyT2.setVisible(false);
            SetUsedT2.setVisible(false);

            SetFreeT3.setVisible(false);
            SetDirtyT3.setVisible(false);
            SetUsedT3.setVisible(false);

            SetFreeT4.setVisible(false);
            SetDirtyT4.setVisible(false);
            SetUsedT4.setVisible(false);
            //-----------------------------------------------------------------
            //                  Tables Orders BUTTONS 
            //                 available on GREEN ONLY
            //-----------------------------------------------------------------
            if (T1.getBackground().equals(Color.green)) {
                OrderT1.setVisible(true);                
            }
            if (T2.getBackground().equals(Color.green)) {
                OrderT2.setVisible(true);                
            }
            if (T3.getBackground().equals(Color.green)) {
                OrderT3.setVisible(true);                
            }
            if (T4.getBackground().equals(Color.green)) {
                OrderT4.setVisible(true);                
            }
            //-----------------------------------------------------------------
            
        }
        // busboy can see buttons to edit table status, but cannot take orders
        else if (currentUser.Type.equals("busboy")) {
            //-----------------------------------------------------------------
            //          Tables Status
            //-----------------------------------------------------------------
            SetFreeT1.setVisible(true);
            SetDirtyT1.setVisible(true);
            SetUsedT1.setVisible(true);

            SetFreeT2.setVisible(true);
            SetDirtyT2.setVisible(true);
            SetUsedT2.setVisible(true);

            SetFreeT3.setVisible(true);
            SetDirtyT3.setVisible(true);
            SetUsedT3.setVisible(true);

            SetFreeT4.setVisible(true);
            SetDirtyT4.setVisible(true);
            SetUsedT4.setVisible(true);
            //-----------------------------------------------------------------
            //-----------------------------------------------------------------
            //                  Tables Orders BUTTONS
            //-----------------------------------------------------------------
            OrderT1.setVisible(false);
            OrderT2.setVisible(false);
            OrderT3.setVisible(false);
            OrderT4.setVisible(false);
            //-----------------------------------------------------------------
            
        }
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOut;
    private javax.swing.JButton OrderT1;
    private javax.swing.JButton OrderT2;
    private javax.swing.JButton OrderT3;
    private javax.swing.JButton OrderT4;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel waiterName;
    // End of variables declaration//GEN-END:variables
}
