package com.aalmecija.program03.prog06_tarea;

import java.time.LocalDate;
import java.time.Period;

/* ESTA CLASE ES PARA AÑADIR TODAS LAS PORPIEDADES DEL VEHICULO Y LOS PARAMETROS O CARACTERISTICAS*/

public class Vehiculo {

    private String marca;
    private String matricula;
    private int Km;
    private LocalDate fechaMatriculacion;
    private String descripcion;
    private double precio;
    private String nombrePropietario;
    private String dniPropietario;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String matricula, int Km, LocalDate fechaMatriculacion, String descripcion, double precio, String nombrePropietario, String dniPropietario) {
        this.marca = marca;
        this.matricula = matricula;
        this.Km = Km;
        this.fechaMatriculacion = fechaMatriculacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombrePropietario = nombrePropietario;
        this.dniPropietario = dniPropietario;
    }
/* METODOS GETTER AND SETTER */
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKm() {
        return Km;
    }

    public void setKm(int Km) {
        this.Km = Km;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }

    /*ESTE METODO NOS DEVUELVE LA CANTIDAD DE AÑOS QUE HAN TRANSCURRIDO DESDE LA FECHA DE MATRICULACION*/
    
    public int get_Anios(){
        
        LocalDate fecha1 = this.fechaMatriculacion;
        LocalDate fecha2 = LocalDate.now();
        
        Period p = Period.between(fecha1, fecha2);
        
        return p.getYears();
        
    }
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", matricula=" + matricula + ", Km=" + Km +  ", descripcion=" + descripcion + ", precio=" + precio;
    }

}
