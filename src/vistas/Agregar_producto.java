
package vistas;
import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Agregar_producto extends javax.swing.JFrame {
         Inventario s1 = new Inventario();
         boolean producto = s1.update;
         int a=0;
   
         int b=0;
    public Agregar_producto() {
        initComponents();
        
        Calendar c = Calendar.getInstance();
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH)+1);
        String ano = Integer.toString(c.get(Calendar.YEAR));
        jlFecha.setText("Cuenca, "+dia+" / "+mes+" / "+ano);
        setLocationRelativeTo(null);
        
        if (producto == true){
              this.btnIngresar.setText("Ingresar");           
        }else{
            this.lvlNuevoProducto.setText("Editar Producto");
            this.btnIngresar.setText("Actualizar");
            try {
        Connection cn = Conexion.conectar();
            
            String ID = s1.ID;
            System.out.println(s1.ID);
            PreparedStatement pst =cn.prepareStatement("select * from inventario where id_inventario= ?");
            pst.setString(1,ID.trim());
            ResultSet rs = pst.executeQuery();
        
        
                   if (rs.next()){
                    txtId.setText(rs.getString("id_proveedor"));
                    txtProducto.setText(rs.getString("producto"));
                    txtStock.setText(rs.getString("cantidad"));
                    txtPrecio.setText(rs.getString("precio"));
                    txtCodigo.setText(rs.getString("codigo"));
                    txtidprod.setText(rs.getString("id_inventario"));
                       
            }else{
                    JOptionPane.showMessageDialog(null, "Datos no encontrados");
                    dispose();
            }
         
        } catch (Exception e) {
        }
        }
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from proveedor where id_proveedor=?");
            pst.setString(1, txtId.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()){
                  
                    txtNombre.setText(rs.getString("nombre"));
            }else{
            JOptionPane.showMessageDialog(null, "Datos no encontrados");
            }
            
        } catch (Exception e) {
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lvlNuevoProducto = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jlFecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTOTAL = new javax.swing.JTextField();
        txtidprod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtProducto.setEditable(false);
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        txtPrecio.setEditable(false);

        txtCodigo.setEditable(false);

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

        lvlNuevoProducto.setText("AGREGAR CANTIDAD");

        lblProducto.setText("Producto:");

        lblCantidad.setText("Cantidad Adquirida:");

        lblPrecio.setText("Total:");

        lblCodigo.setText("Código:");

        jLabel1.setText("Nombre Proveedor");

        txtNombre.setEditable(false);

        jLabel2.setText("ID Proveedor:");

        txtId.setEditable(false);

        jLabel3.setText("Precio Unitario:");

        txtTOTAL.setEditable(false);

        txtidprod.setEditable(false);

        jLabel4.setText("ID");

        jLabel5.setText("Stock Actual");

        txtStock.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addGap(58, 58, 58)
                        .addComponent(btnIngresar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52)
                            .addComponent(jLabel2)
                            .addGap(74, 74, 74)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPrecio)
                                        .addComponent(jLabel1)
                                        .addComponent(lblProducto)
                                        .addComponent(lblCodigo)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))
                                    .addGap(42, 42, 42))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblCantidad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCodigo)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtidprod))
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(lvlNuevoProducto)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lvlNuevoProducto)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidprod, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblProducto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnRegresar))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed

            

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if(!txtCantidad.equals("") && !txtCodigo.equals("") && !txtPrecio.equals("") && !txtProducto.equals("")){
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("insert into compra values(?,?,?,?,?)");

                pst.setString(1, txtId.getText());
                pst.setString(2, txtidprod.getText());
                pst.setString(3, txtCantidad.getText());
                int cantidad=0;
                int precio=0;
                cantidad=Integer.parseInt(txtCantidad.getText());
                precio= Integer.parseInt(txtPrecio.getText());
                txtTOTAL.setText(String.valueOf(cantidad*precio));
                pst.setString(4, txtTOTAL.getText());
                pst.setString(5, jlFecha.getText());
               
               

                JOptionPane.showMessageDialog(null, "Registro guardado en la Base de Datos");
                pst.executeUpdate();

            } catch (Exception e) {
            }
        }else {
            JOptionPane.showMessageDialog(null, "Aviso: Debe llenar todos los campos");
        }
        
        try {
                
            b= Integer.parseInt(txtCantidad.getText()); 
            a= Integer.parseInt(txtStock.getText());
            int stock= a+b;
            Connection cn= Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("update inventario set cantidad='"+stock+"' where id_inventario='"+txtidprod.getText()+"'");
            pst.executeUpdate(); //no es query por que es update
            
            JOptionPane.showMessageDialog(null, "Cantidad aumentada al stock");
                txtId.setText("");
                txtTOTAL.setText("");
                txtProducto.setText("");
                txtCantidad.setText("");
                txtPrecio.setText("");
                txtCodigo.setText("");
                txtNombre.setText("");
                txtStock.setText("");
       

        } catch (Exception e) {
        }
        
        

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
            
            char validar = evt.getKeyChar();
            if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            }


        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadKeyTyped

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lvlNuevoProducto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTOTAL;
    private javax.swing.JTextField txtidprod;
    // End of variables declaration//GEN-END:variables
}
