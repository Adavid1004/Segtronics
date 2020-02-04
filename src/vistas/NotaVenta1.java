package vistas;

import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;
import java.awt.print.*;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import javax.swing.table.DefaultTableModel;

public class NotaVenta1 extends javax.swing.JFrame implements Printable
{
    
    int nf = -1;
    double subt = 0; //total columna final
    DefaultTableModel modelo;
            
    public NotaVenta1() 
    {
        initComponents();
        cargarBD();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCedulaF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarcl = new javax.swing.JButton();
        btnRegistrarcl = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtCantidadF = new javax.swing.JTextField();
        jcProductos = new javax.swing.JComboBox<>();
        btnAgragar = new javax.swing.JButton();
        NotadeVenta = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        txtIVA = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblNDocumento = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFactura = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setText("Productos");

        jLabel8.setText("Producto");

        jLabel1.setText("Número de Cédula:");

        btnBuscarcl.setText("Buscar");
        btnBuscarcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarclActionPerformed(evt);
            }
        });

        btnRegistrarcl.setText("Registrar");
        btnRegistrarcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarclActionPerformed(evt);
            }
        });

        jLabel12.setText("Cantidad");

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

        NotadeVenta.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Total");

        jLabel10.setText("12% IVA");

        jLabel11.setText("Sub Total");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Nro.");

        lblNDocumento.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblNDocumento.setForeground(new java.awt.Color(204, 0, 0));

        jLabel4.setText("Ventas: Tomás Ordóñez 7-32 y Presidente Córdova");

        jLabel2.setText("Firma Autorizada");

        jLabel13.setText("Firma del Cliente");

        jLabel14.setText("Nombre:");

        jLabel15.setText("Fecha:");

        jLabel16.setText("Cédula:");

        jLabel18.setText("Dirección:");

        jLabel19.setText("Email:");

        jLabel20.setText("Telefono:");

        jLabel17.setText("Telf.: 2824738 - Cel.:0983465064 - Cuenca");

        jLabel21.setText("E-mail: segtronics@hotmail.com");

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel22.setText("SEGTRONICS");

        jLabel23.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 15)); // NOI18N
        jLabel23.setText("TECNOLOGIA");

        jLabel24.setText("www.segtronics.net");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("NOTA DE ENTREGA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("NOTA: Salida la Mercaderia, no se aceptan devoluciones");

        tbFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Cantidad", "Producto", "Precio Unitario", "Precio Total"
            }
        ));
        jScrollPane1.setViewportView(tbFactura);
        if (tbFactura.getColumnModel().getColumnCount() > 0) {
            tbFactura.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbFactura.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        javax.swing.GroupLayout NotadeVentaLayout = new javax.swing.GroupLayout(NotadeVenta);
        NotadeVenta.setLayout(NotadeVentaLayout);
        NotadeVentaLayout.setHorizontalGroup(
            NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotadeVentaLayout.createSequentialGroup()
                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NotadeVentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NotadeVentaLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(NotadeVentaLayout.createSequentialGroup()
                                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(NotadeVentaLayout.createSequentialGroup()
                                            .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(NotadeVentaLayout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addGap(130, 130, 130)
                                                    .addComponent(jLabel11))
                                                .addComponent(jLabel10))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtIVA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(NotadeVentaLayout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(NotadeVentaLayout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel13)
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(NotadeVentaLayout.createSequentialGroup()
                                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(NotadeVentaLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(NotadeVentaLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(NotadeVentaLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23))
                                    .addGroup(NotadeVentaLayout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(20, 20, 20)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NotadeVentaLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(20, 20, 20))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NotadeVentaLayout.createSequentialGroup()
                                        .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17)
                                            .addGroup(NotadeVentaLayout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addGap(26, 26, 26)))
                                        .addGap(41, 41, 41))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NotadeVentaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NotadeVentaLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(90, 90, 90))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(NotadeVentaLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NotadeVentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        NotadeVentaLayout.setVerticalGroup(
            NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NotadeVentaLayout.createSequentialGroup()
                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NotadeVentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21))
                    .addGroup(NotadeVentaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel22)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNDocumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NotadeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar Producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Vover Menu Principal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCedulaF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBuscarcl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRegistrarcl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgragar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidadF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(26, 26, 26))))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NotadeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NotadeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCedulaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarcl)
                            .addComponent(btnRegistrarcl))
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jcProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCantidadF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgragar)
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnRegistrarclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarclActionPerformed
        new Clientes().setVisible(true);
    }//GEN-LAST:event_btnRegistrarclActionPerformed

    private void btnBuscarclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarclActionPerformed
        
        String str = txtCedulaF.getText();
        try {
            /*DefaultTableModel*/ modelo = new DefaultTableModel();
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
 
                    Calendar c = Calendar.getInstance();
                    
                    String dia = Integer.toString(c.get(Calendar.DATE));
                    String mes = Integer.toString(c.get(Calendar.MONTH)+1);
                    String ano = Integer.toString(c.get(Calendar.YEAR));
                    
                    if(dato[2].equals(str))
                    {
                        lblNombre.setText(dato[1]);
                        lblCedula.setText(dato[2]);
                        lblDireccion.setText(dato[3]);
                        lblTelefono.setText(dato[4]);
                        lblEmail.setText(dato[5]);
                        lblFecha.setText("Cuenca, "+dia+" / "+mes+" / "+ano);
                    }
                }        
        } catch (Exception e) 
            {} 
        
        // Agregar el número de documento
        try {
            /*DefaultTableModel*/ modelo = new DefaultTableModel();
            modelo.addColumn("NUMERODOCUMENTO");
            String []dato1 =new String[2];
            
            Connection cn = Conexion.conectar();              
            PreparedStatement pst1 = cn.prepareStatement("select numeroDocumento NUMERODOCUMENTO from notaventa");
            ResultSet rs1 = pst1.executeQuery();
            
            while(rs1.next())
                {
                    dato1[0]=rs1.getString(1);
                    modelo.addRow(dato1);

                    int sai = Integer.valueOf(dato1[0]); //String a Integer (número de documento)
                    String ias = Integer.toString((sai)+1); //Integer a String (nuevo número de documento )                  
                    lblNDocumento.setText(ias);
                }         
        } catch (Exception e) 
            {}
    }//GEN-LAST:event_btnBuscarclActionPerformed
    
    public void cargarBD() //Colocar la lista de productos desde la base de datos al combobox
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
            Logger.getLogger(NotaVenta1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    private void jcProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProductosActionPerformed
        // TODO add your handling code here:  
        
    }//GEN-LAST:event_jcProductosActionPerformed

    private void btnAgragarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgragarActionPerformed
        modelo = (DefaultTableModel) tbFactura.getModel();
        String[] ff = {"", "", "", "", ""}; // Cantidad de columnas de la tabla
        modelo.addRow(ff); 

        
        double pru = 0; //precio unitario
        double totalp = 0; //precio total del producto
        double iva = 0;
        double tcf = 0; //total a pagar
        String codigo; //codigo del producto en la base de datos
        String can; // Cantidad
        String pro; // Producto
        nf++; //Agregar datos en una nueva fila de la tabla
        String clc;
        

        can = txtCantidadF.getText();
        pro = (String) jcProductos.getSelectedItem();    

        try {           
            modelo = new DefaultTableModel();
          
            modelo.addColumn("CODIGO");  
            modelo.addColumn("CANTIDAD");
            modelo.addColumn("PRODUCTO");
            modelo.addColumn("PRECIO UNITARIO");
            modelo.addColumn("PRECIO TOTAL");
            
            
            String []dato =new String[4]; 
            
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select cantidad CANTIDAD, producto PRODUCTO, precio PRECIO, codigo CODIGO from inventario");
            ResultSet rs = pst.executeQuery();   
            
            while(rs.next())
                {   
                    
                    dato[3]=rs.getString(4); //codigos
                    dato[0]=can; //Cantidad ingresada
                    dato[1]=rs.getString(2); //Productos
                    dato[2]=rs.getString(3); //precio unitario           
                    //modelo.addRow(dato);

                    if(dato[1].equals(pro))
                    {
                        /*clc = (dato[4]);
                        
                        if(Integer.parseInt(can) >= Integer.parseInt(clc))
                        {
                            JOptionPane.showMessageDialog(null, "La cantidad ingresada supara la existente");
                        }*/
                                                
                        pru = Integer.parseInt(dato[2]);//Cuarta columna
                        totalp = pru * Integer.parseInt(can);//Quinta columna;
                        codigo = dato[3]; //Primera Columna
                                                                       
                        tbFactura.setValueAt(codigo, nf, 0);        
                        tbFactura.setValueAt(pro, nf, 2);        
                        tbFactura.setValueAt(can, nf, 1);    
                        tbFactura.setValueAt(pru, nf, 3);                   
                        tbFactura.setValueAt(totalp, nf, 4); 
                    }  
                    this.txtCantidadF.setText("");
                }
                                        
                subt = subt + totalp;
                txtSubtotal.setText(String.valueOf(subt));
               
                iva = (subt * 12) / 100;
                txtIVA.setText(String.valueOf(iva));
                        
                tcf = subt + iva;
                txtTotal.setText(String.valueOf(tcf));
                
        } catch (Exception e) 
            {}
        //modelo.addRow(new Object[]{"", "", "", "", ""}); 
    }//GEN-LAST:event_btnAgragarActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnAgragarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgragarMouseClicked

    }//GEN-LAST:event_btnAgragarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("insert into notaventa values(?,?,?,?,?)");
            
            pst.setString(1, "0");
            pst.setString(2, lblNDocumento.getText());
            pst.setString(3, lblCedula.getText());
            pst.setString(4, lblFecha.getText());
            pst.setString(5, txtTotal.getText());
            
            JOptionPane.showMessageDialog(null, "Nota de Venta guardada en la Base de Datos");
            pst.executeUpdate();
        } catch (Exception e)
            {}
        
        try 
        {
            for (int i = 0; i < tbFactura.getRowCount(); i++)
            {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("insert into registroventas (fecha, numeroCedula, numeroDocumento, productos, precioUnitario) values(?,?,?,?,?)");
                
                pst.setString(1, lblFecha.getText());
                pst.setString(2, lblCedula.getText());
                pst.setString(3, lblNDocumento.getText());
                pst.setString(4, tbFactura.getValueAt(i, 2).toString());
                pst.setString(5, tbFactura.getValueAt(i, 3).toString());

                pst.executeUpdate();
                
            }
        } catch (Exception e) 
            {}JOptionPane.showMessageDialog(null, "124567890");
        
        try 
        {
            PrinterJob job = PrinterJob.getPrinterJob(); //crea un trabajo de impresion que se asocia con la impresora predeterminada
            job.setPrintable(this);//Se pasa la instancia del Formulario (JFrame)
            boolean x = job.printDialog();//Se Abre el dialogo Para Imprimir
            if (x == true)
            {
                job.print();
            }    
            else
            {
                //Se canceló la impresión
            }    
        } 
        catch (PrinterException ex) 
        {
            JOptionPane.showMessageDialog(null, "No Se Logró Imprimir Por El Siguiente Motivo" + ex);
        }
        
        this.txtIVA.setText("");
        this.txtSubtotal.setText("");
        this.txtCedulaF.setText("");
        this.lblDireccion.setText("");
        this.lblEmail.setText("");
        this.lblNombre.setText("");
        this.lblTelefono.setText("");
        this.lblNDocumento.setText("");
        this.lblCedula.setText("");
        this.lblFecha.setText("");
        this.txtTotal.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    modelo = (DefaultTableModel) tbFactura.getModel();
    
    if(tbFactura.getSelectedRow() != -1)
        {
            modelo.removeRow(tbFactura.getSelectedRow());
            nf = nf+tbFactura.getSelectedRow();  
        }


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NotaVenta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotaVenta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotaVenta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotaVenta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotaVenta1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NotadeVenta;
    private javax.swing.JButton btnAgragar;
    private javax.swing.JButton btnBuscarcl;
    private javax.swing.JButton btnRegistrarcl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jcProductos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNDocumento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tbFactura;
    private javax.swing.JTextField txtCantidadF;
    private javax.swing.JTextField txtCedulaF;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex == 0)
        {
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            NotadeVenta.printAll(graphics);
            return PAGE_EXISTS;
        }    
        else
        {
            return NO_SUCH_PAGE;     
        }    
    }
}