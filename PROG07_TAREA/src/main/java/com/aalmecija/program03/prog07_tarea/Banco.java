/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aalmecija.program03.prog07_tarea;

/**
 *
 * @author aalme
 */
public class Banco {

    private CuentaBancaria[] cuentas;
    private final int MAX_CUENTAS = 100;
    private int numeroCuentas;

    public Banco() {

        this.cuentas = new CuentaBancaria[this.MAX_CUENTAS];
        this.numeroCuentas = 0;

    }

    public boolean abrirCuenta(CuentaBancaria c) {

        if (this.numeroCuentas >= this.MAX_CUENTAS) {
            System.out.println("No hay suficiente espacio");
            return false;
        }

        CuentaBancaria existe = this.buscarCuenta(c.getIBAN());
        if (existe != null) {
            System.out.println("Ya existe la cuenta bancaria");
            return false;
        }

        this.cuentas[this.numeroCuentas] = c;
        this.numeroCuentas++;
        return true;
    }

    public String[] listadoCuentas() {
        String[] infoCuentas = new String[this.numeroCuentas];
        for (int i = 0; i < this.numeroCuentas; i++) {
            infoCuentas[i] = this.cuentas[i].devolverInfoString();

        }
        return infoCuentas;

    }

    public String informacionCuenta(String IBAN) {

        CuentaBancaria c = this.buscarCuenta(IBAN);
        if (c != null) {
            return c.devolverInfoString();
        }

        return null;

    }

    public boolean ingresoCuenta(String IBAN, double cantidad) {

        CuentaBancaria c = this.buscarCuenta(IBAN);
        if (c != null) {

            if (c.getSaldo() + cantidad > 0) {
                c.setSaldo(c.getSaldo() + cantidad);
                return true;
            }
            return false;

        }

        return false;

    }

    public double obtenerSaldo(String IBAN) {
        CuentaBancaria c = this.buscarCuenta(IBAN);
        if (c != null) {
            return c.getSaldo();
        }
        return -1;
    }

    public boolean retiradaCuenta(String IBAN, double cantidad) {

        CuentaBancaria c = this.buscarCuenta(IBAN);
        if (c != null) {
            c.setSaldo(c.getSaldo() - cantidad);
            return true;
        }

        return false;

    }

    private CuentaBancaria buscarCuenta(String IBAN) {
        CuentaBancaria c = null;
        for (int i = 0; i < this.numeroCuentas; i++) {
            if (this.cuentas[i].getIBAN().equals(IBAN)) {
                return this.cuentas[i];

            }
        }
        return null;

    }

}
