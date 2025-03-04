/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.aalmecija.program03.prog03_ejerc4;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author aalme
 */

//Ejercicio 4: Adivinar un número. El funcionamiento será el siguiente:

public class PROG03_EJERC4 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int select = 0, numero, intento = 0, i;
        
        int maxIntentos = 5;
        int numMaximo = 10;
        boolean fin = false;
        int intentosNecesitados = 0;
        System.out.println("    -----ADIVINA EL NUMERO-----     ");
        
        //El programa mostrará un pequeño menú en pantalla con las siguientes opciones (1. Configurar, 2. Jugar, 3. Salir).
        do {
            System.out.println("1. Configurar");
            System.out.println("2. Jugar");
            System.out.println("3. Salir");
            try {
                select = Integer.valueOf(teclado.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("***INTRODUCE UN NUMERO DEL 1 AL 3");
                return;
            }

            switch (select) {
                case 1: //Si el usuario selecciona el la primera opción, se le solicitará por teclado el número de intentos permitidos (numInt) y el número máximo  (numMax) generado.
                    System.out.println("Configuracion");
                    System.out.println("Numero maximo de intentos permitidos: ");
                    maxIntentos = teclado.nextInt();
                    System.out.println("Numero maximo del numero aleatorio: ");
                    numMaximo = teclado.nextInt();
                    break;

                case 2://Si el usuario selecciona la opción 2,  el programa generará un número aleatorio entre 0 y numMax que será el número a adivinar (numOculto). A partir de este momento, se le solicitarán al usuario números hasta adivinar el número oculto.
                    numero = (int) (Math.random() * numMaximo + 1);
                    System.out.println("Se ha generado un numero aleatorio entre 1 y " + numMaximo + "\n Tienes " + maxIntentos + " intentos para adivinarlo");//Si el usuario selecciona Jugar sin configurar previamente el número de intentos y el número máximo generado, se tomarán como valores por defecto: numInt=5 y numMax=10.
                    System.out.println("----ADELANTE----");

                    for (intento = maxIntentos; intento > 0; intento--) {
                        intentosNecesitados++;
                        int intentoUsuario = teclado.nextInt();
                        if (intentoUsuario == numero) { //Si el usuario adivina el número, se mostrará un mensaje "Has ganado!. Has necesitado X intentos".
                            System.out.println("¡CORRECTO!" + " ¡¡HAS GANADO!!");
                            System.out.println("HAS NECESITADO " + intentosNecesitados + " INTENTOS");
                            return;

                        } else {
                            System.out.println("¡¡INCORRECTO!!");
                            System.out.println("TE QUEDAN " + (intento - 1) + " INTENTOS");
                        }
                        if (intentoUsuario < numero) {//En cada intento, si el usuario no adivina el número se le proporcionará una pista, por ejemplo, "El número oculto es menor".
                            System.out.println("El numero oculto es mayor");
                        } else if (intentoUsuario > numero) {
                            System.out.println("El numero oculto es menor");

                        }
                        if (intento == 0) {//Si se consume el número de intentos sin adivinar el número, se mostrará el mensaje "Perdiste!. Intentos consumidos"
                            System.out.println("Perdiste!. Intentos consumidos");
                            break;
                        }

                    }
                    break;//En ambos casos, la siguiente acción será mostrar el menú.

                case 3:
                    System.out.println("     ***BYE BYE!***     ");//Si el usuario pulsa la opción 3, el programa finaliza.
                    return;
                    
            }
        } while (true);
    }
}
