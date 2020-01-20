
package clases;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
   public static Connection conectar(){
       try {
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_segtronics","root","");
           return cn;
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,  "Error en la conexion con la base de datos"+e);
       }
       return(null); 
   }
   //conecta la base de datos con neatbeans
}
