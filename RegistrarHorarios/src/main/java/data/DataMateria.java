/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import clases.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class DataMateria extends Conexion { // Hereda de la Clase Conexion

    public Materia buscarMateria(Materia objRecibido) {
        Materia objMateria = new Materia();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT * FROM materia WHERE codigo = ?";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, objRecibido.getCodigo());
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            if (rs.next()) {
                // SE CREA UN OBJETO CON TODOS LOS ATRIBUTOS
                objMateria.setIdMateria(Integer.parseInt(rs.getString("idMateria")));
                objMateria.setCodigo(rs.getString("codigo"));
                objMateria.setNombre(rs.getString("nombre"));
                objMateria.setArea(rs.getString("area"));
            }
            return objMateria;
        } catch (Exception e) {
            System.err.println(e);
            return objMateria;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean insertarMateria(Materia objMateria) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA INSERTAR UN NUEVO OBJETO EN LA BD
        String sql = "INSERT INTO materia (idMateria, codigo, nombre, area) VALUES (?,?,?,?)";
        try {
            ps = conexion.prepareStatement(sql); // Solo se ejecuta el Statement (Sentencia)
            // SE ENVÍAN UNO POR UNO LOS ATRIBUTOS A LA BD
            ps.setInt(1, objMateria.getIdMateria());
            ps.setString(2, objMateria.getCodigo());
            ps.setString(3, objMateria.getNombre());
            ps.setString(4, objMateria.getArea());
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

    public boolean actualizarMateria(Materia objMateria) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA ACTUALIZAR UN OBJETO EN LA BD
        String sql = "UPDATE materia SET codigo = ?, nombre = ?, area = ? WHERE idMateria = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, objMateria.getCodigo());
            ps.setString(2, objMateria.getNombre());
            ps.setString(3, objMateria.getArea());
            ps.setInt(4, objMateria.getIdMateria());
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

    public boolean eliminarMateria(Materia objMateria) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA ELIMINAR UN OBJETO DE LA BD
        String sql = "DELETE FROM materia WHERE idMateria = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objMateria.getIdMateria());
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

    public Materia generarId(Materia objMateria) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        String sql = "SELECT MAX(idMateria) + 1 as idGenerado FROM materia";

        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                objMateria.setIdMateria(Integer.parseInt(rs.getString("idGenerado")));
            }
            return objMateria;
        } catch (Exception e) {
            System.err.println(e);
            return objMateria;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
