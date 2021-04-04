/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.Administrador;
import data.DataAdministrador;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class LogicaAdministrador {

    DataAdministrador objDataAdministrador = new DataAdministrador();

    public Administrador buscarAdministrador(Administrador objAdministrador) {
        objAdministrador = objDataAdministrador.buscarAdministrador(objAdministrador);
        return objAdministrador;
    }

    public boolean insertarAdministrador(Administrador objAdministrador) {
        objAdministrador = objDataAdministrador.generarId(objAdministrador);
        objAdministrador = generarUsuarioContrasena(objAdministrador);
        boolean insertado = objDataAdministrador.insertarAdministrador(objAdministrador);
        return insertado;
    }

    public boolean actualizarAdministrador(Administrador objAdministrador) {
        boolean actualizado = objDataAdministrador.actualizarAdministrador(objAdministrador);
        return actualizado;
    }

    public boolean eliminarAdministrador(Administrador objAdministrador) {
        boolean eliminado = objDataAdministrador.eliminarAdministrador(objAdministrador);
        return eliminado;
    }

    public Administrador generarUsuarioContrasena(Administrador objAdministrador) {
        objAdministrador.setUsuario(objAdministrador.getCedula());
        objAdministrador.setContrasena(objAdministrador.getCedula());
        return objAdministrador;
    }

}
