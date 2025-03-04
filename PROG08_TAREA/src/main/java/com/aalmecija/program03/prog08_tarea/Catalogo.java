/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aalmecija.program03.prog08_tarea;

import com.aalmecija.program03.prog08_tarea.Libro;
import com.aalmecija.program03.prog08_tarea.PROG08_Tarea;
import com.aalmecija.program03.prog08_tarea.Persona;
import com.aalmecija.program03.prog08_tarea.Validaciones;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author aalme
 */
public class Catalogo {
    
    private ArrayList<Libro> libros;

    public Catalogo() {

        libros = new ArrayList<>();
    }

    public void iniciarCatalogo() {

        libros.add(new Libro("","El señor de los anillos" , "J.R.R Tolkien", 1954,"","",));
        libros.add(new Libro("Cien años de soledad", "Gabriel, García Márquez", 1967));
        libros.add(new Libro("La Metamorfosis", "Franz, Kafka", 1915));
        libros.add(new Libro("1984", "George Orwell", 1949));
        libros.add(new Libro("El efecto Mariposa", "Joaquin, Saint Aymour", 2007));
    }

    public void darDeAltaLibro(Libro libro) {
        libros.add(libro);
    }

    public ArrayList<Libro> listadoCompleto() {
        return libros;
    }

    public void bajaLibro(String titulo) {
        libros.removeIf(libro -> libro.getTitulo().equalsIgnoreCase(titulo));
    }

    public void editarLibro(String titulo, Libro nuevoLibro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                libros.set(i, nuevoLibro);
                break;
            }
        }
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public ArrayList<Libro> buscarPorAño(int añoPublicacion) {
        ArrayList<Libro> resultados = new ArrayList<>();

        for (Libro libro : libros) {
            if (libro.getAñoPublicacion() == añoPublicacion) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public ArrayList<Libro> buscarPorISBN(String ISBN) {
        ArrayList<Libro> resultados = new ArrayList<>();

        for (Libro libro : libros) {
            if (libro.getISBN() == ISBN) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    private void altaLibro(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
