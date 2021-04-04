/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class ValidarEntradas {

    // VALIDACIÓN DE ENTRADAS DE PERSONAS
    public boolean validarCedulas(String cedula) {

        boolean correcto = cedula.matches("[0-9]{10}");

        return correcto;

    }

    public boolean validarNombresApellidos(String nombre) {

        boolean correcto = nombre.matches("([A-Z]{1}[a-z]+){1}((\\s(de|del))?\\s[A-Z]{1}[a-z]+){1}");

        return correcto;

    }

    public boolean validarMail(String mail) {

        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(mail);
        return mat.find();

    }

    public boolean validarNumeroTelefono(String numTelefono) {

        boolean correcto = numTelefono.matches("[0-9]{10}");

        return correcto;

    }

    public boolean validarTitulos(String titulo) {

        boolean correcto = titulo.matches("[A-Z]{1}[a-z]+[\\.]{1}(\\s[A-Z]{2,4}|((\\s[A-Z]{1}[a-z]+){1}(((\\s((y|e)|(a|al)))?(\\s(de|del))?(\\s((el|la)|(los|las)))?\\s[A-Z]{1}[a-z]+)*)))");

        return correcto;

    }

    // VALIDACIÓN DE ENTRADAS DE MATERIAS
    public boolean validarCodigos(String codigo) {

        boolean correcto = codigo.matches("[0-9]{5}");

        return correcto;

    }

    public boolean validarMateriasAreas(String materia) {

        boolean correcto = materia.matches("([A-Z]{1}[a-z]+){1}((\\s((y|e)|(a|al)))?(\\s(de|del))?(\\s((el|la)|(los|las)))?\\s[A-Z]{1}[a-z]+)*");

        return correcto;

    }

    // VALIDACIÓN DE ENTRADAS DE AÑOS LECTIVOS
    public boolean validarPeriodo(String anioLectivo) {

        boolean correcto = anioLectivo.matches("[1]?[0-9]{1}");
        return correcto;

    }

    // VALIDACIÓN DE ENTRADAS DE PARALELOS
    public boolean validarParaleloNombre(String paralelo) {

        boolean correcto = paralelo.matches("([1-9]{1}[A-Z]{1}|([A-Z]{1}[a-z]+){1}((\\s((y|e)|(a|al)))?(\\s(de|del))?(\\s((el|la)|(los|las)))?\\s[A-Z]{1}[a-z]+)*)");
        return correcto;

    }

    public boolean validarParaleloNumEstudiantes(int numEstudiantes) {

        return numEstudiantes >= 0 && numEstudiantes <= 50;

    }

    public boolean validarParaleloUbicacion(String ubicacion) {

        boolean correcto = ubicacion.length() >= 0 && ubicacion.length() <= 100;
        return correcto;

    }

}
