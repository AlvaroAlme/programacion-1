/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aalmecija.program03.prog06_tarea;

/**
 *
 * @author aalme
 */
public class Validacion {
/* CREAMOS UNA CLASE PARA REALIZAR LAS VALIDACIONES DE DNI, MATRIUCLA Y NOMBRE*/
    public static boolean validarDNI(String DNI) {
/* ESTABLECEMOS QUE EL DNI DEBE CONTENER 8 CARACETERES QUE SEAN NUMEROS COMPRENDIDOS ENTRE 0 Y 9, ASI COMO LAS LETRAS DEL DNI*/
        return DNI.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
    }

    public static boolean validarMatricula(String matricula) {
/*PARA LA MATRICULA LO MISMO, 4 DIGITOS Y 3 LETRAS*/
        return matricula.matches("^[0-9]{4}[A-Z]{3}$");

    }

    public static boolean validarNombre(String nombre) {

        if (nombre.length() > 50) {
            return false;

        }

        char caracter;
        int numEspacios = 0;

        for (int i = 0; i < nombre.length(); i++){
            caracter = nombre.charAt(i);
            if (caracter == ' ') {
                numEspacios++;
            }
            if (Character.isDigit(caracter)) {
                return false;
            }
        }

        if (numEspacios >= 2) {
            return true;
        }
        return false;
    }
}
