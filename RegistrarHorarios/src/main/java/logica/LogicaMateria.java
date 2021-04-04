/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.Materia;
import data.DataMateria;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class LogicaMateria {

    DataMateria objDataMateria = new DataMateria();

    public Materia buscarMateria(Materia objMateria) {
        objMateria = objDataMateria.buscarMateria(objMateria);
        return objMateria;
    }

    public boolean insertarMateria(Materia objMateria) {
        objMateria = objDataMateria.generarId(objMateria);
        boolean insertado = objDataMateria.insertarMateria(objMateria);
        return insertado;
    }

    public boolean actualizarMateria(Materia objMateria) {
        boolean actualizado = objDataMateria.actualizarMateria(objMateria);
        return actualizado;
    }

    public boolean eliminarMateria(Materia objMateria) {
        boolean eliminado = objDataMateria.eliminarMateria(objMateria);
        return eliminado;
    }

}
