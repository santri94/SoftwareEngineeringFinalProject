/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.finalproject;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author qazwsx922
 */
public class FoodCategories extends javax.swing.JFrame implements MouseListener {
    
    

    /**
     * Creates new form FoodCategories
     */
    public FoodCategories() {
        initComponents();
        Salad.addMouseListener(this);
        Soup.addMouseListener(this);
        Pizza.addMouseListener(this);
        Chicken.addMouseListener(this);
        Cookie.addMouseListener(this);
        Soda.addMouseListener(this);
        
    }
    
    DefaultTableModel model = new DefaultTableModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Appetizer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MainDish = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Dessert = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Drinks = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        AppetizerPanel = new javax.swing.JPanel();
        Salad = new javax.swing.JLabel();
        Soup = new javax.swing.JLabel();
        MainDishPanel = new javax.swing.JPanel();
        Pizza = new javax.swing.JLabel();
        Chicken = new javax.swing.JLabel();
        DessertPanel = new javax.swing.JPanel();
        Cookie = new javax.swing.JLabel();
        DrinksPanel = new javax.swing.JPanel();
        Soda = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(900, 580));
        setMinimumSize(new java.awt.Dimension(900, 580));
        setPreferredSize(new java.awt.Dimension(900, 580));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Appetizer.setBackground(new java.awt.Color(255, 153, 51));
        Appetizer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Appetizer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Appetizer");

        javax.swing.GroupLayout AppetizerLayout = new javax.swing.GroupLayout(Appetizer);
        Appetizer.setLayout(AppetizerLayout);
        AppetizerLayout.setHorizontalGroup(
            AppetizerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppetizerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        AppetizerLayout.setVerticalGroup(
            AppetizerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppetizerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(Appetizer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, -1));

        MainDish.setBackground(new java.awt.Color(255, 153, 51));
        MainDish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        MainDish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("MainDish");

        javax.swing.GroupLayout MainDishLayout = new javax.swing.GroupLayout(MainDish);
        MainDish.setLayout(MainDishLayout);
        MainDishLayout.setHorizontalGroup(
            MainDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainDishLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        MainDishLayout.setVerticalGroup(
            MainDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainDishLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
        );

        getContentPane().add(MainDish, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 150, 90));

        Dessert.setBackground(new java.awt.Color(255, 153, 51));
        Dessert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Dessert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setText("Dessert");

        javax.swing.GroupLayout DessertLayout = new javax.swing.GroupLayout(Dessert);
        Dessert.setLayout(DessertLayout);
        DessertLayout.setHorizontalGroup(
            DessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DessertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        DessertLayout.setVerticalGroup(
            DessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DessertLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26))
        );

        getContentPane().add(Dessert, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 90));

        Drinks.setBackground(new java.awt.Color(255, 153, 51));
        Drinks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Drinks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setText("Drinks");

        javax.swing.GroupLayout DrinksLayout = new javax.swing.GroupLayout(Drinks);
        Drinks.setLayout(DrinksLayout);
        DrinksLayout.setHorizontalGroup(
            DrinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        DrinksLayout.setVerticalGroup(
            DrinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(Drinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 90));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MENU");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity", "Total_Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Remove Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel6.setLayout(new java.awt.CardLayout());

        AppetizerPanel.setBackground(new java.awt.Color(255, 255, 255));

        Salad.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Salad.setText("Salad");
        Salad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });

        Soup.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Soup.setText("Soup");
        Soup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AppetizerPanelLayout = new javax.swing.GroupLayout(AppetizerPanel);
        AppetizerPanel.setLayout(AppetizerPanelLayout);
        AppetizerPanelLayout.setHorizontalGroup(
            AppetizerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppetizerPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(AppetizerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salad)
                    .addComponent(Soup))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        AppetizerPanelLayout.setVerticalGroup(
            AppetizerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppetizerPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Salad)
                .addGap(18, 18, 18)
                .addComponent(Soup)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jPanel6.add(AppetizerPanel, "card2");

        MainDishPanel.setBackground(new java.awt.Color(255, 255, 255));

        Pizza.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Pizza.setText("Pizza");
        Pizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });

        Chicken.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Chicken.setText("Chicken");
        Chicken.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MainDishPanelLayout = new javax.swing.GroupLayout(MainDishPanel);
        MainDishPanel.setLayout(MainDishPanelLayout);
        MainDishPanelLayout.setHorizontalGroup(
            MainDishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainDishPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(MainDishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Chicken)
                    .addComponent(Pizza))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        MainDishPanelLayout.setVerticalGroup(
            MainDishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainDishPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Pizza)
                .addGap(18, 18, 18)
                .addComponent(Chicken)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        jPanel6.add(MainDishPanel, "card3");

        DessertPanel.setBackground(new java.awt.Color(255, 255, 255));

        Cookie.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Cookie.setText("Cookie");
        Cookie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout DessertPanelLayout = new javax.swing.GroupLayout(DessertPanel);
        DessertPanel.setLayout(DessertPanelLayout);
        DessertPanelLayout.setHorizontalGroup(
            DessertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DessertPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Cookie)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        DessertPanelLayout.setVerticalGroup(
            DessertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DessertPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Cookie)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        jPanel6.add(DessertPanel, "card4");

        DrinksPanel.setBackground(new java.awt.Color(255, 255, 255));

        Soda.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Soda.setText("Soda");
        Soda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout DrinksPanelLayout = new javax.swing.GroupLayout(DrinksPanel);
        DrinksPanel.setLayout(DrinksPanelLayout);
        DrinksPanelLayout.setHorizontalGroup(
            DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(Soda)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        DrinksPanelLayout.setVerticalGroup(
            DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Soda)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        jPanel6.add(DrinksPanel, "card5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(339, 339, 339)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1070, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClicked
        // TODO add your handling code here:
        if(evt.getSource()==Appetizer){
            AppetizerPanel.setVisible(true);
            MainDishPanel.setVisible(false);
            DessertPanel.setVisible(false);
            DrinksPanel.setVisible(false);
        }
        if(evt.getSource()==MainDish){
            AppetizerPanel.setVisible(false);
            MainDishPanel.setVisible(true);
            DessertPanel.setVisible(false);
            DrinksPanel.setVisible(false);
        }
        if(evt.getSource()==Dessert){
            AppetizerPanel.setVisible(false);
            MainDishPanel.setVisible(false);
            DessertPanel.setVisible(true);
            DrinksPanel.setVisible(false);
        }
        if(evt.getSource()==Drinks){
            AppetizerPanel.setVisible(false);
            MainDishPanel.setVisible(false);
            DessertPanel.setVisible(false);
            DrinksPanel.setVisible(true);
        }
    }//GEN-LAST:event_MouseClicked

    private void MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseEntered
        // TODO add your handling code here:
        if(evt.getSource()==Appetizer){
            Appetizer.setBackground(new Color(238,238,238));
        }
        if(evt.getSource()==MainDish){
            MainDish.setBackground(new Color(238,238,238));
        }
        if(evt.getSource()==Dessert){
            Dessert.setBackground(new Color(238,238,238));
        }
        if(evt.getSource()==Drinks){
            Drinks.setBackground(new Color(238,238,238));
        }
        

    }//GEN-LAST:event_MouseEntered

    private void MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseExited
        // TODO add your handling code here:
        if(evt.getSource()==Appetizer){
            Appetizer.setBackground(new Color(255,255,255));
        }
        if(evt.getSource()==MainDish){
            MainDish.setBackground(new Color(255,255,255));
        }
        if(evt.getSource()==Dessert){
            Dessert.setBackground(new Color(255,255,255));
        }
        if(evt.getSource()==Drinks){
            Drinks.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_MouseExited
//     if(evt.getSource()==Pizza){
//            Pizza.setForeground(new Color(0,0,0));
//        }
//        if(evt.getSource()==Chicken){
//            Chicken.setForeground(new Color(0,0,0));
//        }
    }
    
    private void menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseEntered
         if(evt.getSource()==Salad){
            Salad.setForeground(new Color(80,80,80));
        }
         if(evt.getSource()==Soup){
            Soup.setForeground(new Color(80,80,80));
        }
        if(evt.getSource()==Pizza){
            Pizza.setForeground(new Color(80,80,80));
        }
        if(evt.getSource()==Chicken){
            Chicken.setForeground(new Color(80,80,80));
        }
         if(evt.getSource()==Cookie){
            Cookie.setForeground(new Color(80,80,80));
        } if(evt.getSource()==Soda){
            Soda.setForeground(new Color(80,80,80));
        }
// TODO add your handling code here:
    }//GEN-LAST:event_menuMouseEntered

    private void menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseExited
        // TODO add your handling code here:
           if(evt.getSource()==Salad){
            Salad.setForeground(new Color(0,0,0));
        }
         if(evt.getSource()==Soup){
            Soup.setForeground(new Color(0,0,0));
        }
           if(evt.getSource()==Pizza){
            Pizza.setForeground(new Color(0,0,0));
        }
        if(evt.getSource()==Chicken){
            Chicken.setForeground(new Color(0,0,0));
        }
         if(evt.getSource()==Cookie){
            Cookie.setForeground(new Color(0,0,0));
        } if(evt.getSource()==Soda){
            Soda.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_menuMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            int selectedRowIndex = jTable1.getSelectedRow();
            model.removeRow(selectedRowIndex);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
        
    
   
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Appetizer;
    private javax.swing.JPanel AppetizerPanel;
    private javax.swing.JLabel Chicken;
    private javax.swing.JLabel Cookie;
    private javax.swing.JPanel Dessert;
    private javax.swing.JPanel DessertPanel;
    private javax.swing.JPanel Drinks;
    private javax.swing.JPanel DrinksPanel;
    private javax.swing.JPanel MainDish;
    private javax.swing.JPanel MainDishPanel;
    private javax.swing.JLabel Pizza;
    private javax.swing.JLabel Salad;
    private javax.swing.JLabel Soda;
    private javax.swing.JLabel Soup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource()== Salad){
            String name = "Salad";
            int price = 10;
            int quantity = Integer.parseInt((JOptionPane.showInputDialog("Enter the quantity")));
            int total_Price = price * quantity;
            
            model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{
                name,
                price,
                quantity,
                total_Price
            });
            
        }
            else if(e.getSource()== Soup){
            String name = "Soup";
            int price = 8;
            int quantity = Integer.parseInt((JOptionPane.showInputDialog("Enter the quantity")));
            int total_Price = price * quantity;
            
            model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{
                name,
                price,
                quantity,
                total_Price
            });
            
        }
            else if(e.getSource()== Pizza){
            String name = "Pizza";
            int price = 15;
            int quantity = Integer.parseInt((JOptionPane.showInputDialog("Enter the quantity")));
            int total_Price = price * quantity;
            
            model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{
                name,
                price,
                quantity,
                total_Price
            });
            
        }
            else if(e.getSource()== Chicken){
            String name = "Chicken";
            int price = 12;
            int quantity = Integer.parseInt((JOptionPane.showInputDialog("Enter the quantity")));
            int total_Price = price * quantity;
            
            model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{
                name,
                price,
                quantity,
                total_Price
            });
            
        }
            else if(e.getSource()== Cookie){
            String name = "Cookie";
            int price = 3;
            int quantity = Integer.parseInt((JOptionPane.showInputDialog("Enter the quantity")));
            int total_Price = price * quantity;
            
            model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{
                name,
                price,
                quantity,
                total_Price
            });
            
        }
            else if(e.getSource()== Soda){
            String name = "Soda";
            int price = 2;
            int quantity = Integer.parseInt((JOptionPane.showInputDialog("Enter the quantity")));
            int total_Price = price * quantity;
            
            model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{
                name,
                price,
                quantity,
                total_Price
            });
            
        }

        
        
        //To change body of generated methods, choose Tools | Templates.
    }
    
   

    @Override
    public void mousePressed(MouseEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        //To change body of generated methods, choose Tools | Templates.
    }
}
