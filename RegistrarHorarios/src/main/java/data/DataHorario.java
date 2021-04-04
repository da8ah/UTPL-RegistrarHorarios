/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import clases.AnioLectivo;
import clases.Docente;
import clases.Grado;
import clases.Horario;
import clases.Materia;
import clases.Paralelo;
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
public class DataHorario extends Conexion { // Hereda de la Clase Conexion

    public Horario buscarHorario(Horario objRecibido) {
        Horario objHorario = new Horario();
        String horaConsulta = null;
        Date horaDate = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        /* 
         * Consulta Avanzada para comprobar si existe el Horario
         * dependiendo del GradoParalelo y/o del Docente
         */
        String sql = "SELECT h.* "
                + "FROM horario h "
                + "WHERE h.horaInicio = ? AND h.horaFin = ? AND h.dia = ? "
                + "AND h.horario_idAnioLectivo = ? AND h.horario_idGrado = ? AND h.horario_idParalelo = ? "
                + "OR h.horaInicio = ? AND h.horaFin = ? AND h.dia = ? "
                + "AND h.horario_idAnioLectivo = ? AND h.horario_idDocente = ?";

        try {
            ps = conexion.prepareStatement(sql);

            // CONSULTA POR GRADO - PARALELO
            // FECHAS:
            SimpleDateFormat dateStringFormat = new SimpleDateFormat("HH:mm");
            horaConsulta = dateStringFormat.format(objRecibido.getHoraInicio());
            ps.setString(1, horaConsulta);

            horaConsulta = dateStringFormat.format(objRecibido.getHoraFin());
            ps.setString(2, horaConsulta);

            ps.setString(3, objRecibido.getDia());
            ps.setInt(4, objRecibido.getAnioLectivo().getIdAnioLectivo());
            ps.setInt(5, objRecibido.getGrado().getIdGrado());
            ps.setInt(6, objRecibido.getGrado().getParalelos().get(0).getIdParalelo());

            // CONSULTA POR DOCENTE
            // FECHAS:
            horaConsulta = dateStringFormat.format(objRecibido.getHoraInicio());
            ps.setString(7, horaConsulta);

            horaConsulta = dateStringFormat.format(objRecibido.getHoraFin());
            ps.setString(8, horaConsulta);

            ps.setString(9, objRecibido.getDia());
            ps.setInt(10, objRecibido.getAnioLectivo().getIdAnioLectivo());
            ps.setInt(11, objRecibido.getDocente().getIdDocente());

            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            if (rs.next()) {
                objHorario.setIdHorario(Integer.parseInt(rs.getString("idHorario")));

                // HORAS:
                horaDate = rs.getTime("horaInicio");
                objHorario.setHoraInicio(horaDate);

                horaDate = rs.getTime("horaFin");
                objHorario.setHoraFin(horaDate);

                objHorario.setDia(rs.getString("dia"));
                objHorario.setAnioLectivo(objRecibido.getAnioLectivo());
                objHorario.setGrado(objRecibido.getGrado());
            }
            return objHorario;
        } catch (Exception e) {
            System.err.println(e);
            return objHorario;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // Carga todos los Horarios para GUI.CrearHorario
    public ArrayList<Horario> cargarHorarios(Horario objRecibido) {
        ArrayList<Horario> objListadoHorarios = new ArrayList<>();
        Date horaDate = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT h.* FROM horario h WHERE h.horario_idAnioLectivo = ? AND h.horario_idGrado = ? AND h.horario_idParalelo = ?";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objRecibido.getAnioLectivo().getIdAnioLectivo());
            ps.setInt(2, objRecibido.getGrado().getIdGrado());
            ps.setInt(3, objRecibido.getGrado().getParalelos().get(0).getIdParalelo());
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            while (rs.next()) {
                // SE CREAN OBJETOS CON TODOS LOS ATRIBUTOS
                Horario objHorario = new Horario();
                objHorario.setIdHorario(Integer.parseInt(rs.getString("idHorario")));

                // HORAS:
                horaDate = rs.getTime("horaInicio");
                objHorario.setHoraInicio(horaDate);

                horaDate = rs.getTime("horaFin");
                objHorario.setHoraFin(horaDate);

                objHorario.setDia(rs.getString("dia"));
                objHorario.setAnioLectivo(objRecibido.getAnioLectivo());
                objHorario.setGrado(objRecibido.getGrado());
                objListadoHorarios.add(objHorario);
            }
            return objListadoHorarios;
        } catch (Exception e) {
            System.err.println(e);
            return objListadoHorarios;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    /* 
     * Carga todos los Horarios cuando se Encuentra un Docente
     * en la GUI.CrearHorario con todos los Horarios del Docente
     */
    public ArrayList<Horario> cargarHorariosDocente(Horario objRecibido) {
        ArrayList<Horario> objListadoHorarios = new ArrayList<>();
        Date horaDate = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        try {
            // SE CONSULTAN TODOS LOS HORARIOS DONDE EL DOCENTE NO PARTICIPA
            // PERO DEPENDE DEL AÑO LECTIVO, GRADO Y PARALELO CONSULTADO
            String sql = "SELECT h.* FROM horario h WHERE h.horario_idAnioLectivo = ? AND h.horario_idGrado = ? AND h.horario_idParalelo = ? AND h.horario_idDocente != ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objRecibido.getAnioLectivo().getIdAnioLectivo());
            ps.setInt(2, objRecibido.getGrado().getIdGrado());
            ps.setInt(3, objRecibido.getGrado().getParalelos().get(0).getIdParalelo());
            ps.setInt(4, objRecibido.getDocente().getIdDocente());
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            while (rs.next()) {
                // SE CREAN OBJETOS CON TODOS LOS ATRIBUTOS
                Horario objHorario = new Horario();
                objHorario.setIdHorario(Integer.parseInt(rs.getString("idHorario")));

                // HORAS:
                horaDate = rs.getTime("horaInicio");
                objHorario.setHoraInicio(horaDate);

                horaDate = rs.getTime("horaFin");
                objHorario.setHoraFin(horaDate);

                objHorario.setDia(rs.getString("dia"));
                objHorario.setAnioLectivo(objRecibido.getAnioLectivo());
                objHorario.setGrado(objRecibido.getGrado());
                objListadoHorarios.add(objHorario);
            }

            // SE CONSULTAN TODOS LOS HORARIOS DONDE EL DOCENTE PARTICIPA
            sql = "SELECT h.* FROM horario h WHERE h.horario_idAnioLectivo = ? AND h.horario_idDocente = ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objRecibido.getAnioLectivo().getIdAnioLectivo());
            ps.setInt(2, objRecibido.getDocente().getIdDocente());
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            while (rs.next()) {
                // SE CREAN OBJETOS CON TODOS LOS ATRIBUTOS
                Horario objHorario = new Horario();
                objHorario.setIdHorario(Integer.parseInt(rs.getString("idHorario")));

                // HORAS:
                horaDate = rs.getTime("horaInicio");
                objHorario.setHoraInicio(horaDate);

                horaDate = rs.getTime("horaFin");
                objHorario.setHoraFin(horaDate);

                objHorario.setDia(rs.getString("dia"));
                objHorario.setAnioLectivo(objRecibido.getAnioLectivo());
                objHorario.setGrado(new Grado());
                objHorario = cargarHorariosDocenteGrados(objHorario);
                objListadoHorarios.add(objHorario);
            }

            return objListadoHorarios;
        } catch (Exception e) {
            System.err.println(e);
            return objListadoHorarios;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // Carga todos los Horarios en la GUI.VisualizarHorario
    public ArrayList<Horario> cargarHorarioVisualizar(Horario objRecibido) {
        ArrayList<Horario> objListadoHorarios = new ArrayList<>();
        Date horaDate = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT h.* FROM horario h WHERE h.horario_idDocente = ? AND h.horario_idAnioLectivo = ?";

        try {
            // SE CONSULTAN TODOS LOS HORARIOS DONDE EL DOCENTE PARTICIPA
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objRecibido.getDocente().getIdDocente());
            ps.setInt(2, objRecibido.getAnioLectivo().getIdAnioLectivo());
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            while (rs.next()) {
                // SE CREAN OBJETOS CON TODOS LOS ATRIBUTOS
                Horario objHorario = new Horario();
                objHorario.setIdHorario(Integer.parseInt(rs.getString("idHorario")));

                // HORAS:
                horaDate = rs.getTime("horaInicio");
                objHorario.setHoraInicio(horaDate);

                horaDate = rs.getTime("horaFin");
                objHorario.setHoraFin(horaDate);

                objHorario.setDia(rs.getString("dia"));
                objHorario.setAnioLectivo(objRecibido.getAnioLectivo());
                objHorario.setGrado(new Grado());
                objHorario = cargarHorariosDocenteGrados(objHorario);
                objListadoHorarios.add(objHorario);
            }

            return objListadoHorarios;
        } catch (Exception e) {
            System.err.println(e);
            return objListadoHorarios;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // MÉTODOS PARA COMPLETAR LOS OBJETOS DE LA COMPOSICIÓN
    /* 
     * Carga los Grados para los Métodos cargarHorariosDocente como
     * una extensión de los mismos.
     */
    public Horario cargarHorariosDocenteGrados(Horario objRecibido) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT g.*, p.* FROM horario h, grado g, paralelo p WHERE h.horario_idGrado = g.idGrado AND g.idGrado = p.paralelo_idGrado AND h.horario_idParalelo = p.idParalelo AND h.idHorario = ?";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objRecibido.getIdHorario());
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            if (rs.next()) {
                objRecibido.getGrado().setIdGrado(Integer.parseInt(rs.getString("idGrado")));
                objRecibido.getGrado().setSufijo(rs.getString("sufijo"));

                Paralelo objParalelo = new Paralelo();
                objParalelo.setIdParalelo(Integer.parseInt(rs.getString("idParalelo")));
                objParalelo.setParalelo_idGrado(Integer.parseInt(rs.getString("paralelo_idGrado")));
                objParalelo.setNombre(rs.getString("nombre"));
                objParalelo.setNumEstudiantes(Integer.parseInt(rs.getString("numEstudiantes")));
                objParalelo.setUbicacion(rs.getString("ubicacion"));

                objRecibido.getGrado().setParalelos(new ArrayList<>());
                objRecibido.getGrado().getParalelos().add(objParalelo);
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

    public ArrayList<Horario> cargarDocentes(ArrayList<Horario> objRecibido) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT d.* FROM horario h INNER JOIN docente d ON h.horario_idDocente = d.idDocente WHERE h.idHorario = ?";

        try {
            for (Horario horario : objRecibido) {
                ps = conexion.prepareStatement(sql);
                ps.setInt(1, horario.getIdHorario());
                rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
                while (rs.next()) {
                    horario.setDocente(new Docente(Integer.parseInt(rs.getString("idDocente")),
                            rs.getString("nombres"),
                            rs.getString("apellidos"),
                            rs.getString("cedula"),
                            rs.getString("telefono"),
                            rs.getString("mail"),
                            rs.getString("usuario"),
                            rs.getString("contrasena"),
                            rs.getString("titulo")));
                }
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

    public ArrayList<Horario> cargarMaterias(ArrayList<Horario> objRecibido) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT m.* FROM horario h INNER JOIN materia m ON h.horario_idMateria = m.idMateria WHERE h.idHorario = ?";

        try {
            for (Horario horario : objRecibido) {
                ps = conexion.prepareStatement(sql);
                ps.setInt(1, horario.getIdHorario());
                rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
                while (rs.next()) {
                    horario.setMateria(new Materia(Integer.parseInt(rs.getString("idMateria")),
                            rs.getString("codigo"),
                            rs.getString("nombre"),
                            rs.getString("area")));
                }
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

    public ArrayList<Horario> cargarAnioLectivo(ArrayList<Horario> objRecibido) {
        Date fechaInicioDate = null;
        Date fechaFinDate = null;
        String fechaAux = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT al.* FROM horario h INNER JOIN aniolectivo al ON h.horario_idAnioLectivo = al.idAnioLectivo WHERE h.idHorario = ?";

        try {
            for (Horario horario : objRecibido) {
                ps = conexion.prepareStatement(sql);
                ps.setInt(1, horario.getIdHorario());
                rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
                while (rs.next()) {
                    // HORAS:
                    fechaAux = rs.getString("fechaInicio");
                    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    fechaInicioDate = dateFormat.parse(fechaAux);

                    fechaAux = rs.getString("fechaFin");
                    fechaFinDate = dateFormat.parse(fechaAux);

                    horario.setAnioLectivo(new AnioLectivo(Integer.parseInt(rs.getString("idMateria")),
                            fechaInicioDate,
                            fechaFinDate));
                }
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

    // MÉTODOS PARA MANIPULAR OBJETOS HORARIO
    public boolean insertarHorario(Horario objHorario) {
        String horaConsistente;
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA INSERTAR UN NUEVO OBJETO EN LA BD
        String sql = "INSERT INTO horario (idHorario, horaInicio, horaFin, dia, "
                + "horario_idDocente, horario_idMateria, horario_idAnioLectivo, "
                + "horario_idGrado, horario_idParalelo) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            ps = conexion.prepareStatement(sql); // Solo se ejecuta el Statement (Sentencia)
            // SE ENVÍAN UNO POR UNO LOS ATRIBUTOS A LA BD
            ps.setInt(1, objHorario.getIdHorario());

            // HORAS:
            SimpleDateFormat dateStringFormat = new SimpleDateFormat("HH:mm");
            horaConsistente = dateStringFormat.format(objHorario.getHoraInicio());
            ps.setString(2, horaConsistente);

            horaConsistente = dateStringFormat.format(objHorario.getHoraFin());
            ps.setString(3, horaConsistente);

            ps.setString(4, objHorario.getDia());
            ps.setInt(5, objHorario.getDocente().getIdDocente());
            ps.setInt(6, objHorario.getMateria().getIdMateria());
            ps.setInt(7, objHorario.getAnioLectivo().getIdAnioLectivo());
            ps.setInt(8, objHorario.getGrado().getIdGrado());
            ps.setInt(9, objHorario.getGrado().getParalelos().get(0).getIdParalelo());
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

    public boolean eliminarHorario(Horario objHorario) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA ELIMINAR UN OBJETO DE LA BD
        String sql = "DELETE FROM horario WHERE idHorario = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objHorario.getIdHorario());
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

    public Horario generarId(Horario objHorario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        String sql = "SELECT MAX(idHorario) + 1 as idGenerado FROM horario";

        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                objHorario.setIdHorario(Integer.parseInt(rs.getString("idGenerado")));
            }
            return objHorario;
        } catch (Exception e) {
            System.err.println(e);
            return objHorario;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
