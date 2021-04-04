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
public class Secretaria extends Persona { // Hereda de la Clase Persona

    private int idSecretaria;
    private String extension;

    public Secretaria() {
    }

    public Secretaria(int idSecretaria, String nombres, String apellidos, String cedula, String telefono, String mail, String usuario, String contrasena, String extension) {
        super(nombres, apellidos, cedula, telefono, mail, usuario, contrasena);
        this.idSecretaria = idSecretaria;
        this.extension = extension;
    }

    public int getIdSecretaria() {
        return idSecretaria;
    }

    public void setIdSecretaria(int idSecretaria) {
        this.idSecretaria = idSecretaria;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

}
