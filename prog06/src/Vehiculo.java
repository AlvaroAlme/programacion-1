

import java.time.LocalDate;
import java.time.Period;

/**
 * Clase Vehículo que contiene la representación de un vehículo en venta y su propietario.
 * @author Álvaro Almécija
 */
public class Vehiculo {

    private String marca;
    private String matricula;
    private int Km;
    private LocalDate fechaMatriculacion;
    private String descrpicion;
    private double precio;
    private String nombrePropietario;
    private String dniPropietario;

    public Vehiculo(){

    }

    public Vehiculo(String marca, String matricula, int Km, LocalDate fechaMatriculacion, String descrpicion, double precio, String nombrePropietario, String dniPropietario){
        this.marca = marca;
        this.matricula = matricula;
        this.Km = Km;
        this.fechaMatriculacion = fechaMatriculacion;
        this.descrpicion = descrpicion;
        this.precio = precio;
        this.nombrePropietario = nombrePropietario;
        this.dniPropietario = dniPropietario;
    }

    /*
     * GETTERS AND SETTERS
     */

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public int getKm(){
        return Km;
    }
    
    public void setKm(int Km){
        this.Km = Km;
    }

    public LocalDate getFechaMatriculacion(){
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion){
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getDescrpicion(){
        return descrpicion;
    }

    public void setDescrpicion(String descrpicion){
        this.descrpicion = descrpicion;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String getNombrePropietario(){
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario){
        this.nombrePropietario = nombrePropietario;
    }  

    public String getDniPropietario(){
        return dniPropietario;
    }

    public void setDniPropietario(String dniPropietario){
        this.dniPropietario = dniPropietario;
    }

    /*
     * METODOS
     */

    /*
     * ESTE METODO NOS DEVUELVE LA CANTIDAD DE AÑOS QUE HAN TRANSCURRIDO DESDE LA FECHA DE MATRICULACION
     * PARA ELLO UTILIZAMOS LA FECHA DE MATRICULACION INTRODUCIDA, LA FECHA ACTUAL LA CONSEGUIMOS CON 'LOCALDATE'
     * UTILIZAMOS TAMBIEN EL OBJETO PERIOD.BETWEEN Y CONSEGUIMOS EL NUMERO DE AÑOS TRANSCURRIDOS CON P.GETYEARS
     */

     public int getAnios(){
        LocalDate fecha1 = this.fechaMatriculacion;
        LocalDate fecha2 = LocalDate.now();

        Period p = Period.between(fecha1, fecha2);

        return p.getYears();
     }

     @Override
     public String toString(){
        return "Vehiculo{" + "marca=" + marca + ", matricula=" + matricula + ", Km=" + Km + ", fechaMatriculacion=" + fechaMatriculacion + ", descrpicion=" + descrpicion + ", precio=" + precio + ", nombrePropietario=" + nombrePropietario + ", dniPropietario=" + dniPropietario + '}';
     }
    }
