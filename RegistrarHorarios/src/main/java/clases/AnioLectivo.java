/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class AnioLectivo {

    private int idAnioLectivo;
    private Date fechaInicio;
    private Date fechaFinal;

    public AnioLectivo() {
    }

    public AnioLectivo(int idAnioLectivo, Date fechaInicio, Date fechaFinal) {
        this.idAnioLectivo = idAnioLectivo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public int getIdAnioLectivo() {
        return idAnioLectivo;
    }

    public void setIdAnioLectivo(int idAnioLectivo) {
        this.idAnioLectivo = idAnioLectivo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    @Override
    public String toString() { // Impresión para GUI.RegistrarAnioLectivo
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM yyyy");
        String fechaConsistente = dateFormat.format(fechaInicio);
        return fechaConsistente.toUpperCase();
    }

}
