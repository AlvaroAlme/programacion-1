/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aalmecija.program03.prog07_tarea;

/**
 *
 * @author aalme
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente {

    private double maximoDescubierto;
    private double tipoInteresDescubierto;
    private double comisionFija;

    public CuentaCorrienteEmpresa(double maximoDescubierto, double tipoInteresDescubierto, double comisionFija, String listaEntidades, Persona titular, double saldo, String IBAN) {
        super(listaEntidades, titular, saldo, IBAN);
        this.maximoDescubierto = maximoDescubierto;
        this.tipoInteresDescubierto = tipoInteresDescubierto;
        this.comisionFija = comisionFija;
    }

    public double getMaximoDescubierto() {
        return maximoDescubierto;
    }

    public void setMaximoDescubierto(double maximoDescubierto) {
        this.maximoDescubierto = maximoDescubierto;
    }

    public double getTipoInteresDescubierto() {
        return tipoInteresDescubierto;
    }

    public void setTipoInteresDescubierto(double tipoInteresDescubierto) {
        this.tipoInteresDescubierto = tipoInteresDescubierto;
    }

    public double getComisionFija() {
        return comisionFija;
    }

    public void setComisionFija(double comisionFija) {
        this.comisionFija = comisionFija;
    }

    @Override
    public String devolverInfoString() {
        return super.devolverInfoString() + ", maximoDescubierto: " + maximoDescubierto + ", tipoInteresDescubierto: " + tipoInteresDescubierto + ", comisionFija: " + comisionFija;
    }

}


