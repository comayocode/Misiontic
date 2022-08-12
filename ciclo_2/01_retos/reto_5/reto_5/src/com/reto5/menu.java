
package com.reto5;

import java.awt.Color;
import javax.swing.UIManager;

public class menu extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public menu() {
        
        /*try{
            for (UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()){
                if ("Windows".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }*/
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lbBanner = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnProveedores = new javax.swing.JButton();
        btnLideres = new javax.swing.JButton();
        btnProyectos = new javax.swing.JButton();
        lbProveedores = new javax.swing.JLabel();
        lbLideres = new javax.swing.JLabel();
        lbProyectos = new javax.swing.JLabel();
        jpBarraSuperior = new javax.swing.JPanel();
        jpExit = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/BANNER.jpg"))); // NOI18N
        bg.add(lbBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 540));

        lbTitle.setBackground(new java.awt.Color(59, 19, 71));
        lbTitle.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(59, 19, 71));
        lbTitle.setText("Informes Ministerio de Vivienda");
        bg.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 550, -1));

        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/BTN_95.png"))); // NOI18N
        btnProveedores.setBorderPainted(false);
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/BTN_90.png"))); // NOI18N
        btnProveedores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/BTN_100.png"))); // NOI18N
        bg.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 100, 100));

        btnLideres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/BTN_95.png"))); // NOI18N
        btnLideres.setAlignmentY(0.0F);
        btnLideres.setBorder(null);
        btnLideres.setContentAreaFilled(false);
        btnLideres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLideres.setFocusPainted(false);
        btnLideres.setFocusTraversalPolicyProvider(true);
        btnLideres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLideres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/BTN_90.png"))); // NOI18N
        btnLideres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/BTN_100.png"))); // NOI18N
        btnLideres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLideresActionPerformed(evt);
            }
        });
        bg.add(btnLideres, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 120, 120));

        btnProyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/BTN_95.png"))); // NOI18N
        btnProyectos.setBorderPainted(false);
        btnProyectos.setContentAreaFilled(false);
        btnProyectos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProyectos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/BTN_90.png"))); // NOI18N
        btnProyectos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/BTN_100.png"))); // NOI18N
        bg.add(btnProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 100, 100));

        lbProveedores.setBackground(new java.awt.Color(59, 19, 71));
        lbProveedores.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbProveedores.setForeground(new java.awt.Color(59, 19, 71));
        lbProveedores.setText("Proveedores");
        bg.add(lbProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 230, -1, -1));

        lbLideres.setBackground(new java.awt.Color(59, 19, 71));
        lbLideres.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbLideres.setForeground(new java.awt.Color(59, 19, 71));
        lbLideres.setText("Lideres");
        bg.add(lbLideres, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        lbProyectos.setBackground(new java.awt.Color(59, 19, 71));
        lbProyectos.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbProyectos.setForeground(new java.awt.Color(59, 19, 71));
        lbProyectos.setText("Proyectos");
        bg.add(lbProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 230, -1, -1));

        jpBarraSuperior.setBackground(new java.awt.Color(255, 255, 255));
        jpBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpBarraSuperiorMouseDragged(evt);
            }
        });
        jpBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBarraSuperiorMousePressed(evt);
            }
        });

        jpExit.setBackground(new java.awt.Color(255, 255, 255));
        jpExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpExit.setPreferredSize(new java.awt.Dimension(50, 50));
        jpExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpExitMouseEntered(evt);
            }
        });

        lbExit.setBackground(new java.awt.Color(0, 0, 0));
        lbExit.setFont(new java.awt.Font("Roboto Light", 1, 28)); // NOI18N
        lbExit.setForeground(new java.awt.Color(0, 0, 0));
        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setText("X");
        lbExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpExitLayout = new javax.swing.GroupLayout(jpExit);
        jpExit.setLayout(jpExitLayout);
        jpExitLayout.setHorizontalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpExitLayout.setVerticalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jpBarraSuperiorLayout = new javax.swing.GroupLayout(jpBarraSuperior);
        jpBarraSuperior.setLayout(jpBarraSuperiorLayout);
        jpBarraSuperiorLayout.setHorizontalGroup(
            jpBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBarraSuperiorLayout.createSequentialGroup()
                .addGap(0, 930, Short.MAX_VALUE)
                .addComponent(jpExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBarraSuperiorLayout.setVerticalGroup(
            jpBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarraSuperiorLayout.createSequentialGroup()
                .addComponent(jpExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(jpBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jpBarraSuperiorMousePressed

    private void jpBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jpBarraSuperiorMouseDragged

    private void jpExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpExitMouseEntered
        
    }//GEN-LAST:event_jpExitMouseEntered

    private void lbExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseEntered
        jpExit.setBackground(new Color(251, 51, 51));
        lbExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbExitMouseEntered

    private void jpExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpExitMouseClicked
        
    }//GEN-LAST:event_jpExitMouseClicked

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbExitMouseClicked

    private void lbExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseExited
       jpExit.setBackground(Color.WHITE);
       lbExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbExitMouseExited

    private void btnLideresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLideresActionPerformed
        ReportesLideres2 reli = new ReportesLideres2();
        reli.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLideresActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel("com.sun.java.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnLideres;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnProyectos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpBarraSuperior;
    private javax.swing.JPanel jpExit;
    private javax.swing.JLabel lbBanner;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbLideres;
    private javax.swing.JLabel lbProveedores;
    private javax.swing.JLabel lbProyectos;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
