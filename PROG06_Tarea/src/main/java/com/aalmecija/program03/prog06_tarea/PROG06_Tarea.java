/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.aalmecija.program03.prog06_tarea;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aalme
 */
public class PROG06_Tarea {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        sn.useLocale(Locale.US);
        boolean salir = false;
        boolean correcto = false;
        int opcion;

        Concesionario concesionario = new Concesionario();

        Vehiculo v;
        String marca, matricula, descripcion, nombrePropietario, dniPropietario;
        int Kms = 0, dia, mes, anio;
        double precio = 0;
        LocalDate fechaMatriculacion = null;

        while (!salir) {
            System.out.println("Seleccione una opcion");
            System.out.println("1. Nuevo vehiculo");
            System.out.println("2. Listar vehiculo");
            System.out.println("3. Buscar vehiculo");
            System.out.println("4. Modificar Kms vehiculo");
            System.out.println("5. Salir");

            opcion = sn.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("Introduce la marca del vehiculo: ");
                    marca = sn.next();

                    do {

                        System.out.println("Introduce la matricula del vehiculo: ");
                        matricula = sn.next();

                    } while (!Validacion.validarMatricula(matricula));

                    do {
                        correcto = true;

                        try {
                            System.out.println("Introduce el numero de Kilometros: ");
                            Kms = sn.nextInt();

                        } catch (InputMismatchException e) {
                            correcto = false;
                            sn.next();
                        }
                    } while (!correcto);

                    do {
                        correcto = true;

                        try {
                            System.out.println("Dia de matriculacion: ");
                            dia = sn.nextInt();

                            System.out.println("Mes de matriculacion: ");
                            mes = sn.nextInt();

                            System.out.println("Año de matriculacion: ");
                            anio = sn.nextInt();

                            fechaMatriculacion = LocalDate.of(anio, mes, dia);

                        } catch (InputMismatchException e) {
                            correcto = false;
                            sn.next();

                        } catch (DateTimeException e) {
                            correcto = false;
                        }
                    } while (!correcto);

                    System.out.println("Descripcion del vehiculo: ");
                    descripcion = sn.next();

                    do {

                        System.out.println("Nombre del propietario: ");
                        nombrePropietario = sn.next();
                    } while (!Validacion.validarNombre(nombrePropietario));

                    do {

                        System.out.println("Dni del propietario: ");
                        dniPropietario = sn.next();

                    } while (!Validacion.validarDNI(dniPropietario));

                    do {
                        correcto = true;

                        try {
                            System.out.println("Precio: ");
                            precio = sn.nextDouble();

                        } catch (InputMismatchException e) {
                            correcto = false;
                            sn.next();
                        }
                    } while (!correcto);

                    v = new Vehiculo(marca, matricula, Kms, fechaMatriculacion, descripcion, precio, nombrePropietario, dniPropietario);
                    
                    switch (concesionario.insertarVehiculo(v)) {

                        case (-2):
                            System.out.println("El vehiculo ya existe");
                            break;
                        case (-1):
                            System.out.println("El concesionario esta lleno");
                            break;
                        case (0):
                            System.out.println("Vehiculo introducido correctamente");
                            break;
                    }

                case 2:
                    concesionario.listarVehiculos();

                    break;
                case 3:
                    System.out.println("Introduce la matricula.");
                    matricula = sn.next();

                    v = concesionario.buscaVehiculo(matricula);

                    if (v != null) {
                        System.out.println(v.getMarca());
                        System.out.println(v.getMatricula());
                        System.out.println((long) v.getPrecio());

                    } else {
                        System.out.println("No existe vehículo con la matrícula introducida");
                    }

                    break;
                case 4:
                    System.out.println("Introduce la matricula.");
                    matricula = sn.next();

                    System.out.println("Introduce los nuevos Kms");
                    Kms = sn.nextInt();

                    if (concesionario.actualizaKms(matricula, Kms)) {
                        System.out.println("Los kms han sido actualizados correctamente");

                    } else {
                        System.out.println("No existe vehículo con la matrícula introducida");
                    }

                    break;
                case 5:
                    salir = true;

                    break;

            }

        }
    }
}

