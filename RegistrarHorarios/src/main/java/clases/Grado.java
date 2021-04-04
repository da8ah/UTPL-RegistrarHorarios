/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Grado {

    // ATRIBUTOS DE CLASE
    private int idGrado;
    private String sufijo;

    // ATRIBUTOS DE RELACIÓN
    private ArrayList<Materia> materias; // Agregación: Array de Materias para la Malla
    private ArrayList<Paralelo> paralelos; // Composición: Array de Paralelos

    // CONSTRUCTORES
    public Grado() {
    }

    public Grado(int idGrado, String sufijo, ArrayList<Materia> materias, int idParalelo, int paralelo, String nombre, int numEstudiantes, String ubicacion) {
        this.idGrado = idGrado;
        this.sufijo = sufijo;
        // Agregación para las Materias
        this.materias = materias;
        // Composición para los Paralelos
        this.paralelos.add(new Paralelo(idParalelo, paralelo, nombre, numEstudiantes, ubicacion));
    }

    // GETTER AND SETTER
    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public String getSufijo() {
        return sufijo;
    }

    public void setSufijo(String sufijo) {
        this.sufijo = sufijo;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    public void setParalelos(ArrayList<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }

    // Se agrega individualmente un Paralelo al Array de Paralelos
    public void agregarParalelo(int idParalelo, int paralelo, String nombre, int numEstudiantes, String ubicacion) {
        this.paralelos.add(new Paralelo(idParalelo, paralelo, nombre, numEstudiantes, ubicacion));
    }

    @Override
    public String toString() { // Impresión para los Grados
        return idGrado + sufijo;
    }

}
