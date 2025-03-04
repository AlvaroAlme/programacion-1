/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aalmecija.program03.prog08_tarea;

/**
 *
 * @author aalme
 */
public class Persona {
    private String apellidos;
    private String nombre;

    // Constructor
    public Persona(String apellidos, String nombre) {
        this.apellidos = apellidos;
        this.nombre = nombre;
    }

    // Getters y setters
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString para imprimir la información del autor
    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }
}
