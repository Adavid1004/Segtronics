
package vistas;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;


public class MenuAdmin extends javax.swing.JFrame {

  
    public MenuAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        ImageIcon s= new ImageIcon(getClass().getResource("/icons/usuarios.png"));
        ImageIcon icono = new ImageIcon(s.getImage().getScaledInstance(btnnuevoUsu.getWidth(),btnnuevoUsu.getHeight(), Image.SCALE_DEFAULT));
         btnnuevoUsu.setIcon(icono);
        
        ImageIcon s1= new ImageIcon(getClass().getResource("/icons/proveedor.jpg"));
        ImageIcon icono1 = new ImageIcon(s1.getImage().getScaledInstance(btnProved.getWidth(),btnProved.getHeight(), Image.SCALE_DEFAULT));
         btnProved.setIcon(icono1);
         
        ImageIcon s2= new ImageIcon(getClass().getResource("/icons/notaventa.png"));
        ImageIcon icono2 = new ImageIcon(s2.getImage().getScaledInstance(btnAdminventas.getWidth(),btnAdminventas.getHeight(), Image.SCALE_DEFAULT));
         btnAdminventas.setIcon(icono2);
         
         
        ImageIcon s3= new ImageIcon(getClass().getResource("/icons/buscliente.png"));
        ImageIcon icono3 = new ImageIcon(s3.getImage().getScaledInstance(btnBuscaCliente.getWidth(),btnBuscaCliente.getHeight(), Image.SCALE_DEFAULT));
         btnBuscaCliente.setIcon(icono3);
         
        ImageIcon s4= new ImageIcon(getClass().getResource("/icons/bususu.png"));
        ImageIcon icono4 = new ImageIcon(s4.getImage().getScaledInstance(btnBuscaUsuario.getWidth(),btnBuscaUsuario.getHeight(), Image.SCALE_DEFAULT));
         btnBuscaUsuario.setIcon(icono4);
         
        ImageIcon s5= new ImageIcon(getClass().getResource("/icons/inventario2.png"));
        ImageIcon icono5 = new ImageIcon(s5.getImage().getScaledInstance(btnInventario.getWidth(),btnInventario.getHeight(), Image.SCALE_DEFAULT));
         btnInventario.setIcon(icono5);
         
         ImageIcon s6= new ImageIcon(getClass().getResource("/icons/reporte.jpg"));
        ImageIcon icono6 = new ImageIcon(s6.getImage().getScaledInstance(btnreportecompra.getWidth(),btnreportecompra.getHeight(), Image.SCALE_DEFAULT));
         btnreportecompra.setIcon(icono6);
         
         ImageIcon s7= new ImageIcon(getClass().getResource("/icons/reporte.png"));
        ImageIcon icono7 = new ImageIcon(s7.getImage().getScaledInstance(btnReporteGrafico.getWidth(),btnReporteGrafico.getHeight(), Image.SCALE_DEFAULT));
         btnReporteGrafico.setIcon(icono7);
         
         this.getContentPane().setBackground(Color.white);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnnuevoUsu = new javax.swing.JButton();
        btnAdminventas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnInventario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnProved = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnBuscaUsuario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnBuscaCliente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnreportecompra = new javax.swing.JButton();
        btnReporteGrafico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btnnuevoUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoUsuActionPerformed(evt);
            }
        });

        btnAdminventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminventasActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalir.setText("Sallir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nuevo Usuario");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Realizar venta");

        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Revisar Inventario");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Menú Administrador");

        btnProved.setBackground(new java.awt.Color(255, 255, 255));
        btnProved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProvedActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Nuevo Proveedor");

        btnBuscaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaUsuarioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Busqueda Usuario");

        btnBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaClienteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Busqueda Cliente");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Reportes de Compra");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Consultar Reporte Grafico");

        btnreportecompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportecompraActionPerformed(evt);
            }
        });

        btnReporteGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteGraficoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnInventario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnnuevoUsu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReporteGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnreportecompra, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAdminventas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnProved, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnnuevoUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdminventas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProved, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnreportecompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReporteGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoUsuActionPerformed
         
        
        
        new Administrador().setVisible(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevoUsuActionPerformed

    private void btnAdminventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminventasActionPerformed

        new NotaVenta1().setVisible(true);
        dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminventasActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
            
        new Inventario().setVisible(true);
        dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnProvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProvedActionPerformed
            
        new Proveedores().setVisible(true);
            

        // TODO add your handling code here:
    }//GEN-LAST:event_btnProvedActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

            System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaUsuarioActionPerformed

            new Busqueda_Usuarios().setVisible(true);
            dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaUsuarioActionPerformed

    private void btnBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaClienteActionPerformed

            new Busqueda_Clientes().setVisible(true);
            dispose();
            

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaClienteActionPerformed

    private void btnreportecompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportecompraActionPerformed
            new Compras().setVisible(true);
            

        // TODO add your handling code here:
    }//GEN-LAST:event_btnreportecompraActionPerformed

    private void btnReporteGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteGraficoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteGraficoActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminventas;
    private javax.swing.JButton btnBuscaCliente;
    private javax.swing.JButton btnBuscaUsuario;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProved;
    private javax.swing.JButton btnReporteGrafico;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnnuevoUsu;
    private javax.swing.JButton btnreportecompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
