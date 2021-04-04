/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.Grado;
import clases.Materia;
import clases.Paralelo;
import data.DataGrado;
import java.util.ArrayList;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class LogicaGrado {

    DataGrado objDataGrado = new DataGrado();

    public ArrayList<Grado> cargarGrados(ArrayList<Grado> objGrados) {
        objGrados = objDataGrado.cargarGrados(objGrados);
        return objGrados;
    }

    public Grado cargarMaterias(Grado objGrado) {
        objGrado = objDataGrado.cargarMaterias(objGrado);
        return objGrado;
    }

    public Grado comprobarGradoMateria(Grado objGrado) {
        // Se devuelve un Grado con una sola materia en el ArrayList<Materia>
        objGrado = objDataGrado.comprobarGradoMateria(objGrado);
        return objGrado;
    }

    public Materia buscarMateria(Materia objMateria) {
        objMateria = objDataGrado.buscarMateria(objMateria);
        return objMateria;
    }

    public boolean insertarGradoMateria(Grado objGrado) {
        boolean insertado = objDataGrado.insertarGradoMateria(objGrado);
        return insertado;
    }

    public boolean eliminarGradoMateria(Grado objGrado) {
        boolean eliminado = objDataGrado.eliminarGradoMateria(objGrado);
        return eliminado;
    }

}
