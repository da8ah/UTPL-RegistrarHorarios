/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.Grado;
import clases.Paralelo;
import data.DataGrado;
import java.util.ArrayList;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class LogicaParalelo {

    DataGrado objDataGradoParalelo = new DataGrado();

    public Grado cargarParalelos(Grado objGrado) {
        objGrado = objDataGradoParalelo.cargarParalelos(objGrado);
        return objGrado;
    }

    public Grado nuevoParalelo(Grado objGrado) {
        objGrado.agregarParalelo(objGrado.getParalelos().size() + 1, objGrado.getIdGrado(), "", 0, "");
        return objGrado;
    }

    public Grado quitarParalelo(Grado objGrado) {
        objGrado.getParalelos().remove(objGrado.getParalelos().get(objGrado.getParalelos().size() - 1));;
        return objGrado;
    }

    public boolean guardarParalelos(ArrayList<Paralelo> objListadoParalelos, Grado objGrado) {
        boolean guardado = false;

        if (objListadoParalelos.size() < objGrado.getParalelos().size()) {
            // Si se agregaron Paralelos

            for (Paralelo paralelo : objGrado.getParalelos()) {

                if (paralelo.getIdParalelo() - 1 < objListadoParalelos.size() && !paralelo.equals(objListadoParalelos.get(paralelo.getIdParalelo() - 1))) {
                    // Si paralelo != objListadoParalelos.get();
                    guardado = actualizarParalelo(paralelo);
                    if (!guardado) {
                        return false;
                    }
                }

            }

            for (int i = objListadoParalelos.size(); i < objGrado.getParalelos().size(); i++) {

                guardado = insertarParalelo(objGrado.getParalelos().get(i));
                if (!guardado) {
                    return false;
                }

            }

        } else if (objListadoParalelos.size() > objGrado.getParalelos().size()) {
            // Si se eliminaron Paralelos

            for (Paralelo paralelo : objListadoParalelos) {

                if (paralelo.getIdParalelo() - 1 < objGrado.getParalelos().size() && !paralelo.equals(objGrado.getParalelos().get(paralelo.getIdParalelo() - 1))) {
                    // Si paralelo != objListadoParalelos.get();
                    guardado = actualizarParalelo(paralelo);
                    if (!guardado) {
                        return false;
                    }
                }

            }

            for (int i = objGrado.getParalelos().size(); i < objListadoParalelos.size(); i++) {

                guardado = eliminarParalelo(objListadoParalelos.get(i));
                if (!guardado) {
                    return false;
                }

            }

        } else if (objListadoParalelos.size() == objGrado.getParalelos().size()) {
            // Si se actualizaron Paralelos

            for (Paralelo paralelo : objListadoParalelos) {

                guardado = actualizarParalelo(paralelo);
                if (!guardado) {
                    return false;
                }

            }

        }

        return guardado;
    }

    public boolean insertarParalelo(Paralelo objParalelo) {
        boolean insertado = objDataGradoParalelo.insertarParalelo(objParalelo);
        return insertado;
    }

    public boolean actualizarParalelo(Paralelo objParalelo) {
        boolean actualizado = objDataGradoParalelo.actualizarParalelo(objParalelo);
        return actualizado;
    }

    public boolean eliminarParalelo(Paralelo objParalelo) {
        boolean eliminado = objDataGradoParalelo.eliminarParalelo(objParalelo);
        return eliminado;
    }

}
