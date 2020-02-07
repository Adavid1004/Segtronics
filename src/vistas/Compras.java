
package vistas;

import clases.Conexion;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import javax.swing.ImageIcon;


public class Compras extends javax.swing.JFrame {

   
    public Compras() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        
        ImageIcon s1= new ImageIcon(getClass().getResource("/icons/pdf1.png"));
        ImageIcon icono1 = new ImageIcon(s1.getImage().getScaledInstance(btnPDF.getWidth(),btnPDF.getHeight(), java.awt.Image.SCALE_DEFAULT));
         btnPDF.setIcon(icono1);
        
        
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
        btnPDF = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmpre = new javax.swing.JTextField();

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

        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        jLabel6.setText("GENERAR PDF");

        jLabel7.setText("Empresa:");

        txtEmpre.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnBuscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmpre))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(39, 39, 39)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtEmpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
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
                    txtEmpre.setText(rs.getString("Empresa"));
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

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed

         if (txtCedula.getText().equals("") ){
         JOptionPane.showMessageDialog(null, "Aviso: No es posible crear PDF, existen campos vacios");
         }else{
        Document documento=new Document();
          try {
            String ruta=System.getProperty("user.home");
            
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Desktop/Reporte_Compras_Proveedor.pdf"));
            
            
            Image header=Image.getInstance("src/icons/logoseg.png");
            header.scaleToFit(100, 150);
            header.setAlignment(Chunk.ALIGN_LEFT);
            
            Paragraph parrafo=new Paragraph();
            parrafo.setAlignment(Chunk.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tehoms", 30, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("SEGTRONICS\n\n");
            parrafo.setAlignment(Chunk.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tehoms", 22, Font.BOLD, BaseColor.LIGHT_GRAY));
            parrafo.add("Tecnologías\n");
            parrafo.setAlignment(Chunk.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tehoms", 8, Font.BOLD, BaseColor.BLACK));
            parrafo.add("Dirección: Tomás Ordóñez 7-32 y Presidente Córdova\n");
            parrafo.setAlignment(Chunk.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tehoms", 8, Font.BOLD, BaseColor.BLACK));
            parrafo.add("Telf.: 2824738 - Cel.:0983465064 - Cuenca\n");
            parrafo.setAlignment(Chunk.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tehoms", 8, Font.BOLD, BaseColor.BLACK));
            parrafo.add("E-mail: segtronics@hotmail.com\n");
            parrafo.setAlignment(Chunk.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tehoms", 8, Font.BOLD, BaseColor.BLACK));
            parrafo.add("Mas información en: www.segtronics.net\n\n");
            parrafo.setAlignment(Chunk.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tehoms", 18, Font.BOLD, BaseColor.BLACK));
            parrafo.add("Nombre proveedor: "+txtNombre.getText()+"\n\n");
            parrafo.setFont(FontFactory.getFont("Tehoms", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Empresa: "+txtEmpre.getText()+"\n\n");
            parrafo.setFont(FontFactory.getFont("Tehoms", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("RUC/Cedula: "+txtCedula.getText()+"\n\n");
            parrafo.setFont(FontFactory.getFont("Tehoms", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("REPORTE DE COMPRAS\n\n");
            parrafo.setFont(FontFactory.getFont("Tehoms", 20, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("REALIZADAS ALPROVEEDOR\n\n");
            documento.open();
            documento.add(header);
            documento.add(parrafo);
            PdfPTable tabla=new PdfPTable(5);//Las columnas que tenemos en la tabla que seleccionemos
            tabla.addCell("ID_PROVEEDOR");
            tabla.addCell("PRODUCTO");
            tabla.addCell("CANTIDAD_COMPRADA");
            tabla.addCell("TOTAL_COMPRA");
            tabla.addCell("FECHA");
            //tabla.addCell("DIA");
            
              try {
                  Connection cn = Conexion.conectar();
                  PreparedStatement pst= cn.prepareStatement("select * from compra where id_proveedor=?");//Seleccionar la base de datos, c es el alias para llamar la base de datos
                  pst.setString(1, txtID.getText().trim());
                  ResultSet rs =pst.executeQuery();
                  if(rs.next()){
                      do {                          
                          tabla.addCell(rs.getString(1));//segun los campos de la tabla
                          tabla.addCell(rs.getString(2));
                          tabla.addCell(rs.getString(3));
                         tabla.addCell(rs.getString(4));
                         tabla.addCell(rs.getString(5));
                      } while (rs.next());
                      
                      documento.add(tabla);
                  }
              } catch (DocumentException  | SQLException e) { 
              }
              
              documento.close();
              JOptionPane.showMessageDialog(null, "PDF creado correctamente");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
          

         }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPDFActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcompras;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEmpre;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtcorreo;
    // End of variables declaration//GEN-END:variables
}
