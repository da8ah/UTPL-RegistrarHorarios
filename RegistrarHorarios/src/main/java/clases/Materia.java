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
public class Materia {

    private int idMateria;
    private String codigo;
    private String nombre;
    private String area;

    public Materia() {
    }

    public Materia(int idMateria, String codigo, String nombre, String area) {
        this.idMateria = idMateria;
        this.codigo = codigo;
        this.nombre = nombre;
        this.area = area;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override // Impresión del Código para la GUI
    public String toString() {
        return codigo;
    }

}
