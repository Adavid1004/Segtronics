
package vistas;

import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class Productos extends javax.swing.JFrame {
     String IDs;
    Inventario c = new Inventario();
    boolean productos = c.update;
    
    public Productos() {
        
        initComponents();
        setLocationRelativeTo(null);
        if (productos == false){

            this.btnIngresar.setText("Ingresar");           
        }else{
            this.lvlNuevoProducto.setText("Editar Producto");
            this.btnIngresar.setText("Actualizar");
            try {
        Connection cn = Conexion.conectar();
            
            IDs = c.ID;
            System.out.println(c.ID);
            PreparedStatement pst =cn.prepareStatement("select * from inventario where id_inventario= ?");
            pst.setString(1,IDs.trim());
            ResultSet rs = pst.executeQuery();
        
        
                   if (rs.next()){
                    txtProducto.setText(rs.getString("producto"));
                    txtCantidad.setText(rs.getString("cantidad"));
                    txtPrecio.setText(rs.getString("precio"));
                    txtCodigo.setText(rs.getString("codigo"));
                       
            }else{
                    JOptionPane.showMessageDialog(null, "Datos no encontrados");
                    dispose();
            }
         
        } catch (Exception e) {
        }
        }

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lvlNuevoProducto = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        lvlNuevoProducto.setText("Nuevo Producto");

        lblProducto.setText("Producto:");

        lblCantidad.setText("Cantidad:");

        lblPrecio.setText("Precio:");

        lblCodigo.setText("Código:");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lvlNuevoProducto)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProducto)
                                    .addComponent(lblCantidad)
                                    .addComponent(lblPrecio)
                                    .addComponent(lblCodigo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIngresar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lvlNuevoProducto)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProducto)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnRegresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    if (productos == false) {
             if(!txtCantidad.equals("") && !txtCodigo.equals("") && !txtPrecio.equals("") && !txtProducto.equals("")){
            try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("insert into inventario values(?,?,?,?,?)");
            pst.setString(1, "0");
            pst.setString(2, txtProducto.getText());
            pst.setString(3, txtCantidad.getText());
            pst.setString(4, txtPrecio.getText());
            pst.setString(5, txtCodigo.getText());
            txtProducto.setText("");
            txtCantidad.setText("");
            txtPrecio.setText("");
            txtCodigo.setText("");
            JOptionPane.showMessageDialog(null, "Registro guardado en la Base de Datos");
            pst.executeUpdate();
            } catch (Exception e) {
            }
    
            }else {
            JOptionPane.showMessageDialog(null, "Aviso: Debe llenar todos los campos");
            }
        }
        else{
            try {
           
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("update inventario set producto = ?, cantidad = ?, precio =? , codigo = ? where id_inventario ='"+IDs+"'");
            pst.setString(1, txtProducto.getText().trim());
            pst.setString(2, txtCantidad.getText().trim());
            pst.setString(3, txtPrecio.getText().trim());
            pst.setString(4, txtCodigo.getText().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizado con exito");
            } catch (Exception e) {}
        } 
        
    }//GEN-LAST:event_btnIngresarActionPerformed


    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lvlNuevoProducto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
