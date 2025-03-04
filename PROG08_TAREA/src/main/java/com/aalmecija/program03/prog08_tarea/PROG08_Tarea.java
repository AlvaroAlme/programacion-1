/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.aalmecija.program03.prog08_tarea;

import java.util.ArrayList;
import com.aalmecija.program03.prog08_tarea.Catalogo;
import com.aalmecija.program03.prog08_tarea.Libro;
import com.aalmecija.program03.prog08_tarea.Persona;
import com.aalmecija.program03.prog08_tarea.Validaciones;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;

/**
 *
 * @author aalme
 */
public class PROG08_Tarea {
    Libro libro;
    
    private static Catalogo catalogo = new Catalogo();
    private static Scanner sn = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        boolean salir = false;
        int opcion;
        catalogo.iniciarCatalogo();
        
        while (!salir) {
            
            try {
                
                System.out.println("1.Mostrar listado completo de libros.");
                System.out.println("2.Dar de alta nuevo libro.");
                System.out.println("3.Editar libro existente.");
                System.out.println("4.Dar de baja libro existente.");
                System.out.println("5.Buscar libro por titulo.");
                System.out.println("6.Buscar libro por año de publicacion.");
                System.out.println("7.Mostrar listado ordenador por titulo.");
                System.out.println("8.Mostrar listado ordenado por año de publicacion y autor.");
                System.out.println("9.Salir.");
                
                opcion = sn.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.println(catalogo.listadoCompleto());
                        break;
                    case 2:
                        
                        break;
                    
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        salir = true;
                        System.out.println("Adios!");
                        break;
                    
                    default:
                        System.out.println("Elija una opción");
                    
                }
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        }
    }
}
