/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aalmecija.program03.prog04_ejerc1;

import com.aalmecija.program03.prog04_ejerc1.Fecha.enumMes;

/**
 *
 * @author aalme
 */
public class Principal {
    public static void main (String[] args) {
        
        
        System.out.println("Primera fecha, inicializada con el primer constructor");
        Fecha objFecha1 = new Fecha(enumMes.DICIEMBRE);
        objFecha1.setDia(31);
        objFecha1.setAño(1995);
        
        System.out.println(" La fecha es: " + objFecha1.toString());
        System.out.println(objFecha1.isSummer() ? "Es verano" : "No es verano");
        
        System.out.println("Segunda fecha, inicializada con el segundo constructor");
        Fecha objFecha2 = new Fecha(17, enumMes.AGOSTO, 2023);
        System.out.println(objFecha2.getAño ());
        System.out.println(" La fecha es: " + objFecha2.toString());
        System.out.println(objFecha2.isSummer () ? "Es verano" : "No es verano");
        
        
        
    }
    
}
