package vista;

import java.awt.Color;
import modelo.ConsultaLideres;
import java.awt.Font;
import javax.swing.table.JTableHeader;
import conexion.ConexionDB;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class VistaLideres extends javax.swing.JFrame {

    int xMouse, yMouse;

    public VistaLideres() {
        initComponents();
        this.setLocationRelativeTo(null);
        ConsultaLideres.verDatos();

        editarHeaderJtable();
        jtReportesLideres.setFont(new Font("Serif", Font.BOLD, 20));
        //jtReportesLideres.setDefaultRenderer(Object.class, new MiRender());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jpBarraSuperior = new javax.swing.JPanel();
        jpExit = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        jpAtras = new javax.swing.JPanel();
        lbAtras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtReportesLideres = new javax.swing.JTable();
        btnGenerarPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addGroup(jpExitLayout.createSequentialGroup()
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpExitLayout.setVerticalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExitLayout.createSequentialGroup()
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpAtras.setBackground(new java.awt.Color(255, 255, 255));
        jpAtras.setAlignmentX(100.0F);
        jpAtras.setAlignmentY(100.0F);
        jpAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpAtras.setPreferredSize(new java.awt.Dimension(50, 50));

        lbAtras.setBackground(new java.awt.Color(0, 0, 0));
        lbAtras.setFont(new java.awt.Font("Roboto Medium", 0, 28)); // NOI18N
        lbAtras.setForeground(new java.awt.Color(0, 0, 0));
        lbAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAtras.setText("<");
        lbAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbAtrasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpAtrasLayout = new javax.swing.GroupLayout(jpAtras);
        jpAtras.setLayout(jpAtrasLayout);
        jpAtrasLayout.setHorizontalGroup(
            jpAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAtrasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpAtrasLayout.setVerticalGroup(
            jpAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAtrasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jpBarraSuperiorLayout = new javax.swing.GroupLayout(jpBarraSuperior);
        jpBarraSuperior.setLayout(jpBarraSuperiorLayout);
        jpBarraSuperiorLayout.setHorizontalGroup(
            jpBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBarraSuperiorLayout.createSequentialGroup()
                .addComponent(jpAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 540, Short.MAX_VALUE)
                .addComponent(jpExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBarraSuperiorLayout.setVerticalGroup(
            jpBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarraSuperiorLayout.createSequentialGroup()
                .addGroup(jpBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(jpBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        jLabel1.setBackground(new java.awt.Color(59, 19, 71));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(59, 19, 71));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informe de líderes");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, -1));

        jtReportesLideres.setFont(new java.awt.Font("Roboto", 0, 8)); // NOI18N
        jtReportesLideres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtReportesLideres.setRowHeight(25);
        jtReportesLideres.setSelectionBackground(new java.awt.Color(255, 154, 17));
        jtReportesLideres.setSelectionForeground(new java.awt.Color(59, 19, 71));
        jtReportesLideres.setShowVerticalLines(true);
        jtReportesLideres.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtReportesLideres);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 600, 280));

        btnGenerarPDF.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_GUARDAR_REPORTE 40x40.png"))); // NOI18N
        btnGenerarPDF.setBorder(null);
        btnGenerarPDF.setBorderPainted(false);
        btnGenerarPDF.setContentAreaFilled(false);
        btnGenerarPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarPDF.setFocusPainted(false);
        btnGenerarPDF.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_GUARDAR_REPORTE 42x42 3.png"))); // NOI18N
        btnGenerarPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarPDFMouseEntered(evt);
            }
        });
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });
        bg.add(btnGenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbExitMouseClicked

    private void lbExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseEntered
        jpExit.setBackground(new Color(251, 51, 51));
        lbExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbExitMouseEntered

    private void lbExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseExited
        jpExit.setBackground(Color.WHITE);
        lbExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbExitMouseExited

    private void lbAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAtrasMouseClicked
        Menu me = new Menu();
        VistaLideres vi = new VistaLideres();
        me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbAtrasMouseClicked

    private void lbAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAtrasMouseEntered
        jpAtras.setBackground(new Color(255, 175, 114));
        lbAtras.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbAtrasMouseEntered

    private void lbAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAtrasMouseExited
        jpAtras.setBackground(Color.WHITE);
        lbAtras.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbAtrasMouseExited

    private void jpBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jpBarraSuperiorMouseDragged

    private void jpBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jpBarraSuperiorMousePressed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        
        try {
            ConexionDB con = new ConexionDB();
            Connection conn = con.conectar();
            
            JasperReport reporte = null;
            String archivo = "src\\reportes\\ReporteLideres.jasper";
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(archivo);
            
            JasperPrint jPrint = JasperFillManager.fillReport(reporte, null, conn);
            //Agregar vista
            JasperViewer view = new JasperViewer(jPrint, false);
            
            //Agregar X para cerrar
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            //Mostrar reporte
            view.setVisible(true);
            
            
        } catch (JRException ex) {
            Logger.getLogger(VistaLideres.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    private void btnGenerarPDFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarPDFMouseEntered
        btnGenerarPDF.setToolTipText("Guardar Reporte");
    }//GEN-LAST:event_btnGenerarPDFMouseEntered
    
    //Método para editar el Header del jtable
    private void editarHeaderJtable(){
        JTableHeader header = jtReportesLideres.getTableHeader();
        header.setFont(new Font("Roboto", Font.BOLD, 16));
        header.setOpaque(false);
        jtReportesLideres.getTableHeader().setBackground(new Color(0x1E89CC));
        
        //PROBANDO COLORES
        //jtReportesLideres.getTableHeader().setBackground(new Color(0x3B1347));
        //jtReportesLideres.getTableHeader().setForeground(new Color(0xEAD5FF));
        
        
        //Centrar encabezado del Header
        //((DefaultTableCellRenderer) jtReportesLideres.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    }
    

    
    /*public class MiRender extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSelected, boolean hasFocus, int row,
            int column) {
            Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (row %2 == 0){
                cell.setBackground(Color.RED);
            }else{
                cell.setForeground(Color.WHITE);
            }
           
            return cell;
        }
    }*/

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
            java.util.logging.Logger.getLogger(VistaLideres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLideres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLideres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLideres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLideres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpAtras;
    private javax.swing.JPanel jpBarraSuperior;
    private javax.swing.JPanel jpExit;
    public static javax.swing.JTable jtReportesLideres;
    private javax.swing.JLabel lbAtras;
    private javax.swing.JLabel lbExit;
    // End of variables declaration//GEN-END:variables
}
