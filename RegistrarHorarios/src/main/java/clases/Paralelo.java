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
public class Paralelo {

    private int idParalelo;
    private int paralelo_idGrado;
    private String nombre;
    private int numEstudiantes;
    private String ubicacion;

    public Paralelo() {
    }

    public Paralelo(int idParalelo, int paralelo_idGrado, String nombre, int numEstudiantes, String ubicacion) {
        this.idParalelo = idParalelo;
        this.paralelo_idGrado = paralelo_idGrado;
        this.nombre = nombre;
        this.numEstudiantes = numEstudiantes;
        this.ubicacion = ubicacion;
    }

    public int getParalelo_idGrado() {
        return paralelo_idGrado;
    }

    public void setParalelo_idGrado(int paralelo_idGrado) {
        this.paralelo_idGrado = paralelo_idGrado;
    }

    public int getIdParalelo() {
        return idParalelo;
    }

    public void setIdParalelo(int idParalelo) {
        this.idParalelo = idParalelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override // Impresión del nombre para la GUI
    public String toString() {
        return nombre;
    }

}
