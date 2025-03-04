/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aalmecija.program03.prog03_ejerc3;
import java.util.Scanner;

/**
 *
 * @author aalme
 */
//Ejercicio 3: Minimo Comun Multiplo. Implementa un programa Java que pida dos números por teclado, compruebe que son
//positivos y calcule su MCM. En caso de no ser ambos números positivos, el programa
//mostrará un mensaje por pantalla y finalizará.
public class PROG03_EJERC3 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1, num2, mcm, i, aux1, aux2, mcd;
    mcm = 0;
    
    System.out.println("Escriba dos numeros");
    num1 = teclado.nextInt();
    num2 = teclado.nextInt();
    
    aux1 = Math.max(num1, num2);
    aux2 = Math.min(num1, num2);
    if (num1 < 0 || num2 <0){
        System.out.println("No es posible utilizar numeros negativos");
    } else {
     
      
    do{
        mcd = aux2;
        aux2 = aux1 % aux2;
        aux1 = mcd;
    } while (aux2 != 0);
    mcm = Math.max(num1, num2) / mcd * Math.min(num1, num2);
    
    if (mcm != 0)
        System.out.println("El minimo comun multiplo es " + mcm);
        
    }
}
}