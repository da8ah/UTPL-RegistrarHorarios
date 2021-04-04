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
 * @author Danilo Alejandro Ochoa Hidalgo
 */
// CLASE HORA PARA FACILITAR EL CONTROL POR LO QUE NO SE AGREGA EN EL DIAGRAMA
public class Hora {

    private int idHora;
    private Date horaInicio;
    private Date horaFin;

    public Hora() {
    }

    public Hora(int idHora, Date horaInicio, Date horaFin) {
        this.idHora = idHora;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public int getIdHora() {
        return idHora;
    }

    public void setIdHora(int idHora) {
        this.idHora = idHora;
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

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        String horaConsistente = dateFormat.format(horaInicio);
        return horaConsistente.toUpperCase();
    }

}
