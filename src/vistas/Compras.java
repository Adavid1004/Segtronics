
package vistas;

import clases.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Compras extends javax.swing.JFrame {

   
    public Compras() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        
    }
    
     public void mostrarDatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID_PROVEEDOR");
        modelo.addColumn("PRODUCTO");
        modelo.addColumn("CANTIDAD_COMPRADA");
        modelo.addColumn("TOTAL_COMPRA");
        modelo.addColumn("FECHA");
        String sql="";
        if (valor.equals("")){
            
            sql="select * from compra";
            
        }else{
        
            sql="select id_proveedor ID_PROVEEDOR, id_inventario PRODUCTO, cantidad CANTIDAD_COMPRADA, Vtotal TOTAL_COMPRA, fecha FECHA from compra where id_proveedor='"+txtID.getText()+"'";
     }
        
        String []dato =new String[5];
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
                
                modelo.addRow(dato);
                
            }
            tblcompras.setModel(modelo);
         } catch (Exception e) {
         }
     }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcompras = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese Cedula:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblcompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_PROVEEDOR", "ID_PRODUCTO", "CANTIDAD COMPRADA", "TOTAL COMPRA", "FECHA"
            }
        ));
        jScrollPane1.setViewportView(tblcompras);

        jLabel2.setText("Nombre:");

        jLabel4.setText("Correo:");

        txtNombre.setEditable(false);

        txtcorreo.setEditable(false);

        jLabel5.setText("ID:");

        txtID.setEditable(false);

        jLabel3.setText("Telefono:");

        txtTelefono.setEditable(false);

        jButton1.setText("VOLVER AL MENÚ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnBuscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(215, 215, 215)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jButton1)))
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
            
            try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst =cn.prepareStatement("select * from proveedor where cedula=?");
            pst.setString(1, txtCedula.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()){
                
                    txtNombre.setText(rs.getString("nombre"));
                    txtID.setText(rs.getString("id_proveedor"));
                    txtcorreo.setText(rs.getString("correo"));           
                    txtTelefono.setText(rs.getString("telefono"));
            }else{
                    JOptionPane.showMessageDialog(null, "Datos no encontrados");
            }
        } catch (Exception e) {
        }
            
             try {   
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID_PROVEEDOR");
        modelo.addColumn("PRODUCTO");
        modelo.addColumn("CANTIDAD_COMPRADA");
        modelo.addColumn("TOTAL_COMPRA");
        modelo.addColumn("FECHA");
        
        String []dato =new String[5]; //segun las columnas de la tabla (es un vector)
        
       
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select id_proveedor ID_ROVEEDOR, id_inventario PRODUCTO, cantidad CANTIDAD_COMPRADA, Vtotal TOTAL_COMPRA, fecha FECHA from compra where id_proveedor='"+txtID.getText()+"'");
           //bse de datos
            ResultSet rs = pst.executeQuery();  // para descargar datos
            
            while(rs.next()){
                dato[0]=rs.getString(1);
                dato[1]=rs.getString(2);
                dato[2]=rs.getString(3);
                dato[3]=rs.getString(4);
                dato[4]=rs.getString(5);
                modelo.addRow(dato);
                
            }
            tblcompras.setModel(modelo);  
            
            
        } catch (Exception e) {
            
            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcompras;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtcorreo;
    // End of variables declaration//GEN-END:variables
}
