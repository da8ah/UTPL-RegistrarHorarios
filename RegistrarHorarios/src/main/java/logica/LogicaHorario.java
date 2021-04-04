/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.Hora;
import clases.Horario;
import data.DataHorario;
import java.util.ArrayList;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class LogicaHorario {

    DataHorario objDataHorario = new DataHorario();

    public Horario buscarHorario(Horario objHorario) {
        objHorario = objDataHorario.buscarHorario(objHorario);
        return objHorario;
    }

    // Carga los Horarios para GUI.CrearHorario
    public ArrayList<Horario> cargarHorarios(Horario objRecibido) {
        ArrayList<Horario> objListadoHorarios = new ArrayList<>();
        if (objRecibido.getDocente() != null && objRecibido.getDocente().getIdDocente() != 0) {
            // Carga Horarios para un Docente
            objListadoHorarios = objDataHorario.cargarHorariosDocente(objRecibido);
        } else { // Carga Horarios de un Grado y Paralelo
            objListadoHorarios = objDataHorario.cargarHorarios(objRecibido);
        }
        objListadoHorarios = objDataHorario.cargarDocentes(objListadoHorarios);
        objListadoHorarios = objDataHorario.cargarMaterias(objListadoHorarios);
        return objListadoHorarios;
    }

    // Carga los Horarios para GUI.VisualizarHorario
    public ArrayList<Horario> cargarHorarioVisualizar(Horario objRecibido) {
        ArrayList<Horario> objListadoHorarios = new ArrayList<>();
        objListadoHorarios = objDataHorario.cargarHorarioVisualizar(objRecibido);
        objListadoHorarios = objDataHorario.cargarDocentes(objListadoHorarios);
        objListadoHorarios = objDataHorario.cargarMaterias(objListadoHorarios);
        return objListadoHorarios;
    }

    public boolean insertarHorarios(Hora horaInicio, Hora horaFin, int numPeriodoRecreo, int numPeriodos, Horario objHorario, ArrayList<Hora> objListadoHoras) {
        /*
         * Se usan variables para controlar:
         * 1. Inicio del Horario
         * 2. Fin del Horario
         * 3. numPeriodos y numPeriodoRecreo para evitar sobreponer Horarios en
         *    las horas del Recreo y de Salida.
         * 4. objListadoHoras: para obtener la posición de la hora en que se
         *    va a agregar el Horario tomando en cuenta que se agregarán
         *    multiples Horarios y se agregan hora por hora.
         *    Ejemplo:
         *    Matematica -> Lunes 10 a 11
         *    Matematica -> Lunes 11 a 12
         */
        int periodosAgregar = horaFin.getIdHora();
        for (int i = horaInicio.getIdHora(); i < periodosAgregar; i++) {
            if (i != numPeriodoRecreo && i != numPeriodos) { // Diferente del Recreo y Salida
                objHorario.setHoraInicio(objListadoHoras.get(i).getHoraInicio());
                objHorario.setHoraFin(objListadoHoras.get(i).getHoraFin());
                objHorario = objDataHorario.generarId(objHorario);
                if (!objDataHorario.insertarHorario(objHorario)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean eliminarHorarios(ArrayList<Horario> objListadoHorariosEliminar) {
        // Recomendación de Java (Ojalá no explote xD)
        return objListadoHorariosEliminar.stream().noneMatch((horario) -> (!objDataHorario.eliminarHorario(horario)));
    }

}
