package vistas;

import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class NotaVenta extends javax.swing.JFrame 
{
    
    int nf = -1;
    double subt = 0; //total columna final
    
    public NotaVenta() 
    {
        initComponents();
        cargarBD();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCedulaF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        btnBuscarcl = new javax.swing.JButton();
        lblDireccion = new javax.swing.JLabel();
        btnRegistrarcl = new javax.swing.JButton();
        lblTelefono = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCantidadF = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        txtIVA = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jcProductos = new javax.swing.JComboBox<>();
        btnAgragar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbFactura = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEmail.setText("E-mail");

        jLabel7.setText("Productos");

        jLabel8.setText("Producto");

        jLabel1.setText("Número de Cédula:");

        lblCedula.setText("Cédula");

        btnBuscarcl.setText("Buscar");
        btnBuscarcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarclActionPerformed(evt);
            }
        });

        lblDireccion.setText("Dirección");

        btnRegistrarcl.setText("Registrar");
        btnRegistrarcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarclActionPerformed(evt);
            }
        });

        lblTelefono.setText("Teléfono");

        lblNombre.setText("Nombre");

        jLabel9.setText("Total");

        jLabel10.setText("IVA");

        jLabel11.setText("Sub Total");

        jLabel12.setText("Cantidad");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jcProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcProductosActionPerformed(evt);
            }
        });

        btnAgragar.setText("Agregar");
        btnAgragar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgragarMouseClicked(evt);
            }
        });
        btnAgragar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgragarActionPerformed(evt);
            }
        });

        tbFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CANTIDAD", "PRODUCTO", "PRECIO UNITARIO", "PRECIO TOTAL"
            }
        ));
        jScrollPane2.setViewportView(tbFactura);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtSubtotal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel7)
                                        .addGap(0, 92, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(btnAgragar)
                                                .addGap(0, 71, Short.MAX_VALUE))
                                            .addComponent(txtCantidadF)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtTotal)
                                            .addComponent(txtIVA))))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnBuscarcl)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnRegistrarcl))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCedulaF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedulaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarcl)
                    .addComponent(btnRegistrarcl))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblCedula)
                    .addComponent(lblTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jcProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCantidadF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgragar)
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnRegistrarclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarclActionPerformed
        new Clientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistrarclActionPerformed

    private void btnBuscarclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarclActionPerformed
        
                String str = txtCedulaF.getText();
        
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("IDENTIFICACION");
            modelo.addColumn("DIRECCION");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("EMAIL");

            String []dato =new String[6];
            
            Connection cn = Conexion.conectar();            
            PreparedStatement pst = cn.prepareStatement("select id_cliente ID, nombre_cliente NOMBRE, identificacion IDENTIFICACION, direccion DIRECCION, telefono TELEFONO, mail_cliente EMAIL from clientes");
            ResultSet rs = pst.executeQuery();
            
                while(rs.next())
                {
                    dato[0]=rs.getString(1);
                    dato[1]=rs.getString(2);
                    dato[2]=rs.getString(3);
                    dato[3]=rs.getString(4);
                    dato[4]=rs.getString(5);
                    dato[5]=rs.getString(6); 
                    modelo.addRow(dato);
                    
                    if(dato[2].equals(str))
                    {
                        lblNombre.setText(dato[1]);
                        lblCedula.setText(dato[2]);
                        lblDireccion.setText(dato[3]);
                        lblTelefono.setText(dato[4]);
                        lblEmail.setText(dato[5]);
                    }
                }          
        } catch (Exception e) 
            {}
    }//GEN-LAST:event_btnBuscarclActionPerformed
    
    public void cargarBD()
    {   
        try 
        {
            Connection cn = Conexion.conectar();            
            PreparedStatement pst;
            pst = cn.prepareStatement("select producto from inventario");
            ResultSet rs = pst.executeQuery("select producto from inventario");   
            jcProductos.removeAllItems();
            
            while(rs.next())
            {
                jcProductos.addItem(rs.getString(1));
            }
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(NotaVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    private void jcProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProductosActionPerformed
        // TODO add your handling code here:  
        
    }//GEN-LAST:event_jcProductosActionPerformed

    private void btnAgragarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgragarActionPerformed
        double pru = 0;
        double totalp = 0;
        double iva = 0;
        double tcf = 0;
        String can;
        String pro;
        nf++;

        can = txtCantidadF.getText();
        pro = (String) jcProductos.getSelectedItem();
        
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("CANTIDAD");
            modelo.addColumn("PRODUCTO");
            modelo.addColumn("PRECIO");
            
            String []dato =new String[5]; //segun las columnas de la tabla (es un vector)

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select cantidad CANTIDAD, producto PRODUCTO, precio PRECIO from inventario");
            ResultSet rs = pst.executeQuery();  // para descargar datos         
            
            while(rs.next())
                {
                    dato[0]=can;
                    dato[1]=rs.getString(2); 
                    dato[2]=rs.getString(3); //descargar datos de la tabla
                    
                
                    if(dato[1].equals(pro))
                    {
                        pru = Integer.parseInt(dato[2]);//Cuarta columna
                        totalp = pru * Integer.parseInt(can);//Cuarta columna

                        tbFactura.setValueAt(pro, nf, 1);        
                        tbFactura.setValueAt(can, nf, 0);    
                        tbFactura.setValueAt(pru, nf, 2);                   
                        tbFactura.setValueAt(totalp, nf, 3); 
                    }
                        this.txtCantidadF.setText("");
                }   

                modelo.addRow(dato);
            
                subt = subt + totalp;
                txtSubtotal.setText(String.valueOf(subt));
               
                iva = (subt * 12) / 100;
                txtIVA.setText(String.valueOf(iva));
                        
                tcf = subt + iva;
                txtTotal.setText(String.valueOf(tcf));
                
        } catch (Exception e) 
            {}   System.out.println(""+nf);
    }//GEN-LAST:event_btnAgragarActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnAgragarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgragarMouseClicked

    }//GEN-LAST:event_btnAgragarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.txtTotal.setText("");
        this.txtIVA.setText("");
        this.txtSubtotal.setText("");
        //this.tbFactura.set
    }//GEN-LAST:event_jButton1ActionPerformed
         
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
            java.util.logging.Logger.getLogger(NotaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotaVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgragar;
    private javax.swing.JButton btnBuscarcl;
    private javax.swing.JButton btnRegistrarcl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcProductos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tbFactura;
    private javax.swing.JTextField txtCantidadF;
    private javax.swing.JTextField txtCedulaF;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
  }
