/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aalmecija.program03.prog06_tarea;
public class Concesionario {

    private Vehiculo[] Vehiculos;
    private int numVehiculos;

    public Concesionario() {
        this.numVehiculos = 0;
        this.Vehiculos = new Vehiculo[50];
    }

    public Vehiculo buscaVehiculo(String matricula) {

        for (int i = 0; i < numVehiculos; i++) {
            Vehiculo v = this.Vehiculos[i];

            if (v.getMatricula().equals(matricula)) {
                return v;
            }
        }
        return null;

    }

    public int insertarVehiculo(Vehiculo v) {

        if (this.numVehiculos == this.Vehiculos.length) {
            return -1;
        }

        if (this.buscaVehiculo(v.getMatricula()) != null) {
            return -2;
        } else {
            this.Vehiculos[this.numVehiculos++] = v;
            return 0;
        }
    }

    public void listarVehiculos() {

        for (int i = 0; i < numVehiculos; i++) {
            Vehiculo v = this.Vehiculos[i];
            System.out.println(v.toString());

        }
    }
    
    public boolean actualizaKms (String matricula, int Kms){
        
        for (int i = 0; i < numVehiculos; i++){
            Vehiculo v = this.Vehiculos[i];
            
            if (v.getMatricula().equals(matricula)){
                v.setKm(Kms);
                return true;
            }
        }
        return false;
    }

}
