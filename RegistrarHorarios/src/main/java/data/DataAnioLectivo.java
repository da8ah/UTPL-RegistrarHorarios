/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import clases.AnioLectivo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class DataAnioLectivo extends Conexion { // Hereda de la Clase Conexion

    public AnioLectivo ultimoAnioLectivo(AnioLectivo objRecibido) {
        AnioLectivo objAnioLectivo = new AnioLectivo();
        Date fechaEnvio = null;
        String fechaAux = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT * \n"
                + "FROM aniolectivo \n"
                + "WHERE idAnioLectivo = (\n"
                + "	SELECT MAX(idAnioLectivo)\n"
                + "    FROM aniolectivo\n"
                + ");";

        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            if (rs.next()) {
                // SE CREA UN OBJETO CON TODOS LOS ATRIBUTOS
                objAnioLectivo.setIdAnioLectivo(Integer.parseInt(rs.getString("idAnioLectivo")));

                // FECHAS:
                fechaAux = rs.getString("fechaInicio");
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                fechaEnvio = dateFormat.parse(fechaAux);
                objAnioLectivo.setFechaInicio(fechaEnvio);

                fechaAux = rs.getString("fechaFin");
                fechaEnvio = dateFormat.parse(fechaAux);
                objAnioLectivo.setFechaFinal(fechaEnvio);
            }
            return objAnioLectivo;
        } catch (Exception e) {
            System.err.println(e);
            return objAnioLectivo;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public AnioLectivo buscarAnioLectivo(AnioLectivo objRecibido) {
        AnioLectivo objAnioLectivo = new AnioLectivo();
        Date fechaEnvio = null;
        String fechaAux = null;
        String fechaConsulta = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT * FROM aniolectivo WHERE fechaInicio = ? AND fechaFin = ?";

        try {
            ps = conexion.prepareStatement(sql);
            // FECHAS:
            SimpleDateFormat dateStringFormat = new SimpleDateFormat("yyyy-MM-dd");
            fechaConsulta = dateStringFormat.format(objRecibido.getFechaInicio());
            ps.setString(1, fechaConsulta);

            dateStringFormat = new SimpleDateFormat("yyyy-MM-dd");
            fechaConsulta = dateStringFormat.format(objRecibido.getFechaFinal());
            ps.setString(2, fechaConsulta);

            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            if (rs.next()) {
                // SE CREA UN OBJETO CON TODOS LOS ATRIBUTOS
                objAnioLectivo.setIdAnioLectivo(Integer.parseInt(rs.getString("idAnioLectivo")));

                // FECHAS:
                fechaAux = rs.getString("fechaInicio");
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                fechaEnvio = dateFormat.parse(fechaAux);
                objAnioLectivo.setFechaInicio(fechaEnvio);

                fechaAux = rs.getString("fechaFin");
                fechaEnvio = dateFormat.parse(fechaAux);
                objAnioLectivo.setFechaFinal(fechaEnvio);
            }
            return objAnioLectivo;
        } catch (Exception e) {
            System.err.println(e);
            return objAnioLectivo;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public ArrayList<AnioLectivo> cargarAniosLectivos(ArrayList<AnioLectivo> objRecibido) {
        Date fechaConsistente = null;
        String fechaAux = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT * FROM aniolectivo ORDER BY 2";

        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            while (rs.next()) {
                // SE CREAN OBJETOS CON TODOS LOS ATRIBUTOS
                AnioLectivo objAnioLectivo = new AnioLectivo();
                objAnioLectivo.setIdAnioLectivo(Integer.parseInt(rs.getString("idAnioLectivo")));

                // FECHAS:
                fechaAux = rs.getString("fechaInicio");
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                fechaConsistente = dateFormat.parse(fechaAux);
                objAnioLectivo.setFechaInicio(fechaConsistente);

                fechaAux = rs.getString("fechaFin");
                fechaConsistente = dateFormat.parse(fechaAux);
                objAnioLectivo.setFechaFinal(fechaConsistente);

                objRecibido.add(objAnioLectivo);
            }
            return objRecibido;
        } catch (Exception e) {
            System.err.println(e);
            return objRecibido;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean insertarAnioLectivo(AnioLectivo objAnioLectivo) {
        String fechaConsistente = null;
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA INSERTAR UN NUEVO OBJETO EN LA BD
        String sql = "INSERT INTO aniolectivo (idAnioLectivo, fechaInicio, fechaFin) VALUES (?,?,?)";
        try {
            ps = conexion.prepareStatement(sql); // Solo se ejecuta el Statement (Sentencia)
            // SE ENVÍAN UNO POR UNO LOS ATRIBUTOS A LA BD
            ps.setInt(1, objAnioLectivo.getIdAnioLectivo());

            // FECHAS:
            SimpleDateFormat dateStringFormat = new SimpleDateFormat("yyyy-MM-dd");
            fechaConsistente = dateStringFormat.format(objAnioLectivo.getFechaInicio());
            ps.setString(2, fechaConsistente);

            fechaConsistente = dateStringFormat.format(objAnioLectivo.getFechaFinal());
            ps.setString(3, fechaConsistente);

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

    public boolean eliminarAnioLectivo(AnioLectivo objAnioLectivo) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA ELIMINAR UN OBJETO DE LA BD
        String sql = "DELETE FROM aniolectivo WHERE idAnioLectivo = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objAnioLectivo.getIdAnioLectivo());
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

    public AnioLectivo generarId(AnioLectivo objAnioLectivo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        String sql = "SELECT MAX(idAnioLectivo) + 1 as idGenerado FROM aniolectivo";

        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                objAnioLectivo.setIdAnioLectivo(Integer.parseInt(rs.getString("idGenerado")));
            }
            return objAnioLectivo;
        } catch (Exception e) {
            System.err.println(e);
            return objAnioLectivo;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
