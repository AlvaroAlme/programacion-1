/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aalmecija.program03.prog08_tarea;
import java.util.regex.Pattern;
import com.aalmecija.program03.prog08_tarea.Libro;
/**
 *
 * @author aalme
 */
public class Validaciones {
       public static boolean validarISBN(String ISBN){
        
        String regex = "^(97([89]))?\\d{9}(\\d|X)$";
        return Pattern.matches(regex, ISBN);
    }
    
    
    public static boolean validarTitulo(String titulo){
        
        return titulo.length() >= 3;
        
    }
    
    public static boolean validarAutor(String nombre, String apellidos){
        
        return nombre.length() >= 3 && apellidos.length() >= 3 && !Character.isDigit(nombre.charAt(0)) && !Character.isDigit(apellidos.charAt(0));
        
    }
    
    public static boolean validarGenero (String genero){
        return genero.equalsIgnoreCase("drama") || genero.equalsIgnoreCase("misterio") || genero.equalsIgnoreCase("teatro");
        
        
    }
    
    public static boolean validarSinopsis(String sinopsis){
        
        return sinopsis.length() > 0 && Character.isLetter(sinopsis.charAt(0));
    }
    
}

