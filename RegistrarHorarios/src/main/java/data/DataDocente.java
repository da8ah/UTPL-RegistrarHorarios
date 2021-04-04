/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import clases.Docente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class DataDocente extends Conexion { // Hereda de la Clase Conexion

    public Docente buscarDocente(Docente objRecibido) {
        Docente objDocente = new Docente();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT * FROM docente WHERE cedula = ?";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, objRecibido.getCedula());
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

    public boolean insertarDocente(Docente objDocente) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA INSERTAR UN NUEVO OBJETO EN LA BD
        String sql = "INSERT INTO docente (idDocente, nombres, apellidos, cedula, telefono, mail, usuario, contrasena, titulo) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            ps = conexion.prepareStatement(sql); // Solo se ejecuta el Statement (Sentencia)
            // SE ENVÍAN UNO POR UNO LOS ATRIBUTOS A LA BD
            ps.setInt(1, objDocente.getIdDocente());
            ps.setString(2, objDocente.getNombres());
            ps.setString(3, objDocente.getApellidos());
            ps.setString(4, objDocente.getCedula());
            ps.setString(5, objDocente.getTelefono());
            ps.setString(6, objDocente.getMail());
            ps.setString(7, objDocente.getUsuario());
            ps.setString(8, objDocente.getContrasena());
            ps.setString(9, objDocente.getTitulo());
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

    public boolean actualizarDocente(Docente objDocente) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA ACTUALIZAR UN OBJETO EN LA BD
        String sql = "UPDATE docente SET nombres = ?, apellidos = ?, telefono = ?, mail = ?, titulo = ? WHERE idDocente = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, objDocente.getNombres());
            ps.setString(2, objDocente.getApellidos());
            ps.setString(3, objDocente.getTelefono());
            ps.setString(4, objDocente.getMail());
            ps.setString(5, objDocente.getTitulo());
            ps.setInt(6, objDocente.getIdDocente());
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

    public boolean eliminarDocente(Docente objDocente) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA ELIMINAR UN OBJETO DE LA BD
        String sql = "DELETE FROM docente WHERE idDocente = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objDocente.getIdDocente());
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

    public Docente generarId(Docente objDocente) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        String sql = "SELECT MAX(idDocente) + 1 as idGenerado FROM docente";

        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                objDocente.setIdDocente(Integer.parseInt(rs.getString("idGenerado")));
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
