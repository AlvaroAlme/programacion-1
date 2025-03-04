/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aalmecija.program03.prog03_ejerc5;
import java.util.Scanner;

/**
 *
 * @author aalme
 */

/*Ejercicio 5: implementar un programa Java que calcule la división de dos números solicitados por teclado (dividendo y divisor). 
El programa solicitará números indefinidamente hasta que los dos números solicitados sean -1. 
Se debe controlar mediante excepciones que el divisor no sea 0. En caso de serlo, se mostrará un mensaje por pantalla.
También habrá que mostrar por pantalla el número de divisiones calculadas. Utiliza número enteros para las variables.*/


public class PROG03_EJERC5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dividendo, divisor, divisiones = 0;
        double resultado;
        boolean fin = false;
        
        
        System.out.println( "       ---PROGRAMA DE CALCULO DE DIVISIONES---        ");
        System.out.println("Para salir de la aplicacion introducir -1 en los siguientes valores");
            do{
                System.out.println("Introduzca dividendo");
                dividendo = teclado.nextInt();
                System.out.println("Introduzca divisor");
                divisor = teclado.nextInt();
                
                if(dividendo == -1 && divisor == -1){
                    System.out.println("Adiós");
                    return;
                }
                
                try{
                    resultado = dividendo / divisor;
                    resultado = (double) dividendo / divisor;
                    divisiones++;
                    
                    System.out.println("El resultado es = " + resultado);
                    System.out.println("Numero de divisiones realizadas : " + divisiones);
                } catch(ArithmeticException Ari) {
                    System.out.println("El divisor no debe ser 0");
                }
            } while (!fin);
       
    }
}
