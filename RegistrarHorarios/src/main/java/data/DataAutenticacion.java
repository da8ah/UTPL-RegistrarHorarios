/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import clases.Administrador;
import clases.Docente;
import clases.Secretaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class DataAutenticacion extends Conexion { // Hereda de la Clase Conexion

    public Administrador buscarAdministrador(Administrador objRecibido) {
        Administrador objAdministrador = new Administrador();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT * FROM administrador WHERE usuario = ?";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, objRecibido.getUsuario());
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            if (rs.next()) {
                // SE CREA UN OBJETO CON TODOS LOS ATRIBUTOS
                objAdministrador.setIdAdministrador(Integer.parseInt(rs.getString("idAdministrador")));
                objAdministrador.setNombres(rs.getString("nombres"));
                objAdministrador.setApellidos(rs.getString("apellidos"));
                objAdministrador.setCedula(rs.getString("cedula"));
                objAdministrador.setTelefono(rs.getString("telefono"));
                objAdministrador.setMail(rs.getString("mail"));
                objAdministrador.setUsuario(rs.getString("usuario"));
                objAdministrador.setContrasena(rs.getString("contrasena"));
            }
            return objAdministrador;
        } catch (Exception e) {
            System.err.println(e);
            return objAdministrador;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public Secretaria buscarSecretaria(Secretaria objRecibido) {
        Secretaria objSecretaria = new Secretaria();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT * FROM secretaria WHERE usuario = ?";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, objRecibido.getUsuario());
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            if (rs.next()) {
                // SE CREA UN OBJETO CON TODOS LOS ATRIBUTOS
                objSecretaria.setIdSecretaria(Integer.parseInt(rs.getString("idSecretaria")));
                objSecretaria.setNombres(rs.getString("nombres"));
                objSecretaria.setApellidos(rs.getString("apellidos"));
                objSecretaria.setCedula(rs.getString("cedula"));
                objSecretaria.setTelefono(rs.getString("telefono"));
                objSecretaria.setMail(rs.getString("mail"));
                objSecretaria.setUsuario(rs.getString("usuario"));
                objSecretaria.setContrasena(rs.getString("contrasena"));
                objSecretaria.setExtension(rs.getString("extension"));
            }
            return objSecretaria;
        } catch (Exception e) {
            System.err.println(e);
            return objSecretaria;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public Docente buscarDocente(Docente objRecibido) {
        Docente objDocente = new Docente();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT * FROM docente WHERE usuario = ?";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, objRecibido.getUsuario());
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            if (rs.next()) {
                // SE CREA UN OBJETO CON TODOS LOS ATRIBUTOS
                objDocente.setIdDocente(Integer.parseInt(rs.getString("idDocente")));
                objDocente.setNombres(rs.getString("nombres"));
                objDocente.setApellidos(rs.getString("apellidos"));
                objDocente.setCedula(rs.getString("cedula"));
                objDocente.setTelefono(rs.getString("telefono"));
                objDocente.setMail(rs.getString("mail"));
                objDocente.setUsuario(rs.getString("usuario"));
                objDocente.setContrasena(rs.getString("contrasena"));
                objDocente.setTitulo(rs.getString("titulo"));
            }
            return objDocente;
        } catch (Exception e) {
            System.err.println(e);
            return objDocente;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
