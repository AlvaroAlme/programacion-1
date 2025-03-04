/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aalmecija.program03.prog04_ejerc1;

/**
 *
 * @author aalme
 */
public class Fecha {
    enum enumMes{ ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}
    
    private int dia;
    private enumMes mes;
    private int año;

    public Fecha(enumMes mes) {
        this.mes = mes;
    }

    

    public Fecha(int dia, enumMes mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public enumMes getMes() {
        return mes;
    }

    public void setMes(enumMes mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public boolean isSummer(){
        return (this.mes == enumMes.JUNIO && this.dia >= 21) || this.mes == enumMes.JULIO || this.mes == enumMes.AGOSTO || (this.mes == enumMes.SEPTIEMBRE && this.dia < 21);
    }

    @Override
    public String toString() {
        return  dia + " de " + mes + " de " + año;
    }
    
    
        
    
    
}
