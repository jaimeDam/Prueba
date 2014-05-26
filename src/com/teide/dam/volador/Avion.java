/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.dam.volador;

/**
 *
 * @author DAM1
 */
// repositorio
public class Avion implements Volador{

    @Override
    public String despegar() {
        return "El avion ha despegado";
    }

    @Override
    public String aterrizar(int metros) {
       return "El avion ha aterrizado";
    }
    
}
