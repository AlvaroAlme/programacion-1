/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.aalmecija.program03.prog03_ejerc1;

import java.util.Scanner;

/**
 *
 * @author aalme
 */
//Implementar un programa que muestre la tabla de multiplicar de un número leido desde teclado utilizando 3 bucles diferentes.
//El numero debe ser menor de 30, en caso contrario se mostrará un mensaje por pantalla y el programa finalizará.
public class PROG03_EJERC1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //CON ESTA FUNCION AÑADIMOS LA UTILIDAD PARA LEER POR TECLADO

        int numero1, num;
        String metodo;

        System.out.println("Introduce un numero menor de 30");
        numero1 = teclado.nextInt(); //YA TENEMOS EL NUMERO INTRODUCIDO

        if (numero1 >= 30) {
            System.out.println("El numero introducido debe ser menor de 30");
            
            //COMPROBAMOS QUE EL NUMERO ES MENOR DE 30

        }
        System.out.println("Elige un metodo entre 'for', 'while' y 'do-while'");
        metodo = teclado.next();
        
        //PEDIMOS AL USUARIO QUE ELIJA UN METODO DE ENTRE LOS 3 DADOS, SI NO ES NINGUNO DE ELLOS VOLVEMOS PARA QUE ELIJA
        
        if (!metodo.equals("for") && !metodo.equals("while") && !metodo.equals("do-while")) {
            System.out.println("El metodo elegido no es valido");
            return;
        }
        //CON SWITCH PODEMOS ESTABLECER LOS 3 CASOS DISTINTOS
        
        switch (metodo) {

            case "for":
                System.out.println("Método FOR");

                for (num = 1; num <= 10; num++) {
                    System.out.println(numero1 * num);
                }

                break;

            case "while":
                System.out.println("Método WHILE");
                num = 1;

                while (num <= 10) {
                    System.out.println(numero1 * num);
                    num++;
                }
                break;

            case "do-while":
                System.out.println("Método DO-WHILE");
                num = 1;

                do {
                    System.out.println(numero1 * num);
                    num++;
                } while (num <= 10);
                break;

        }
    }
}
