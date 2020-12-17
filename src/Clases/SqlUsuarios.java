/*
Clase control: funciones y metodos para registrar comprobar usuario e iniciar sesion.
Clase para el manejo de usuarios
*/
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia
 */
public class SqlUsuarios extends Conectar{ 

    public boolean registrar(Usuarios usr) {//recibe de parametro la clase usuario
        PreparedStatement ps = null; //preparar consulta
        Connection con = getConnect();// hacer conexion

        String sql = "INSERT INTO usuarios (usuario, password, nombre, correo, id_Tipo) VALUES(?,?,?,?,?)";// consulta a mysql

        try {//al preparar consulta indicamos los valores a agregar
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getEmail());
            ps.setInt(5, usr.getIdTipo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public boolean login(Usuarios usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnect();

        String sql = "SELECT id, usuario, password, nombre, id_Tipo FROM usuarios WHERE usuario = ? LIMIT 1";//primero comparamos el usuario

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();//ejecutamos y traemos el resultado

            if (rs.next()) {//ahora comparamos 3 campos mas para comprobar el login
                if (usr.getPassword().equals(rs.getString(3))) {
                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    usr.setIdTipo(rs.getInt(5));
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public int existeUsuario(String usuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnect();
//consultamos a mysql si el usuario ya existe 
        String sql = "SELECT count(id) FROM usuarios WHERE usuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);//solo enviamos el parametro de usuario
            rs = ps.executeQuery();//Traemos el resultado de mysql

            if (rs.next()) {
                return rs.getInt(1);//retornamos el valor de la consulta//hace la funcion de contador 
            }
            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public boolean esEmail(String correo) {

        // Patrón para validar el email              nombre de correo          arroba            dominio               
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);//valida el correo que llega

        return mather.find();

    }

}


