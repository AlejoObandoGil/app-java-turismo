/*
Esta clase se encarga de conectar con mysql
 */
package Clases;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Natalia
 */
public class Conectar {
    
    private final String nombreBaseDatos = "AppColombiaTravel";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost/" + nombreBaseDatos;
    //private com.mysql.jdbc.Connection con = null;
 
    private Connection conexion = null;

    public Connection getConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(this.url,this.user,this.password); 
        } catch (SQLException e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);            
            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }   
//    
//     public Connection Desconectar() {
//        try {
//            conect.close();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
//        }
//        return conect;
//    } 

        
    }
