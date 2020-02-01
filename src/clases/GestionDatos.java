package clases;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class GestionDatos extends Conexion {

    public int ExisteCliente(String Cedula) {

        PreparedStatement pst = null;
        Connection cn = Conexion.conectar();
        ResultSet rs = null;

        String sql = "SELECT count(id_cliente) FROM clientes where identificacion=?";

        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, Cedula);
            rs = pst.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }

    }

    public int ExisteUsuario(String Cedula) {

        PreparedStatement pst = null;
        Connection cn = Conexion.conectar();
        ResultSet rs = null;

        String sql = "SELECT count(id_usuarios) FROM usuarios where identificacion=?";

        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, Cedula);
            rs = pst.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }

    }

    public boolean esEmail(String correo) {

        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);

        return mather.find();

    }

  
}
