package vistas;

import clases.Conexion;
import clases.GestionDatos;
import java.awt.Color;
import java.sql.*;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Busqueda_Usuarios extends javax.swing.JFrame {
    

    public Busqueda_Usuarios() {
        initComponents();
        setLocationRelativeTo(null);
        comboEstado.addItem("Activo");
        comboEstado.addItem("Inactivo");
        comboNivel.addItem("Administrador");
        comboNivel.addItem("Empleado");
        this.getContentPane().setBackground(Color.white);
       

    }

    public void mostrarDatos(String valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("IDENTIFICACION");
        modelo.addColumn("MAIL");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("USERNAME");
        modelo.addColumn("NIVEL");
        modelo.addColumn("ESTADO");

        String sql = "";
        if (valor.equals("")) {

            sql = "select * from usuarios";

        } else {

            sql = "select id_usuarios ID, nombre NOMBRE, identificacion IDENTIFICACION, email MAIL, telefono TELEFONO, username USERNAME, nivel NIVEL, estatus ESTADO from usuarios where identificacion='" + txtBusqueUsu.getText() + "'";
        }

        String[] dato = new String[8]; //segun las columnas de la tabla (es un vector)

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);   //bse de datos
            ResultSet rs = pst.executeQuery();  // para descargar datos

            while (rs.next()) {
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                dato[4] = rs.getString(5);
                dato[5] = rs.getString(6);
                dato[6] = rs.getString(8); //descargar datos de la tabla
                dato[7] = rs.getString(9);
                //segun posciones de la base de datos

                modelo.addRow(dato);

            }
            lstUsuarios.setModel(modelo);

        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBusqueUsu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstUsuarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboNivel = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtNombreU = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnActualizar = new javax.swing.JButton();
        BTNregresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtBusqueUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusqueUsuKeyPressed(evt);
            }
        });

        jLabel1.setText("Cedula: ");

        btnBuscar.setText("Pulse para editar datos");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lstUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "IDENTIFICACION", "MAIL", "TELEFONO", "USERNAME", "NIVEL", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(lstUsuarios);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Cedula:");

        jLabel4.setText("Username:");

        jLabel5.setText("Contraseña:");

        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo de nivel:");

        comboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNivelActionPerformed(evt);
            }
        });

        jLabel7.setText("Estatus");

        jLabel9.setText("E-mail:");

        jLabel10.setText("Telefono:");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtNombreU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreUKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        btnActualizar.setText("Actualizar Datos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        BTNregresar.setText("VOLVER MENÚ");
        BTNregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNregresarActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel9))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPassword))))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBusqueUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNregresar)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBusqueUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnBuscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTNregresar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void comboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNivelActionPerformed

    private void txtBusqueUsuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqueUsuKeyPressed

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("IDENTIFICACION");
            modelo.addColumn("MAIL");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("USERNAME");
            modelo.addColumn("NIVEL");
            modelo.addColumn("ESTADO");

            String[] dato = new String[8]; //segun las columnas de la tabla (es un vector)

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select id_usuarios ID, nombre NOMBRE, identificacion IDENTIFICACION, email MAIL, telefono TELEFONO, username USERNAME, nivel NIVEL, estatus ESTADO from usuarios where identificacion like '%"+txtBusqueUsu.getText()+"%'");
            //bse de datos
            ResultSet rs = pst.executeQuery();  // para descargar datos

            while (rs.next()) {
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                dato[4] = rs.getString(5);
                dato[5] = rs.getString(6);
                dato[6] = rs.getString(7);
                dato[7] = rs.getString(8);
                dato[8] = rs.getString(9);
                //descargar datos de la tabla

                modelo.addRow(dato);

            }
            lstUsuarios.setModel(modelo);

        } catch (Exception e) {
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusqueUsuKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from usuarios where identificacion=? ");
            pst.setString(1, txtBusqueUsu.getText().trim());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                txtNombreU.setText(rs.getString("nombre"));
                txtCedula.setText(rs.getString("identificacion"));
                txtMail.setText(rs.getString("email"));
                txtTelefono.setText(rs.getString("telefono"));
                txtMail.setText(rs.getString("email"));
                txtusername.setText(rs.getString("username"));
                txtPassword.setText(rs.getString("password"));
                comboNivel.setSelectedItem(rs.getString("nivel"));
                comboEstado.setSelectedItem(rs.getString("estatus"));

            } else {
                JOptionPane.showMessageDialog(null, "Datos no encontrados");
            }

            mostrarDatos(txtBusqueUsu.getText());

        } catch (Exception e) {
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        GestionDatos modSql = new GestionDatos();
        String cedula;
        String a = "";
        String b = "";

        try {

            String id = txtBusqueUsu.getText();
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("update usuarios set nombre=?, identificacion=?, email=?, telefono=?, username=?, password=?, nivel=?, estatus=? where identifiacion='" + id + "'");
            pst.setString(1, txtNombreU.getText().trim());
            pst.setString(2, txtCedula.getText().trim());
            pst.setString(3, txtMail.getText().trim());
            pst.setString(4, txtTelefono.getText().trim());
            pst.setString(5, txtusername.getText().trim());
            pst.setString(6, txtPassword.getText().trim());
            a = txtusername.getText();
            b = txtPassword.getText();
            pst.setString(7, String.valueOf(comboNivel.getSelectedItem()).trim());
            pst.setString(8, String.valueOf(comboEstado.getSelectedItem()).trim());

            if (txtCedula.getText().equals("") || txtMail.getText().equals("") || txtNombreU.getText().equals("") || txtTelefono.getText().equals("") || txtusername.getText().equals("") || txtPassword.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Existen campos vacios");

            } else {
                if (modSql.ExisteUsuario(txtCedula.getText()) == 0) {
                    if (modSql.esEmail(txtMail.getText())) {
                        if (validarDocumento(cedula = txtCedula.getText()) == true) {
                            if (modSql.ExisteUsername(txtusername.getText()) == 0) {

                                Properties propiedades = new Properties();
                                propiedades.setProperty("mail.smtp.host", "smtp.gmail.com");
                                propiedades.setProperty("mail.smtp.starttls.enable", "true");
                                propiedades.setProperty("mail.smtp.port", "587");
                                propiedades.setProperty("mail.smtp.auth", "true");

                                Session sesion = Session.getDefaultInstance(propiedades);

                                String correoEnviado = "anddychunagta@gmail.com";
                                String contrasena = "anddy1004";
                                String destinatario = txtMail.getText();
                                String asunto = "SOFTWARE F1 SOLUCIONES";
                                String mensaje ="Su usuario es: " + txtNombreU.getText() + " y su contraseña es: " + txtPassword.getText();

                                MimeMessage mail = new MimeMessage(sesion);

                                try {
                                    mail.setFrom(new InternetAddress(correoEnviado));
                                    mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
                                    mail.setSubject(asunto);
                                    mail.setText(mensaje);

                                    Transport transporte = sesion.getTransport("smtp");

                                    transporte.connect(correoEnviado, contrasena);
                                    transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
                                    transporte.close();
                                    JOptionPane.showMessageDialog(null, "Correo enviando con exito");

                                } catch (AddressException ex) {
                                    Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (MessagingException ex) {
                                    Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);

                                }
                                txtNombreU.setText("");
                                txtCedula.setText("");
                                txtMail.setText("");
                                txtTelefono.setText("");
                                txtusername.setText("");
                                txtPassword.setText("");

                                JOptionPane.showMessageDialog(null, "Registro guardado en la Base de Datos");
                                pst.executeUpdate();
                            } else {
                                JOptionPane.showMessageDialog(null, "Username ya en uso");

                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Cedula Incorrecta");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Correo Incorrecto");

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario ya existe");
                }

            }

        } catch (Exception e) {
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void BTNregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNregresarActionPerformed

        new MenuAdmin().setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_BTNregresarActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped

        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUKeyTyped
    private boolean validarDocumento(String numero) {
        boolean valor = true;
        try {
            int suma = 0;
            int residuo = 0;
            boolean privada = false;
            boolean publica = false;
            boolean natural = false;
            int numeroProvincias = 22;
            int digitoVerificador = 0;
            int modulo = 11;

            int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
            int p1, p2, p3, p4, p5, p6, p7, p8, p9;

            d1 = d2 = d3 = d4 = d5 = d6 = d7 = d8 = d9 = d10 = 0;
            p1 = p2 = p3 = p4 = p5 = p6 = p7 = p8 = p9 = 0;

            if (numero.length() < 10) {
//				JOptionPane.showMessageDialog(Motor.getVentana(), "El n" + Motor.u + "mero ingresado no es v" + Motor.a + "lido");
                numero = "";
                valor = false;
            }

            // Los primeros dos digitos corresponden al codigo de la provincia
            int provincia = Integer.parseInt(numero.substring(0, 2));

            if (provincia <= 0 || provincia > numeroProvincias) {
//				JOptionPane.showMessageDialog(Motor.getVentana(), "El c" + Motor.o + "digo de la provincia (dos primeros d" + Motor.i + "gitos) es inv" + Motor.a + "lido");
                numero = "";
                valor = false;
            }

            // Aqui almacenamos los digitos de la cedula en variables.
            d1 = Integer.parseInt(numero.substring(0, 1));
            d2 = Integer.parseInt(numero.substring(1, 2));
            d3 = Integer.parseInt(numero.substring(2, 3));
            d4 = Integer.parseInt(numero.substring(3, 4));
            d5 = Integer.parseInt(numero.substring(4, 5));
            d6 = Integer.parseInt(numero.substring(5, 6));
            d7 = Integer.parseInt(numero.substring(6, 7));
            d8 = Integer.parseInt(numero.substring(7, 8));
            d9 = Integer.parseInt(numero.substring(8, 9));
            d10 = Integer.parseInt(numero.substring(9, 10));

            // El tercer digito es:
            // 9 para sociedades privadas y extranjeros
            // 6 para sociedades publicas
            // menor que 6 (0,1,2,3,4,5) para personas naturales
            if (d3 == 7 || d3 == 8) {
//				JOptionPane.showMessageDialog(Motor.getVentana(), "El tercer d"	+ Motor.i + "gito ingresado es inv" + Motor.a + "lido");
                numero = "";
                valor = false;
            }

            // Solo para personas naturales (modulo 10)
            if (d3 < 6) {
                natural = true;
                modulo = 10;
                p1 = d1 * 2;
                if (p1 >= 10) {
                    p1 -= 9;
                }
                p2 = d2 * 1;
                if (p2 >= 10) {
                    p2 -= 9;
                }
                p3 = d3 * 2;
                if (p3 >= 10) {
                    p3 -= 9;
                }
                p4 = d4 * 1;
                if (p4 >= 10) {
                    p4 -= 9;
                }
                p5 = d5 * 2;
                if (p5 >= 10) {
                    p5 -= 9;
                }
                p6 = d6 * 1;
                if (p6 >= 10) {
                    p6 -= 9;
                }
                p7 = d7 * 2;
                if (p7 >= 10) {
                    p7 -= 9;
                }
                p8 = d8 * 1;
                if (p8 >= 10) {
                    p8 -= 9;
                }
                p9 = d9 * 2;
                if (p9 >= 10) {
                    p9 -= 9;
                }
            }

            // Solo para sociedades publicas (modulo 11)
            // Aqui el digito verficador esta en la posicion 9, en las otras 2
            // en la pos. 10
            if (d3 == 6) {
                publica = true;
                p1 = d1 * 3;
                p2 = d2 * 2;
                p3 = d3 * 7;
                p4 = d4 * 6;
                p5 = d5 * 5;
                p6 = d6 * 4;
                p7 = d7 * 3;
                p8 = d8 * 2;
                p9 = 0;
            }

            /* Solo para entidades privadas (modulo 11) */
            if (d3 == 9) {
                privada = true;
                p1 = d1 * 4;
                p2 = d2 * 3;
                p3 = d3 * 2;
                p4 = d4 * 7;
                p5 = d5 * 6;
                p6 = d6 * 5;
                p7 = d7 * 4;
                p8 = d8 * 3;
                p9 = d9 * 2;
            }

            suma = p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8 + p9;
            residuo = suma % modulo;

            // Si residuo=0, dig.ver.=0, caso contrario 10 - residuo
            digitoVerificador = residuo == 0 ? 0 : modulo - residuo;
            int longitud = numero.length(); // Longitud del string

            // ahora comparamos el elemento de la posicion 10 con el dig. ver.
            if (publica == true) {
                if (digitoVerificador != d9) {
//					JOptionPane.showMessageDialog(Motor.getVentana(),"El ruc de la empresa del sector p" + Motor.u	+ "blico es incorrecto.");
                    numero = "";
                    valor = false;
                }
                /* El ruc de las empresas del sector publico terminan con 0001 */
                if (!numero.substring(9, longitud).equals("0001")) {
//					JOptionPane.showMessageDialog(Motor.getVentana(),"El ruc de la empresa del sector p" + Motor.u	+ "blico debe terminar con 0001");
                    numero = "";
                    valor = false;
                }
            }

            if (privada == true) {
                if (digitoVerificador != d10) {
//					JOptionPane.showMessageDialog(Motor.getVentana(),"El ruc de la empresa del sector privado es incorrecto.");
                    numero = "";
                    valor = false;
                }
                if (!numero.substring(10, longitud).equals("001")) {
//					JOptionPane.showMessageDialog(Motor.getVentana(),"El ruc de la empresa del sector privado debe terminar con 001");
                    numero = "";
                    valor = false;
                }
            }

            if (natural == true) {
                if (digitoVerificador != d10) {
//					JOptionPane.showMessageDialog(Motor.getVentana(), "El n"+ Motor.u + "mero de c" + Motor.e+ "dula de la persona natural es incorrecto.");
                    numero = "";
                    valor = false;
                }
                if (numero.length() > 10
                        && !numero.substring(10, longitud).equals("001")) {
//					JOptionPane.showMessageDialog(Motor.getVentana(),"El ruc de la persona natural debe terminar con 001");
                    numero = "";
                    valor = false;
                }
            }
        } catch (Exception e) {
            numero = "";
            valor = false;
        }
        return valor;
    }

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
            java.util.logging.Logger.getLogger(Busqueda_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busqueda_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNregresar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lstUsuarios;
    private javax.swing.JTextField txtBusqueUsu;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombreU;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
