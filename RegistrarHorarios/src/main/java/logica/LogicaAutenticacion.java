/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.Administrador;
import clases.Docente;
import clases.Secretaria;
import data.DataAutenticacion;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class LogicaAutenticacion {

    DataAutenticacion objDataAutenticacion = new DataAutenticacion();

    public Administrador buscarAdministrador(Administrador objAdministrador) {
        objAdministrador = objDataAutenticacion.buscarAdministrador(objAdministrador);
        return objAdministrador;
    }

    public Secretaria buscarSecretaria(Secretaria objSecretaria) {
        objSecretaria = objDataAutenticacion.buscarSecretaria(objSecretaria);
        return objSecretaria;
    }

    public Docente buscarDocente(Docente objDocente) {
        objDocente = objDataAutenticacion.buscarDocente(objDocente);
        return objDocente;
    }
   
}
