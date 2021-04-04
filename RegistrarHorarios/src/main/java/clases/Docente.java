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
public class Docente extends Persona { // Hereda de la Clase Persona

    private int idDocente;
    private String titulo;

    public Docente() {
    }

    public Docente(int idDocente, String nombres, String apellidos, String cedula, String telefono, String mail, String usuario, String contrasena, String titulo) {
        super(nombres, apellidos, cedula, telefono, mail, usuario, contrasena);
        this.idDocente = idDocente;
        this.titulo = titulo;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
