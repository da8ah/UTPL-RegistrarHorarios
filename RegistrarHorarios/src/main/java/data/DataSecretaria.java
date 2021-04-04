/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import clases.Secretaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class DataSecretaria extends Conexion { // Hereda de la Clase Conexion

    public Secretaria buscarSecretaria(Secretaria objRecibido) {
        Secretaria objSecretaria = new Secretaria();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT * FROM secretaria WHERE cedula = ?";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, objRecibido.getCedula());
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

    public boolean insertarSecretaria(Secretaria objSecretaria) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA INSERTAR UN NUEVO OBJETO EN LA BD
        String sql = "INSERT INTO secretaria (idSecretaria, nombres, apellidos, cedula, telefono, mail, usuario, contrasena, extension) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            ps = conexion.prepareStatement(sql); // Solo se ejecuta el Statement (Sentencia)
            // SE ENVÍAN UNO POR UNO LOS ATRIBUTOS A LA BD
            ps.setInt(1, objSecretaria.getIdSecretaria());
            ps.setString(2, objSecretaria.getNombres());
            ps.setString(3, objSecretaria.getApellidos());
            ps.setString(4, objSecretaria.getCedula());
            ps.setString(5, objSecretaria.getTelefono());
            ps.setString(6, objSecretaria.getMail());
            ps.setString(7, objSecretaria.getUsuario());
            ps.setString(8, objSecretaria.getContrasena());
            ps.setString(9, objSecretaria.getExtension());
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

    public boolean actualizarSecretaria(Secretaria objSecretaria) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA ACTUALIZAR UN OBJETO EN LA BD
        String sql = "UPDATE secretaria SET nombres = ?, apellidos = ?, telefono = ?, mail = ?, extension = ? WHERE idSecretaria = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, objSecretaria.getNombres());
            ps.setString(2, objSecretaria.getApellidos());
            ps.setString(3, objSecretaria.getTelefono());
            ps.setString(4, objSecretaria.getMail());
            ps.setString(5, objSecretaria.getExtension());
            ps.setInt(6, objSecretaria.getIdSecretaria());
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

    public boolean eliminarSecretaria(Secretaria objSecretaria) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA ELIMINAR UN OBJETO DE LA BD
        String sql = "DELETE FROM secretaria WHERE idSecretaria = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objSecretaria.getIdSecretaria());
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

    public Secretaria generarId(Secretaria objSecretaria) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        String sql = "SELECT MAX(idSecretaria) + 1 as idGenerado FROM secretaria";

        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                objSecretaria.setIdSecretaria(Integer.parseInt(rs.getString("idGenerado")));
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

}
