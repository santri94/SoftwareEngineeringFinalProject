/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.finalproject;

/**
 *
 * @author qazwsx922
 */
public class FoodCategories extends javax.swing.JFrame {

    /**
     * Creates new form FoodCategories
     */
    public FoodCategories() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Appetizer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MainDish = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Dessert = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Drinks = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        AppetizerPanel = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        MainDishPanel = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        DessertPanel = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();

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
        setPreferredSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 6, -1, -1));

        Appetizer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Appetizer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppetizerMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Appetizer");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AppetizerLayout = new javax.swing.GroupLayout(Appetizer);
        Appetizer.setLayout(AppetizerLayout);
        AppetizerLayout.setHorizontalGroup(
            AppetizerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppetizerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );
        AppetizerLayout.setVerticalGroup(
            AppetizerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppetizerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(Appetizer, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 23, -1, -1));

        MainDish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setText("MainDish");

        javax.swing.GroupLayout MainDishLayout = new javax.swing.GroupLayout(MainDish);
        MainDish.setLayout(MainDishLayout);
        MainDishLayout.setHorizontalGroup(
            MainDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainDishLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        MainDishLayout.setVerticalGroup(
            MainDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainDishLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(MainDish, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 129, 138, -1));

        Dessert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel3.setText("Dessert");

        javax.swing.GroupLayout DessertLayout = new javax.swing.GroupLayout(Dessert);
        Dessert.setLayout(DessertLayout);
        DessertLayout.setHorizontalGroup(
            DessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DessertLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        DessertLayout.setVerticalGroup(
            DessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DessertLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30))
        );

        getContentPane().add(Dessert, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 237, -1, -1));

        Drinks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel4.setText("Drinks");

        javax.swing.GroupLayout DrinksLayout = new javax.swing.GroupLayout(Drinks);
        Drinks.setLayout(DrinksLayout);
        DrinksLayout.setHorizontalGroup(
            DrinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        DrinksLayout.setVerticalGroup(
            DrinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(Drinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 338, -1, -1));

        jPanel6.setLayout(new java.awt.CardLayout());

        AppetizerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jCheckBox1.setText("Salad");

        javax.swing.GroupLayout AppetizerPanelLayout = new javax.swing.GroupLayout(AppetizerPanel);
        AppetizerPanel.setLayout(AppetizerPanelLayout);
        AppetizerPanelLayout.setHorizontalGroup(
            AppetizerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppetizerPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jCheckBox1)
                .addContainerGap(677, Short.MAX_VALUE))
        );
        AppetizerPanelLayout.setVerticalGroup(
            AppetizerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppetizerPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jCheckBox1)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        jPanel6.add(AppetizerPanel, "card2");

        MainDishPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jCheckBox2.setText("Meatball Spaghetti");

        javax.swing.GroupLayout MainDishPanelLayout = new javax.swing.GroupLayout(MainDishPanel);
        MainDishPanel.setLayout(MainDishPanelLayout);
        MainDishPanelLayout.setHorizontalGroup(
            MainDishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainDishPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jCheckBox2)
                .addContainerGap(602, Short.MAX_VALUE))
        );
        MainDishPanelLayout.setVerticalGroup(
            MainDishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainDishPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jCheckBox2)
                .addContainerGap(340, Short.MAX_VALUE))
        );

        jPanel6.add(MainDishPanel, "card3");

        DessertPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jCheckBox3.setText("IceCream");

        javax.swing.GroupLayout DessertPanelLayout = new javax.swing.GroupLayout(DessertPanel);
        DessertPanel.setLayout(DessertPanelLayout);
        DessertPanelLayout.setHorizontalGroup(
            DessertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DessertPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jCheckBox3)
                .addContainerGap(660, Short.MAX_VALUE))
        );
        DessertPanelLayout.setVerticalGroup(
            DessertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DessertPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jCheckBox3)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        jPanel6.add(DessertPanel, "card4");

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 800, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AppetizerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppetizerMouseClicked
        // TODO add your handling code here:
        AppetizerPanel.setVisible(true);
        MainDishPanel.setVisible(false);
        DessertPanel.setVisible(false);
        
    }//GEN-LAST:event_AppetizerMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        AppetizerPanel.setVisible(true);
        MainDishPanel.setVisible(false);
        DessertPanel.setVisible(false);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Appetizer;
    private javax.swing.JPanel AppetizerPanel;
    private javax.swing.JPanel Dessert;
    private javax.swing.JPanel DessertPanel;
    private javax.swing.JPanel Drinks;
    private javax.swing.JPanel MainDish;
    private javax.swing.JPanel MainDishPanel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
