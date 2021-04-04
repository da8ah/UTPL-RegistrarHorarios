/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import clases.Grado;
import clases.Materia;
import clases.Paralelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class DataGrado extends Conexion { // Hereda de la Clase Conexion

    // MÉTODOS PARA CARGAR LOS DATOS
    public ArrayList<Grado> cargarGrados(ArrayList<Grado> objRecibido) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT * FROM grado";

        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            while (rs.next()) {
                // SE CREAN OBJETOS CON TODOS LOS ATRIBUTOS
                Grado objGrado = new Grado();
                objGrado.setIdGrado(Integer.parseInt(rs.getString("idGrado")));
                objGrado.setSufijo(rs.getString("sufijo"));
                objRecibido.add(objGrado);
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

    public Grado cargarMaterias(Grado objRecibido) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT m.* "
                + "FROM grado g, materia m, grado_materia gm "
                + "WHERE g.idGrado = gm.idGrado AND gm.idMateria = m.idMateria "
                + "AND g.idGrado = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objRecibido.getIdGrado());
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            while (rs.next()) {
                // SE CREAN OBJETOS CON TODOS LOS ATRIBUTOS
                Materia objMateria = new Materia();
                objMateria.setIdMateria(Integer.parseInt(rs.getString("idMateria")));
                objMateria.setCodigo(rs.getString("codigo"));
                objMateria.setNombre(rs.getString("nombre"));
                objMateria.setArea(rs.getString("area"));
                objRecibido.getMaterias().add(objMateria);
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

    public Grado cargarParalelos(Grado objRecibido) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT p.* FROM grado g INNER JOIN paralelo p ON g.idGrado = p.paralelo_idGrado WHERE g.idGrado = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objRecibido.getIdGrado());
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            while (rs.next()) {
                // SE CREAN OBJETOS CON TODOS LOS ATRIBUTOS
                Paralelo objParalelo = new Paralelo();
                objParalelo.setIdParalelo(Integer.parseInt(rs.getString("idParalelo")));
                objParalelo.setParalelo_idGrado(Integer.parseInt(rs.getString("paralelo_idGrado")));
                objParalelo.setNombre(rs.getString("nombre"));
                objParalelo.setNumEstudiantes(Integer.parseInt(rs.getString("numEstudiantes")));
                objParalelo.setUbicacion(rs.getString("ubicacion"));
                objRecibido.getParalelos().add(objParalelo);
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

    // Comprueba si ya existe la relación entre un Grado y una Materia específicas
    public Grado comprobarGradoMateria(Grado objRecibido) {
        Grado objGrado = new Grado();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        // CONSULTA PARA OBTENER UN OBJETO DESDE LA BD
        String sql = "SELECT g.idGrado, m.codigo FROM grado g, materia m, grado_materia gm "
                + "WHERE g.idGrado = gm.idGrado AND gm.idMateria = m.idMateria "
                + "AND g.idGrado = ? AND m.codigo = ?";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objRecibido.getIdGrado());
            ps.setString(2, objRecibido.getMaterias().get(0).getCodigo());
            rs = ps.executeQuery(); // Se ejecuta la Query (Consulta)
            if (rs.next()) {
                // SE CREA UN OBJETO CON TODOS LOS ATRIBUTOS
                objGrado.setIdGrado(Integer.parseInt(rs.getString("idGrado")));
                objGrado.setMaterias(new ArrayList<>());
                Materia materia = new Materia();
                materia.setCodigo(rs.getString("codigo"));
                if (materia.getCodigo() != null) {
                    // Se devuelve un Grado con una sola materia en el ArrayList<Materia>
                    objGrado.getMaterias().add(materia);
                }
            }
            return objGrado;
        } catch (Exception e) {
            System.err.println(e);
            return objGrado;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // MÉTODOS PARA MANIPULAR OBJETOS GRADO - MATERIA
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

    public boolean insertarGradoMateria(Grado objGradoMateria) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA INSERTAR UN NUEVO OBJETO EN LA BD
        String sql = "INSERT INTO grado_materia VALUES (?,?)";
        try {
            ps = conexion.prepareStatement(sql); // Solo se ejecuta el Statement (Sentencia)
            // SE ENVÍAN UNO POR UNO LOS ATRIBUTOS A LA BD
            ps.setInt(1, objGradoMateria.getIdGrado());
            ps.setInt(2, objGradoMateria.getMaterias().get(0).getIdMateria());
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

    public boolean eliminarGradoMateria(Grado objGradoMateria) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA ELIMINAR UN OBJETO DE LA BD
        String sql = "DELETE FROM grado_materia WHERE idGrado = ? AND idMateria = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objGradoMateria.getIdGrado());
            ps.setInt(2, objGradoMateria.getMaterias().get(0).getIdMateria());
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

    public boolean insertarParalelo(Paralelo objParalelo) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA INSERTAR UN NUEVO OBJETO EN LA BD
        String sql = "INSERT INTO paralelo (idParalelo, paralelo_idGrado, nombre, numEstudiantes, ubicacion) VALUES (?,?,?,?,?)";
        try {
            ps = conexion.prepareStatement(sql); // Solo se ejecuta el Statement (Sentencia)
            // SE ENVÍAN UNO POR UNO LOS ATRIBUTOS A LA BD
            ps.setInt(1, objParalelo.getIdParalelo());
            ps.setInt(2, objParalelo.getParalelo_idGrado());
            ps.setString(3, objParalelo.getNombre());
            ps.setInt(4, objParalelo.getNumEstudiantes());
            ps.setString(5, objParalelo.getUbicacion());
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

    public boolean actualizarParalelo(Paralelo objParalelo) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA INSERTAR UN NUEVO OBJETO EN LA BD
        String sql = "UPDATE paralelo SET idParalelo = ?, "
                + "paralelo_idGrado = ?, "
                + "nombre = ?, "
                + "numEstudiantes = ?, ubicacion = ? "
                + "WHERE idParalelo = ? AND paralelo_idGrado = ?";
        try {
            ps = conexion.prepareStatement(sql); // Solo se ejecuta el Statement (Sentencia)
            // SE ENVÍAN UNO POR UNO LOS ATRIBUTOS A LA BD
            ps.setInt(1, objParalelo.getIdParalelo());
            ps.setInt(2, objParalelo.getParalelo_idGrado());
            ps.setString(3, objParalelo.getNombre());
            ps.setInt(4, objParalelo.getNumEstudiantes());
            ps.setString(5, objParalelo.getUbicacion());

            ps.setInt(6, objParalelo.getIdParalelo());
            ps.setInt(7, objParalelo.getParalelo_idGrado());
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

    public boolean eliminarParalelo(Paralelo objParalelo) {
        PreparedStatement ps = null;
        Connection conexion = getConexion();
        // SENTENCIA PARA ELIMINAR UN OBJETO DE LA BD
        String sql = "DELETE FROM paralelo WHERE idParalelo = ? AND paralelo_idGrado = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, objParalelo.getIdParalelo());
            ps.setInt(2, objParalelo.getParalelo_idGrado());
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

}
