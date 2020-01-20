
package vistas;

import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Busqueda_Clientes extends javax.swing.JFrame {

    public Busqueda_Clientes() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        btnbuscarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreCli = new javax.swing.JTextField();
        txtCedulaCliente = new javax.swing.JTextField();
        txtDireccionCli = new javax.swing.JTextField();
        txtTelefonoCli = new javax.swing.JTextField();
        txtMailClie = new javax.swing.JTextField();
        btnClienteUsu = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cedula:");

        txtBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarClienteActionPerformed(evt);
            }
        });
        txtBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarClienteKeyPressed(evt);
            }
        });

        btnbuscarCliente.setText("Editar datos");
        btnbuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarClienteActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "IDENTIFICACION", "DIRECCION", "TELEFONO", "MAIL"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Identificacion:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Telefono:");

        jLabel6.setText("E-mail");

        txtCedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaClienteActionPerformed(evt);
            }
        });

        btnClienteUsu.setText("Actualizar Datos");
        btnClienteUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteUsuActionPerformed(evt);
            }
        });

        jButton3.setText("Volver Menú Principal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnNuevo.setText("Crear Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscarCliente)
                        .addGap(33, 33, 33)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMailClie, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(btnClienteUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscarCliente)
                            .addComponent(jButton3)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNuevo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMailClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClienteUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
     public void mostrarDatos(String valor){
    
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("IDENTIFICACION");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("MAIL");
        
        String sql="";
        if (valor.equals("")){
            
            sql="select * from clientes";
            
        }else{
        
            sql="select id_cliente ID, nombre_cliente NOMBRE, identificacion IDENTIFICACION, direccion DIRECCION, telefono TELEFONO, mail_cliente MAIL from clientes where identificacion='"+txtBuscarCliente.getText()+"'";
        }
        
        String []dato =new String[6]; //segun las columnas de la tabla (es un vector)
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);   //bse de datos
            ResultSet rs = pst.executeQuery();  // para descargar datos
            
            while(rs.next()){
                dato[0]=rs.getString(1);
                dato[1]=rs.getString(2);
                dato[2]=rs.getString(3);
                dato[3]=rs.getString(4);
                dato[4]=rs.getString(5);
                dato[5]=rs.getString(6);
                
                modelo.addRow(dato);
                
            }
            tblClientes.setModel(modelo);  
            
            
        } catch (Exception e) {
        }
    }
    
    private void txtCedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaClienteActionPerformed

    private void txtBuscarClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClienteKeyPressed

            try {   
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("IDENTIFICACION");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("MAIL");
        
    
        
        String []dato =new String[6]; //segun las columnas de la tabla (es un vector)
        
       
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select id_cliente ID, nombre_cliente NOMBRE, identificacion IDENTIFICACION, direccion DIRECCION, telefono TELEFONO, mail_cliente MAIL from clientes where identificacion LIKE '%"+txtBuscarCliente.getText()+"'");
           //bse de datos
            ResultSet rs = pst.executeQuery();  // para descargar datos
            
            while(rs.next()){
                dato[0]=rs.getString(1);
                dato[1]=rs.getString(2);
                dato[2]=rs.getString(3);
                dato[3]=rs.getString(4);
                dato[4]=rs.getString(5);
                dato[5]=rs.getString(6);
             
                
                modelo.addRow(dato);
                
            }
            tblClientes.setModel(modelo);  
            
            
        } catch (Exception e) {
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarClienteKeyPressed

    private void btnbuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarClienteActionPerformed
        
         try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst =cn.prepareStatement("select * from clientes where identificacion=?");
            pst.setString(1, txtBuscarCliente.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()){
                  
                    txtNombreCli.setText(rs.getString("nombre_cliente"));
                    txtCedulaCliente.setText(rs.getString("identificacion"));
                    txtDireccionCli.setText(rs.getString("direccion"));
                    txtTelefonoCli.setText(rs.getString("telefono"));
                    txtMailClie.setText(rs.getString("mail_cliente"));
                  
                    
            }else{
                    JOptionPane.showMessageDialog(null, "Datos no encontrados");
            }
            
            mostrarDatos(txtBuscarCliente.getText());
            
        } catch (Exception e) {
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarClienteActionPerformed

    private void btnClienteUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteUsuActionPerformed
            
         try {
            
                String id= txtBuscarCliente.getText();
                Connection cn= Conexion.conectar();
                PreparedStatement pst= cn.prepareStatement("update clientes set nombre_cliente=?, identificacion=?, direccion=?, telefono=?, mail_cliente=? where identificacion='"+id+"'");
                pst.setString(1, txtNombreCli.getText().trim());
                pst.setString(2, txtCedulaCliente.getText().trim());
                pst.setString(3, txtDireccionCli.getText().trim());
                pst.setString(4, txtTelefonoCli.getText().trim());
                pst.setString(5, txtMailClie.getText().trim());
               
                txtNombreCli.setText("");
                txtCedulaCliente.setText("");
                txtDireccionCli.setText("");
                txtTelefonoCli.setText("");
                txtMailClie.setText("");
                
                JOptionPane.showMessageDialog(null, "Registro guardado en la Base de Datos");
            pst.executeUpdate();
                
        } catch (Exception e) {
        }



    }//GEN-LAST:event_btnClienteUsuActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

            Login lg = new Login();
              String Usuario = lg.user;
        
                try {
                Connection cn = Conexion.conectar();
                
                PreparedStatement pst=cn.prepareStatement("Select nivel,estatus from usuarios where username='"+Usuario+"'");
                ResultSet rs=pst.executeQuery();
                
                if(rs.next()){
                    String tipo_nivel=rs.getString("nivel");
                    String estatus=rs.getString("estatus");
                    
                    
                    if(tipo_nivel.equalsIgnoreCase("Administrador") && estatus.equalsIgnoreCase("Activo")){
                    dispose();
                    new MenuAdmin().setVisible(true);
                    }else if(tipo_nivel.equalsIgnoreCase("Empleado") && estatus.equalsIgnoreCase("Activo")){
                      dispose();
                      new MenuUsuario().setVisible(true);
                    }
                }
                
            } catch (Exception e) {
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

             new Clientes().setVisible(true);
            dispose();
            
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Busqueda_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busqueda_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClienteUsu;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnbuscarCliente;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtDireccionCli;
    private javax.swing.JTextField txtMailClie;
    private javax.swing.JTextField txtNombreCli;
    private javax.swing.JTextField txtTelefonoCli;
    // End of variables declaration//GEN-END:variables
}
