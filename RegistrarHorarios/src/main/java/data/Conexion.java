/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class Conexion { // Clase Padre para todas las conexiones a BD

    private final String baseDatosEsquema = "sistemaescolar";
    private final String usuario = "root";
    private final String contrasena = "";
    private final String url = "jdbc:mysql://localhost:3306/" + baseDatosEsquema;
    private Connection conexion = null;

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(this.url, this.usuario, this.contrasena);
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }

}
