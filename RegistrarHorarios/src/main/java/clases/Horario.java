/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Horario {

    // ATRIBUTOS DE CLASE
    private int idHorario;
    private Date horaInicio;
    private Date horaFin;
    private String dia;

    // ATRIBUTOS DE RELACIÓN
    private Docente docente; // Agregación
    private Materia materia; // Agregación
    private Grado grado; // Agregación
    private AnioLectivo anioLectivo; // Agregación

    // ATRIBUTO ADICIONAL PARA IMPRESIÓN
    private boolean presentar;

    // CONSTRUCTORES
    public Horario() {
    }

    public Horario(Horario horario) { // Constructor para crear una Copia
        this.idHorario = horario.getIdHorario();
        this.horaInicio = horario.getHoraInicio();
        this.horaFin = horario.getHoraFin();
        this.dia = horario.getDia();
        this.docente = horario.getDocente();
        this.materia = horario.getMateria();
        this.grado = horario.getGrado();
        this.anioLectivo = horario.getAnioLectivo();
        this.presentar = false;
    }

    public Horario(int idHorario, Date horaInicio, Date horaFin, String dia, Docente docente, Materia materia, Grado grado, AnioLectivo anioLectivo) {
        this.idHorario = idHorario;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.dia = dia;
        this.docente = docente;
        this.materia = materia;
        this.grado = grado;
        this.anioLectivo = anioLectivo;
        this.presentar = false;
    }

    // GETTER AND SETTER
    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    public AnioLectivo getAnioLectivo() {
        return anioLectivo;
    }

    public void setAnioLectivo(AnioLectivo anioLectivo) {
        this.anioLectivo = anioLectivo;
    }

    public boolean isPresentar() {
        return presentar;
    }

    public void setPresentar(boolean presentar) {
        this.presentar = presentar;
    }

    @Override
    public String toString() { // Impresión para GUI.CrearHorario y GUI.VisualizarHorario
        if (!isPresentar()) {
            return getMateria().getNombre();
        } else { // Para imprimir el Grado y Paralelo cuando es un Docente
            return "(" + getGrado().getParalelos().get(0).getNombre() + ") " + getMateria().getNombre();
        }
    }

}
