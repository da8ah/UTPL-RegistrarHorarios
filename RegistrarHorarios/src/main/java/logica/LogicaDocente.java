/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.Docente;
import data.DataDocente;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class LogicaDocente {

    DataDocente objDataDocente = new DataDocente();

    public Docente buscarDocente(Docente objDocente) {
        objDocente = objDataDocente.buscarDocente(objDocente);
        return objDocente;
    }

    public boolean insertarDocente(Docente objDocente) {
        objDocente = objDataDocente.generarId(objDocente);
        objDocente = generarUsuarioContrasena(objDocente);
        boolean insertado = objDataDocente.insertarDocente(objDocente);
        return insertado;
    }

    public boolean actualizarDocente(Docente objDocente) {
        boolean actualizado = objDataDocente.actualizarDocente(objDocente);
        return actualizado;
    }

    public boolean eliminarDocente(Docente objDocente) {
        boolean eliminado = objDataDocente.eliminarDocente(objDocente);
        return eliminado;
    }

    public Docente generarUsuarioContrasena(Docente objDocente) {
        objDocente.setUsuario(objDocente.getCedula());
        objDocente.setContrasena(objDocente.getCedula());
        return objDocente;
    }

}
