/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aalmecija.program03.prog08_tarea;

/**
 *
 * @author aalme
 */
public class Libro {
    private String ISBN = null;
    private String titulo;
    private int añoPublicacion;
    private Persona autor;
    private String genero;
    private String sinopsis;

    // Constructor
    public Libro(String ISBN, String titulo, Persona autor, int añoPublicacion, String genero, String sinopsis) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.autor = autor;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    // Getters y setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    // Método toString para imprimir la información del libro
    @Override
    public String toString() {
        return "ISBN: " + ISBN + "\n" +
               "Título: " + titulo + "\n" +
               "Año de Publicación: " + añoPublicacion + "\n" +
               "Autor: " + autor.toString() + "\n" +
               "Género: " + genero + "\n" +
               "Sinopsis: " + sinopsis + "\n";
    }
}
