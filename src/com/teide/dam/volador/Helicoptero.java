/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.dam.volador;

/**
 *
 * @author DAM1
 */
public class Helicoptero implements Volador{

    @Override
    public String despegar() {
       return "El helicoptero esta despegando";
    }

    @Override
    public String aterrizar(int metros) {
       return "El helicoptero ha aterrizado con un coste de " + (metros*0.95) + "€";
    }
    
    
    
}
