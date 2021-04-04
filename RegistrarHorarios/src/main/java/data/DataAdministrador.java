/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import clases.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class DataAdministrador extends Conexion { // Hereda de la Clase Conexion

    public Administrador buscarAdministrador(Administrador objRecibido) {
        Administrador objAdministrador = new Administrador();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT * FROM administrador WHERE cedula = ?";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, objRecibido.getCedula());
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

    public boolean insertarAdministrador(Administrador objAdministrador) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA INSERTAR UN NUEVO OBJETO EN LA BD
        String sql = "INSERT INTO administrador (idAdministrador, nombres, apellidos, cedula, telefono, mail, usuario, contrasena) VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = conexion.prepareStatement(sql); // Solo se ejecuta el Statement (Sentencia)
            // SE ENVÍAN UNO POR UNO LOS ATRIBUTOS A LA BD
            ps.setInt(1, objAdministrador.getIdAdministrador());
            ps.setString(2, objAdministrador.getNombres());
            ps.setString(3, objAdministrador.getApellidos());
            ps.setString(4, objAdministrador.getCedula());
            ps.setString(5, objAdministrador.getTelefono());
            ps.setString(6, objAdministrador.getMail());
            ps.setString(7, objAdministrador.getUsuario());
            ps.setString(8, objAdministrador.getContrasena());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean actualizarAdministrador(Administrador objAdministrador) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA ACTUALIZAR UN OBJETO EN LA BD
        String sql = "UPDATE administrador SET nombres = ?, apellidos = ?, telefono = ?, mail = ? WHERE idAdministrador = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, objAdministrador.getNombres());
            ps.setString(2, objAdministrador.getApellidos());
            ps.setString(3, objAdministrador.getTelefono());
            ps.setString(4, objAdministrador.getMail());
            ps.setInt(5, objAdministrador.getIdAdministrador());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminarAdministrador(Administrador objAdministrador) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA ELIMINAR UN OBJETO DE LA BD
        String sql = "DELETE FROM administrador WHERE idAdministrador = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objAdministrador.getIdAdministrador());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public Administrador generarId(Administrador objAdministrador) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        String sql = "SELECT MAX(idAdministrador) + 1 as idGenerado FROM administrador";

        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                objAdministrador.setIdAdministrador(Integer.parseInt(rs.getString("idGenerado")));
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

}
