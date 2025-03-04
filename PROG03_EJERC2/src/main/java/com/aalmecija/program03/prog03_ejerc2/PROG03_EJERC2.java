/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aalmecija.program03.prog03_ejerc2;
import java.util.Scanner;

/**
 *
 * @author aalme
 */
//Ejercicio 2: Un número es primo si solo tiene dos divisores: el 1 y el propio número. Implementa un programa Java que pida por teclado 5 números. Para cada uno de ellos:
//Comprueba si es negativo. En caso afirmativo, muestra el mensaje por pantalla "El número es negativo".
//Si es positivo, deberá mostrar por pantalla si es primo o no.
//Procesados los 5 números, el programa finaliza.*/

public class PROG03_EJERC2 {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        int[] num = {0,0,0,0,0};
        int i;
        int j;
        boolean noPrimo[] = {true, true, true, true, true};
        
        
        for (i=0; i <= 4; i++){
            System.out.println( "Introducir numero "+ (i +1));
            num[i] = teclado.nextInt();
        }
        for (i=0; i<=4; i++){
            if(num[i] <0)
                System.out.println("El numero " + num[i] + " es negativo");
        }
        for (i=0; i<= 4; i++){
            if (num[i] <2){
                noPrimo[i] = false;
                continue;
            }
        for (j = 2; j< num[i]; j++){
            if (num[i] % j == 0){
                    noPrimo[i] = false;
                };
                
            } 
        }
        for (i = 0; i <= 4; i++){
            if (noPrimo[i] == true){
                System.out.println("El numero " + num[i] + " es primo");
            } else {
                System.out.println("El numero " + num[i] + " no es primo");
            }
           
        }
        
        }
        
        
    }

  

