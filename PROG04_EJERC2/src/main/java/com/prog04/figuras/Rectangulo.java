/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog04.figuras;

/**
 *
 * @author aalme
 */
public class Rectangulo {
    private float base;
    private float altura;
    
    public Rectangulo (){
        this.base = 0;
        this.altura = 0;
    }
    
    public Rectangulo (float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getBase() {
        return base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
    
    public float getArea(){
        return base * altura;
    }

    @Override
    public String toString() {
        return "Area: " + getArea() + ", Altura: " + altura;
    }
    public boolean isCuadrado(){
        return base == altura;
    }
    
}
