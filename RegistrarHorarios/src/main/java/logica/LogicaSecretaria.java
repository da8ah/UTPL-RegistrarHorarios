/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.Secretaria;
import data.DataSecretaria;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class LogicaSecretaria {

    DataSecretaria objDataSecretaria = new DataSecretaria();

    public Secretaria buscarSecretaria(Secretaria objSecretaria) {
        objSecretaria = objDataSecretaria.buscarSecretaria(objSecretaria);
        return objSecretaria;
    }

    public boolean insertarSecretaria(Secretaria objSecretaria) {
        objSecretaria = objDataSecretaria.generarId(objSecretaria);
        objSecretaria = generarExtension(objSecretaria);
        objSecretaria = generarUsuarioContrasena(objSecretaria);
        boolean insertado = objDataSecretaria.insertarSecretaria(objSecretaria);
        return insertado;
    }

    public boolean actualizarSecretaria(Secretaria objSecretaria) {
        boolean actualizado = objDataSecretaria.actualizarSecretaria(objSecretaria);
        return actualizado;
    }

    public boolean eliminarSecretaria(Secretaria objSecretaria) {
        boolean eliminado = objDataSecretaria.eliminarSecretaria(objSecretaria);
        return eliminado;
    }

    public Secretaria generarUsuarioContrasena(Secretaria objSecretaria) {
        objSecretaria.setUsuario(objSecretaria.getCedula());
        objSecretaria.setContrasena(objSecretaria.getCedula());
        return objSecretaria;
    }

    public Secretaria generarExtension(Secretaria objSecretaria) {
        objSecretaria.setExtension(objSecretaria.getCedula());
        return objSecretaria;
    }

}
