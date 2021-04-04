/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.AnioLectivo;
import data.DataAnioLectivo;
import java.util.ArrayList;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class LogicaAnioLectivo {

    DataAnioLectivo objDataAnioLectivo = new DataAnioLectivo();

    public AnioLectivo ultimoAnioLectivo(AnioLectivo objAnioLectivo) {
        objAnioLectivo = objDataAnioLectivo.ultimoAnioLectivo(objAnioLectivo);
        return objAnioLectivo;
    }

    public AnioLectivo buscarAnioLectivo(AnioLectivo objAnioLectivo) {
        objAnioLectivo = objDataAnioLectivo.buscarAnioLectivo(objAnioLectivo);
        return objAnioLectivo;
    }

    public ArrayList<AnioLectivo> cargarAniosLectivos(ArrayList<AnioLectivo> objAniosLectivos) {
        objAniosLectivos = objDataAnioLectivo.cargarAniosLectivos(objAniosLectivos);
        return objAniosLectivos;
    }

    public boolean insertarAnioLectivo(AnioLectivo objAnioLectivo) {
        objAnioLectivo = objDataAnioLectivo.generarId(objAnioLectivo);
        boolean insertado = objDataAnioLectivo.insertarAnioLectivo(objAnioLectivo);
        return insertado;
    }

    public boolean eliminarAnioLectivo(AnioLectivo objAnioLectivo) {
        boolean eliminado = objDataAnioLectivo.eliminarAnioLectivo(objAnioLectivo);
        return eliminado;
    }

}
