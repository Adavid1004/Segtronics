
package vistas;

import clases.Conexion;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class Grafico extends javax.swing.JFrame {
  String dia = "", mes = "", año = "";
    public Grafico() {
        initComponents();
         ImageIcon s= new ImageIcon(getClass().getResource("/icons/grafico.jpg"));
        ImageIcon icono = new ImageIcon(s.getImage().getScaledInstance(btnGrafico.getWidth(),btnGrafico.getHeight(), Image.SCALE_DEFAULT));
         btnGrafico.setIcon(icono);
    
        cmbAno.addItem("-Seleccione un año-");
        cmbDia.addItem("-Seleccione un día-");
        cmbMes.addItem("-Seleccione un mes-");
       
        setLocationRelativeTo(null);
        for (int i = 2020; i > 2000; i--) {
            String año = String.valueOf(i);
            cmbAno.addItem(año);
        }
        for (int e = 1; e <= 31; e++) {
                String dia = String.valueOf(e);
                cmbDia.addItem(dia);
            }
          for (int m = 1; m <= 12; m++) {
                String mes = String.valueOf(m);
                cmbMes.addItem(mes);
            }
             mostrarDatos();

    }
     public void mostrarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("FECHA");
        modelo.addColumn("FACTURAS");
        modelo.addColumn("PRODUCTOS");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("INGRESO");
        String fecha = "";
        if (cmbDia.getSelectedItem().equals("-Seleccione un día-") && cmbMes.getSelectedItem().equals("-Seleccione un mes-") && cmbAno.getSelectedItem().equals("-Seleccione un año-")) {
            dia = "";
            mes = "";
            año = "";
        } else {
            dia = cmbDia.getSelectedItem().toString().trim();
            mes = cmbMes.getSelectedItem().toString().trim();
            año = cmbAno.getSelectedItem().toString().trim();
            fecha = "where fecha like 'Cuenca, " + dia + " / " + mes + " / " + año + "'";
        }

        String Dato[] = new String[5];

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select fecha FECHA, numeroDocumento FACTURAS, productos PRODUCTOS, count(productos) CANTIDAD, count(productos)*precioUnitario INGRESO from registroventas " + fecha + " group by productos");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Dato[0] = rs.getString(1);
                Dato[1] = rs.getString(2);
                Dato[2] = rs.getString(3);
                Dato[3] = rs.getString(4);
                Dato[4] = "$ " + rs.getString(5);
                modelo.addRow(Dato);
            }
            tbReporte.setModel(modelo);

        } catch (Exception e) {
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();
        cmbMes = new javax.swing.JComboBox<>();
        cmbAno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReporte = new javax.swing.JTable();
        btnGrafico = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Reporte Grafico");

        tbReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbReporte);

        btnGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficoActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(431, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficoActionPerformed
  mostrarDatos();
         DefaultCategoryDataset dtsc1 = new DefaultCategoryDataset();
        for (int i = 0; i < tbReporte.getRowCount(); i++) {
            dtsc1.setValue(Integer.parseInt(tbReporte.getValueAt(i, 3).toString()), tbReporte.getValueAt(i, 2).toString(), tbReporte.getValueAt(i, 4).toString());
        }

        JFreeChart ch = ChartFactory.createBarChart3D("Grafica de Reporte Ventas", "Producto", "Cantidad", dtsc1, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel cp = new ChartPanel(ch);
        add(cp);
        cp.setBounds(500, 100, 400, 400);




    }//GEN-LAST:event_btnGraficoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();

        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrafico;
    private javax.swing.JComboBox<String> cmbAno;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbReporte;
    // End of variables declaration//GEN-END:variables
}
