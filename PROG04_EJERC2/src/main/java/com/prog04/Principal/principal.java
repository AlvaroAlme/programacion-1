/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.prog04.Principal;
import com.prog04.figuras.Rectangulo;
/**
 *
 * @author aalme
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo rectangulo1 = new Rectangulo (3,6);
        Rectangulo rectangulo2 = new Rectangulo (4,4);
        
        System.out.println("Rectangulo 1: " + rectangulo1.toString());
        System.out.println("¿Es cuadrado?: " + rectangulo1.isCuadrado());
        
        System.out.println("Rectangulo2: " + rectangulo2.toString());
        System.out.println("¿Es cuadrado?: " + rectangulo2.isCuadrado());
    }
    
}
