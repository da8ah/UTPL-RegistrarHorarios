/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Usuario
 */
public class Administrador extends Persona { // Hereda de la Clase Persona

    private int idAdministrador;

    public Administrador() {
    }

    public Administrador(int idAdministrador, String nombres, String apellidos, String cedula, String telefono, String mail, String usuario, String contrasena) {
        super(nombres, apellidos, cedula, telefono, mail, usuario, contrasena);
        this.idAdministrador = idAdministrador;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

}
