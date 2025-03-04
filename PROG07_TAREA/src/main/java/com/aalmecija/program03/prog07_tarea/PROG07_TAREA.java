/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.aalmecija.program03.prog07_tarea;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aalme
 */
public class PROG07_TAREA {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        sn.useLocale(Locale.US);

        boolean salir = false;
        int opcion, tipoCuenta;
        String nombreTitular;
        String apellidosTitular;
        String DNITitular;
        String IBAN, listaAutorizadas, infoCuenta;
        String[] listaCuentas;
        Persona titular;
        double saldo, tipoInteres, comisionMantenimiento, tipoInteresDescubierto, maxDescubierto, comisionDescubierto, cantidad;

        Banco banco = new Banco();
        CuentaBancaria cuenta = null;

        while (!salir) {

            try {

                System.out.println("1. Abrir una nueva cuenta");
                System.out.println("2. Ver listado de cuentas disponibles");
                System.out.println("3. Obtener datos de una cuenta");
                System.out.println("4. Realizar ingreso");
                System.out.println("5. Retirar efectivo");
                System.out.println("6. Consulta de saldo");
                System.out.println("7. Salir");

                opcion = sn.nextInt();

                switch (opcion) {

                    case 1:

                        System.out.println("Nombre del titular: ");
                        nombreTitular = sn.next();
                        System.out.println("Apellidos del titular: ");
                        apellidosTitular = sn.next();
                        System.out.println("DNI del titular: ");
                        DNITitular = sn.next();

                        titular = new Persona(nombreTitular, apellidosTitular, DNITitular);

                        System.out.println("IBAN: ");
                        IBAN = sn.next();

                        if (!IBAN.matches("^ES[0-9]{20}$")) {
                            throw new Exception("El IBAN no tiene el formato correcto");

                        }

                        System.out.println("Saldo inicial: ");
                        saldo = sn.nextDouble();

                        System.out.println("Elige el tipo de cuenta: ");
                        System.out.println("1. Cuenta Ahorro.");
                        System.out.println("2. Cuenta Corriente personal.");
                        System.out.println("3. Cuenta Corriente empresa.");
                        tipoCuenta = sn.nextInt();

                        switch (tipoCuenta) {
                            case 1:
                                System.out.println("Introduce el tipo de interes");
                                tipoInteres = sn.nextDouble();
                                cuenta = new CuentaAhorro(tipoInteres, titular, saldo, IBAN);
                                break;
                            case 2:
                                System.out.println("Lista de entidades autorizadas: ");
                                listaAutorizadas = sn.next();
                                System.out.println("Comision de mantenimiento: ");
                                comisionMantenimiento = sn.nextDouble();
                                cuenta = new CuentaCorrientePersonal(comisionMantenimiento, listaAutorizadas, titular, saldo, IBAN);
                                break;
                            case 3:
                                System.out.println("Lista de entidades autorizadas: ");
                                listaAutorizadas = sn.next();
                                System.out.println("Tipo de Interes descubierto: ");
                                tipoInteresDescubierto = sn.nextDouble();
                                System.out.println("Maximo descubierto: ");
                                maxDescubierto = sn.nextDouble();
                                System.out.println("Comision por descubierto: ");
                                comisionDescubierto = sn.nextDouble();
                                cuenta = new CuentaCorrienteEmpresa(maxDescubierto, tipoInteresDescubierto, comisionDescubierto, listaAutorizadas, titular, saldo, IBAN);
                                break;
                            default:
                                throw new Exception("Debes elegir un tipo de cuenta");
                        }

                        if (banco.abrirCuenta(cuenta)) {
                            System.out.println("Se ha abierto la cuenta con exito");
                        } else {
                            System.out.println("Error al abrir la cuenta");
                        }

                        break;
                    case 2:
                        listaCuentas = banco.listadoCuentas();
                        for (int i = 0; i < listaCuentas.length; i++) {
                            System.out.println(listaCuentas[i]);
                        }
                        break;
                    case 3:
                        System.out.println("Introduce el IBAN de la cuenta: ");
                        IBAN = sn.next();

                        infoCuenta = banco.informacionCuenta(IBAN);
                        if (infoCuenta != null) {
                            System.out.println(infoCuenta);

                        } else {
                            System.out.println("La cuenta no existe.");
                        }
                        break;
                    case 4:
                        System.out.println("Introduce el IBAN de la cuenta: ");
                        IBAN = sn.next();

                        System.out.println("Introduce una cantidad: ");
                        cantidad = sn.nextDouble();

                        if (banco.ingresoCuenta(IBAN, cantidad)) {
                            System.out.println("Ingreso realizado con éxito");

                        } else {
                            System.out.println("No se pudo realizar el ingreso.");
                        }

                        break;
                    case 5:
                        System.out.println("Introduce el IBAN de la cuenta: ");
                        IBAN = sn.next();

                        System.out.println("Introduce una cantidad: ");
                        cantidad = sn.nextDouble();

                        if (banco.retiradaCuenta(IBAN, cantidad)) {
                            System.out.println("La operacion se realizó correctamente");

                        } else {
                            System.out.println("No se pudo realizar la operación.");
                        }
                        break;
                    case 6:
                        System.out.println("Introduce el IBAN de la cuenta: ");
                        IBAN = sn.next();

                        saldo = banco.obtenerSaldo(IBAN);
                        if (saldo != -1) {
                            System.out.println("El saldo es: " + saldo);

                        } else {
                            System.out.println("La cuenta no existe.");
                        }
                        break;
                    case 7:
                        salir = true;

                        break;

                }
            } catch (InputMismatchException e) {
                sn.next();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
