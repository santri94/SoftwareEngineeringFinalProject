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

    //These objects are for each of our tables 
    FoodCategories table1FoodCategories = new FoodCategories();
    FoodCategories table2FoodCategories = new FoodCategories();
    FoodCategories table3FoodCategories = new FoodCategories();
    FoodCategories table4FoodCategories = new FoodCategories();
    
    public String waiterNameString;
    /**
     * Creates new form TableWindow
     */
    public boolean isOpen;
    public TableWindow() {
        initComponents();
        SetTablesReady();
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
        jLabel1 = new javax.swing.JLabel();
        T3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        T4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        T2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
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
        waiterName = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        OrderT2 = new javax.swing.JButton();
        OrderT3 = new javax.swing.JButton();
        OrderT4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tables");
        setBackground(new java.awt.Color(0, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(925, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T1.setBackground(new java.awt.Color(255, 255, 255));
        T1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("1");

        javax.swing.GroupLayout T1Layout = new javax.swing.GroupLayout(T1);
        T1.setLayout(T1Layout);
        T1Layout.setHorizontalGroup(
            T1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(T1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        T1Layout.setVerticalGroup(
            T1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(T1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 90));

        T3.setBackground(new java.awt.Color(255, 255, 255));
        T3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("3");

        javax.swing.GroupLayout T3Layout = new javax.swing.GroupLayout(T3);
        T3.setLayout(T3Layout);
        T3Layout.setHorizontalGroup(
            T3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, T3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        T3Layout.setVerticalGroup(
            T3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(T3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 140, 90));

        T4.setBackground(new java.awt.Color(255, 255, 255));
        T4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("4");

        javax.swing.GroupLayout T4Layout = new javax.swing.GroupLayout(T4);
        T4.setLayout(T4Layout);
        T4Layout.setHorizontalGroup(
            T4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, T4Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        T4Layout.setVerticalGroup(
            T4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, T4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 140, 90));

        T2.setBackground(new java.awt.Color(255, 255, 255));
        T2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("2");

        javax.swing.GroupLayout T2Layout = new javax.swing.GroupLayout(T2);
        T2.setLayout(T2Layout);
        T2Layout.setHorizontalGroup(
            T2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(T2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        T2Layout.setVerticalGroup(
            T2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(T2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, 90));

        SetFreeT1.setBackground(new java.awt.Color(0, 51, 255));
        SetFreeT1.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        SetFreeT1.setText("Ready");
        SetFreeT1.setPreferredSize(new java.awt.Dimension(98, 29));
        SetFreeT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetFreeT1ActionPerformed(evt);
            }
        });
        getContentPane().add(SetFreeT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 90, -1));

        SetDirtyT1.setBackground(new java.awt.Color(0, 51, 255));
        SetDirtyT1.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        SetDirtyT1.setText("Occupied");
        SetDirtyT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDirtyT1ActionPerformed(evt);
            }
        });
        getContentPane().add(SetDirtyT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 90, -1));

        SetUsedT1.setBackground(new java.awt.Color(0, 51, 255));
        SetUsedT1.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        SetUsedT1.setText("Dirty");
        SetUsedT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUsedT1ActionPerformed(evt);
            }
        });
        getContentPane().add(SetUsedT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 90, 30));

        SetFreeT2.setBackground(new java.awt.Color(0, 51, 255));
        SetFreeT2.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        SetFreeT2.setText("Ready");
        SetFreeT2.setPreferredSize(new java.awt.Dimension(98, 29));
        SetFreeT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetFreeT2ActionPerformed(evt);
            }
        });
        getContentPane().add(SetFreeT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 90, -1));

        SetDirtyT2.setBackground(new java.awt.Color(0, 51, 255));
        SetDirtyT2.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        SetDirtyT2.setText("Occupied");
        SetDirtyT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDirtyT2ActionPerformed(evt);
            }
        });
        getContentPane().add(SetDirtyT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 90, -1));

        SetUsedT2.setBackground(new java.awt.Color(0, 51, 255));
        SetUsedT2.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        SetUsedT2.setText("Dirty");
        SetUsedT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUsedT2ActionPerformed(evt);
            }
        });
        getContentPane().add(SetUsedT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 90, 30));

        SetFreeT3.setBackground(new java.awt.Color(0, 51, 255));
        SetFreeT3.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        SetFreeT3.setText("Ready");
        SetFreeT3.setPreferredSize(new java.awt.Dimension(98, 29));
        SetFreeT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetFreeT3ActionPerformed(evt);
            }
        });
        getContentPane().add(SetFreeT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 90, -1));

        SetDirtyT3.setBackground(new java.awt.Color(0, 51, 255));
        SetDirtyT3.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        SetDirtyT3.setText("Occupied");
        SetDirtyT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDirtyT3ActionPerformed(evt);
            }
        });
        getContentPane().add(SetDirtyT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 90, -1));

        SetUsedT3.setBackground(new java.awt.Color(0, 51, 255));
        SetUsedT3.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        SetUsedT3.setText("Dirty");
        SetUsedT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUsedT3ActionPerformed(evt);
            }
        });
        getContentPane().add(SetUsedT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 90, 30));

        SetUsedT4.setBackground(new java.awt.Color(0, 51, 255));
        SetUsedT4.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        SetUsedT4.setText("Dirty");
        SetUsedT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUsedT4ActionPerformed(evt);
            }
        });
        getContentPane().add(SetUsedT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 90, 30));

        SetFreeT4.setBackground(new java.awt.Color(0, 51, 255));
        SetFreeT4.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        SetFreeT4.setText("Ready");
        SetFreeT4.setPreferredSize(new java.awt.Dimension(98, 29));
        SetFreeT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetFreeT4ActionPerformed(evt);
            }
        });
        getContentPane().add(SetFreeT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 90, -1));

        SetDirtyT4.setBackground(new java.awt.Color(0, 51, 255));
        SetDirtyT4.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        SetDirtyT4.setText("Occupied");
        SetDirtyT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDirtyT4ActionPerformed(evt);
            }
        });
        getContentPane().add(SetDirtyT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 90, -1));

        OrderT1.setBackground(new java.awt.Color(0, 51, 255));
        OrderT1.setFont(new java.awt.Font("Malayalam MN", 1, 15)); // NOI18N
        OrderT1.setText("Order");
        OrderT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderT1ActionPerformed(evt);
            }
        });
        getContentPane().add(OrderT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 80, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N
        jLabel2.setText("Kitchen");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 160, 130));

        waiterName.setFont(new java.awt.Font("Chalkduster", 1, 25)); // NOI18N
        waiterName.setForeground(new java.awt.Color(153, 153, 255));
        waiterName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waiterName.setText("Hello Waiter");
        getContentPane().add(waiterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 180, 50));

        LogOut.setBackground(new java.awt.Color(0, 51, 255));
        LogOut.setFont(new java.awt.Font("Luminari", 1, 15)); // NOI18N
        LogOut.setText("Log  out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 100, 40));

        OrderT2.setBackground(new java.awt.Color(0, 51, 255));
        OrderT2.setFont(new java.awt.Font("Malayalam MN", 1, 15)); // NOI18N
        OrderT2.setText("Order");
        OrderT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderT2ActionPerformed(evt);
            }
        });
        getContentPane().add(OrderT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, 30));

        OrderT3.setBackground(new java.awt.Color(0, 51, 255));
        OrderT3.setFont(new java.awt.Font("Malayalam MN", 1, 15)); // NOI18N
        OrderT3.setText("Order");
        OrderT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderT3ActionPerformed(evt);
            }
        });
        getContentPane().add(OrderT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 80, 30));

        OrderT4.setBackground(new java.awt.Color(0, 51, 255));
        OrderT4.setFont(new java.awt.Font("Malayalam MN", 1, 15)); // NOI18N
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
        T1.setBackground(Color.yellow);
        table1FoodCategories.setVisible(true);
        table1FoodCategories.thisTableNumber = 1;
        table1FoodCategories.myTableWindow = this;
        table1FoodCategories.waiterName = waiterNameString;
        
    }//GEN-LAST:event_OrderT1ActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        //We want to hide this window, not close it, because it is also used by other waiters and busboys
        //We can save changes to the DB at the end when admin closes the program.
        //We really want to keep the program running the whole time and admin is the one that ends the program.
        this.setVisible(false);

    }//GEN-LAST:event_LogOutActionPerformed

    private void OrderT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderT2ActionPerformed
        // TODO add your handling code here:
        T2.setBackground(Color.yellow);
        table2FoodCategories.setVisible(true);
        table2FoodCategories.thisTableNumber = 2;
        table2FoodCategories.myTableWindow = this;
        table2FoodCategories.waiterName = waiterNameString;
        
    }//GEN-LAST:event_OrderT2ActionPerformed

    private void OrderT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderT3ActionPerformed
        // TODO add your handling code here:
        T3.setBackground(Color.yellow);
        table3FoodCategories.setVisible(true);
        table3FoodCategories.thisTableNumber = 3;
        table3FoodCategories.myTableWindow = this;
        table3FoodCategories.waiterName = waiterNameString;
        
    }//GEN-LAST:event_OrderT3ActionPerformed

    private void OrderT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderT4ActionPerformed
        // TODO add your handling code here:
        T4.setBackground(Color.yellow);
        table4FoodCategories.setVisible(true);
        table4FoodCategories.thisTableNumber = 4;
        table4FoodCategories.myTableWindow = this;
        table4FoodCategories.waiterName = waiterNameString;
        
    }//GEN-LAST:event_OrderT4ActionPerformed
    
    public void setUpView(User currentUser) {
        // In this method we want to check that user is either waiter or busboy
        // Then set up the window according to user type
        
        // Setting Up Name
        waiterNameString = currentUser.F_Name;
        this.waiterName.setText("Hi "+waiterNameString);
        
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
            if (T1.getBackground().equals(Color.green) || T1.getBackground().equals(Color.yellow)) {
                OrderT1.setVisible(true);                
            }
            if (T2.getBackground().equals(Color.green) || T2.getBackground().equals(Color.yellow)) {
                OrderT2.setVisible(true);                
            }
            if (T3.getBackground().equals(Color.green) || T3.getBackground().equals(Color.yellow)) {
                OrderT3.setVisible(true);                
            }
            if (T4.getBackground().equals(Color.green) || T4.getBackground().equals(Color.yellow)) {
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
    public javax.swing.JButton OrderT1;
    public javax.swing.JButton OrderT2;
    public javax.swing.JButton OrderT3;
    public javax.swing.JButton OrderT4;
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
    public javax.swing.JPanel T1;
    public javax.swing.JPanel T2;
    public javax.swing.JPanel T3;
    public javax.swing.JPanel T4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel waiterName;
    // End of variables declaration//GEN-END:variables

    public void SetTablesReady() {
        //when program is initialize all tables should be set to ready
        T1.setBackground(Color.green);
        T2.setBackground(Color.green);
        T3.setBackground(Color.green);
        T4.setBackground(Color.green);
    }
}
